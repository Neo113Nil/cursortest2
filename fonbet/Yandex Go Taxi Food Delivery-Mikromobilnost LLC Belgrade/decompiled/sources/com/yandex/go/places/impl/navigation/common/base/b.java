package com.yandex.go.places.impl.navigation.common.base;

import com.yandex.go.address.models.PlaceType;
import defpackage.am80;
import defpackage.as6;
import defpackage.at3;
import defpackage.cb0;
import defpackage.fva0;
import defpackage.j75;
import defpackage.jl40;
import defpackage.lx4;
import defpackage.m9c0;
import defpackage.na1;
import defpackage.q1j0;
import defpackage.qu;
import defpackage.sls;
import defpackage.sy60;
import defpackage.ti80;
import defpackage.tje;
import defpackage.tls;
import defpackage.wls;
import defpackage.zzs;
import ru.yandex.taxi.analytics.j;

/* loaded from: classes13.dex */
public final class b {
    public final /* synthetic */ d a;

    public b(d dVar) {
        this.a = dVar;
    }

    public final void a() {
        d dVar = this.a;
        if (dVar.t()) {
            return;
        }
        dVar.r(new qu(9));
    }

    public final void b() {
        d dVar = this.a;
        dVar.S(new BasePlacesRouter$InnerNavigator$closeOrganizationCard$1(dVar, null));
    }

    public final void c(tls tlsVar, wls wlsVar, sy60 sy60Var, tls tlsVar2) {
        d dVar = this.a;
        dVar.S(new BasePlacesRouter$InnerNavigator$launchChildPlacesUpdatableRouter$1(wlsVar, tlsVar, dVar, sy60Var, tlsVar2, null));
    }

    public final void d(tls tlsVar, Object obj, sy60 sy60Var, q1j0 q1j0Var) {
        d dVar = this.a;
        dVar.S(new BasePlacesRouter$InnerNavigator$launchChildRouter$1(obj, tlsVar, dVar, sy60Var, q1j0Var, null));
    }

    public final void f(PlaceType placeType, zzs zzsVar, sls slsVar) {
        d dVar = this.a;
        tje.N(dVar.o(), null, null, new BasePlacesRouter$InnerNavigator$openNearbyOrganizations$1(dVar, placeType, zzsVar, this, slsVar, null), 3);
    }

    public final void g(am80 am80Var, sls slsVar) {
        d dVar = this.a;
        tje.N(dVar.o(), null, null, new BasePlacesRouter$InnerNavigator$openPaymentsResult$1(dVar, this, am80Var, slsVar, null), 3);
    }

    public final void h(ti80 ti80Var, wls wlsVar, tls tlsVar, sls slsVar) {
        d dVar = this.a;
        if (jl40.l(ti80Var, dVar.T)) {
            dVar.Q.b();
        }
        dVar.T = ti80Var;
        j75 j75Var = new j75(dVar, slsVar);
        m9c0 m9c0Var = dVar.K;
        m9c0Var.d = 0;
        fva0.f(m9c0Var.a, "Places.FlexOrganizationCard.Shown", null, 0L, 6);
        lx4 lx4Var = m9c0Var.b;
        ((na1) m9c0Var.c).getClass();
        ((j) lx4Var).v(as6.r());
        c(new at3(28), wlsVar, new cb0(1, dVar, j75Var), tlsVar);
    }
}
