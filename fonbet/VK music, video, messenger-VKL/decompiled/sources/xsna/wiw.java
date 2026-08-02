package xsna;

/* compiled from: ImageGalleryCellEvents.kt */
/* loaded from: classes18.dex */
public interface wiw {

    /* compiled from: ImageGalleryCellEvents.kt */
    public static final class a implements wiw {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 727172987;
        }

        public final String toString() {
            return "OnAddNewOneClick";
        }
    }

    /* compiled from: ImageGalleryCellEvents.kt */
    public static final class b implements wiw {
        public final int a;

        public b(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.a == ((b) obj).a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("OnReloadImageClick(imageId="), this.a, ')');
        }
    }

    /* compiled from: ImageGalleryCellEvents.kt */
    public static final class c implements wiw {
        public final int a;

        public c(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.a == ((c) obj).a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("OnRemoveImageClick(imageId="), this.a, ')');
        }
    }
}
