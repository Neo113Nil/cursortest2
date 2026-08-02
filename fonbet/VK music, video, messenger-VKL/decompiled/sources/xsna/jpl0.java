package xsna;

/* compiled from: StorefrontViewState.kt */
/* loaded from: classes18.dex */
public final class jpl0 implements lm50 {
    public final b b;
    public final a c;

    /* compiled from: StorefrontViewState.kt */
    public interface a {

        /* compiled from: StorefrontViewState.kt */
        /* renamed from: xsna.jpl0$a$a, reason: collision with other inner class name */
        public static final class C3136a implements a {
            public static final C3136a a = new C3136a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C3136a);
            }

            public final int hashCode() {
                return -466230495;
            }

            public final String toString() {
                return "AccessDenied";
            }
        }

        /* compiled from: StorefrontViewState.kt */
        public static final class b implements a {
            public final String a;
            public final Integer b;
            public final boolean c;

            public b() {
                this(null, null, false);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && this.c == bVar.c;
            }

            public final int hashCode() {
                String str = this.a;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                Integer num = this.b;
                return Boolean.hashCode(this.c) + ((hashCode + (num != null ? num.hashCode() : 0)) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Blocked(message=");
                sb.append(this.a);
                sb.append(", buttonTextId=");
                sb.append(this.b);
                sb.append(", isButtonEnabled=");
                return defpackage.q0.a(sb, this.c, ')');
            }

            public b(String str, Integer num, boolean z) {
                this.a = str;
                this.b = num;
                this.c = z;
            }
        }

        /* compiled from: StorefrontViewState.kt */
        public static final class c implements a {
            public static final c a = new c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return 2135320314;
            }

            public final String toString() {
                return "Loading";
            }
        }

        /* compiled from: StorefrontViewState.kt */
        public static final class d implements a {
            public final apl0 a;
            public final sll0 b;

            public d(apl0 apl0Var, sll0 sll0Var) {
                this.a = apl0Var;
                this.b = sll0Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return epx.f(this.a, dVar.a) && epx.f(this.b, dVar.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                return "Success(state=" + this.a + ", ctaState=" + this.b + ')';
            }
        }
    }

    /* compiled from: StorefrontViewState.kt */
    public static final class b {
        public final ipl0 a;

        public b(ipl0 ipl0Var) {
            this.a = ipl0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "TopBar(searchState=" + this.a + ')';
        }
    }

    public jpl0(b bVar, a aVar) {
        this.b = bVar;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jpl0)) {
            return false;
        }
        jpl0 jpl0Var = (jpl0) obj;
        return epx.f(this.b, jpl0Var.b) && epx.f(this.c, jpl0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.a.hashCode() * 31);
    }

    public final String toString() {
        return "StorefrontViewState(topBar=" + this.b + ", content=" + this.c + ')';
    }
}
