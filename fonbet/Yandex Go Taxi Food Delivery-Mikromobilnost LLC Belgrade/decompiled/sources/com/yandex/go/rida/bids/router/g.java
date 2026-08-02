package com.yandex.go.rida.bids.router;

import android.content.Context;
import com.yandex.go.navigation.api.router.BaseRootNavigationRouter;
import com.yandex.go.navigation.screen.api.Screen;
import com.yandex.go.rida.bids.interactor.i;
import com.yandex.go.rida.bids.interactor.m;
import com.yandex.go.rida.bids.interactor.n;
import com.yandex.go.rida.bids.interactor.p;
import com.yandex.go.rida.bids.interactor.s;
import com.yandex.go.rida.bids.interactor.t;
import com.yandex.go.rida.bids.interactor.u;
import com.yandex.go.rida.bids.interactor.x;
import com.yandex.go.taxi.order.domain.repositories.e0;
import com.yandex.go.taxi.order.models.api.preorder.Preorder;
import com.yandex.go.taxi.order.y;
import defpackage.a3v;
import defpackage.a5y0;
import defpackage.ah00;
import defpackage.b6z0;
import defpackage.br5;
import defpackage.c0g;
import defpackage.c29;
import defpackage.c4;
import defpackage.f5k0;
import defpackage.f721;
import defpackage.g5k0;
import defpackage.g6g;
import defpackage.h5k0;
import defpackage.h6r;
import defpackage.i130;
import defpackage.i5k0;
import defpackage.i5m;
import defpackage.i6r;
import defpackage.ir5;
import defpackage.j5k0;
import defpackage.jr5;
import defpackage.jzi0;
import defpackage.kgb;
import defpackage.l880;
import defpackage.lyh;
import defpackage.m5k0;
import defpackage.m950;
import defpackage.mej;
import defpackage.n3w;
import defpackage.n721;
import defpackage.np5;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.p2y0;
import defpackage.pp5;
import defpackage.q4g;
import defpackage.q5z;
import defpackage.qbl0;
import defpackage.qp5;
import defpackage.qrj0;
import defpackage.ra00;
import defpackage.ri1;
import defpackage.rq70;
import defpackage.sls;
import defpackage.sup0;
import defpackage.teb;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uw40;
import defpackage.vng;
import defpackage.vpr0;
import defpackage.vxj0;
import defpackage.w511;
import defpackage.wiq0;
import defpackage.x780;
import defpackage.xr5;
import defpackage.xvf0;
import defpackage.yea0;
import defpackage.ymu;
import defpackage.yq5;
import defpackage.yr5;
import defpackage.ysg;
import defpackage.yvf0;
import defpackage.z0a0;
import defpackage.zuj0;
import defpackage.zy11;
import defpackage.zzf;
import java.util.HashSet;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.order.l;
import ru.yandex.taxi.zonemodes.j;

/* loaded from: classes13.dex */
public final class g extends BaseRootNavigationRouter implements j5k0 {
    public final ysg D;
    public final zuj0 E;
    public final ra00 F;
    public final ri1 G;
    public final j H;
    public final i6r I;
    public final com.yandex.go.blockeduser.data.c J;
    public final uw40 K;
    public final yvf0 L;
    public final p2y0 M;
    public final com.yandex.go.taxi.order.provider.a N;
    public final yvf0 O;
    public final l880 P;
    public final y Q;
    public final yea0 R;
    public final com.yandex.go.mainscreen.superapp.impl.foundation.domain.g S;
    public final rq70 T;
    public final yvf0 U;
    public final kgb V;
    public final BaseRootNavigationRouter.a W = new BaseRootNavigationRouter.a(Screen.RIDA_BIDS, BaseRootNavigationRouter.Background.MAP, null, 12);

