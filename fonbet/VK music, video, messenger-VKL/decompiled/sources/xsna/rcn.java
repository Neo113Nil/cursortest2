package xsna;

import java.util.concurrent.Executor;
import kotlin.coroutines.EmptyCoroutineContext;

/* compiled from: Executors.kt */
/* loaded from: classes11.dex */
public final class rcn implements Executor {
    public final ovj b;

    public rcn(ovj ovjVar) {
        this.b = ovjVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.b;
        ovj ovjVar = this.b;
        if (upj.d(ovjVar, emptyCoroutineContext)) {
            upj.c(ovjVar, emptyCoroutineContext, runnable);
        } else {
            runnable.run();
        }
    }

    public final String toString() {
        return this.b.toString();
    }
}
