package xsna;

import xsna.q630;

/* compiled from: SwipeableV2.kt */
/* loaded from: classes17.dex */
public final class qln0 extends of6 implements loy, ta80 {
    public final yka0 b;
    public final dm c;
    public float d;
    public float e;

    public qln0(yka0 yka0Var, dm dmVar, izs izsVar) {
        super(izsVar);
        this.b = yka0Var;
        this.c = dmVar;
        this.d = -1.0f;
        this.e = -1.0f;
    }

    @Override // xsna.q630.b, xsna.q630
    public final <R> R a(R r, wzs<? super R, ? super q630.b, ? extends R> wzsVar) {
        return wzsVar.invoke(r, this);
    }

    @Override // xsna.loy
    public final dp10 c(ep10 ep10Var, zo10 zo10Var, long j) {
        if (ep10Var.getDensity() != this.d || ep10Var.getFontScale() != this.e) {
            this.b.invoke(new dzl(ep10Var.getDensity(), ep10Var.getFontScale()));
            this.d = ep10Var.getDensity();
            this.e = ep10Var.getFontScale();
        }
        tra0 N = zo10Var.N(j);
        return ep10Var.Q(N.b, N.c, jgp.b, new pln0(N, 0));
    }

    @Override // xsna.ta80
    public final void e(long j) {
        this.c.invoke(new q9x(j));
    }

    public final String toString() {
        return "SwipeAnchorsModifierImpl(updateDensity=" + this.b + ", onSizeChanged=" + this.c + ')';
    }
}
