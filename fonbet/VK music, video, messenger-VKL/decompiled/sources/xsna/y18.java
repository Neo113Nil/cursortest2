package xsna;

/* compiled from: BorderStroke.kt */
/* loaded from: classes11.dex */
public final class y18 {
    public final float a;
    public final yk8 b;

    public y18(float f, yk8 yk8Var) {
        this.a = f;
        this.b = yk8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y18)) {
            return false;
        }
        y18 y18Var = (y18) obj;
        return pco.b(this.a, y18Var.a) && this.b.equals(y18Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BorderStroke(width=");
        oq.f(this.a, ", brush=", sb);
        sb.append(this.b);
        sb.append(')');
        return sb.toString();
    }
}
