package defpackage;

/* loaded from: classes8.dex */
public final class eoe {
    public final double a;
    public final double b;
    public final double c;

    public eoe(double d, double d2, double d3) {
        this.a = d;
        this.b = d2;
        this.c = d3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eoe)) {
            return false;
        }
        eoe eoeVar = (eoe) obj;
        return Double.compare(this.a, eoeVar.a) == 0 && Double.compare(this.b, eoeVar.b) == 0 && Double.compare(this.c, eoeVar.c) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.c) + unr0.a(Double.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CoordinatesInput(accuracy=");
        sb.append(this.a);
        sb.append(", latitude=");
        sb.append(this.b);
        sb.append(", longitude=");
        return unr0.q(sb, this.c, ')');
    }
}
