package xsna;

/* compiled from: RatingBarStyleProperties.kt */
/* loaded from: classes17.dex */
public final class vxe0 {
    public final int a;
    public final int b;

    public vxe0(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vxe0)) {
            return false;
        }
        vxe0 vxe0Var = (vxe0) obj;
        return this.a == vxe0Var.a && this.b == vxe0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RatingBarStyleProperties(colorEmpty=");
        sb.append(this.a);
        sb.append(", colorFilled=");
        return vu5.b(sb, this.b, ')');
    }
}
