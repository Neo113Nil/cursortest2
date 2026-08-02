package xsna;

/* compiled from: RatingBarSizeProperties.kt */
/* loaded from: classes17.dex */
public final class txe0 {
    public final int a;
    public final int b;
    public final int c;

    public txe0(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof txe0)) {
            return false;
        }
        txe0 txe0Var = (txe0) obj;
        return this.a == txe0Var.a && this.b == txe0Var.b && this.c == txe0Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + shy.a(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RatingBarSkeletonSizeProperties(starSize=");
        sb.append(this.a);
        sb.append(", gap=");
        sb.append(this.b);
        sb.append(", horizontalPaddings=");
        return vu5.b(sb, this.c, ')');
    }
}
