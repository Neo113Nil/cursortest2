package xsna;

/* compiled from: Squircles.kt */
/* loaded from: classes17.dex */
public final class lws {
    public final int a;
    public final double b;

    public lws(int i, double d) {
        this.a = i;
        this.b = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lws)) {
            return false;
        }
        lws lwsVar = (lws) obj;
        return this.a == lwsVar.a && Double.compare(this.b, lwsVar.b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FullSquircleParams(radius=");
        sb.append(this.a);
        sb.append(", curvature=");
        return ojp0.a(sb, this.b, ')');
    }
}
