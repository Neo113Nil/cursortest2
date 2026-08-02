package xsna;

import java.lang.Thread;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: DaemonThreadFactory.java */
/* loaded from: classes8.dex */
public final class ask implements ThreadFactory {
    public final String b;
    public final AtomicInteger c;
    public final ThreadFactory d;

    /* compiled from: DaemonThreadFactory.java */
    public static class a implements Thread.UncaughtExceptionHandler {
        public final Thread.UncaughtExceptionHandler a;

        public a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.a = uncaughtExceptionHandler;
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public final void uncaughtException(Thread thread, Throwable th) {
            if (th instanceof InterruptedException) {
                thread.interrupt();
                return;
            }
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.a;
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(thread, th);
            }
        }
    }

    public ask() {
        ThreadFactory defaultThreadFactory = Executors.defaultThreadFactory();
        this.c = new AtomicInteger();
        this.b = "PeriodicMetricReader";
        this.d = defaultThreadFactory;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.d.newThread(runnable);
        newThread.setUncaughtExceptionHandler(new a(newThread.getUncaughtExceptionHandler()));
        try {
            newThread.setDaemon(true);
            newThread.setName(this.b + "-" + this.c.incrementAndGet());
            newThread.setContextClassLoader(null);
        } catch (SecurityException unused) {
        }
        return newThread;
    }
}
