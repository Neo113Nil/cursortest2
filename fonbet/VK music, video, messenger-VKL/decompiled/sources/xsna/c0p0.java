package xsna;

import java.util.concurrent.ExecutionException;
import kotlin.Result;

/* compiled from: WorkerWrapper.kt */
/* loaded from: classes.dex */
public final class c0p0<T> implements Runnable {
    public final ugz<T> b;
    public final lq9 c;

    public c0p0(ugz ugzVar, lq9 lq9Var) {
        this.b = ugzVar;
        this.c = lq9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        T t;
        ugz<T> ugzVar = this.b;
        boolean isCancelled = ugzVar.isCancelled();
        lq9 lq9Var = this.c;
        if (isCancelled) {
            lq9Var.z(null);
            return;
        }
        boolean z = false;
        while (true) {
            try {
                try {
                    t = ugzVar.get();
                    break;
                } catch (InterruptedException unused) {
                    z = true;
                } catch (Throwable th) {
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            } catch (ExecutionException e) {
                lq9Var.resumeWith(new Result.Failure(e.getCause()));
                return;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        lq9Var.resumeWith(t);
    }
}
