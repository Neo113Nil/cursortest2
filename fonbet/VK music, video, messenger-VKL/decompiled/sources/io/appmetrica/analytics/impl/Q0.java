package io.appmetrica.analytics.impl;

import android.location.Location;

/* loaded from: classes8.dex */
public final class Q0 implements Runnable {
    public final /* synthetic */ Location a;
    public final /* synthetic */ C5208u1 b;

    public Q0(C5208u1 c5208u1, Location location) {
        this.b = c5208u1;
        this.a = location;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5332z0 c5332z0 = this.b.a;
        Location location = this.a;
        c5332z0.getClass();
        C5307y0.c().a(location);
    }
}
