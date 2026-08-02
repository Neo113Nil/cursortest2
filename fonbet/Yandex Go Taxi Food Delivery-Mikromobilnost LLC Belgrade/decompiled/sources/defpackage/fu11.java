package defpackage;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public final class fu11 {
    public static final fu11 a = new fu11();
    public static final Handler b = new Handler(Looper.getMainLooper());

    public final boolean a() {
        return jl40.l(Thread.currentThread(), Looper.getMainLooper().getThread());
    }

    public final boolean b(Runnable runnable) {
        return b.post(runnable);
    }
}
