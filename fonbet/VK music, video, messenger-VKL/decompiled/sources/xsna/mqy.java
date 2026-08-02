package xsna;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: LazyExecutorFacade.kt */
/* loaded from: classes.dex */
public final class mqy implements Executor {
    public final gzs<ExecutorService> b;

    /* JADX WARN: Multi-variable type inference failed */
    public mqy(gzs<? extends ExecutorService> gzsVar) {
        this.b = gzsVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.b.invoke().execute(runnable);
    }
}
