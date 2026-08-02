package defpackage;

/* loaded from: classes2.dex */
public final class bec {
    public final ydc a;
    public final double b;

    public bec(ydc ydcVar, double d) {
        this.a = ydcVar;
        this.b = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bec)) {
            return false;
        }
        bec becVar = (bec) obj;
        return this.a.equals(becVar.a) && Double.compare(this.b, becVar.b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.b) + (this.a.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Color(color=");
        sb.append(this.a);
        sb.append(", location=");
        return unr0.q(sb, this.b, ')');
    }
}
