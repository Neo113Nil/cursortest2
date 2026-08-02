package xsna;

/* compiled from: ChatClipsTopBarDecorationNavigationEvent.kt */
/* loaded from: classes2.dex */
public interface ipb {

    /* compiled from: ChatClipsTopBarDecorationNavigationEvent.kt */
    public static final class a implements ipb {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -931535638;
        }

        public final String toString() {
            return "NavigateBack";
        }
    }

    /* compiled from: ChatClipsTopBarDecorationNavigationEvent.kt */
    public static final class b implements ipb {
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
            return "OpenSender(dialogExt=null)";
        }
    }
}
