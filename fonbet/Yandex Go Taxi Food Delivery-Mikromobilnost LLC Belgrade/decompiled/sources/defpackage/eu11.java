package defpackage;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes11.dex */
public abstract class eu11 {
    public static final etx0 a = new etx0(Looper.getMainLooper());

    public static final void a(Runnable runnable) {
        Handler handler = a.a.a;
        if (jl40.l(handler.getLooper(), Looper.myLooper())) {
            runnable.run();
        } else {
            handler.post(runnable);
        }
    }
}
