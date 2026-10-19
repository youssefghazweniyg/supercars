
const cars = [
  {
    brand: "Porsche", name: "911 GT3 RS", year: "2025",
    power: "518 HP", speed: "296 km/h",
    image: "https://images.unsplash.com/photo-1503376780353-7e6692767b70?auto=format&fit=crop&w=1000&q=85",
    description: "A precision-focused track machine featuring aggressive aerodynamics, a high-revving flat-six and a chassis designed for serious driving."
  },
  {
    brand: "Porsche", name: "911 Turbo S", year: "2025",
    power: "640 HP", speed: "330 km/h",
    image: "https://images.unsplash.com/photo-1611651338412-8403fa6e3599?auto=format&fit=crop&w=1000&q=85",
    description: "Everyday usability meets immense performance in this all-wheel-drive sports car with twin-turbocharged power."
  },
  {
    brand: "Ferrari", name: "SF90 Stradale", year: "2024",
    power: "986 HP", speed: "340 km/h",
    image: "https://images.unsplash.com/photo-1592198084033-aade902d1aae?auto=format&fit=crop&w=1000&q=85",
    description: "A plug-in hybrid Ferrari combining a twin-turbo V8 with electric motors for breathtaking performance."
  },
  {
    brand: "Ferrari", name: "296 GTB", year: "2025",
    power: "819 HP", speed: "330 km/h",
    image: "https://images.unsplash.com/photo-1594787318286-3d835c1d207f?auto=format&fit=crop&w=1000&q=85",
    description: "A mid-engine hybrid berlinetta with a compact V6 powertrain and the unmistakable spirit of Ferrari."
  },
  {
    brand: "Lamborghini", name: "Revuelto", year: "2025",
    power: "1001 HP", speed: "350 km/h",
    image: "https://images.unsplash.com/photo-1544636331-e26879cd4d9b?auto=format&fit=crop&w=1000&q=85",
    description: "A dramatic V12 hybrid supercar featuring angular design, electrified performance and all-wheel drive."
  },
  {
    brand: "Lamborghini", name: "Huracán STO", year: "2024",
    power: "631 HP", speed: "310 km/h",
    image: "https://images.unsplash.com/photo-1511919884226-fd3cad34687c?auto=format&fit=crop&w=1000&q=85",
    description: "Inspired by racing, the STO combines a naturally aspirated V10 with lightweight construction and track-focused aerodynamics."
  },
  {
    brand: "McLaren", name: "750S", year: "2025",
    power: "740 HP", speed: "332 km/h",
    image: "https://images.unsplash.com/photo-1621135802920-133df287f89c?auto=format&fit=crop&w=1000&q=85",
    description: "A lightweight supercar built around a twin-turbo V8, responsive handling and an intense connection with the road."
  },
  {
    brand: "McLaren", name: "Artura", year: "2025",
    power: "690 HP", speed: "330 km/h",
    image: "https://images.unsplash.com/photo-1552519507-da3b142c6e3d?auto=format&fit=crop&w=1000&q=85",
    description: "A modern hybrid supercar pairing a twin-turbo V6 with electric power in a lightweight carbon-fibre structure."
  },
  {
    brand: "Bugatti", name: "Chiron", year: "2024",
    power: "1479 HP", speed: "420 km/h",
    image: "https://images.unsplash.com/photo-1566023888477-4c5c0c9f12d1?auto=format&fit=crop&w=1000&q=85",
    description: "An extraordinary hypercar powered by a quad-turbocharged W16 engine and engineered for immense speed."
  },
  {
    brand: "Bugatti", name: "Tourbillon", year: "2026",
    power: "1800 HP", speed: "445 km/h",
    image: "https://images.unsplash.com/photo-1503739049985-772bcfc10da5?auto=format&fit=crop&w=1000&q=85",
    description: "Bugatti's next-generation hybrid hypercar concept pairs a naturally aspirated V16 with electric motors. Figures shown are announced specifications."
  },
  {
    brand: "Koenigsegg", name: "Jesko Absolut", year: "2025",
    power: "1600 HP", speed: "500+ km/h target",
    image: "https://images.unsplash.com/photo-1492144534655-ae79c964c9d7?auto=format&fit=crop&w=1000&q=85",
    description: "A low-drag hypercar designed around high-speed stability, advanced aerodynamics and extreme power. The ultimate top speed remains unverified."
  },
  {
    brand: "Koenigsegg", name: "Gemera", year: "2025",
    power: "Up to 2300 HP", speed: "400 km/h",
    image: "https://images.unsplash.com/photo-1485291571150-772bcfc10da5?auto=format&fit=crop&w=1000&q=85",
    description: "A high-performance four-seat mega-GT designed to combine exceptional power with space for passengers."
  },
  {
    brand: "Pagani", name: "Huayra", year: "2024",
    power: "720 HP", speed: "383 km/h",
    image: "https://images.unsplash.com/photo-1503736334956-4c8f8e92946d?auto=format&fit=crop&w=1000&q=85",
    description: "Italian craftsmanship meets dramatic carbon-fibre design and a powerful Mercedes-AMG-derived V12."
  },
  {
    brand: "Pagani", name: "Utopia", year: "2025",
    power: "852 HP", speed: "350+ km/h",
    image: "https://images.unsplash.com/photo-1503376780353-7e6692767b70?auto=format&fit=crop&w=1000&q=85",
    description: "An exclusive hypercar with sculptural design, meticulous craftsmanship and a twin-turbo V12."
  },
  {
    brand: "Aston Martin", name: "Valkyrie", year: "2025",
    power: "About 1140 HP", speed: "350+ km/h",
    image: "https://images.unsplash.com/photo-1544829099-b9a0c07fad1a?auto=format&fit=crop&w=1000&q=85",
    description: "A road-going machine shaped by Formula One-inspired aerodynamics and a high-revving V12 hybrid system."
  },
  {
    brand: "Aston Martin", name: "Valhalla", year: "2025",
    power: "About 1064 HP", speed: "350 km/h",
    image: "https://images.unsplash.com/photo-1504215680853-026ed2a45def?auto=format&fit=crop&w=1000&q=85",
    description: "A mid-engine hybrid supercar featuring advanced aerodynamics and a twin-turbo V8 powertrain."
  },
  {
    brand: "Mercedes-AMG", name: "ONE", year: "2025",
    power: "About 1063 HP", speed: "352 km/h",
    image: "https://images.unsplash.com/photo-1618843479313-40f8afb4b4d8?auto=format&fit=crop&w=1000&q=85",
    description: "Formula One hybrid technology brought to the road with a sophisticated electrified powertrain."
  },
  {
    brand: "Mercedes-AMG", name: "GT Black Series", year: "2024",
    power: "720 HP", speed: "325 km/h",
    image: "https://images.unsplash.com/photo-1614200187524-dc4b892acf16?auto=format&fit=crop&w=1000&q=85",
    description: "An aggressive V8-powered performance coupe with track-oriented aerodynamics and focused handling."
  }
];

