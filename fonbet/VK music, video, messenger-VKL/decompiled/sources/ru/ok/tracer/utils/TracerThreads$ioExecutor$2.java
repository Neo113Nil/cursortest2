package ru.ok.tracer.utils;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Lambda;
import ru.ok.tracer.CoreTracerConfiguration;
import xsna.gzs;
import xsna.lhg;

/* compiled from: TracerThreads.kt */
/* loaded from: classes11.dex */
public final class TracerThreads$ioExecutor$2 extends Lambda implements gzs<Executor> {
    public static final TracerThreads$ioExecutor$2 INSTANCE = new TracerThreads$ioExecutor$2();

    public TracerThreads$ioExecutor$2() {
        super(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Thread invoke$lambda$0(AtomicInteger atomicInteger, Runnable runnable) {
        return new Thread(runnable, lhg.a(atomicInteger.getAndIncrement(), "tracer-io-"));
    }

    @Override // xsna.gzs
    public final Executor invoke() {
        Executor ioExecutor$tracer_commons_release = CoreTracerConfiguration.Companion.get().getIoExecutor$tracer_commons_release();
        if (ioExecutor$tracer_commons_release != null) {
            return ioExecutor$tracer_commons_release;
        }
        final AtomicInteger atomicInteger = new AtomicInteger(0);
        return Executors.newCachedThreadPool(new ThreadFactory() { // from class: ru.ok.tracer.utils.b
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Thread invoke$lambda$0;
                invoke$lambda$0 = TracerThreads$ioExecutor$2.invoke$lambda$0(atomicInteger, runnable);
                return invoke$lambda$0;
            }
        });
    }
}
