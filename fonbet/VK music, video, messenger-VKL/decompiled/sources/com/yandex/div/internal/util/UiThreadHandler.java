package com.yandex.div.internal.util;

import android.os.Handler;
import android.os.Looper;
import xsna.epx;
import xsna.gzs;
import xsna.oo6;
import xsna.s3q0;

/* compiled from: UiThreadHandler.kt */
/* loaded from: classes7.dex */
public final class UiThreadHandler {
    public static final UiThreadHandler INSTANCE = new UiThreadHandler();
    private static final Handler INSTANCE$1 = new Handler(Looper.getMainLooper());

    private UiThreadHandler() {
    }

    public static final Handler get() {
        return INSTANCE$1;
    }

    public static final boolean isMainThread() {
        return epx.f(Thread.currentThread(), mainThread());
    }

    public static final Thread mainThread() {
        return Looper.getMainLooper().getThread();
    }

    public final boolean postOnMainThread(gzs<s3q0> gzsVar) {
        return INSTANCE$1.post(new oo6(gzsVar, 10));
    }
}
