package xsna;

/* compiled from: TextWithSuffixLayout.kt */
/* loaded from: classes3.dex */
public final class y2n0 {
    public final int a;
    public final int b;

    public y2n0(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y2n0)) {
            return false;
        }
        y2n0 y2n0Var = (y2n0) obj;
        return this.a == y2n0Var.a && this.b == y2n0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SuffixPosition(x=");
        sb.append(this.a);
        sb.append(", y=");
        return vu5.b(sb, this.b, ')');
    }
}
