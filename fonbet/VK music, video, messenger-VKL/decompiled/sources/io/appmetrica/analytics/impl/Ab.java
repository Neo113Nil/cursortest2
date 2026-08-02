package io.appmetrica.analytics.impl;

import android.os.Handler;
import android.os.SystemClock;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;

/* loaded from: classes8.dex */
public final class Ab {
    public final Handler a;
    public final U2 b;
    public final Bb c;

    public Ab(Handler handler, U2 u2) {
        this.a = handler;
        this.b = u2;
        this.c = new Bb(handler, u2);
    }

    public static void a(Handler handler, U2 u2, Runnable runnable) {
        handler.removeCallbacks(runnable, u2.b.b.getApiKey());
        handler.postAtTime(runnable, u2.b.b.getApiKey(), SystemClock.uptimeMillis() + (((Integer) WrapUtils.getOrDefault(u2.b.b.getSessionTimeout(), 10)).intValue() * 500));
    }
}
