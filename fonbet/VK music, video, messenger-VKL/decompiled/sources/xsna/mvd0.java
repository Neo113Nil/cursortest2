package xsna;

/* compiled from: ProfileCountersState.kt */
/* loaded from: classes17.dex */
public interface mvd0 {

    /* compiled from: ProfileCountersState.kt */
    public interface a extends mvd0 {

        /* compiled from: ProfileCountersState.kt */
        /* renamed from: xsna.mvd0$a$a, reason: collision with other inner class name */
        public static final class C3374a implements a {
            public final xow<lvd0> a;

            public C3374a(xow<lvd0> xowVar) {
                this.a = xowVar;
            }

            @Override // xsna.mvd0.a
            public final xow<lvd0> H() {
                return this.a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C3374a) && epx.f(this.a, ((C3374a) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "Stable(counters=" + this.a + ')';
            }
        }

        /* compiled from: ProfileCountersState.kt */
        public static final class b implements a {
            public final xow<lvd0> a;

            public b(xow<lvd0> xowVar) {
                this.a = xowVar;
            }

            @Override // xsna.mvd0.a
            public final xow<lvd0> H() {
                return this.a;
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
                return "Updating(counters=" + this.a + ')';
            }
        }

        xow<lvd0> H();
    }

    /* compiled from: ProfileCountersState.kt */
    public static final class b implements mvd0 {
        public final int a;

        public b(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.a == ((b) obj).a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("Loading(countersCount="), this.a, ')');
        }
    }
}
