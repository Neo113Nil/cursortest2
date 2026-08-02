package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AdRevenue;

/* loaded from: classes8.dex */
public final class Rj implements InterfaceC4753cb {
    public final /* synthetic */ AdRevenue a;
    public final /* synthetic */ boolean b;

    public Rj(AdRevenue adRevenue, boolean z) {
        this.a = adRevenue;
        this.b = z;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4753cb
    public final void a(InterfaceC4779db interfaceC4779db) {
        interfaceC4779db.reportAdRevenue(this.a, this.b);
    }
}
