package xsna;

import xsna.q630;

/* compiled from: ChildParentSemantics.kt */
/* loaded from: classes11.dex */
public final class qi90 extends q630.c implements npp0, fgi0 {
    public izs<? super tgi0, s3q0> p;
    public boolean q;
    public final znk0 r = znk0.h;

    public qi90(jh3 jh3Var) {
        this.p = jh3Var;
    }

    @Override // xsna.npp0
    public final Object g0() {
        return this.r;
    }

    @Override // xsna.fgi0
    public final void l1(tgi0 tgi0Var) {
        if (this.q) {
            return;
        }
        this.p.invoke(tgi0Var);
    }

    @Override // xsna.fgi0
    public final boolean q1() {
        return true;
    }
}
