package xsna;

/* compiled from: CatalogSectionScreenEvent.kt */
/* loaded from: classes16.dex */
public interface dfa extends pk50 {

    /* compiled from: CatalogSectionScreenEvent.kt */
    public static final class a implements dfa {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1800983785;
        }

        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: CatalogSectionScreenEvent.kt */
    @vby
    public static final class b implements dfa {
        public final bea a;

        public final boolean equals(Object obj) {
            if (obj instanceof b) {
                return epx.f(this.a, ((b) obj).a);
            }
            return false;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "SectionEvent(event=" + this.a + ')';
        }
    }
}
