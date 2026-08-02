package xsna;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: ReleasableExecutor.java */
/* loaded from: classes12.dex */
public final class gtf0 implements Executor {
    public final /* synthetic */ Executor b;
    public final /* synthetic */ gr c;

    public gtf0(ExecutorService executorService, gr grVar) {
        this.b = executorService;
        this.c = grVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.b.execute(runnable);
    }
}
