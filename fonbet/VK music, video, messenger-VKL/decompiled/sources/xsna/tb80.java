package xsna;

import xsna.q630;

/* compiled from: OnRemeasuredModifier.kt */
/* loaded from: classes11.dex */
public final class tb80 extends q630.c implements lp10 {
    public izs<? super q9x, s3q0> p;
    public final boolean q = true;
    public long r;

    public tb80(izs<? super q9x, s3q0> izsVar) {
        this.p = izsVar;
        long j = Integer.MIN_VALUE;
        this.r = (j & 4294967295L) | (j << 32);
    }

    @Override // xsna.q630.c
    public final boolean X1() {
        return this.q;
    }

    @Override // xsna.lp10
    public final void e(long j) {
        if (q9x.b(this.r, j)) {
            return;
        }
        this.p.invoke(new q9x(j));
        this.r = j;
    }
}
