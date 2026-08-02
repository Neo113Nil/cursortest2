package com.yandex.go.navigator.rate_route;

import android.content.Context;
import com.yandex.go.navigator.analitycs.RouteCompletionType;
import com.yandex.passport.sloth.ui.dependencies.m;
import defpackage.aye0;
import defpackage.gus;
import defpackage.ip11;
import defpackage.l7i0;
import defpackage.p7i0;
import defpackage.par;
import defpackage.pwy0;
import defpackage.pzt0;
import defpackage.q7i0;
import defpackage.r4v;
import defpackage.rut;
import defpackage.tje;
import defpackage.vm80;
import defpackage.w030;
import defpackage.xvf0;
import defpackage.ya50;
import defpackage.zuj0;
import kotlin.coroutines.Continuation;

/* loaded from: classes12.dex */
public final class e extends com.yandex.go.navigation.modals.coroutines.a {
    public final q7i0 F;
    public final l7i0 G;
    public final d H;
    public final w030 I;
    public pzt0 J;
    public final boolean K;

    public e(q7i0 q7i0Var, l7i0 l7i0Var, d dVar, w030 w030Var) {
        super(null);
        this.F = q7i0Var;
        this.G = l7i0Var;
        this.H = dVar;
        this.I = w030Var;
        this.K = true;
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a, defpackage.h55
    public final void G(Object obj) {
        this.J = tje.N(o(), null, null, new RateRouteRouter$onAttach$1(this, (RouteCompletionType) obj, null), 3);
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a, defpackage.h55
    public final void H(Object obj) {
        super.H((RouteCompletionType) obj);
        pzt0 pzt0Var = this.J;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.J = null;
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a
    public final w030 P() {
        return this.I;
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a
    public final boolean Q() {
        return this.K;
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a
    public final Object S(Object obj, Continuation continuation) {
        RouteCompletionType routeCompletionType = (RouteCompletionType) obj;
        aye0 aye0Var = new aye0(8, this);
        m mVar = this.F.a;
        p7i0 p7i0Var = new p7i0(aye0Var, routeCompletionType, (ru.yandex.taxi.design.utils.b) ((xvf0) mVar.a).get(), (ya50) ((xvf0) mVar.b).get(), (par) ((xvf0) mVar.c).get(), (zuj0) ((xvf0) mVar.d).get(), (com.yandex.go.navigator.providers.b) ((xvf0) mVar.e).get(), (ru.yandex.taxi.map_common.style.domain.a) ((xvf0) mVar.f).get(), (d) ((xvf0) mVar.g).get(), (a) ((vm80) mVar.h).get(), (r4v) ((rut) mVar.i).get(), (pwy0) ((xvf0) mVar.j).get());
        gus gusVar = this.G.a;
        return new RateRouteModalView((Context) gusVar.a.get(), p7i0Var, (ip11) gusVar.b.get());
    }
}
