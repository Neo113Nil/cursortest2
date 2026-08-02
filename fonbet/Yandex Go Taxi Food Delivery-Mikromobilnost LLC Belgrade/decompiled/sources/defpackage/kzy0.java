package defpackage;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes11.dex */
public abstract class kzy0 {
    public static final Thread a;

    static {
        new Handler(Looper.getMainLooper());
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            a = mainLooper.getThread();
        } else {
            ny61.r("No main looper");
        }
    }
}
