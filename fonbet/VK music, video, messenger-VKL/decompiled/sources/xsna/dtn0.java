package xsna;

/* compiled from: InternalTabs.kt */
/* loaded from: classes17.dex */
public final class dtn0 {
    public final float a;
    public final float b;

    public dtn0(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dtn0)) {
            return false;
        }
        dtn0 dtn0Var = (dtn0) obj;
        return pco.b(this.a, dtn0Var.a) && pco.b(this.b, dtn0Var.b);
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TabPosition(left=");
        float f = this.a;
        oq.f(f, ", right=", sb);
        float f2 = this.b;
        sb.append((Object) pco.c(f + f2));
        sb.append(", width=");
        sb.append((Object) pco.c(f2));
        sb.append(')');
        return sb.toString();
    }
}
