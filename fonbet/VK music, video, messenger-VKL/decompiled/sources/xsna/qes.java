package xsna;

/* compiled from: FrameBounds.kt */
/* loaded from: classes4.dex */
public final class qes {
    public final double a;
    public final double b;
    public final double c;
    public final double d;

    public qes(double d, double d2, double d3, double d4) {
        this.a = d;
        this.b = d2;
        this.c = d3;
        this.d = d4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qes)) {
            return false;
        }
        qes qesVar = (qes) obj;
        return Double.compare(this.a, qesVar.a) == 0 && Double.compare(this.b, qesVar.b) == 0 && Double.compare(this.c, qesVar.c) == 0 && Double.compare(this.d, qesVar.d) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.d) + zjh0.b(this.c, zjh0.b(this.b, Double.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FrameBounds(height=");
        sb.append(this.a);
        sb.append(", width=");
        sb.append(this.b);
        sb.append(", innerHeight=");
        sb.append(this.c);
        sb.append(", innerWidth=");
        return ojp0.a(sb, this.d, ')');
    }
}
