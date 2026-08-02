package xsna;

/* compiled from: ZIndexModifier.kt */
/* loaded from: classes11.dex */
public final class y5y0 extends d730<z5y0> {
    public final float a;

    public y5y0(float f) {
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y5y0) && Float.compare(this.a, ((y5y0) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    @Override // xsna.d730
    public final z5y0 r() {
        z5y0 z5y0Var = new z5y0();
        z5y0Var.p = this.a;
        return z5y0Var;
    }

    @Override // xsna.d730
    public final void s(z5y0 z5y0Var) {
        z5y0Var.p = this.a;
    }

    public final String toString() {
        return xq.c(')', this.a, new StringBuilder("ZIndexElement(zIndex="));
    }
}
