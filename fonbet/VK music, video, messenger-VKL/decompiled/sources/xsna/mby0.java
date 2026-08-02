package xsna;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: DaemonThreadFactory.java */
/* loaded from: classes8.dex */
public final class mby0 implements ThreadFactory {
    public final String b;
    public final AtomicInteger c = new AtomicInteger(1);

    public mby0(String str) {
        this.b = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, na8.a(this.c.getAndIncrement(), this.b, "-"));
        thread.setDaemon(true);
        return thread;
    }
}
