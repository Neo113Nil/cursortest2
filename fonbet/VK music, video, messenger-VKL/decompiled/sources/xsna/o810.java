package xsna;

import xsna.b910;

/* compiled from: MarketMultiPickerPagingHelper.kt */
/* loaded from: classes18.dex */
public final class o810 implements df90 {
    public final izs<b910.g, s3q0> b;
    public final int c;

    public o810(fa00 fa00Var, int i) {
        this.b = fa00Var;
        this.c = i;
    }

    @Override // xsna.df90
    public final void e(int i, int i2, int i3, int i4) {
        if (i - 6 > i3 || i3 > i) {
            return;
        }
        this.b.invoke(new b910.g(this.c));
    }

    @Override // xsna.df90
    public final void l(int i) {
    }
}
