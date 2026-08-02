package defpackage;

import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.Lifecycle;

/* loaded from: classes6.dex */
public final class eh2 {
    public final git0 a;
    public final azz0 b;
    public final Handler c = new Handler(Looper.getMainLooper());

    public eh2(git0 git0Var, azz0 azz0Var) {
        this.a = git0Var;
        this.b = azz0Var;
    }

    public final Runnable a(Handler handler, boolean z, Runnable runnable, int i) {
        if (!this.a.a.w.a(Lifecycle.State.STARTED) || handler == null) {
            return null;
        }
        if (!z) {
            runnable.run();
            return null;
        }
        this.b.a = false;
        long j = i;
        handler.postDelayed(new hc(19, this, runnable), j);
        this.c.postDelayed(new jg(19, this), j);
        return runnable;
    }
}
