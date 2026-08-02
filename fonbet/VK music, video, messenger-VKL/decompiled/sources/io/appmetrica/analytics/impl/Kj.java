package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AdRevenue;

/* loaded from: classes8.dex */
public final class Kj implements InterfaceC4753cb {
    public final /* synthetic */ AdRevenue a;

    public Kj(AdRevenue adRevenue) {
        this.a = adRevenue;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4753cb
    public final void a(InterfaceC4779db interfaceC4779db) {
        interfaceC4779db.reportAdRevenue(this.a);
    }
}
