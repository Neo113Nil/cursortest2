package com.yandex.go.taxi.intercity.dashboard.impl.domain.interactor;

import com.yandex.go.address.models.Address;
import defpackage.atd0;
import defpackage.hit;
import defpackage.mdh;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.uyj;
import ru.yandex.taxi.persuggest.api.finalsuggest.PositionInitAction;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;

/* loaded from: classes14.dex */
public final class h {
    public final tt2 a;
    public final com.yandex.go.taxi.intercity.dashboard.impl.data.repository.a b;
    public final com.yandex.go.route.interactor.b c;
    public final atd0 d;
    public final hit e;

    public h(tt2 tt2Var, com.yandex.go.taxi.intercity.dashboard.impl.data.repository.a aVar, com.yandex.go.route.interactor.b bVar, atd0 atd0Var, hit hitVar) {
        this.a = tt2Var;
        this.b = aVar;
        this.c = bVar;
        this.d = atd0Var;
        this.e = hitVar;
    }

    public static final tpr a(h hVar, Address address, RoutePointType routePointType) {
        tpr c = atd0.c(hVar.d, address.B(), routePointType, PositionInitAction.CACHE, null, null, null, 56);
        hVar.a.getClass();
        sjh sjhVar = uyj.a;
        return kotlinx.coroutines.flow.e.F(c, mdh.b);
    }

    public final void b() {
        hit hitVar = this.e;
        tje.N(hitVar.a, null, null, new IntercityDashboardRestorePointsInteractorImpl$restoreSourcePointIfNeeded$1(this, null), 3);
        tje.N(hitVar.a, null, null, new IntercityDashboardRestorePointsInteractorImpl$restoreDestinationPointIfNeeded$1(this, null), 3);
    }
}
