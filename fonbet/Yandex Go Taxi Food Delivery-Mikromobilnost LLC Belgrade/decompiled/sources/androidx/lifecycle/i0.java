package androidx.lifecycle;

import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.Lifecycle;

/* loaded from: classes.dex */
public final class i0 {
    public final t a;
    public final Handler b = new Handler(Looper.getMainLooper());
    public h0 c;

    public i0(LifecycleService lifecycleService) {
        this.a = new t(lifecycleService, true);
    }

    public final void a(Lifecycle.Event event) {
        h0 h0Var = this.c;
        if (h0Var != null) {
            h0Var.run();
        }
        h0 h0Var2 = new h0(this.a, event);
        this.c = h0Var2;
        this.b.postAtFrontOfQueue(h0Var2);
    }
}
