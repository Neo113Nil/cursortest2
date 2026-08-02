package xsna;

import android.os.Handler;
import android.os.Looper;

/* compiled from: MainThreadAsyncHandler.java */
/* loaded from: classes11.dex */
public final class dg00 {
    public static volatile Handler a;

    public static Handler a() {
        if (a != null) {
            return a;
        }
        synchronized (dg00.class) {
            try {
                if (a == null) {
                    a = Handler.createAsync(Looper.getMainLooper());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return a;
    }
}
