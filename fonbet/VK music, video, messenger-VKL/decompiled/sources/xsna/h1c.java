package xsna;

/* compiled from: CheckSignInPatch.kt */
/* loaded from: classes6.dex */
public interface h1c extends xl50 {

    /* compiled from: CheckSignInPatch.kt */
    public static final class a implements h1c {
        public final Throwable b;

        public a(Throwable th) {
            this.b = th;
        }
    }

    /* compiled from: CheckSignInPatch.kt */
    public static final class b implements h1c {
        public static final b b = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1461906761;
        }

        public final String toString() {
            return "Authenticating";
        }
    }

    /* compiled from: CheckSignInPatch.kt */
    public static final class c implements h1c {
        public static final c b = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -1457380796;
        }

        public final String toString() {
            return "PeriodicallyCheckingStatus";
        }
    }

    /* compiled from: CheckSignInPatch.kt */
    public static final class d implements h1c {
        public static final d b = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -296635860;
        }

        public final String toString() {
            return "ShowExpiredQrErrorDialog";
        }
    }
}
