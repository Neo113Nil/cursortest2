package xsna;

/* compiled from: LoaderSideEffects.kt */
/* loaded from: classes6.dex */
public interface osz {

    /* compiled from: LoaderSideEffects.kt */
    public static final class a implements osz {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1793821951;
        }

        public final String toString() {
            return "CloseScreen";
        }
    }

    /* compiled from: LoaderSideEffects.kt */
    public static final class b implements osz {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1095098722;
        }

        public final String toString() {
            return "MaxAccountsLimitReached";
        }
    }

    /* compiled from: LoaderSideEffects.kt */
    public static final class c implements osz {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 613512896;
        }

        public final String toString() {
            return "WrongAuthCodeReceived";
        }
    }
}
