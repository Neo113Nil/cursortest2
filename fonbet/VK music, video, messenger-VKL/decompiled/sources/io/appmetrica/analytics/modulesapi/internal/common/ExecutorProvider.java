package io.appmetrica.analytics.modulesapi.internal.common;

import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreapi.internal.executors.InterruptionSafeThread;
import java.util.concurrent.Executor;

/* loaded from: classes8.dex */
public interface ExecutorProvider {
    IHandlerExecutor getDefaultExecutor();

    InterruptionSafeThread getInterruptionThread(String str, String str2, Runnable runnable);

    IHandlerExecutor getModuleExecutor();

    Executor getReportRunnableExecutor();

    IHandlerExecutor getSupportIOExecutor();

    Executor getUiExecutor();
}
