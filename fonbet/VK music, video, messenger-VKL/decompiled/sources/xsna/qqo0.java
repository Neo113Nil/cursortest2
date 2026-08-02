package xsna;

import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: ThreadFactoryBuilder.java */
/* loaded from: classes13.dex */
public final class qqo0 implements ThreadFactory {
    public final /* synthetic */ ThreadFactory b;
    public final /* synthetic */ AtomicLong c;

    public qqo0(ThreadFactory threadFactory, AtomicLong atomicLong) {
        this.b = threadFactory;
        this.c = atomicLong;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.b.newThread(runnable);
        Objects.requireNonNull(newThread);
        AtomicLong atomicLong = this.c;
        Objects.requireNonNull(atomicLong);
        long andIncrement = atomicLong.getAndIncrement();
        Locale locale = Locale.ROOT;
        newThread.setName("HealthData-HealthDataSdkService-" + andIncrement);
        return newThread;
    }
}
