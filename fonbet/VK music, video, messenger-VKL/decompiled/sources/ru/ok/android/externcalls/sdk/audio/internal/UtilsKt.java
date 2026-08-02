package ru.ok.android.externcalls.sdk.audio.internal;

import android.os.Looper;
import xsna.epx;

/* compiled from: Utils.kt */
/* loaded from: classes9.dex */
public final class UtilsKt {
    public static final void checkIsOnMainThread() {
        if (!epx.f(Thread.currentThread(), Looper.getMainLooper().getThread())) {
            throw new IllegalStateException("Not on main thread!");
        }
    }
}