    public g(ysg ysgVar, zuj0 zuj0Var, ra00 ra00Var, ri1 ri1Var, j jVar, i6r i6rVar, com.yandex.go.blockeduser.data.c cVar, uw40 uw40Var, yvf0 yvf0Var, p2y0 p2y0Var, com.yandex.go.taxi.order.provider.a aVar, yvf0 yvf0Var2, l880 l880Var, y yVar, yea0 yea0Var, com.yandex.go.mainscreen.superapp.impl.foundation.domain.g gVar, rq70 rq70Var, yvf0 yvf0Var3, kgb kgbVar) {
        this.D = ysgVar;
        this.E = zuj0Var;
        this.F = ra00Var;
        this.G = ri1Var;
        this.H = jVar;
        this.I = i6rVar;
        this.J = cVar;
        this.K = uw40Var;
        this.L = yvf0Var;
        this.M = p2y0Var;
        this.N = aVar;
        this.O = yvf0Var2;
        this.P = l880Var;
        this.Q = yVar;
        this.R = yea0Var;
        this.S = gVar;
        this.T = rq70Var;
        this.U = yvf0Var3;
        this.V = kgbVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object Q(g gVar, o2y0 o2y0Var, ContinuationImpl continuationImpl) {
        RidaBidsRootRouterImpl$finishOrderProcessing$1 ridaBidsRootRouterImpl$finishOrderProcessing$1;
        int i;
        y yVar = gVar.Q;
        if (continuationImpl instanceof RidaBidsRootRouterImpl$finishOrderProcessing$1) {
            ridaBidsRootRouterImpl$finishOrderProcessing$1 = (RidaBidsRootRouterImpl$finishOrderProcessing$1) continuationImpl;
            int i2 = ridaBidsRootRouterImpl$finishOrderProcessing$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ridaBidsRootRouterImpl$finishOrderProcessing$1.label = i2 - Integer.MIN_VALUE;
                Object obj = ridaBidsRootRouterImpl$finishOrderProcessing$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = ridaBidsRootRouterImpl$finishOrderProcessing$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ri1 ri1Var = gVar.G;
                    String str = o2y0Var.b().a;
                    HashSet hashSet = ri1Var.b;
                    if (hashSet.contains(str)) {
                        hashSet.clear();
                    }
                    com.yandex.go.taxi.order.provider.a aVar = gVar.N;
                    ridaBidsRootRouterImpl$finishOrderProcessing$1.L$0 = o2y0Var;
                    ridaBidsRootRouterImpl$finishOrderProcessing$1.label = 1;
                    if (aVar.i(o2y0Var, true, false, ridaBidsRootRouterImpl$finishOrderProcessing$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o2y0Var = (o2y0) ridaBidsRootRouterImpl$finishOrderProcessing$1.L$0;
                    kotlin.b.b(obj);
                }
                yVar.n(0L, o2y0Var.b().a, "finishRidaBidsOrderProcessing");
                yVar.a(o2y0Var.b().a);
                return zy11.a;
            }
        }
        ridaBidsRootRouterImpl$finishOrderProcessing$1 = new RidaBidsRootRouterImpl$finishOrderProcessing$1(gVar, continuationImpl);
        Object obj2 = ridaBidsRootRouterImpl$finishOrderProcessing$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = ridaBidsRootRouterImpl$finishOrderProcessing$1.label;
        if (i != 0) {
        }
        yVar.n(0L, o2y0Var.b().a, "finishRidaBidsOrderProcessing");
        yVar.a(o2y0Var.b().a);
        return zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object R(g gVar, i5k0 i5k0Var, ContinuationImpl continuationImpl) {
        RidaBidsRootRouterImpl$launchRidaBidsRouter$1 ridaBidsRootRouterImpl$launchRidaBidsRouter$1;
        int i;
        o2y0 o2y0Var;
        boolean a;
        kgb kgbVar = gVar.V;
        if (continuationImpl instanceof RidaBidsRootRouterImpl$launchRidaBidsRouter$1) {
            ridaBidsRootRouterImpl$launchRidaBidsRouter$1 = (RidaBidsRootRouterImpl$launchRidaBidsRouter$1) continuationImpl;
            int i2 = ridaBidsRootRouterImpl$launchRidaBidsRouter$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ridaBidsRootRouterImpl$launchRidaBidsRouter$1.label = i2 - Integer.MIN_VALUE;
                Object obj = ridaBidsRootRouterImpl$launchRidaBidsRouter$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = ridaBidsRootRouterImpl$launchRidaBidsRouter$1.label;
                int i3 = 1;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (!(i5k0Var instanceof g5k0)) {
                        if (!(i5k0Var instanceof h5k0)) {
                            w511.b();
                            return null;
                        }
                        o2y0Var = ((h5k0) i5k0Var).a;
                        o2y0 o2y0Var2 = o2y0Var;
                        a = kgbVar.a(o2y0Var2.b());
                        zy11 zy11Var = zy11.a;
                        if (!a) {
                            gVar.F.b((m950) gVar.L.get(), new a5y0("open from rida bids", o2y0Var2, null, 28));
                            return zy11Var;
                        }
                        int i4 = 9;
                        tje.N(gVar.o(), null, null, new RidaBidsRootRouterImpl$launchListenCompatibility$$inlined$collectIn$1(kotlinx.coroutines.flow.e.t(new p(vng.l(o2y0Var2.a(), new teb(i4), vng.c), kgbVar)), null, gVar, o2y0Var2), 3);
                        rq70 rq70Var = gVar.T;
                        qrj0 qrj0Var = rq70Var.a;
                        h6r h6rVar = rq70Var.b;
                        qrj0Var.getClass();
                        h6rVar.getClass();
                        c29 c29Var = new c29(26, new q4g(h6rVar, o2y0Var2, qrj0Var).n());
                        gVar.P.a(new vxj0(i3, gVar, c29Var));
                        i6r i6rVar = gVar.I;
                        i6rVar.getClass();
                        xvf0 b = i5m.b(yr5.a);
                        xvf0 b2 = i5m.b(qp5.a);
                        xvf0 b3 = i5m.b(jr5.a);
                        xvf0 b4 = i5m.b(new c4(new jzi0(5, new g6g(i6rVar, 11)), new g6g(i6rVar, i4), n3w.a(o2y0Var2), 22));
                        lyh lyhVar = new lyh(new g6g(i6rVar, 10), new g6g(i6rVar, 12), 17);
                        c0g c0gVar = (c0g) i6rVar;
                        c0g c0gVar2 = c0gVar.A;
                        zzf zzfVar = c0gVar.z;
                        Context e2 = c0gVar.e2();
                        q5z.h(e2);
                        zuj0 N2 = c0gVar.N2();
                        q5z.h(N2);
                        ah00 z2 = c0gVar.z2();
                        q5z.h(z2);
                        tt2 Z1 = c0gVar.Z1();
                        q5z.h(Z1);
                        a3v q2 = c0gVar.q2();
                        q5z.h(q2);
                        ru.yandex.taxi.map_common.map.p pVar = (ru.yandex.taxi.map_common.map.p) c0gVar.ht.get();
                        q5z.h(pVar);
                        t tVar = new t(z2, Z1, o2y0Var2, q2, pVar);
                        tt2 Z12 = c0gVar.Z1();
                        q5z.h(Z12);
                        xr5 xr5Var = (xr5) b.get();
                        pp5 pp5Var = (pp5) b2.get();
                        zuj0 N22 = c0gVar.N2();
                        q5z.h(N22);
                        ru.yandex.taxi.widget.c r2 = c0gVar.r2();
                        q5z.h(r2);
                        i iVar = new i(pp5Var, N22, r2);
                        zuj0 N23 = c0gVar.N2();
                        q5z.h(N23);
                        f5k0 f5k0Var = (f5k0) c0gVar2.a.h4.get();
                        q5z.h(f5k0Var);
                        com.yandex.go.rida.bids.interactor.e eVar = new com.yandex.go.rida.bids.interactor.e(N23, o2y0Var2, f5k0Var, new x(o2y0Var2, (pp5) b2.get()), zzfVar.d1(), (z0a0) zzfVar.fi.get());
                        ir5 ir5Var = (ir5) b3.get();
                        ymu ymuVar = new ymu(24, (pp5) b2.get(), (com.yandex.go.rida.bids.data.a) b4.get());
                        a3v q22 = c0gVar.q2();
                        q5z.h(q22);
                        wiq0 S2 = c0gVar.S2();
                        q5z.h(S2);
                        qbl0 qbl0Var = (qbl0) zzfVar.C2.get();
                        q5z.h(qbl0Var);
                        m mVar = new m(Z12, xr5Var, iVar, eVar, ir5Var, ymuVar, new sup0(q22, S2, qbl0Var));
                        pp5 pp5Var2 = (pp5) b2.get();
                        a3v q23 = c0gVar.q2();
                        q5z.h(q23);
                        xr5 xr5Var2 = (xr5) b.get();
                        pp5 pp5Var3 = (pp5) b2.get();
                        zuj0 N24 = c0gVar.N2();
                        q5z.h(N24);
                        com.yandex.go.rida.bids.interactor.a aVar = new com.yandex.go.rida.bids.interactor.a(pp5Var3, N24, (com.yandex.go.rida.bids.data.a) b4.get());
                        u uVar = new u((pp5) b2.get(), (com.yandex.go.rida.bids.data.a) b4.get());
                        zuj0 N25 = c0gVar.N2();
                        q5z.h(N25);
                        com.yandex.go.promocodes.base.impl.promo_codes.data.repositories.c cVar = (com.yandex.go.promocodes.base.impl.promo_codes.data.repositories.c) zzfVar.q8.get();
                        q5z.h(cVar);
                        np5 np5Var = new np5(N25, o2y0Var2, cVar, c29Var);
                        n nVar = new n((pp5) b2.get(), o2y0Var2, (com.yandex.go.rida.bids.data.a) b4.get());
                        pp5 pp5Var4 = (pp5) b2.get();
                        com.yandex.go.rida.bids.data.a aVar2 = (com.yandex.go.rida.bids.data.a) b4.get();
                        f5k0 f5k0Var2 = (f5k0) c0gVar2.a.h4.get();
                        q5z.h(f5k0Var2);
                        com.yandex.go.rida.bids.interactor.j jVar = new com.yandex.go.rida.bids.interactor.j(pp5Var2, q23, xr5Var2, aVar, uVar, np5Var, nVar, new com.yandex.go.rida.bids.interactor.b(pp5Var4, aVar2, f5k0Var2), (ir5) b3.get());
                        xr5 xr5Var3 = (xr5) b.get();
                        l lVar = (l) zzfVar.l4.get();
                        q5z.h(lVar);
                        i130 G = c0gVar.G();
                        q5z.h(G);
                        ysg ysgVar = (ysg) zzfVar.I2.get();
                        q5z.h(ysgVar);
                        zuj0 N26 = c0gVar.N2();
                        q5z.h(N26);
                        s sVar = new s(ysgVar, N26, o2y0Var2, new x780());
                        pp5 pp5Var5 = (pp5) b2.get();
                        b6z0 b6z0Var = (b6z0) zzfVar.N.get();
                        q5z.h(b6z0Var);
                        com.yandex.go.rida.bids.interactor.f fVar = new com.yandex.go.rida.bids.interactor.f(sVar, new f721(pp5Var5, o2y0Var2, b6z0Var));
                        vpr0 vpr0Var = (vpr0) c0gVar2.a.w0.get();
                        q5z.h(vpr0Var);
                        ru.yandex.taxi.widget.utils.e A2 = c0gVar.A2();
                        q5z.h(A2);
                        gVar.D(new e(e2, N2, tVar, mVar, jVar, xr5Var3, lVar, lyhVar, G, fVar, vpr0Var, new br5(A2, new x(o2y0Var2, (pp5) b2.get()), (ir5) b3.get())), yq5.a, new m5k0(c29Var, o2y0Var2, gVar));
                        return zy11Var;
                    }
                    p2y0 p2y0Var = gVar.M;
                    Preorder preorder = ((g5k0) i5k0Var).a;
                    ridaBidsRootRouterImpl$launchRidaBidsRouter$1.L$0 = null;
                    ridaBidsRootRouterImpl$launchRidaBidsRouter$1.label = 1;
                    obj = ((e0) p2y0Var).j(preorder, ridaBidsRootRouterImpl$launchRidaBidsRouter$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                o2y0Var = (o2y0) obj;
                o2y0 o2y0Var22 = o2y0Var;
                a = kgbVar.a(o2y0Var22.b());
                zy11 zy11Var2 = zy11.a;
                if (!a) {
                }
            }
        }
        ridaBidsRootRouterImpl$launchRidaBidsRouter$1 = new RidaBidsRootRouterImpl$launchRidaBidsRouter$1(gVar, continuationImpl);
        Object obj2 = ridaBidsRootRouterImpl$launchRidaBidsRouter$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = ridaBidsRootRouterImpl$launchRidaBidsRouter$1.label;
        int i32 = 1;
        if (i != 0) {
        }
        o2y0Var = (o2y0) obj2;
        o2y0 o2y0Var222 = o2y0Var;
        a = kgbVar.a(o2y0Var222.b());
        zy11 zy11Var22 = zy11.a;
        if (!a) {
        }
    }

    public static final void S(c29 c29Var, final o2y0 o2y0Var, final g gVar) {
        gVar.getClass();
        ((com.yandex.go.taxi.order.controller.a) c29Var.b).k(new n721() { // from class: com.yandex.go.rida.bids.router.f
            @Override // defpackage.n721
            public final void a() {
            }

            @Override // defpackage.n721
            public final void onSuccess() {
                g gVar2 = g.this;
                tje.N(gVar2.o(), null, null, new RidaBidsRootRouterImpl$returnToSummary$1$1(gVar2, o2y0Var, null), 3);
            }
        });
    }

    public static final void T(g gVar, mej mejVar, sls slsVar, sls slsVar2) {
        gVar.A((m950) gVar.O.get(), mejVar, new c(gVar, slsVar2, slsVar, 1));
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        tje.N(o(), null, null, new RidaBidsRootRouterImpl$onLaunch$1(this, (i5k0) obj, null), 3);
    }

    @Override // com.yandex.go.navigation.api.router.BaseRootNavigationRouter
    public final BaseRootNavigationRouter.a P() {
        return this.W;
    }
}
