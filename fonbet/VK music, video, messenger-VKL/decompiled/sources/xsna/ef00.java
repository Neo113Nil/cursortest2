package xsna;

import androidx.fragment.app.Fragment;
import com.vk.voip.ui.actions.menu.fragments.VoipMainMenuFragmentBase;

/* compiled from: MainMenuViewState.kt */
/* loaded from: classes7.dex */
public final class ef00 {
    public final b a;
    public final a b;
    public final c c;
    public final boolean d;
    public final boolean e;

    /* compiled from: MainMenuViewState.kt */
    public interface a {

        /* compiled from: MainMenuViewState.kt */
        /* renamed from: xsna.ef00$a$a, reason: collision with other inner class name */
        public static final class C2803a implements a {
            public static final C2803a a = new C2803a();
        }

        /* compiled from: MainMenuViewState.kt */
        public static final class b implements a {
            public final boolean a;

            public b(boolean z) {
                this.a = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.a == ((b) obj).a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.a);
            }

            public final String toString() {
                return defpackage.q0.a(new StringBuilder("Expanded(showingRoot="), this.a, ')');
            }
        }

        /* compiled from: MainMenuViewState.kt */
        public static final class c implements a {
            public static final c a = new c();
        }
    }

    /* compiled from: MainMenuViewState.kt */
    public interface b {

        /* compiled from: MainMenuViewState.kt */
        public static final class a implements b {
            public final Fragment a;

            public a(Fragment fragment) {
                this.a = fragment;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "Cleaning(content=" + this.a + ')';
            }
        }

        /* compiled from: MainMenuViewState.kt */
        /* renamed from: xsna.ef00$b$b, reason: collision with other inner class name */
        public static final class C2804b implements b {
            public static final C2804b a = new C2804b();
        }

        /* compiled from: MainMenuViewState.kt */
        public static final class c implements b {
            public final Fragment a;

            public c(Fragment fragment) {
                this.a = fragment;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "Loaded(content=" + this.a + ')';
            }
        }

        /* compiled from: MainMenuViewState.kt */
        public static final class d implements b {
            public final Fragment a;

            public d(Fragment fragment) {
                this.a = fragment;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && epx.f(this.a, ((d) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "Loading(content=" + this.a + ')';
            }
        }

        /* compiled from: MainMenuViewState.kt */
        public static final class e implements b {
            public final gzs<Fragment> a;

            /* JADX WARN: Multi-variable type inference failed */
            public e(gzs<? extends Fragment> gzsVar) {
                this.a = gzsVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof e) && epx.f(this.a, ((e) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return uf3.d(new StringBuilder("Ready(createFragmentFactory="), this.a, ')');
            }
        }

        /* compiled from: MainMenuViewState.kt */
        public static final class f implements b {
            public final VoipMainMenuFragmentBase a;
            public final boolean b;

            public f(VoipMainMenuFragmentBase voipMainMenuFragmentBase, boolean z) {
                this.a = voipMainMenuFragmentBase;
                this.b = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof f)) {
                    return false;
                }
                f fVar = (f) obj;
                return this.a.equals(fVar.a) && this.b == fVar.b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Replacing(child=");
                sb.append(this.a);
                sb.append(", isGoingBack=");
                return defpackage.q0.a(sb, this.b, ')');
            }
        }

        /* compiled from: MainMenuViewState.kt */
        public static final class g implements b {
            public final Fragment a;
            public final boolean b;
            public final boolean c;
            public final boolean d;

            public g(Fragment fragment, boolean z, boolean z2, boolean z3) {
                this.a = fragment;
                this.b = z;
                this.c = z2;
                this.d = z3;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof g)) {
                    return false;
                }
                g gVar = (g) obj;
                return epx.f(this.a, gVar.a) && this.b == gVar.b && this.c == gVar.c && this.d == gVar.d;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.d) + qoy.b(qoy.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Running(content=");
                sb.append(this.a);
                sb.append(", expandRequested=");
                sb.append(this.b);
                sb.append(", collapseRequested=");
                sb.append(this.c);
                sb.append(", showingRoot=");
                return defpackage.q0.a(sb, this.d, ')');
            }
        }

        /* compiled from: MainMenuViewState.kt */
        public static final class h implements b {
            public final Fragment a;

            public h(Fragment fragment) {
                this.a = fragment;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof h) && epx.f(this.a, ((h) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "Starting(content=" + this.a + ')';
            }
        }
    }

    /* compiled from: MainMenuViewState.kt */
    public interface c {

        /* compiled from: MainMenuViewState.kt */
        public static final class a implements c {
            public static final a a = new a();
        }

        /* compiled from: MainMenuViewState.kt */
        public static final class b implements c {
            public final boolean a;

            public b(boolean z) {
                this.a = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.a == ((b) obj).a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.a);
            }

            public final String toString() {
                return defpackage.q0.a(new StringBuilder("Running(animateInstruction="), this.a, ')');
            }
        }

        /* compiled from: MainMenuViewState.kt */
        /* renamed from: xsna.ef00$c$c, reason: collision with other inner class name */
        public static final class C2805c implements c {
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C2805c)) {
                    return false;
                }
                ((C2805c) obj).getClass();
                return true;
            }

            public final int hashCode() {
                return Long.hashCode(10000L);
            }

            public final String toString() {
                return "Scheduled(timeout=10000)";
            }
        }
    }

    public ef00(b bVar, a aVar, c cVar, boolean z, boolean z2) {
        this.a = bVar;
        this.b = aVar;
        this.c = cVar;
        this.d = z;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ef00)) {
            return false;
        }
        ef00 ef00Var = (ef00) obj;
        return epx.f(this.a, ef00Var.a) && epx.f(this.b, ef00Var.b) && epx.f(this.c, ef00Var.c) && this.d == ef00Var.d && this.e == ef00Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + qoy.b((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MainMenuViewState(contentState=");
        sb.append(this.a);
        sb.append(", bottomSheetState=");
        sb.append(this.b);
        sb.append(", onboardingState=");
        sb.append(this.c);
        sb.append(", isVisible=");
        sb.append(this.d);
        sb.append(", isEnabled=");
        return defpackage.q0.a(sb, this.e, ')');
    }
}
