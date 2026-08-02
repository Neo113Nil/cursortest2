package xsna;

/* compiled from: AvitoAction.kt */
/* loaded from: classes18.dex */
public interface nt5 extends kj50 {

    /* compiled from: AvitoAction.kt */
    public interface a extends nt5 {

        /* compiled from: AvitoAction.kt */
        /* renamed from: xsna.nt5$a$a, reason: collision with other inner class name */
        public static final class C3413a implements a {
            public static final C3413a b = new C3413a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C3413a);
            }

            public final int hashCode() {
                return 1806858061;
            }

            public final String toString() {
                return "InfoClick";
            }
        }

        /* compiled from: AvitoAction.kt */
        public static final class b implements a {
            public static final b b = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return 1721416768;
            }

            public final String toString() {
                return "InfoView";
            }
        }
    }

    /* compiled from: AvitoAction.kt */
    public static final class b implements nt5 {
        public final String b;

        public b(String str) {
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.b, ((b) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("Click(url="), this.b, ')');
        }
    }

    /* compiled from: AvitoAction.kt */
    public static final class c implements nt5 {
        public static final c b = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -1455927317;
        }

        public final String toString() {
            return "Load";
        }
    }

    /* compiled from: AvitoAction.kt */
    public static final class d implements nt5 {
        public static final d b = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 1647599818;
        }

        public final String toString() {
            return "ReloadClick";
        }
    }
}
