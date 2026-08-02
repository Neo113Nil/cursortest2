package xsna;

/* compiled from: EduMaxTransitionBanner.kt */
/* loaded from: classes2.dex */
public interface h6p {

    /* compiled from: EduMaxTransitionBanner.kt */
    public static final class a implements h6p {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1594663284;
        }

        public final String toString() {
            return "Empty";
        }
    }

    /* compiled from: EduMaxTransitionBanner.kt */
    public static final class b implements h6p {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            ((b) obj).getClass();
            return true;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "Loaded(data=null)";
        }
    }
}
