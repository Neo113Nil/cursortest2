package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.impl.vd, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5245vd extends SafeRunnable {
    public final /* synthetic */ C5320yd a;
    public final /* synthetic */ boolean b;

    public C5245vd(C5320yd c5320yd, boolean z) {
        this.a = c5320yd;
        this.b = z;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        C5320yd.a(this.a).a(this.b, false);
    }
}
