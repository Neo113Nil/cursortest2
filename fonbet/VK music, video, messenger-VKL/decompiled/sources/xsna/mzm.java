package xsna;

import java.util.concurrent.Executor;

/* compiled from: DirectExecutor.java */
/* loaded from: classes11.dex */
public final class mzm implements Executor {
    public static volatile mzm b;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
