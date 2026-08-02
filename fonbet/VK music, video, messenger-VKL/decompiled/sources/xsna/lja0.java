package xsna;

/* compiled from: PictureClickExcludedBounds.kt */
/* loaded from: classes5.dex */
public final class lja0 {
    public final int a;
    public final int b;

    public lja0(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lja0)) {
            return false;
        }
        lja0 lja0Var = (lja0) obj;
        return this.a == lja0Var.a && this.b == lja0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PictureClickExcludedBounds(topExcludedHeightPx=");
        sb.append(this.a);
        sb.append(", bottomExcludedHeightPx=");
        return vu5.b(sb, this.b, ')');
    }
}
