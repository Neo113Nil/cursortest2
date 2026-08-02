package ru.ok.android.webrtc.mediaadaptation;

import android.os.Handler;
import java.util.TimerTask;
import xsna.kv2;

/* loaded from: classes9.dex */
public final class PeriodicalNetworkStateProvider$scheduleNextState$1 extends TimerTask {
    public final /* synthetic */ PeriodicalNetworkStateProvider a;

    public PeriodicalNetworkStateProvider$scheduleNextState$1(PeriodicalNetworkStateProvider periodicalNetworkStateProvider) {
        this.a = periodicalNetworkStateProvider;
    }

    public static final void a(PeriodicalNetworkStateProvider periodicalNetworkStateProvider) {
        PeriodicalNetworkStateProvider.access$nextState(periodicalNetworkStateProvider);
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public void run() {
        Handler handler;
        handler = this.a.a;
        handler.post(new kv2(this.a, 8));
    }
}
