package com.yandex.go.preorder.lifecycle;

import defpackage.gtq0;
import defpackage.jjt0;
import defpackage.mth;
import defpackage.oep0;
import defpackage.pd61;
import defpackage.pft0;
import defpackage.rft0;
import defpackage.s6k0;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyo0;
import defpackage.wj0;
import defpackage.yvf0;

/* loaded from: classes13.dex */
public final class p implements pft0 {
    public final pd61 a;
    public final ru.yandex.taxi.sdc.router.e b;
    public final ru.yandex.taxi.sdc.route.presentation.f c;
    public final wj0 d;
    public final yvf0 e;
    public final oep0 f;
    public final rft0 g;
    public final jjt0 h;
    public final s6k0 i;

    public p(pd61 pd61Var, ru.yandex.taxi.sdc.router.e eVar, ru.yandex.taxi.sdc.route.presentation.f fVar, wj0 wj0Var, yvf0 yvf0Var, oep0 oep0Var, rft0 rft0Var, jjt0 jjt0Var, s6k0 s6k0Var) {
        this.a = pd61Var;
        this.b = eVar;
        this.c = fVar;
        this.d = wj0Var;
        this.e = yvf0Var;
        this.f = oep0Var;
        this.g = rft0Var;
        this.h = jjt0Var;
        this.i = s6k0Var;
    }

    @Override // defpackage.pft0
    public final void a(tse tseVar) {
        ru.yandex.taxi.sdc.router.e eVar = this.b;
        eVar.getClass();
        gtq0.t(tseVar, new uyo0(13, eVar));
    }

    @Override // defpackage.pft0
    public final void d(tse tseVar) {
        this.c.c(tseVar);
        ru.yandex.taxi.sdc.router.e eVar = this.b;
        tje.N(tseVar, null, null, new SourcePointSdcLifecycleListener$onResume$$inlined$safeCollectIn$1(eVar.l, null, this), 3);
        tje.N(tseVar, null, null, new SourcePointSdcLifecycleListener$onResume$$inlined$safeCollectIn$2(new o(eVar.k, this), null, this), 3);
        tje.N(tseVar, null, null, new SourcePointSdcLifecycleListener$onResume$$inlined$safeCollectIn$3(new mth(eVar.m, 6), null, this), 3);
        tje.N(tseVar, null, null, new SourcePointSdcLifecycleListener$onResume$$inlined$safeCollectIn$4(eVar.n, null, this), 3);
        tje.N(tseVar, null, null, new SourcePointSdcLifecycleListener$onResume$6(this, null), 3);
    }
}
