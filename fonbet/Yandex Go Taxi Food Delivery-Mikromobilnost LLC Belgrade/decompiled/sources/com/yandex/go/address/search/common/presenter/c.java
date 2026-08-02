package com.yandex.go.address.search.common.presenter;

import defpackage.j61;
import defpackage.ngf;
import defpackage.pzt0;
import defpackage.x5s0;
import ru.yandex.taxi.analytics.LocationRequestAnalytics$ErrorReason;
import ru.yandex.taxi.analytics.LocationRequestAnalytics$Source;

/* loaded from: classes12.dex */
public final class c implements ngf {
    public final /* synthetic */ d a;
    public final /* synthetic */ j61 b;

    public c(d dVar, j61 j61Var) {
        this.a = dVar;
        this.b = j61Var;
    }

    @Override // defpackage.ngf
    public final void N4() {
        d dVar = this.a;
        dVar.B0.b = true;
        ((j61) dVar.Dg()).hideKeyboard();
        pzt0 pzt0Var = dVar.G0;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        dVar.G0 = com.yandex.go.coroutines.b.g(dVar.Jg(), null, null, new SuggestedSourcesPresenter$showNoLocationServiceAlertDialog$1(dVar, null), 3);
        dVar.l0.c(LocationRequestAnalytics$Source.CURRENT_LOCATION_IN_SUGGESTS, LocationRequestAnalytics$ErrorReason.LOCATION_SERVICE_NOT_AVAILABLE);
    }

    @Override // defpackage.ngf
    public final void y0() {
        this.a.Jh();
    }

    @Override // defpackage.ngf
    public final void zc() {
        this.b.hideKeyboard();
        d dVar = this.a;
        dVar.H0 = ((com.yandex.go.permission.b) dVar.p0).c(1, new x5s0(10, dVar));
        dVar.l0.c(LocationRequestAnalytics$Source.CURRENT_LOCATION_IN_SUGGESTS, LocationRequestAnalytics$ErrorReason.PERMISSION_NOT_GRANTED);
    }
}