const $ = (selector) => document.querySelector(selector);
const $$ = (selector) => document.querySelectorAll(selector);

const grid = $("#carGrid");
const searchInput = $("#searchInput");
const countLabel = $("#carCount");
const noResults = $("#noResults");
const filters = $$(".filter");

let activeBrand = "All";
let searchTerm = "";
let previousFocus = null;

function escapeHTML(value) {
  return String(value).replace(/[&<>"']/g, (character) => ({
    "&": "&amp;",
    "<": "&lt;",
    ">": "&gt;",
    '"': "&quot;",
    "'": "&#039;"
  })[character]);
}

function makeCarCard(car, index) {
  return `
    <article class="car-card tilt-card" style="animation-delay:${(index % 6) * 70}ms">
      <div class="car-image">
        <img
          src="${escapeHTML(car.image)}"
          alt="${escapeHTML(car.brand + " " + car.name)}"
          loading="lazy"
          onerror="this.style.display='none'"
        >
        <span class="car-brand">${escapeHTML(car.brand)}</span>
        <span class="car-index">APX / ${String(index + 1).padStart(2, "0")}</span>
      </div>

      <div class="car-info">
        <h3>${escapeHTML(car.name)}</h3>
        <p class="description">${escapeHTML(car.description)}</p>

        <div class="car-specs">
          <div><small>POWER OUTPUT</small><strong>${escapeHTML(car.power)}</strong></div>
          <div><small>TOP SPEED</small><strong>${escapeHTML(car.speed)}</strong></div>
        </div>

        <div class="car-bottom">
          <span class="car-year">MODEL ${escapeHTML(car.year)}</span>
          <button class="details-btn" data-index="${index}">
            EXPLORE <span>↗</span>
          </button>
        </div>
      </div>
    </article>
  `;
}

