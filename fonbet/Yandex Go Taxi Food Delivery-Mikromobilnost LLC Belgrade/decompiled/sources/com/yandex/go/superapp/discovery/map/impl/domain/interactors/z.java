package com.yandex.go.superapp.discovery.map.impl.domain.interactors;

import com.yandex.go.superapp.discovery.map.impl.data.repositories.state.PointAAddressChangesRepository$startCollecting$$inlined$safeCollectIn$1;
import defpackage.o400;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tpr;
import defpackage.usd0;
import defpackage.uyj;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;

/* loaded from: classes14.dex */
public final class z {
    public final usd0 a;
    public final com.yandex.go.route.interactor.b b;

    public z(usd0 usd0Var, com.yandex.go.route.interactor.b bVar) {
        this.a = usd0Var;
        this.b = bVar;
    }

    public final void a() {
        SuperAppDiscoveryMapRouteBridgeInteractor$start$1 superAppDiscoveryMapRouteBridgeInteractor$start$1 = new SuperAppDiscoveryMapRouteBridgeInteractor$start$1(1, this, z.class, "applyToRoute", "applyToRoute(Lcom/yandex/go/preorder/AddressInfo;)V", 0);
        usd0 usd0Var = this.a;
        if (usd0Var.d.compareAndSet(false, true)) {
            tpr j = usd0Var.c.j(RoutePointType.POINT_A, true);
            usd0Var.b.getClass();
            sjh sjhVar = uyj.a;
            tje.N(usd0Var.a, null, null, new PointAAddressChangesRepository$startCollecting$$inlined$safeCollectIn$1(kotlinx.coroutines.flow.e.F(j, o400.a), superAppDiscoveryMapRouteBridgeInteractor$start$1, null), 3);
        }
    }
}
