package ru.ok.tracer.utils;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import kotlin.Lazy;
import xsna.bpn0;
import xsna.xq3;

/* compiled from: TracerThreads.kt */
/* loaded from: classes11.dex */
public final class TracerThreads {
    public static final TracerThreads INSTANCE = new TracerThreads();
    private static final Lazy ioExecutor$delegate = new bpn0(TracerThreads$ioExecutor$2.INSTANCE);
    private static final Lazy bgExecutor$delegate = new bpn0(TracerThreads$bgExecutor$2.INSTANCE);

    private TracerThreads() {
    }

    private final Executor getBgExecutor() {
        return (Executor) bgExecutor$delegate.getValue();
    }

    private final Executor getIoExecutor() {
        return (Executor) ioExecutor$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void runInBgAfterStartup$lambda$0(Runnable runnable) {
        INSTANCE.runInBgSequential(runnable);
    }

    public final void runInBgAfterStartup(Runnable runnable) {
        new Handler(Looper.getMainLooper()).post(new xq3(runnable, 13));
    }

    public final void runInBgSequential(Runnable runnable) {
        getBgExecutor().execute(runnable);
    }

    public final void runOnIo(Runnable runnable) {
        getIoExecutor().execute(runnable);
    }
}
