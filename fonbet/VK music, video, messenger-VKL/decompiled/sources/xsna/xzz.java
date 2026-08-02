package xsna;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: LockableSingleCommandMainThreadExecutor.kt */
/* loaded from: classes17.dex */
public final class xzz implements Executor {
    public final AtomicBoolean b = new AtomicBoolean(false);
    public final Handler c = new Handler(Looper.getMainLooper());
    public volatile Runnable d;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this) {
            try {
                if (this.b.get()) {
                    this.d = runnable;
                    s3q0 s3q0Var = s3q0.a;
                } else {
                    this.c.post(runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
