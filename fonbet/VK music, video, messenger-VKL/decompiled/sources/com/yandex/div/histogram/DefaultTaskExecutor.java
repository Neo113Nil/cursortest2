package com.yandex.div.histogram;

import android.os.Handler;
import android.os.Looper;
import xsna.epx;
import xsna.gzs;
import xsna.hol;
import xsna.s3q0;

/* compiled from: TaskExecutor.kt */
/* loaded from: classes7.dex */
public final class DefaultTaskExecutor implements TaskExecutor {
    private final Handler handler = new Handler(Looper.getMainLooper());

    @Override // com.yandex.div.histogram.TaskExecutor
    public void post(gzs<s3q0> gzsVar) {
        if (epx.f(Looper.myLooper(), Looper.getMainLooper())) {
            gzsVar.invoke();
        } else {
            this.handler.post(new hol(0, gzsVar));
        }
    }
}
