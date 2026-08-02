package xsna;

import android.os.Handler;
import android.os.Looper;

/* compiled from: AndroidThread.kt */
/* loaded from: classes3.dex */
public final class jd2 {
    public static final jd2 a = new jd2();
    public static volatile Thread b;
    public static volatile Handler c;

    public static void a(Runnable runnable) {
        if (b == null) {
            b = Looper.getMainLooper().getThread();
        }
        if (Thread.currentThread() == b) {
            runnable.run();
            return;
        }
        Handler handler = c;
        if (handler == null) {
            handler = new Handler(Looper.getMainLooper());
            c = handler;
        }
        handler.post(runnable);
    }
}
