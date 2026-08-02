package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.internal.IAppMetricaService;

/* loaded from: classes8.dex */
public class Zg extends Hh {
    public final Fh e;

    public Zg(C5078p0 c5078p0, InterfaceC4943jl interfaceC4943jl, Fh fh) {
        super(c5078p0, interfaceC4943jl);
        this.e = fh;
    }

    @Override // io.appmetrica.analytics.impl.Hh
    public final void a(Throwable th) {
    }

    @Override // io.appmetrica.analytics.impl.Hh
    public final void a(IAppMetricaService iAppMetricaService) {
        Fh fh = this.e;
        iAppMetricaService.reportData(fh.c, fh.a.d(fh.e.c()));
    }
}
