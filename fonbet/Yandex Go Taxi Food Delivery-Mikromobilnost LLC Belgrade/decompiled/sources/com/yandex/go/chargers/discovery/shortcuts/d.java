package com.yandex.go.chargers.discovery.shortcuts;

import defpackage.a60;
import defpackage.avj0;
import defpackage.dai;
import defpackage.dwr0;
import defpackage.ewr0;
import defpackage.exr0;
import defpackage.fwr0;
import defpackage.g18;
import defpackage.gwr0;
import defpackage.gxr0;
import defpackage.hh8;
import defpackage.hwr0;
import defpackage.hxx;
import defpackage.iwr0;
import defpackage.ixr0;
import defpackage.jl40;
import defpackage.jwr0;
import defpackage.kxr0;
import defpackage.mpu0;
import defpackage.mwr0;
import defpackage.npu0;
import defpackage.oep0;
import defpackage.pep0;
import defpackage.psg0;
import defpackage.pzr0;
import defpackage.qxr0;
import defpackage.rxr0;
import defpackage.sls;
import defpackage.tls;
import defpackage.v770;
import defpackage.x3;
import defpackage.xx70;
import defpackage.y50;
import defpackage.y700;
import defpackage.yvf0;
import defpackage.ywr0;
import defpackage.zuj0;

/* loaded from: classes12.dex */
public final class d implements pzr0, rxr0 {
    public final y50 a;
    public final tls b;
    public final sls c;
    public final sls d;
    public final sls e;
    public final sls f;
    public final sls g;
    public final sls h;
    public final tls i;
    public final sls j;
    public final sls k;
    public final hh8 l;
    public final yvf0 m;
    public final zuj0 n;
    public final oep0 o;

    public d(y50 y50Var, tls tlsVar, sls slsVar, sls slsVar2, sls slsVar3, sls slsVar4, sls slsVar5, sls slsVar6, tls tlsVar2, sls slsVar7, sls slsVar8, hh8 hh8Var, yvf0 yvf0Var, zuj0 zuj0Var, oep0 oep0Var) {
        this.a = y50Var;
        this.b = tlsVar;
        this.c = slsVar;
        this.d = slsVar2;
        this.e = slsVar3;
        this.f = slsVar4;
        this.g = slsVar5;
        this.h = slsVar6;
        this.i = tlsVar2;
        this.j = slsVar7;
        this.k = slsVar8;
        this.l = hh8Var;
        this.m = yvf0Var;
        this.n = zuj0Var;
        this.o = oep0Var;
    }

    @Override // defpackage.pzr0, defpackage.rxr0
    public final g18 b(qxr0 qxr0Var) {
        boolean z = qxr0Var instanceof mwr0;
        dai daiVar = g18.u1;
        if (z) {
            ((a60) this.a).c(((mwr0) qxr0Var).a, v770.j);
            return daiVar;
        }
        if (qxr0Var instanceof gxr0) {
            gxr0 gxr0Var = (gxr0) qxr0Var;
            String str = gxr0Var.a;
            sls slsVar = gxr0Var.b;
            ((ChargersDiscoveryShortcutGridViewFactory$createShortcutGridView$1) this.b).invoke(str);
            ((pep0) this.o).f(new xx70(2, (ru.yandex.taxi.communications.stories.domain.a) this.m.get(), slsVar), new npu0((x3) new mpu0(str), "chargers", Float.valueOf(((avj0) this.n).b(psg0.shortcuts_corners_round)), false, 120), hxx.a);
            return daiVar;
        }
        if (qxr0Var instanceof exr0) {
            ((ChargersDiscoveryShortcutGridViewFactory$createShortcutGridView$4) this.e).invoke();
            return daiVar;
        }
        if (qxr0Var instanceof ywr0) {
            ((ChargersDiscoveryShortcutGridViewFactory$createShortcutGridView$5) this.f).invoke();
            return daiVar;
        }
        if (qxr0Var instanceof iwr0) {
            ((ChargersDiscoveryShortcutGridViewFactory$createShortcutGridView$3) this.d).invoke();
            return daiVar;
        }
        if (qxr0Var instanceof jwr0) {
            ((ChargersDiscoveryShortcutGridViewFactory$createShortcutGridView$6) this.g).invoke();
            return daiVar;
        }
        if (qxr0Var instanceof ewr0) {
            ((ChargersDiscoveryShortcutGridViewFactory$createShortcutGridView$7) this.h).invoke();
            return daiVar;
        }
        if (qxr0Var instanceof hwr0) {
            ((ChargersDiscoveryShortcutGridViewFactory$createShortcutGridView$8) this.i).invoke(((hwr0) qxr0Var).a);
            return daiVar;
        }
        if (qxr0Var instanceof fwr0) {
            ((ChargersDiscoveryShortcutGridViewFactory$createShortcutGridView$9) this.j).invoke();
            return daiVar;
        }
        if (qxr0Var instanceof gwr0) {
            ((ChargersDiscoveryShortcutGridViewFactory$createShortcutGridView$10) this.k).invoke();
            return daiVar;
        }
        if (qxr0Var instanceof ixr0) {
            if (jl40.l(((ixr0) qxr0Var).a, "chargers")) {
                ((ChargersDiscoveryShortcutGridViewFactory$createShortcutGridView$2) this.c).invoke();
            }
            return daiVar;
        }
        if (!(qxr0Var instanceof kxr0)) {
            if (qxr0Var instanceof dwr0) {
                dwr0 dwr0Var = (dwr0) qxr0Var;
                this.l.invoke(dwr0Var.a, dwr0Var.b);
                return daiVar;
            }
            super.b(qxr0Var);
        }
        return daiVar;
    }

    @Override // defpackage.pzr0
    public final y700 d() {
        return null;
    }
}
