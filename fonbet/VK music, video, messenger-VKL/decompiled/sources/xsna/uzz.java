package xsna;

import android.os.Handler;
import android.os.Looper;
import androidx.recyclerview.widget.RecyclerView;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: LockableAndAttachableSingleCommandMainThreadExecutor.kt */
/* loaded from: classes17.dex */
public final class uzz implements Executor {
    public final Handler b = new Handler(Looper.getMainLooper());
    public final AtomicBoolean c = new AtomicBoolean(false);
    public volatile Runnable d;
    public volatile RecyclerView e;

    public final void a(Runnable runnable) {
        synchronized (this) {
            try {
                if (this.d != null) {
                    return;
                }
                if (this.c.get()) {
                    this.d = runnable;
                    s3q0 s3q0Var = s3q0.a;
                } else {
                    this.b.post(new tzz(0, this, runnable));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this) {
            try {
                if (this.c.get()) {
                    this.d = runnable;
                    s3q0 s3q0Var = s3q0.a;
                } else {
                    this.b.post(new uv6(4, this, runnable));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
