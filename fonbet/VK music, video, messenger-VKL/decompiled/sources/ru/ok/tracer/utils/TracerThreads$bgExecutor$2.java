package ru.ok.tracer.utils;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.Lambda;
import ru.ok.tracer.CoreTracerConfiguration;
import xsna.gzs;

/* compiled from: TracerThreads.kt */
/* loaded from: classes11.dex */
public final class TracerThreads$bgExecutor$2 extends Lambda implements gzs<Executor> {
    public static final TracerThreads$bgExecutor$2 INSTANCE = new TracerThreads$bgExecutor$2();

    public TracerThreads$bgExecutor$2() {
        super(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Thread invoke$lambda$0(Runnable runnable) {
        return new Thread(runnable, "tracer-scheduler");
    }

    @Override // xsna.gzs
    public final Executor invoke() {
        Executor bgExecutor$tracer_commons_release = CoreTracerConfiguration.Companion.get().getBgExecutor$tracer_commons_release();
        return bgExecutor$tracer_commons_release != null ? new SequentialExecutor(bgExecutor$tracer_commons_release) : Executors.newSingleThreadExecutor(new a());
    }
}
