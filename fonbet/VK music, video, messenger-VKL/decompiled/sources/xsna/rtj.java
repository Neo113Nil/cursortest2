package xsna;

import xsna.q630;

/* compiled from: SemanticsModifier.kt */
/* loaded from: classes11.dex */
public final class rtj extends q630.c implements fgi0 {
    public boolean p;
    public final boolean q;
    public izs<? super tgi0, s3q0> r;

    public rtj(izs izsVar, boolean z, boolean z2) {
        this.p = z;
        this.q = z2;
        this.r = izsVar;
    }

    @Override // xsna.fgi0
    public final void l1(tgi0 tgi0Var) {
        this.r.invoke(tgi0Var);
    }

    @Override // xsna.fgi0
    public final boolean p0() {
        return this.q;
    }

    @Override // xsna.fgi0
    public final boolean q1() {
        return this.p;
    }
}
