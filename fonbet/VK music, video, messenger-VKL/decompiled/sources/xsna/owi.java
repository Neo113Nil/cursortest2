package xsna;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* compiled from: ConcurrentExt.kt */
/* loaded from: classes.dex */
public final class owi {
    public static final Handler a = new Handler(Looper.getMainLooper());

    public static final void a(Object obj, long j, gzs<s3q0> gzsVar) {
        Handler handler = a;
        handler.removeCallbacksAndMessages(obj);
        handler.postAtTime(new nwi(gzsVar, 0), obj, SystemClock.uptimeMillis() + j);
    }

    public static final void b(Object obj) {
        a.removeCallbacksAndMessages(obj);
    }
}
