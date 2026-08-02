package com.yandex.go.navigator.domain;

import com.yandex.mapkit.directions.driving.DrivingRoute;
import com.yandex.mapkit.location.Location;
import com.yandex.mapkit.navigation.automotive.Guidance;
import defpackage.bvf0;
import defpackage.l7z;
import defpackage.oc50;
import defpackage.par;
import defpackage.t1l0;
import defpackage.tt2;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes12.dex */
public final class o {
    public final com.yandex.go.navigator.repository.f a;
    public final oc50 b;
    public final par c;
    public final tt2 d;
    public final r0 e;
    public final kotlinx.coroutines.flow.n f;
    public final l g;
    public final n h;

    public o(com.yandex.go.navigator.repository.f fVar, oc50 oc50Var, par parVar, tt2 tt2Var) {
        this.a = fVar;
        this.b = oc50Var;
        this.c = parVar;
        this.d = tt2Var;
        r0 c = bvf0.c(null);
        this.e = c;
        kotlinx.coroutines.flow.n nVar = new kotlinx.coroutines.flow.n(c, new LocationChangedListener$locationData$1(this, null));
        this.f = nVar;
        this.g = new l(nVar);
        this.h = new n(nVar);
    }

    public final Location a() {
        l7z l7zVar = (l7z) this.e.getValue();
        if (l7zVar != null) {
            return l7zVar.a;
        }
        return null;
    }

    public final kotlinx.coroutines.flow.n b() {
        return this.f;
    }

    public final void c(Guidance guidance) {
        DrivingRoute currentRoute = guidance.getCurrentRoute();
        t1l0 t1l0Var = currentRoute != null ? new t1l0(currentRoute.getMetadata().getWeight().getDistance().getValue(), currentRoute.getMetadata().getWeight().getTimeWithTraffic().getValue(), currentRoute.getPosition().getSegmentIndex(), currentRoute.getJamSegments()) : null;
        DrivingRoute currentRoute2 = guidance.getCurrentRoute();
        l7z l7zVar = new l7z(guidance.getLocation(), currentRoute2 != null ? currentRoute2.getPosition() : null, t1l0Var);
        r0 r0Var = this.e;
        r0Var.getClass();
        r0Var.m(null, l7zVar);
    }
}
