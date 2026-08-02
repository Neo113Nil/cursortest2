package com.yandex.go.scooters.passes;

import com.yandex.go.scooters.bdui.api.ScootersBduiNavigationAction;
import defpackage.bb1;
import defpackage.deo0;
import defpackage.ggo0;
import defpackage.h55;
import defpackage.j5x;
import defpackage.leo0;
import defpackage.m3b1;
import defpackage.ndo0;
import defpackage.oeo0;
import defpackage.po21;
import defpackage.qu;
import defpackage.rbx;
import defpackage.rdo0;
import defpackage.sbx;
import defpackage.tje;
import defpackage.v0n0;
import defpackage.vez0;
import defpackage.xsq0;
import defpackage.yvf0;
import java.io.Serializable;
import java.util.Map;

/* loaded from: classes13.dex */
public final class c extends h55 {
    public final yvf0 D;
    public final po21 E;
    public final yvf0 F;
    public final v0n0 G;
    public final com.yandex.go.scooters.passes.data.e H;
    public final com.yandex.go.scooters.passes.data.jason.a I;
    public final yvf0 J;
    public final com.yandex.go.scooters.payments.domain.a K;
    public final ndo0 L;
    public final rdo0 M;
    public final oeo0 N;
    public final ggo0 O;

    public c(yvf0 yvf0Var, po21 po21Var, yvf0 yvf0Var2, v0n0 v0n0Var, com.yandex.go.scooters.passes.data.e eVar, com.yandex.go.scooters.passes.data.jason.a aVar, yvf0 yvf0Var3, com.yandex.go.scooters.payments.domain.a aVar2, ndo0 ndo0Var, rdo0 rdo0Var, oeo0 oeo0Var, ggo0 ggo0Var) {
        super(null);
        this.D = yvf0Var;
        this.E = po21Var;
        this.F = yvf0Var2;
        this.G = v0n0Var;
        this.H = eVar;
        this.I = aVar;
        this.J = yvf0Var3;
        this.K = aVar2;
        this.L = ndo0Var;
        this.M = rdo0Var;
        this.N = oeo0Var;
        this.O = ggo0Var;
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        tje.N(o(), null, null, new ScootersPassesDocumentRouter$onLaunch$$inlined$collectIn$1(kotlinx.coroutines.flow.e.c(this.M.a), null, this), 3);
        tje.N(o(), null, null, new ScootersPassesDocumentRouter$onLaunch$$inlined$collectIn$2(kotlinx.coroutines.flow.e.c(this.L.a), null, this), 3);
        tje.N(o(), null, null, new ScootersPassesDocumentRouter$onLaunch$3(this, null), 3);
    }

    public final void P() {
        j5x J = bb1.J(this.I.a.a.b, deo0.a("on_back_navigation_action"));
        ScootersBduiNavigationAction scootersBduiNavigationAction = null;
        Serializable t = J != null ? vez0.t(J) : null;
        Map map = t instanceof Map ? (Map) t : null;
        if (map != null) {
            rbx rbxVar = sbx.d;
            kotlinx.serialization.json.c b = xsq0.b(map);
            rbxVar.getClass();
            scootersBduiNavigationAction = (ScootersBduiNavigationAction) rbxVar.a(ScootersBduiNavigationAction.Companion.serializer(), b);
        }
        if (scootersBduiNavigationAction == null) {
            r(new qu(9));
            return;
        }
        leo0 a = m3b1.a(scootersBduiNavigationAction);
        if (a.b) {
            r(new a(a));
        } else {
            this.N.a(a.a);
        }
    }
}
