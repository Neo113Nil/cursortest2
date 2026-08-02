package io.appmetrica.analytics.impl;

import android.content.Intent;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* loaded from: classes8.dex */
public final class H1 extends SafeRunnable {
    public final /* synthetic */ Intent a;
    public final /* synthetic */ M1 b;

    public H1(M1 m1, Intent intent) {
        this.b = m1;
        this.a = intent;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        this.b.b.c(this.a);
    }
}
