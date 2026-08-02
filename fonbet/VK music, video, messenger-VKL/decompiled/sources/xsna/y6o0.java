package xsna;

import androidx.annotation.NonNull;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.mlkit:common@@18.7.0 */
/* loaded from: classes13.dex */
public final class y6o0 {
    public boolean b;
    public final Object a = new Object();
    public final ArrayDeque c = new ArrayDeque();
    public final AtomicReference d = new AtomicReference();

    public final void a(@NonNull Runnable runnable, @NonNull Executor executor) {
        synchronized (this.a) {
            try {
                if (this.b) {
                    this.c.add(new zq01(runnable, executor));
                } else {
                    this.b = true;
                    c(runnable, executor);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        synchronized (this.a) {
            try {
                if (this.c.isEmpty()) {
                    this.b = false;
                    return;
                }
                zq01 zq01Var = (zq01) this.c.remove();
                c(zq01Var.b, zq01Var.a);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(Runnable runnable, Executor executor) {
        try {
            executor.execute(new hy4(this, runnable));
        } catch (RejectedExecutionException unused) {
            b();
        }
    }
}
