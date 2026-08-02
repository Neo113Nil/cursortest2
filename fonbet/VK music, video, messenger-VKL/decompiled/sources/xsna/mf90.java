package xsna;

import xsna.aig;

/* compiled from: PagingScrollListener.kt */
/* loaded from: classes7.dex */
public final class mf90 implements df90 {
    public final k59<aig.c> b;
    public final int c = 5;

    public mf90(k59 k59Var) {
        this.b = k59Var;
    }

    @Override // xsna.df90
    public final void e(int i, int i2, int i3, int i4) {
        if (i - this.c > i3 || i3 > i) {
            return;
        }
        this.b.a(aig.c.a);
    }

    @Override // xsna.df90
    public final void l(int i) {
    }
}
