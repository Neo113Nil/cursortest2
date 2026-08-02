package xsna;

import java.util.concurrent.Executor;

/* compiled from: CurrentThreadExecutor.kt */
/* loaded from: classes8.dex */
public final class olk implements Executor {
    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (runnable != null) {
            runnable.run();
        }
    }
}
