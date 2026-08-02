package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* loaded from: classes8.dex */
public final class K1 extends SafeRunnable {
    public final /* synthetic */ Bundle a;
    public final /* synthetic */ M1 b;

    public K1(M1 m1, Bundle bundle) {
        this.b = m1;
        this.a = bundle;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        this.b.b.resumeUserSession(this.a);
    }
}
