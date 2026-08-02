package xsna;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: SafeLoggingExecutor.java */
/* loaded from: classes.dex */
public final class nzg0 implements Executor {
    public final ExecutorService b;

    /* compiled from: SafeLoggingExecutor.java */
    public static class a implements Runnable {
        public final Runnable b;

        public a(Runnable runnable) {
            this.b = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                this.b.run();
            } catch (Exception e) {
                b200.b("Executor", "Background execution failure.", e);
            }
        }
    }

    public nzg0(ExecutorService executorService) {
        this.b = executorService;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.b.execute(new a(runnable));
    }
}
