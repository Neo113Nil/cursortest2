package com.yandex.go.superapp.discovery.map.impl.navigation;

import com.yandex.go.layers.api.model.params.Mode;
import com.yandex.go.navigation.api.router.BaseRootNavigationRouter;
import com.yandex.go.navigation.screen.api.Screen;
import com.yandex.go.superapp.discovery.map.impl.data.repositories.common.d;
import com.yandex.go.superapp.discovery.map.impl.domain.interactors.y;
import com.yandex.go.superapp.discovery.map.impl.experiments.s;
import com.yandex.go.superapp.discovery.map.impl.experiments.v2.p;
import defpackage.a211;
import defpackage.avv0;
import defpackage.byx;
import defpackage.c430;
import defpackage.cyx;
import defpackage.f7c0;
import defpackage.fif;
import defpackage.fin0;
import defpackage.g18;
import defpackage.gh00;
import defpackage.hwv0;
import defpackage.i6r;
import defpackage.ivv0;
import defpackage.jvv0;
import defpackage.l30;
import defpackage.m950;
import defpackage.ogu0;
import defpackage.pzt0;
import defpackage.sls;
import defpackage.sy60;
import defpackage.tje;
import defpackage.tls;
import defpackage.tux0;
import defpackage.un0;
import defpackage.w030;
import defpackage.ww9;
import defpackage.xvv0;
import defpackage.ydf;
import defpackage.yvf0;
import defpackage.zy11;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes14.dex */
public final class c extends BaseRootNavigationRouter {
    public final w030 D;
    public final i6r E;
    public final s F;
    public final p G;
    public final avv0 H;
    public final jvv0 I;
    public final f7c0 J;
    public final a211 K;
    public final ww9 L;
    public final fin0 M;
    public final tux0 N;
    public final yvf0 O;
    public final yvf0 P;
    public final yvf0 Q;
    public final yvf0 R;
    public final cyx S;
    public final fif T;
    public final com.yandex.go.superapp.discovery.map.impl.domain.interactors.settlement.a U;
    public final yvf0 V;
    public final com.yandex.go.superapp.discovery.map.impl.domain.interactors.b W;
    public l30 Z;
    public y a0;
    public pzt0 b0;
    public final BaseRootNavigationRouter.a c0 = new BaseRootNavigationRouter.a(Screen.DISCOVERY_MAP, BaseRootNavigationRouter.Background.MAP, null, 12);

    public c(w030 w030Var, i6r i6rVar, s sVar, p pVar, avv0 avv0Var, jvv0 jvv0Var, f7c0 f7c0Var, a211 a211Var, ww9 ww9Var, fin0 fin0Var, tux0 tux0Var, yvf0 yvf0Var, yvf0 yvf0Var2, yvf0 yvf0Var3, yvf0 yvf0Var4, cyx cyxVar, fif fifVar, com.yandex.go.superapp.discovery.map.impl.domain.interactors.settlement.a aVar, yvf0 yvf0Var5, com.yandex.go.superapp.discovery.map.impl.domain.interactors.b bVar) {
        this.D = w030Var;
        this.E = i6rVar;
        this.F = sVar;
        this.G = pVar;
        this.H = avv0Var;
        this.I = jvv0Var;
        this.J = f7c0Var;
        this.K = a211Var;
        this.L = ww9Var;
        this.M = fin0Var;
        this.N = tux0Var;
        this.O = yvf0Var;
        this.P = yvf0Var2;
        this.Q = yvf0Var3;
        this.R = yvf0Var4;
        this.S = cyxVar;
        this.T = fifVar;
        this.U = aVar;
        this.V = yvf0Var5;
        this.W = bVar;
    }

    public static final void Q(c cVar, d dVar, m950 m950Var, sy60 sy60Var) {
        cVar.getClass();
        cVar.R(dVar, new ogu0(21, m950Var), zy11.a, sy60Var, new hwv0(cVar, 0));
    }

    @Override // defpackage.h55
    public final void G(Object obj) {
        l30 l30Var = this.Z;
        if (l30Var != null) {
            l30Var.cancel();
        }
        this.Z = this.T.c(new ydf(11));
        this.S.b(new byx(com.yandex.go.layers.api.model.params.Screen.DISCOVERY, new c430(Mode.NORMAL, (kotlinx.serialization.json.b) null, (un0) null)));
        jvv0 jvv0Var = this.I;
        if (jvv0Var.b) {
            return;
        }
        jvv0Var.b = true;
        jvv0Var.c = this.D.g(jvv0Var.a);
    }

    @Override // defpackage.h55
    public final void H(Object obj) {
        jvv0 jvv0Var = this.I;
        jvv0Var.b = false;
        g18 g18Var = jvv0Var.c;
        if (g18Var != null) {
            g18Var.cancel();
        }
        jvv0Var.c = null;
        ivv0 ivv0Var = jvv0Var.a;
        ivv0Var.a.clear();
        ivv0Var.b.a();
    }

    @Override // defpackage.h55
    public final void I(Object obj) {
        Object value;
        y yVar = this.a0;
        if (yVar != null) {
            yVar.i = false;
            ((gh00) yVar.g).s(yVar.m);
            yVar.k.b = null;
        }
        this.a0 = null;
        pzt0 pzt0Var = this.b0;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.b0 = null;
        this.J.f();
        this.K.f();
        this.L.f();
        this.M.f();
        this.N.f();
        r0 r0Var = this.H.a;
        do {
            value = r0Var.getValue();
        } while (!r0Var.k(value, EmptyList.a));
        l30 l30Var = this.Z;
        if (l30Var != null) {
            l30Var.cancel();
        }
        this.Z = null;
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        com.yandex.go.coroutines.b.g(o(), null, null, new SuperAppDiscoveryMapRouterImpl$initSettlementBbox$1(this, null), 3);
        com.yandex.go.coroutines.b.g(o(), null, null, new SuperAppDiscoveryMapRouterImpl$onLaunch$1(this, (xvv0) obj, null), 3);
    }

    @Override // com.yandex.go.navigation.api.router.BaseRootNavigationRouter
    public final BaseRootNavigationRouter.a P() {
        return this.c0;
    }

    public final pzt0 R(d dVar, sls slsVar, Object obj, sy60 sy60Var, tls tlsVar) {
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        return tje.N(o(), null, null, new SuperAppDiscoveryMapRouterImpl$collectAsServiceVisibility$$inlined$safeCollectIn$1(e.t(new b(dVar, tlsVar)), null, ref$ObjectRef, slsVar, this, obj, sy60Var), 3);
    }
}
