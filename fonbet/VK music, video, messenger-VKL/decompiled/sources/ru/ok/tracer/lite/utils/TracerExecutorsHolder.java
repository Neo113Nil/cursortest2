package ru.ok.tracer.lite.utils;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import ru.ok.tracer.lite.TracerLite;
import ru.ok.tracer.lite.utils.TracerExecutorsHolder;
import xsna.zcl;
import xsna.zil0;

/* compiled from: TracerExecutorsHolder.kt */
/* loaded from: classes11.dex */
public final class TracerExecutorsHolder {
    public static final Companion Companion = new Companion(null);
    private final Executor ioExecutor;

    /* compiled from: TracerExecutorsHolder.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Executor createIoExecutor(final String str) {
            final AtomicInteger atomicInteger = new AtomicInteger(0);
            return Executors.newCachedThreadPool(new ThreadFactory() { // from class: xsna.cep0
                @Override // java.util.concurrent.ThreadFactory
                public final Thread newThread(Runnable runnable) {
                    Thread createIoExecutor$lambda$0;
                    createIoExecutor$lambda$0 = TracerExecutorsHolder.Companion.createIoExecutor$lambda$0(atomicInteger, str, runnable);
                    return createIoExecutor$lambda$0;
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Thread createIoExecutor$lambda$0(AtomicInteger atomicInteger, String str, Runnable runnable) {
            return new Thread(runnable, zil0.a(atomicInteger.getAndIncrement(), "tracer-io-", str, "-"));
        }

        public final TracerExecutorsHolder get(TracerLite tracerLite) {
            return tracerLite.getExecutorHolder$tracer_lite_commons_release();
        }

        private Companion() {
        }
    }

    public TracerExecutorsHolder(Executor executor, String str) {
        this.ioExecutor = executor == null ? Companion.createIoExecutor(str) : executor;
    }

    public final Executor getIoExecutor() {
        return this.ioExecutor;
    }
}
