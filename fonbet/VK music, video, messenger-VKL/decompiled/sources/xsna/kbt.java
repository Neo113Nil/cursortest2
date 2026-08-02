package xsna;

/* compiled from: GamesCatalogErrorState.kt */
/* loaded from: classes17.dex */
public abstract class kbt {

    /* compiled from: GamesCatalogErrorState.kt */
    public static final class a extends kbt {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -574206913;
        }

        public final String toString() {
            return "InternetErrorState";
        }
    }

    /* compiled from: GamesCatalogErrorState.kt */
    public static final class b extends kbt {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -509853584;
        }

        public final String toString() {
            return "LoadingErrorState";
        }
    }
}
