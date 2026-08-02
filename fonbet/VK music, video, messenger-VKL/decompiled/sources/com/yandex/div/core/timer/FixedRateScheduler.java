package com.yandex.div.core.timer;

import android.os.Handler;
import android.os.Looper;
import xsna.gzs;
import xsna.s3q0;

/* compiled from: FixedRateScheduler.kt */
/* loaded from: classes7.dex */
public final class FixedRateScheduler {
    private final Handler handler = new Handler(Looper.getMainLooper());

    public final void cancel() {
        this.handler.removeCallbacksAndMessages(null);
    }

    public final void scheduleAtFixedRate(long j, final long j2, final gzs<s3q0> gzsVar) {
        this.handler.postDelayed(new Runnable() { // from class: com.yandex.div.core.timer.FixedRateScheduler$scheduleAtFixedRate$1
            @Override // java.lang.Runnable
            public void run() {
                Handler handler;
                handler = FixedRateScheduler.this.handler;
                handler.postDelayed(this, j2);
                gzsVar.invoke();
            }
        }, j);
    }
}
