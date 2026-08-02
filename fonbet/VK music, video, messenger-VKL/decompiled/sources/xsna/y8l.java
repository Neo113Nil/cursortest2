package xsna;

/* compiled from: OrderListItem.kt */
/* loaded from: classes18.dex */
public abstract class y8l {

    /* compiled from: OrderListItem.kt */
    public static final class a extends y8l {
        public final float a = kqu0.v;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && pco.b(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return Float.hashCode(this.a);
        }

        public final String toString() {
            return ir.f(')', this.a, new StringBuilder("Bottom(spaceDp="));
        }
    }

    /* compiled from: OrderListItem.kt */
    public static final class b extends y8l {
        public final float a = 0;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && pco.b(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            return Float.hashCode(this.a);
        }

        public final String toString() {
            return ir.f(')', this.a, new StringBuilder("Middle(spaceDp="));
        }
    }

    /* compiled from: OrderListItem.kt */
    public static final class c extends y8l {
        public final float a = 0;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && pco.b(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            return Float.hashCode(this.a);
        }

        public final String toString() {
            return ir.f(')', this.a, new StringBuilder("Top(spaceDp="));
        }
    }
}
