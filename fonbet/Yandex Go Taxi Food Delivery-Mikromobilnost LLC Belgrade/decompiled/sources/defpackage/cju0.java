package defpackage;

/* loaded from: classes5.dex */
public final class cju0 {
    public final double a;
    public final double b;

    public cju0(double d, double d2) {
        this.a = d;
        this.b = d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cju0)) {
            return false;
        }
        cju0 cju0Var = (cju0) obj;
        return Double.compare(this.a, cju0Var.a) == 0 && Double.compare(this.b, cju0Var.b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.b) + (Double.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StorageInfo(totalSpace=");
        sb.append(this.a);
        sb.append(", freeSpace=");
        return unr0.q(sb, this.b, ')');
    }
}
