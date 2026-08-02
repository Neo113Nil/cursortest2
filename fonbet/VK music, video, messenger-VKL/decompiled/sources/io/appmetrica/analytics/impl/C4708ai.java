package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.coreapi.internal.backport.Provider;

/* renamed from: io.appmetrica.analytics.impl.ai, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C4708ai implements Provider {
    public final /* synthetic */ C5332z0 a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ ReporterConfig c;

    public C4708ai(C5332z0 c5332z0, Context context, ReporterConfig reporterConfig) {
        this.a = c5332z0;
        this.b = context;
        this.c = reporterConfig;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Provider
    public final Object get() {
        C5332z0 c5332z0 = this.a;
        Context context = this.b;
        ReporterConfig reporterConfig = this.c;
        c5332z0.getClass();
        return C5307y0.a(context).f().c(reporterConfig);
    }
}
