package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.Revenue;

/* loaded from: classes8.dex */
public final class Gj implements InterfaceC4753cb {
    public final /* synthetic */ Revenue a;

    public Gj(Revenue revenue) {
        this.a = revenue;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4753cb
    public final void a(InterfaceC4779db interfaceC4779db) {
        interfaceC4779db.reportRevenue(this.a);
    }
}
