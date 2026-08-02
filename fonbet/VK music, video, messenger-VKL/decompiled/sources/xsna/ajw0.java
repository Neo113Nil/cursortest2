package xsna;

/* compiled from: VoipCallServiceViewEvent.kt */
/* loaded from: classes7.dex */
public interface ajw0 {

    /* compiled from: VoipCallServiceViewEvent.kt */
    public interface a extends ajw0 {

        /* compiled from: VoipCallServiceViewEvent.kt */
        /* renamed from: xsna.ajw0$a$a, reason: collision with other inner class name */
        public static final class C2547a implements a {
            public static final C2547a a = new C2547a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C2547a);
            }

            public final int hashCode() {
                return -1722483375;
            }

            public final String toString() {
                return "Added";
            }
        }

        /* compiled from: VoipCallServiceViewEvent.kt */
        public static final class b implements a {
            public static final b a = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -995273185;
            }

            public final String toString() {
                return "Followed";
            }
        }
    }

    /* compiled from: VoipCallServiceViewEvent.kt */
    public static final class b implements ajw0 {
        public final shw0 a;

        public b(shw0 shw0Var) {
            this.a = shw0Var;
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
            return "RequestSyncContacts(from=" + this.a + ')';
        }
    }

    /* compiled from: VoipCallServiceViewEvent.kt */
    public static final class c implements ajw0 {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 1405740088;
        }

        public final String toString() {
            return "ScrollToTopSearchRV";
        }
    }
}
