package com.yandex.go.address.search.common.presenter.favorites;

import defpackage.ngf;
import defpackage.pzt0;
import defpackage.qa0;
import ru.yandex.taxi.analytics.LocationRequestAnalytics$ErrorReason;
import ru.yandex.taxi.analytics.LocationRequestAnalytics$Source;

/* loaded from: classes12.dex */
public final class a implements ngf {
    public final /* synthetic */ b a;

    public a(b bVar) {
        this.a = bVar;
    }

    @Override // defpackage.ngf
    public final void N4() {
        b bVar = this.a;
        bVar.Z = true;
        pzt0 pzt0Var = bVar.V;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        bVar.V = com.yandex.go.coroutines.b.g(bVar.Jg(), null, null, new FavoritesSearchPresenter$showNoLocationServiceAlertDialog$1(bVar, null), 3);
        bVar.Q.c(LocationRequestAnalytics$Source.CURRENT_LOCATION_IN_FAVORITES, LocationRequestAnalytics$ErrorReason.LOCATION_SERVICE_NOT_AVAILABLE);
    }

    @Override // defpackage.ngf
    public final void y0() {
        this.a.xh();
    }

    @Override // defpackage.ngf
    public final void zc() {
        b bVar = this.a;
        bVar.W = ((com.yandex.go.permission.b) bVar.M).c(1, new qa0(7, bVar));
        bVar.Q.c(LocationRequestAnalytics$Source.CURRENT_LOCATION_IN_FAVORITES, LocationRequestAnalytics$ErrorReason.PERMISSION_NOT_GRANTED);
    }
}
