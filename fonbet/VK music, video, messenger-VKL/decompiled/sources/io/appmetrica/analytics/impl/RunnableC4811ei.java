package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.ReporterConfig;

/* renamed from: io.appmetrica.analytics.impl.ei, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC4811ei implements Runnable {
    public final /* synthetic */ ReporterConfig a;
    public final /* synthetic */ C5122qi b;

    public RunnableC4811ei(C5122qi c5122qi, ReporterConfig reporterConfig) {
        this.b = c5122qi;
        this.a = reporterConfig;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5122qi c5122qi = this.b;
        ReporterConfig reporterConfig = this.a;
        C5332z0 c5332z0 = c5122qi.a;
        Context context = c5122qi.d;
        c5332z0.getClass();
        C5307y0.a(context).f().a(reporterConfig);
    }
}
