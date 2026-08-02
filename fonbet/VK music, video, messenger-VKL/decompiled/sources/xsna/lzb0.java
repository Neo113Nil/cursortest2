package xsna;

/* compiled from: Position.kt */
/* loaded from: classes7.dex */
public final class lzb0 {
    public static final lzb0 c = new lzb0(0, 0);
    public final int a;
    public final int b;

    public lzb0(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lzb0)) {
            return false;
        }
        lzb0 lzb0Var = (lzb0) obj;
        return this.a == lzb0Var.a && this.b == lzb0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Position(x=");
        sb.append(this.a);
        sb.append(", y=");
        return vu5.b(sb, this.b, ')');
    }
}
