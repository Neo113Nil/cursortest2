package defpackage;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes6.dex */
public final class ktg {
    public final Handler a = new Handler(Looper.getMainLooper());
    public Runnable b;

    public final void a() {
        Runnable runnable = this.b;
        if (runnable == null) {
            return;
        }
        this.a.removeCallbacks(runnable);
        this.b = null;
    }
}
