package xsna;

import android.os.CountDownTimer;

/* compiled from: BannerCompanionView.kt */
/* loaded from: classes16.dex */
public final class y16 extends CountDownTimer {
    public final /* synthetic */ z16 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y16(z16 z16Var) {
        super(5000L, 1000L);
        this.a = z16Var;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        z16 z16Var = this.a;
        z16Var.C = false;
        z16Var.P4(false);
        n16 n16Var = z16Var.A;
        if (n16Var != null) {
            n16Var.b();
        }
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
        this.a.x.setCounterWithAnimation(((int) (j / 1000)) + 1);
    }
}
