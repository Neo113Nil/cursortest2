package defpackage;

/* loaded from: classes8.dex */
public final class azt0 extends h55 {
    public final h55 D;
    public final Object E;
    public final sy60 F;
    public final csz G;

    public azt0(h55 h55Var, Object obj, sy60 sy60Var, csz cszVar) {
        super(null);
        this.D = h55Var;
        this.E = obj;
        this.F = sy60Var;
        this.G = cszVar;
    }

    @Override // defpackage.h55
    public final void G(Object obj) {
        P();
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        this.c = new ate0(18, this);
    }

    public final void P() {
        h55 h55Var = this.D;
        if (h55Var.w() || !((Boolean) this.G.invoke()).booleanValue()) {
            return;
        }
        A(h55Var, this.E, this.F);
    }
}
