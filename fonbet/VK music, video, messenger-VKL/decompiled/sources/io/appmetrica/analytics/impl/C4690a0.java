package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.AppMetricaLibraryAdapterConfig;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.impl.a0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C4690a0 extends SafeRunnable {
    public final /* synthetic */ C4716b0 a;
    public final /* synthetic */ Context b;

    public C4690a0(C4716b0 c4716b0, Context context) {
        this.a = c4716b0;
        this.b = context;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        C4716b0 c4716b0 = this.a;
        Context context = this.b;
        c4716b0.getClass();
        c4716b0.a(context, AppMetricaLibraryAdapterConfig.newConfigBuilder().build());
    }
}
