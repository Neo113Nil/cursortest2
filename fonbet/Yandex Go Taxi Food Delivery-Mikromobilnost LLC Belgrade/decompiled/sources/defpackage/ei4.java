package defpackage;

/* loaded from: classes2.dex */
public final class ei4 {
    public final double a;
    public final String b;
    public final double c;

    public ei4(String str, double d, double d2) {
        this.a = d;
        this.b = str;
        this.c = d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ei4)) {
            return false;
        }
        ei4 ei4Var = (ei4) obj;
        return Double.compare(this.a, ei4Var.a) == 0 && this.b.equals(ei4Var.b) && Double.compare(this.c, ei4Var.c) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.c) + unr0.b(Double.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Color(a=");
        sb.append(this.a);
        sb.append(", hex=");
        sb.append(this.b);
        sb.append(", location=");
        return unr0.q(sb, this.c, ')');
    }
}
