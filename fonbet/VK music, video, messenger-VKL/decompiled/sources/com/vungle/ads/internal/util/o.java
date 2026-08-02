package com.vungle.ads.internal.util;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* loaded from: classes7.dex */
public final class o {
    public final Handler a = new Handler(Looper.getMainLooper());

    public final void a(Runnable runnable, long j) {
        this.a.postAtTime(runnable, SystemClock.uptimeMillis() + j);
    }
}
