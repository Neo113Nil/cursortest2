package xsna;

/* compiled from: LoaderScreenPatch.kt */
/* loaded from: classes6.dex */
public interface ksz extends xl50 {

    /* compiled from: LoaderScreenPatch.kt */
    public static final class a implements ksz {
        public static final a b = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 876003151;
        }

        public final String toString() {
            return "AccountsLimitReached";
        }
    }

    /* compiled from: LoaderScreenPatch.kt */
    public static final class b implements ksz {
        public final Throwable b;

        public b(Throwable th) {
            this.b = th;
        }
    }

    /* compiled from: LoaderScreenPatch.kt */
    public static final class c implements ksz {
        public static final c b = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 606849226;
        }

        public final String toString() {
            return "Loading";
        }
    }

    /* compiled from: LoaderScreenPatch.kt */
    public static final class d implements ksz {
        public static final d b = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -1353972847;
        }

        public final String toString() {
            return "WrongAuthCodeReceived";
        }
    }
}
