package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AdRevenue;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.impl.sd, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5168sd extends SafeRunnable {
    public final /* synthetic */ C5320yd a;
    public final /* synthetic */ AdRevenue b;
    public final /* synthetic */ boolean c;

    public C5168sd(C5320yd c5320yd, AdRevenue adRevenue, boolean z) {
        this.a = c5320yd;
        this.b = adRevenue;
        this.c = z;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        C5320yd.a(this.a).reportAdRevenue(this.b, this.c);
    }
}
