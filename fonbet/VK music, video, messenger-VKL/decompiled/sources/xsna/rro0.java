package xsna;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;

/* compiled from: ThreadUtils.java */
/* loaded from: classes11.dex */
public final class rro0 {
    public static final Handler a = new Handler(Looper.getMainLooper());

    public static void a() {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("Not running on main thread when it is required to");
        }
    }

    public static void b(@NonNull Runnable runnable) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            a.post(runnable);
        }
    }
}
