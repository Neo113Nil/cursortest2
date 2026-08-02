package xsna;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: LottieThreadFactory.java */
/* loaded from: classes12.dex */
public final class y800 implements ThreadFactory {
    public static final AtomicInteger e = new AtomicInteger(1);
    public final ThreadGroup b;
    public final AtomicInteger c = new AtomicInteger(1);
    public final String d;

    public y800() {
        SecurityManager securityManager = System.getSecurityManager();
        this.b = securityManager == null ? Thread.currentThread().getThreadGroup() : securityManager.getThreadGroup();
        this.d = "lottie-" + e.getAndIncrement() + "-thread-";
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(this.b, runnable, this.d + this.c.getAndIncrement(), 0L);
        thread.setDaemon(false);
        thread.setPriority(10);
        return thread;
    }
}
