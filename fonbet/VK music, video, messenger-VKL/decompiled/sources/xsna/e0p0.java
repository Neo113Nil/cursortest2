package xsna;

import java.util.concurrent.ExecutionException;
import kotlin.Result;

/* compiled from: ListenableFuture.kt */
/* loaded from: classes11.dex */
public final class e0p0<T> implements Runnable {
    public final ugz<T> b;
    public final lq9 c;

    public e0p0(ugz ugzVar, lq9 lq9Var) {
        this.b = ugzVar;
        this.c = lq9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ugz<T> ugzVar = this.b;
        boolean isCancelled = ugzVar.isCancelled();
        lq9 lq9Var = this.c;
        if (isCancelled) {
            lq9Var.z(null);
            return;
        }
        try {
            lq9Var.resumeWith(kh.g(ugzVar));
        } catch (ExecutionException e) {
            lq9Var.resumeWith(new Result.Failure(e.getCause()));
        }
    }
}
