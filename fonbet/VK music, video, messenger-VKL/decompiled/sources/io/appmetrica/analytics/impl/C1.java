package io.appmetrica.analytics.impl;

import android.content.res.Configuration;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* loaded from: classes8.dex */
public final class C1 extends SafeRunnable {
    public final /* synthetic */ Configuration a;
    public final /* synthetic */ M1 b;

    public C1(M1 m1, Configuration configuration) {
        this.b = m1;
        this.a = configuration;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        this.b.b.onConfigurationChanged(this.a);
    }
}
