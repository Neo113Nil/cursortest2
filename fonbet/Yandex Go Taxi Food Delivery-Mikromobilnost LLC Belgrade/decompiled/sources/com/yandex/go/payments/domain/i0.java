package com.yandex.go.payments.domain;

import com.yandex.go.address.models.ZoneAddress;
import com.yandex.go.zone.model.Zone;
import defpackage.acz;
import defpackage.b2k;
import defpackage.dqe0;
import defpackage.qda0;
import defpackage.vng;

/* loaded from: classes8.dex */
public final class i0 {
    public final com.yandex.go.zone.repository.o a;
    public final dqe0 b;
    public final acz c;
    public final com.yandex.go.zone.interactors.b d;

    public i0(com.yandex.go.zone.repository.o oVar, dqe0 dqe0Var, acz aczVar, com.yandex.go.zone.interactors.b bVar) {
        this.a = oVar;
        this.b = dqe0Var;
        this.c = aczVar;
        this.d = bVar;
    }

    public final Zone a() {
        ZoneAddress f = this.b.f();
        if (f == null) {
            return null;
        }
        Zone zone = f.b;
        if (zone != null) {
            return zone;
        }
        return this.a.f(f.a.getZoneName());
    }

    public final b2k b() {
        return vng.l(new kotlinx.coroutines.flow.o(new kotlinx.coroutines.flow.n(new h0(this.a.s), new PaymentMethodsZoneInteractor$zoneFlow$2(this, null)), new PaymentMethodsZoneInteractor$zoneFlow$3(3, null)), new qda0(3), vng.c);
    }
}
