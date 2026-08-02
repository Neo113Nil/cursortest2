package xsna;

import android.os.CountDownTimer;

/* compiled from: DynamicCountDownTimer.kt */
/* loaded from: classes15.dex */
public final class dpo extends CountDownTimer {
    public final /* synthetic */ epo a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpo(long j, epo epoVar) {
        super(j, 1000L);
        this.a = epoVar;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        ((com.vk.biometrics.lock.impl.presentation.base.mvi.pin.b) this.a.b).j.b(new j77(new wla0(false, -1L, 1)));
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
        ((com.vk.biometrics.lock.impl.presentation.base.mvi.pin.b) this.a.b).j.b(new j77(new wla0(true, an10.c(j / 1000.0d) * 1000, 1)));
    }
}
