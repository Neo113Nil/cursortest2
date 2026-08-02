package xsna;

import java.util.concurrent.Executor;

/* compiled from: Tasks.kt */
/* loaded from: classes11.dex */
public final class lzm implements Executor {
    public static final lzm b = new lzm();

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
