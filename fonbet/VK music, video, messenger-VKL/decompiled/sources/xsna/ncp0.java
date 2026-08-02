package xsna;

/* compiled from: TopshelfPagerPageKey.kt */
/* loaded from: classes2.dex */
public interface ncp0 {

    /* compiled from: TopshelfPagerPageKey.kt */
    public static final class a implements ncp0 {
        public final int a;

        public a(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a == ((a) obj).a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("PageIndex(index="), this.a, ')');
        }
    }

    /* compiled from: TopshelfPagerPageKey.kt */
    public static final class b implements ncp0 {
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
            return "SlideId(id=null)";
        }
    }
}
