package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.impl.xd, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5295xd extends SafeRunnable {
    public final /* synthetic */ String a;

    public C5295xd(String str) {
        this.a = str;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        C5332z0 c5332z0 = C5030n4.l().p;
        String str = this.a;
        c5332z0.getClass();
        C5307y0.c().a(str);
    }
}