function renderCars() {
  const filteredCars = cars
    .map((car, index) => ({ car, index }))
    .filter(({ car }) => {
      const matchesBrand = activeBrand === "All" || car.brand === activeBrand;
      const searchContent = `${car.brand} ${car.name} ${car.year}`.toLowerCase();
      const matchesSearch = searchContent.includes(searchTerm.toLowerCase());
      return matchesBrand && matchesSearch;
    });

  grid.innerHTML = filteredCars
    .map(({ car, index }) => makeCarCard(car, index))
    .join("");

  countLabel.textContent =
    `${filteredCars.length} / ${cars.length} MACHINES DISCOVERED`;

  noResults.hidden = filteredCars.length > 0;

  // Re-enable reveal and 3D effects for newly created cards.
  observeRevealElements();
  attachTiltEffects();
}

filters.forEach((button) => {
  button.addEventListener("click", () => {
    activeBrand = button.dataset.brand;

    filters.forEach((item) => item.classList.remove("active"));
    button.classList.add("active");

    renderCars();
  });
});

searchInput.addEventListener("input", () => {
  searchTerm = searchInput.value.trim();
  renderCars();
});

$("#resetSearch").addEventListener("click", () => {
  activeBrand = "All";
  searchTerm = "";
  searchInput.value = "";

  filters.forEach((button) => {
    button.classList.toggle("active", button.dataset.brand === "All");
  });

  renderCars();
});

$$("[data-select-brand]").forEach((button) => {
  button.addEventListener("click", () => {
    activeBrand = button.dataset.selectBrand;
    searchTerm = "";
    searchInput.value = "";

    filters.forEach((filter) => {
      filter.classList.toggle("active", filter.dataset.brand === activeBrand);
    });

    renderCars();
    $("#garage").scrollIntoView({ behavior: "smooth" });
  });
});

// CAR DETAILS MODAL
const modal = $("#carModal");

function openCarModal(car) {
  previousFocus = document.activeElement;

  $("#modalImage").src = car.image;
  $("#modalImage").alt = `${car.brand} ${car.name}`;
  $("#modalBrand").textContent = car.brand.toUpperCase();
  $("#modalName").textContent = car.name;
  $("#modalDescription").textContent = car.description;
  $("#modalPower").textContent = car.power;
  $("#modalSpeed").textContent = car.speed;
  $("#modalYear").textContent = car.year;

  modal.hidden = false;
  document.body.classList.add("modal-open");
  $("#modalClose").focus();
}

function closeCarModal() {
  modal.hidden = true;
  document.body.classList.remove("modal-open");

  if (previousFocus) previousFocus.focus();
}

grid.addEventListener("click", (event) => {
  const button = event.target.closest("[data-index]");
  if (!button) return;

  const car = cars[Number(button.dataset.index)];
  if (car) openCarModal(car);
});

$("#modalClose").addEventListener("click", closeCarModal);
$("#modalBackdrop").addEventListener("click", closeCarModal);

document.addEventListener("keydown", (event) => {
  if (event.key === "Escape" && !modal.hidden) closeCarModal();
});

// MOBILE MENU
const menuToggle = $("#menuToggle");
const navLinks = $("#navLinks");

menuToggle.addEventListener("click", () => {
  const isOpen = navLinks.classList.toggle("open");
  menuToggle.setAttribute("aria-expanded", String(isOpen));
  menuToggle.textContent = isOpen ? "×" : "☰";
});

