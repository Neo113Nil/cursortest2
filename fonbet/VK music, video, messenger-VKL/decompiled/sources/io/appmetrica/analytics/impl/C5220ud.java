package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.impl.ud, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5220ud extends SafeRunnable {
    public final /* synthetic */ C5320yd a;
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;

    public C5220ud(C5320yd c5320yd, int i, String str) {
        this.a = c5320yd;
        this.b = i;
        this.c = str;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        C5320yd.a(this.a).a(new R9(this.b, this.c));
    }
}
