package com.yandex.go.rida.mainscreen.router;

import androidx.lifecycle.Lifecycle;
import com.yandex.go.navigation.api.router.BaseRootNavigationRouter;
import com.yandex.go.navigation.screen.api.Screen;
import com.yandex.go.taxi.order.domain.repositories.e0;
import com.yandex.go.taxi.order.models.api.preorder.Preorder;
import defpackage.a5y0;
import defpackage.b5y0;
import defpackage.c5y0;
import defpackage.cey;
import defpackage.d5k0;
import defpackage.d5y0;
import defpackage.e5k0;
import defpackage.g5k0;
import defpackage.gtc;
import defpackage.h3y;
import defpackage.h5k0;
import defpackage.hre0;
import defpackage.hxx;
import defpackage.jl40;
import defpackage.kgb;
import defpackage.m950;
import defpackage.mo30;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.ofb;
import defpackage.p2y0;
import defpackage.qa00;
import defpackage.qse0;
import defpackage.rre0;
import defpackage.tje;
import defpackage.vpe0;
import defpackage.w511;
import defpackage.xmf0;
import defpackage.yvf0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.am.g;

/* loaded from: classes13.dex */
public final class e extends BaseRootNavigationRouter implements qa00 {
    public final Lifecycle D;
    public final g E;
    public final com.yandex.go.preload.e F;
    public final com.yandex.go.superapp.order.multi.old.provider.g G;
    public final gtc H;
    public final com.yandex.go.navigation.screen.c I;
    public final yvf0 J;
    public final p2y0 K;
    public final h3y L;
    public final ofb M;
    public final yvf0 N;
    public final kgb O;
    public final BaseRootNavigationRouter.a P = new BaseRootNavigationRouter.a(Screen.MAIN, BaseRootNavigationRouter.Background.MAP, null, 12);
    public boolean Q;

    public e(Lifecycle lifecycle, g gVar, com.yandex.go.preload.e eVar, com.yandex.go.superapp.order.multi.old.provider.g gVar2, gtc gtcVar, com.yandex.go.navigation.screen.c cVar, yvf0 yvf0Var, p2y0 p2y0Var, h3y h3yVar, ofb ofbVar, yvf0 yvf0Var2, kgb kgbVar) {
        this.D = lifecycle;
        this.E = gVar;
        this.F = eVar;
        this.G = gVar2;
        this.H = gtcVar;
        this.I = cVar;
        this.J = yvf0Var;
        this.K = p2y0Var;
        this.L = h3yVar;
        this.M = ofbVar;
        this.N = yvf0Var2;
        this.O = kgbVar;
    }

    public static final void Q(e eVar, qse0 qse0Var, String str) {
        eVar.getClass();
        eVar.R(new hre0(new vpe0(new Preorder(0)), qse0Var, str));
    }

    @Override // defpackage.h55
    public final void G(Object obj) {
        d5k0 d5k0Var = (d5k0) obj;
        if (this.Q) {
            return;
        }
        tje.N(o(), null, null, new RidaAppMainScreenRouterImpl$onAttach$1(d5k0Var, this, null), 3);
    }

    @Override // defpackage.h55
    public final void H(Object obj) {
        this.Q = true;
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        tje.N(o(), null, null, new RidaAppMainScreenRouterImpl$onLaunch$1(this, null), 3);
    }

    @Override // com.yandex.go.navigation.api.router.BaseRootNavigationRouter
    public final BaseRootNavigationRouter.a P() {
        return this.P;
    }

    public final void R(rre0 rre0Var) {
        Lifecycle lifecycle = this.D;
        if (lifecycle.b().a(Lifecycle.State.STARTED)) {
            E((m950) this.N.get(), rre0Var, new mo30(19, this), hxx.a);
        } else {
            cey.b(lifecycle, Lifecycle.Event.ON_START, new xmf0(23, this, rre0Var));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object S(d5y0 d5y0Var, Continuation continuation) {
        RidaAppMainScreenRouterImpl$launchTaxiOrderRouter$1 ridaAppMainScreenRouterImpl$launchTaxiOrderRouter$1;
        int i;
        o2y0 o2y0Var;
        if (continuation instanceof RidaAppMainScreenRouterImpl$launchTaxiOrderRouter$1) {
            ridaAppMainScreenRouterImpl$launchTaxiOrderRouter$1 = (RidaAppMainScreenRouterImpl$launchTaxiOrderRouter$1) continuation;
            int i2 = ridaAppMainScreenRouterImpl$launchTaxiOrderRouter$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ridaAppMainScreenRouterImpl$launchTaxiOrderRouter$1.label = i2 - Integer.MIN_VALUE;
                Object obj = ridaAppMainScreenRouterImpl$launchTaxiOrderRouter$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = ridaAppMainScreenRouterImpl$launchTaxiOrderRouter$1.label;
                int i3 = 0;
                gtc gtcVar = this.H;
                yvf0 yvf0Var = this.J;
                hxx hxxVar = hxx.a;
                int i4 = 1;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (d5y0Var instanceof c5y0) {
                        E((m950) yvf0Var.get(), d5y0Var, new e5k0(this, i3), hxxVar);
                    } else if (d5y0Var instanceof b5y0) {
                        E((m950) gtcVar.get(), new g5k0(((b5y0) d5y0Var).b), new e5k0(this, i4), hxxVar);
                    } else {
                        if (!(d5y0Var instanceof a5y0)) {
                            w511.b();
                            return null;
                        }
                        o2y0Var = ((a5y0) d5y0Var).b;
                        if (o2y0Var == null) {
                            ridaAppMainScreenRouterImpl$launchTaxiOrderRouter$1.L$0 = d5y0Var;
                            ridaAppMainScreenRouterImpl$launchTaxiOrderRouter$1.label = 1;
                            obj = ((e0) this.K).y(ridaAppMainScreenRouterImpl$launchTaxiOrderRouter$1);
                            if (obj == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                        if (jl40.l(o2y0Var != null ? Boolean.valueOf(this.O.a(o2y0Var.b())) : null, Boolean.TRUE)) {
                            E((m950) gtcVar.get(), new h5k0(o2y0Var), new e5k0(this, i4), hxxVar);
                        } else {
                            E((m950) yvf0Var.get(), d5y0Var, new e5k0(this, i3), hxxVar);
                        }
                    }
                    return zy11.a;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                d5y0Var = (d5y0) ridaAppMainScreenRouterImpl$launchTaxiOrderRouter$1.L$0;
                kotlin.b.b(obj);
                o2y0Var = (o2y0) obj;
                if (jl40.l(o2y0Var != null ? Boolean.valueOf(this.O.a(o2y0Var.b())) : null, Boolean.TRUE)) {
                }
                return zy11.a;
            }
        }
        ridaAppMainScreenRouterImpl$launchTaxiOrderRouter$1 = new RidaAppMainScreenRouterImpl$launchTaxiOrderRouter$1(this, continuation);
        Object obj2 = ridaAppMainScreenRouterImpl$launchTaxiOrderRouter$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = ridaAppMainScreenRouterImpl$launchTaxiOrderRouter$1.label;
        int i32 = 0;
        gtc gtcVar2 = this.H;
        yvf0 yvf0Var2 = this.J;
        hxx hxxVar2 = hxx.a;
        int i42 = 1;
        if (i != 0) {
        }
        o2y0Var = (o2y0) obj2;
        if (jl40.l(o2y0Var != null ? Boolean.valueOf(this.O.a(o2y0Var.b())) : null, Boolean.TRUE)) {
        }
        return zy11.a;
    }
}
