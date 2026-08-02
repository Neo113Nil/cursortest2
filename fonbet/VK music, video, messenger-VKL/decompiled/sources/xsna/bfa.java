package xsna;

/* compiled from: CatalogSectionScreenAction.kt */
/* loaded from: classes16.dex */
public interface bfa extends lj50 {

    /* compiled from: CatalogSectionScreenAction.kt */
    public static final class a implements bfa {
        public static final a b = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1289081609;
        }

        public final String toString() {
            return "OnBackClick";
        }
    }

    /* compiled from: CatalogSectionScreenAction.kt */
    public static final class b implements bfa {
        public final int b;

        public b(int i) {
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.b == ((b) obj).b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("OnIconClick(index="), this.b, ')');
        }
    }

    /* compiled from: CatalogSectionScreenAction.kt */
    @vby
    public static final class c implements bfa {
        public final yda b;

        public final boolean equals(Object obj) {
            if (obj instanceof c) {
                return epx.f(this.b, ((c) obj).b);
            }
            return false;
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "SectionAction(action=" + this.b + ')';
        }
    }
}
