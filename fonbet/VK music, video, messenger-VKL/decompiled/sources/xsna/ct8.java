package xsna;

import xsna.qpk;

/* compiled from: BuyMusicSubscriptionController.kt */
/* loaded from: classes3.dex */
public final class ct8 implements qpk.a {
    public final /* synthetic */ dt8 b;

    public ct8(dt8 dt8Var) {
        this.b = dt8Var;
    }

    @Override // xsna.qpk.a
    public final void r(int i) {
        dt8 dt8Var = this.b;
        String str = dt8Var.n;
        u750 u750Var = dt8Var.o;
        if (i == 5) {
            u750Var.X(str, "swipe_close");
            u750Var.D(str, dt8Var.r, true);
        }
    }

    @Override // xsna.qpk.a
    public final void C(float f) {
    }
}
