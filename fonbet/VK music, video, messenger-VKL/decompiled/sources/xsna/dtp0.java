package xsna;

/* compiled from: AnimationSpec.kt */
/* loaded from: classes11.dex */
public final class dtp0<T> implements aoo<T> {
    public final int a;
    public final int b;
    public final huo c;

    public dtp0() {
        this(0, (huo) null, 7);
    }

    @Override // xsna.iq2
    public final tlr0 a(itp0 itp0Var) {
        return new hmr0(this.a, this.b, this.c);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dtp0) {
            dtp0 dtp0Var = (dtp0) obj;
            if (dtp0Var.a == this.a && dtp0Var.b == this.b && epx.f(dtp0Var.c, this.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.c.hashCode() + (this.a * 31)) * 31) + this.b;
    }

    public dtp0(int i, huo huoVar, int i2) {
        this((i2 & 1) != 0 ? 300 : i, 0, (i2 & 4) != 0 ? luo.a : huoVar);
    }

    @Override // xsna.aoo, xsna.phr, xsna.iq2
    public final wlr0 a(itp0 itp0Var) {
        return new hmr0(this.a, this.b, this.c);
    }

    @Override // xsna.phr, xsna.iq2
    public final xlr0 a(itp0 itp0Var) {
        return new hmr0(this.a, this.b, this.c);
    }

    public dtp0(int i, int i2, huo huoVar) {
        this.a = i;
        this.b = i2;
        this.c = huoVar;
    }
}
