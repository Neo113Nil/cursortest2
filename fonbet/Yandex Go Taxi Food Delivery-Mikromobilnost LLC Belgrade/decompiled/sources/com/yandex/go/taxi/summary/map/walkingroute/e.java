package com.yandex.go.taxi.summary.map.walkingroute;

import com.yandex.go.address.models.Address;
import com.yandex.go.taxi.summary.experiments.UserLocationToSourcePointWalkRouteExperiment;
import defpackage.fp21;
import defpackage.g8e;
import defpackage.i741;
import defpackage.jl40;
import defpackage.jqr;
import defpackage.jst;
import defpackage.o400;
import defpackage.oyr;
import defpackage.pex0;
import defpackage.po21;
import defpackage.pvn;
import defpackage.rz0;
import defpackage.sjh;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.wu1;
import java.util.List;
import kotlinx.coroutines.flow.k;

/* loaded from: classes14.dex */
public final class e {
    public final ru.yandex.taxi.walkroute.a a;
    public final po21 b;
    public final tt2 c;
    public final fp21 d;
    public final rz0 e;

    public e(ru.yandex.taxi.walkroute.a aVar, po21 po21Var, tt2 tt2Var, fp21 fp21Var, rz0 rz0Var) {
        this.a = aVar;
        this.b = po21Var;
        this.c = tt2Var;
        this.d = fp21Var;
        this.e = rz0Var;
    }

    public final boolean a(pex0 pex0Var) {
        rz0 rz0Var = this.e;
        if (!rz0Var.d().b) {
            return false;
        }
        for (i741 i741Var : (List) rz0Var.d().j.getValue()) {
            if (jl40.l(pex0Var.b, i741Var.a)) {
                wu1 wu1Var = pex0Var.O;
                if (jl40.l(wu1Var != null ? wu1Var.a() : null, i741Var.b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean b(pex0 pex0Var) {
        rz0 rz0Var = this.e;
        if (!rz0Var.d().b) {
            return false;
        }
        for (i741 i741Var : (List) rz0Var.d().j.getValue()) {
            if (jl40.l(pex0Var.b, i741Var.a)) {
                wu1 wu1Var = pex0Var.O;
                if (jl40.l(wu1Var != null ? wu1Var.a() : null, i741Var.b)) {
                    return i741Var.c;
                }
            }
        }
        return false;
    }

    public final tpr c(Address address, boolean z, pex0 pex0Var) {
        if (!z) {
            this.d.a();
            return pvn.a;
        }
        boolean b = b(pex0Var);
        UserLocationToSourcePointWalkRouteExperiment d = this.e.d();
        jqr n = ((ru.yandex.taxi.preorder.source.userposition.e) this.b).n();
        int i = d.e;
        if (i < 0) {
            g8e.B(jst.e, "USER_LOCATION_TO_SOURCE_WALK:INVALID_EXPERIMENT_ARGUMENT", null, oyr.i(i, "invalid minUpdateRateSeconds: "), 2);
            i = Integer.MAX_VALUE;
        }
        k kVar = new k(new d(new jqr(new b(com.yandex.go.coroutines.b.d(com.yandex.go.coroutines.b.j(n, i * 1000), new UserLocationToAddressWalkingRouteOverlayInteractorImpl$fetchWalkingRoute$lambda$0$$inlined$start$1(this, null)), address, d, this), new UserLocationToAddressWalkingRouteOverlayInteractorImpl$walkingRouteUpdateFlow$1(this, b, null), 3)), new UserLocationToAddressWalkingRouteOverlayInteractorImpl$walkingRouteUpdateFlow$3(this, null));
        this.c.getClass();
        sjh sjhVar = uyj.a;
        return kotlinx.coroutines.flow.e.F(kVar, o400.a);
    }
}
