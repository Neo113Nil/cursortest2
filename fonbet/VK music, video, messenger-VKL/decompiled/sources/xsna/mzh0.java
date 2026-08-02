package xsna;

/* compiled from: SearchDelegateFactory.kt */
/* loaded from: classes5.dex */
public interface mzh0 {

    /* compiled from: SearchDelegateFactory.kt */
    public static final class a implements mzh0 {
        public final boolean a;

        public a() {
            this(3);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a == ((a) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(false) + (Boolean.hashCode(this.a) * 31);
        }

        public final String toString() {
            return n23.b(new StringBuilder("SearchWithParams(isParamsDescriptionEnabled="), this.a, ", isFiltersIconAlwaysVisible=false)");
        }

        public a(int i) {
            this.a = (i & 1) == 0;
        }
    }

    /* compiled from: SearchDelegateFactory.kt */
    public static final class b implements mzh0 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -598769370;
        }

        public final String toString() {
            return "SearchWithoutParams";
        }
    }
}
