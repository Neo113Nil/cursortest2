package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.internal.IAppMetricaService;

/* loaded from: classes8.dex */
public final class Oi extends Hh {
    public final Lf e;

    public Oi(C5078p0 c5078p0, InterfaceC4943jl interfaceC4943jl, Lf lf) {
        super(c5078p0, interfaceC4943jl);
        this.e = lf;
    }

    @Override // io.appmetrica.analytics.impl.Hh
    public final void a(IAppMetricaService iAppMetricaService) {
        Bundle bundle = new Bundle();
        Lf lf = this.e;
        synchronized (lf) {
            bundle.putParcelable("PROCESS_CFG_OBJ", lf);
        }
        iAppMetricaService.resumeUserSession(bundle);
    }
}
