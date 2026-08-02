package xsna;

/* compiled from: OnMediaPlaceable.kt */
/* loaded from: classes18.dex */
public abstract class o880 {

    /* compiled from: OnMediaPlaceable.kt */
    public static final class a extends o880 {
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
            return vu5.b(new StringBuilder("BottomOffsetChanged(offset="), this.a, ')');
        }
    }

    /* compiled from: OnMediaPlaceable.kt */
    public static final class b extends o880 {
        public final boolean a;

        public b(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.a == ((b) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("OverlayVisibilityChanged(isVisible="), this.a, ')');
        }
    }
}
