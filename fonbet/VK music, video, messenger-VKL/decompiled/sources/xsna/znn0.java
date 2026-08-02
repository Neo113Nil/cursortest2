package xsna;

/* compiled from: MultiAccountSwitcherLoadingAdapter.kt */
/* loaded from: classes6.dex */
public interface znn0 {

    /* compiled from: MultiAccountSwitcherLoadingAdapter.kt */
    public static final class a implements znn0 {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 934873511;
        }

        public final String toString() {
            return "LoadingContent";
        }
    }

    /* compiled from: MultiAccountSwitcherLoadingAdapter.kt */
    public static final class b implements znn0 {
        public final exo a;

        public b(exo exoVar) {
            this.a = exoVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            return this.a.a.hashCode();
        }

        public final String toString() {
            return "LoadingEcoplate(loadingConfig=" + this.a + ')';
        }
    }

    /* compiled from: MultiAccountSwitcherLoadingAdapter.kt */
    public static final class c implements znn0 {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -1221808225;
        }

        public final String toString() {
            return "LoadingHeader";
        }
    }
}