navLinks.querySelectorAll("a").forEach((link) => {
  link.addEventListener("click", () => {
    navLinks.classList.remove("open");
    menuToggle.setAttribute("aria-expanded", "false");
    menuToggle.textContent = "☰";
  });
});

// SCROLL PROGRESS + BACK TO TOP
const progressBar = $("#scrollProgress");
const backToTop = $("#backToTop");

function updateScrollUI() {
  const scrollable = document.documentElement.scrollHeight - window.innerHeight;
  const progress = scrollable > 0 ? (window.scrollY / scrollable) * 100 : 0;

  progressBar.style.width = `${progress}%`;
  backToTop.classList.toggle("visible", window.scrollY > 500);
}

window.addEventListener("scroll", updateScrollUI, { passive: true });

backToTop.addEventListener("click", () => {
  window.scrollTo({ top: 0, behavior: "smooth" });
});

// REVEAL ELEMENTS ON SCROLL
let revealObserver;

function observeRevealElements() {
  if (!("IntersectionObserver" in window)) {
    $$(".reveal").forEach((element) => element.classList.add("in-view"));
    return;
  }

  if (!revealObserver) {
    revealObserver = new IntersectionObserver((entries, observer) => {
      entries.forEach((entry) => {
        if (entry.isIntersecting) {
          entry.target.classList.add("in-view");
          observer.unobserve(entry.target);
        }
      });
    }, { threshold: 0.12 });
  }

  $$(".reveal:not(.in-view)").forEach((element) => {
    revealObserver.observe(element);
  });
}

// 3D MOUSE TILT
function attachTiltEffects() {
  const reduceMotion = window.matchMedia("(prefers-reduced-motion: reduce)").matches;
  const touchDevice = window.matchMedia("(hover: none)").matches;

  if (reduceMotion || touchDevice) return;

  $$(".tilt-card").forEach((card) => {
    if (card.dataset.tiltReady) return;
    card.dataset.tiltReady = "true";

    card.addEventListener("mousemove", (event) => {
      const rect = card.getBoundingClientRect();
      const x = (event.clientX - rect.left) / rect.width;
      const y = (event.clientY - rect.top) / rect.height;

      const rotateY = (x - 0.5) * 7;
      const rotateX = (0.5 - y) * 6;

      card.style.setProperty("--rx", `${rotateX}deg`);
      card.style.setProperty("--ry", `${rotateY}deg`);
    });

    card.addEventListener("mouseleave", () => {
      card.style.setProperty("--rx", "0deg");
      card.style.setProperty("--ry", "0deg");
    });
  });
}

// SUBTLE CURSOR LIGHT
const cursorGlow = $(".cursor-glow");
const finePointer = window.matchMedia("(hover: hover) and (pointer: fine)");

if (finePointer.matches) {
  document.addEventListener("mousemove", (event) => {
    cursorGlow.style.left = `${event.clientX}px`;
    cursorGlow.style.top = `${event.clientY}px`;
  });
} else {
  cursorGlow.style.display = "none";
}

// HERO PARALLAX
const heroVisual = $(".hero-visual");
const heroCarWrap = $("#heroCarWrap");

if (finePointer.matches) {
  heroVisual.addEventListener("mousemove", (event) => {
    const rect = heroVisual.getBoundingClientRect();
    const x = (event.clientX - rect.left) / rect.width - 0.5;
    const y = (event.clientY - rect.top) / rect.height - 0.5;

    heroCarWrap.style.animation = "none";
    heroCarWrap.style.transform =
      `rotateY(${x * 9}deg) rotateX(${-y * 7}deg) translateY(-4px)`;
  });

  heroVisual.addEventListener("mouseleave", () => {
    heroCarWrap.style.transform = "";
    heroCarWrap.style.animation = "";
  });
}

// LOADER
window.addEventListener("load", () => {
  setTimeout(() => {
    $("#loader").classList.add("loaded");
  }, 1200);
});

// INITIALISE
renderCars();
observeRevealElements();
updateScrollUI();
