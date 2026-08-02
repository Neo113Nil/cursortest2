package com.yandex.go.scooters.ignition.data;

import defpackage.brn0;
import defpackage.pzt0;
import defpackage.tje;
import defpackage.vqn0;
import kotlinx.coroutines.flow.m0;

/* loaded from: classes8.dex */
public final class i {
    public final com.yandex.go.scooters.ignition.analytics.a a;
    public final brn0 b;
    public final d c;
    public final vqn0 d;
    public pzt0 e;

    public i(com.yandex.go.scooters.ignition.analytics.a aVar, brn0 brn0Var, d dVar, vqn0 vqn0Var) {
        this.a = aVar;
        this.b = brn0Var;
        this.c = dVar;
        this.d = vqn0Var;
    }

    public final void a() {
        pzt0 pzt0Var = this.e;
        if (pzt0Var == null || !pzt0Var.isActive()) {
            this.e = tje.N(this.d.a(), null, null, new ScootersIgnitionTechnicalAnalyticsTimerRepository$start$$inlined$collectLatestIn$1(new m0(this.c.a(), ru.yandex.taxi.experiments.d.b(this.b), new ScootersIgnitionTechnicalAnalyticsTimerRepository$start$1()), null, this), 3);
        }
    }
}
