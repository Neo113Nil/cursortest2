package io.appmetrica.analytics.impl;

import android.os.Handler;
import android.os.Looper;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreapi.internal.executors.InterruptionSafeThread;
import io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider;
import java.util.concurrent.Executor;
import xsna.ho8;
import xsna.v1v;

/* loaded from: classes8.dex */
public final class K9 implements ExecutorProvider {
    public final C5227uk a;
    public final IHandlerExecutor b;

    public K9() {
        C5227uk w = C5342za.k().w();
        this.a = w;
        this.b = w.c();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider
    public final IHandlerExecutor getDefaultExecutor() {
        return this.a.a();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider
    public final InterruptionSafeThread getInterruptionThread(String str, String str2, Runnable runnable) {
        StringBuilder b = ho8.b(v1v.a('-', str, str2), "-");
        b.append(Kd.a.incrementAndGet());
        return new InterruptionSafeThread(runnable, b.toString());
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider
    public final IHandlerExecutor getModuleExecutor() {
        return this.b;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider
    public final Executor getReportRunnableExecutor() {
        return this.a.e();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider
    public final IHandlerExecutor getSupportIOExecutor() {
        C5227uk c5227uk = this.a;
        if (c5227uk.f == null) {
            synchronized (c5227uk) {
                try {
                    if (c5227uk.f == null) {
                        c5227uk.a.getClass();
                        HandlerThreadC5063ob a = L9.a("IAA-SIO");
                        c5227uk.f = new L9(a, a.getLooper(), new Handler(a.getLooper()));
                    }
                } finally {
                }
            }
        }
        return c5227uk.f;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider
    public final Executor getUiExecutor() {
        C5227uk c5227uk = this.a;
        if (c5227uk.h == null) {
            synchronized (c5227uk) {
                try {
                    if (c5227uk.h == null) {
                        c5227uk.a.getClass();
                        c5227uk.h = new ExecutorC5175sk(new Handler(Looper.getMainLooper()));
                    }
                } finally {
                }
            }
        }
        return c5227uk.h;
    }
}
