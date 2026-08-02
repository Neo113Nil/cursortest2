package xsna;

import android.os.CountDownTimer;
import android.widget.TextView;

/* compiled from: MethodSelectorButtonsController.kt */
/* loaded from: classes15.dex */
public final class qj20 extends CountDownTimer {
    public final /* synthetic */ pj20 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qj20(long j, pj20 pj20Var) {
        super(j, 1000L);
        this.a = pj20Var;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        pj20 pj20Var = this.a;
        TextView textView = pj20Var.d;
        CountDownTimer countDownTimer = pj20Var.l;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        pj20Var.l = null;
        textView.setClickable(true);
        textView.setEnabled(true);
        pj20Var.a();
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
        this.a.c(j);
    }
}
