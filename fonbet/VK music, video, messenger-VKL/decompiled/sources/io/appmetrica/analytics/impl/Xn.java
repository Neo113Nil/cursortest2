package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.internal.IAppMetricaService;

/* loaded from: classes8.dex */
public final class Xn extends Hh {
    public final int e;
    public final Bundle f;

    public Xn(C5078p0 c5078p0, InterfaceC4943jl interfaceC4943jl, int i, Bundle bundle) {
        super(c5078p0, interfaceC4943jl);
        this.e = i;
        this.f = bundle;
    }

    @Override // io.appmetrica.analytics.impl.Hh
    public final void a(IAppMetricaService iAppMetricaService) {
        iAppMetricaService.reportData(this.e, this.f);
    }
}
