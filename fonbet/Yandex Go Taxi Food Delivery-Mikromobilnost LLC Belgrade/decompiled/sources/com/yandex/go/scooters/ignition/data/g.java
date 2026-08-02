package com.yandex.go.scooters.ignition.data;

import com.yandex.go.scooters.ignition.domain.m;
import defpackage.ffx;
import defpackage.hbp0;
import defpackage.pzt0;
import defpackage.rol0;
import defpackage.tje;
import defpackage.tls;
import defpackage.tse;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes13.dex */
public final class g {
    public final int a;
    public final tse b;
    public final tls c;
    public final b d;
    public final m e;
    public final com.yandex.go.scooters.ignition.analytics.a f;
    public final n0 g = ffx.c(0, 512, null, 5);
    public pzt0 h;
    public pzt0 i;

    public g(int i, hbp0 hbp0Var, tls tlsVar, b bVar, m mVar, com.yandex.go.scooters.ignition.analytics.a aVar) {
        this.a = i;
        this.b = hbp0Var;
        this.c = tlsVar;
        this.d = bVar;
        this.e = mVar;
        this.f = aVar;
    }

    public final void a() {
        pzt0 pzt0Var = this.h;
        if (pzt0Var == null || !pzt0Var.isActive()) {
            this.h = tje.N(this.b, null, null, new ScootersIgnitionRangeNotifier$start$$inlined$safeCollectIn$1(new rol0(new ScootersIgnitionRangeNotifier$windowedByInterval$1(this.g, 1000L, null)), null, this), 3);
        }
    }

    public final void b() {
        pzt0 pzt0Var = this.h;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.h = null;
    }
}
