package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.AppMetricaLibraryAdapterConfig;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import java.util.concurrent.TimeUnit;
import xsna.mxz;

/* renamed from: io.appmetrica.analytics.impl.b0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C4716b0 {
    public final C5332z0 a;
    public final C4866gl b;
    public final C4772d4 c;
    public final long d = TimeUnit.SECONDS.toMillis(10);

    public C4716b0(C5332z0 c5332z0, C4866gl c4866gl, C4772d4 c4772d4) {
        this.a = c5332z0;
        this.b = c4866gl;
        this.c = c4772d4;
    }

    public final synchronized void a(Context context, AppMetricaLibraryAdapterConfig appMetricaLibraryAdapterConfig) {
        this.a.getClass();
        if (C5332z0.a()) {
            return;
        }
        LoggerStorage.getMainPublicOrAnonymousLogger().info("Session autotracking enabled", new Object[0]);
        this.b.a();
        this.a.getClass();
        C5307y0 a = C5307y0.a(context);
        a.d.a(null, a);
        IHandlerExecutor a2 = this.c.a();
        ((L9) a2).b.post(new mxz(this, context, appMetricaLibraryAdapterConfig, 3));
        this.a.getClass();
        C5332z0.b();
    }

    public static final void a(C4716b0 c4716b0, Context context, AppMetricaLibraryAdapterConfig appMetricaLibraryAdapterConfig) {
        c4716b0.a.getClass();
        C5307y0 a = C5307y0.a(context);
        a.f().a(appMetricaLibraryAdapterConfig);
        C5030n4.l().c.a().execute(new RunnableC5283x1(a.a));
    }
}
