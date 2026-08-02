package xsna;

/* compiled from: RatingBarSizeProperties.kt */
/* loaded from: classes17.dex */
public final class sxe0 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public sxe0(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sxe0)) {
            return false;
        }
        sxe0 sxe0Var = (sxe0) obj;
        return this.a == sxe0Var.a && this.b == sxe0Var.b && this.c == sxe0Var.c && this.d == sxe0Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + shy.a(this.c, shy.a(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RatingBarSizeProperties(starSize=");
        sb.append(this.a);
        sb.append(", starResId=");
        sb.append(this.b);
        sb.append(", starInnerPadding=");
        sb.append(this.c);
        sb.append(", gap=");
        return vu5.b(sb, this.d, ')');
    }
}
