package com.yandex.go.taxi.order.navigation;

import com.yandex.go.address.models.Address;
import com.yandex.go.blockeduser.data.c;
import com.yandex.go.navigation.api.router.BaseRootNavigationRouter;
import com.yandex.go.navigation.screen.api.Screen;
import com.yandex.go.route.analytics.e;
import com.yandex.go.superapp.order.multi.old.provider.g;
import com.yandex.go.taxi.order.logger.TaxiOrderLogGroup;
import com.yandex.go.taxi.order.models.api.preorder.Preorder;
import defpackage.a3y0;
import defpackage.a5y0;
import defpackage.b5y0;
import defpackage.clk0;
import defpackage.d0l0;
import defpackage.d5y0;
import defpackage.e5y0;
import defpackage.f5y0;
import defpackage.g6y0;
import defpackage.h3y;
import defpackage.h5y0;
import defpackage.hst;
import defpackage.hxx;
import defpackage.i6y0;
import defpackage.jc00;
import defpackage.jst;
import defpackage.kf4;
import defpackage.kgb;
import defpackage.m950;
import defpackage.mua0;
import defpackage.mw40;
import defpackage.n1u0;
import defpackage.ny61;
import defpackage.o0m0;
import defpackage.o2y0;
import defpackage.oep0;
import defpackage.pzt0;
import defpackage.ra00;
import defpackage.t41;
import defpackage.tje;
import defpackage.tse;
import defpackage.vzx0;
import defpackage.y4k0;
import defpackage.yvf0;
import defpackage.zy11;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;
import ru.yandex.taxi.multiorder.f;

/* loaded from: classes8.dex */
public final class a extends BaseRootNavigationRouter implements e5y0 {
    public final tse D;
    public final ra00 E;
    public final oep0 F;
    public final n1u0 G;
    public final clk0 H;
    public final mw40 I;
    public final yvf0 J;
    public final f K;
    public final kf4 L;
    public final h3y M;
    public final com.yandex.go.taxi.order.provider.a N;
    public final yvf0 O;
    public final g P;
    public final yvf0 Q;
    public final h3y R;
    public final h3y S;
    public final y4k0 T;
    public final o0m0 U;
    public final g6y0 V;
    public final t41 W;
    public final a3y0 Z = new a3y0(TaxiOrderLogGroup.NAVIGATION.getTag(), "TaxiOrderRootRouter");
    public final BaseRootNavigationRouter.a a0 = new BaseRootNavigationRouter.a(Screen.ORDER, BaseRootNavigationRouter.Background.MAP, BaseRootNavigationRouter.AnimationType.SLIDE, 8);

    public a(tse tseVar, ra00 ra00Var, oep0 oep0Var, n1u0 n1u0Var, jc00 jc00Var, clk0 clk0Var, mw40 mw40Var, yvf0 yvf0Var, f fVar, kf4 kf4Var, h3y h3yVar, com.yandex.go.taxi.order.provider.a aVar, yvf0 yvf0Var2, g gVar, yvf0 yvf0Var3, h3y h3yVar2, h3y h3yVar3, y4k0 y4k0Var, yvf0 yvf0Var4, kgb kgbVar, o0m0 o0m0Var, g6y0 g6y0Var, t41 t41Var, i6y0 i6y0Var, mua0 mua0Var) {
        this.D = tseVar;
        this.E = ra00Var;
        this.F = oep0Var;
        this.G = n1u0Var;
        this.H = clk0Var;
        this.I = mw40Var;
        this.J = yvf0Var;
        this.K = fVar;
        this.L = kf4Var;
        this.M = h3yVar;
        this.N = aVar;
        this.O = yvf0Var2;
        this.P = gVar;
        this.Q = yvf0Var3;
        this.R = h3yVar2;
        this.S = h3yVar3;
        this.T = y4k0Var;
        this.U = o0m0Var;
        this.V = g6y0Var;
        this.W = t41Var;
        i6y0Var.getClass();
        i6y0Var.c = new WeakReference(mua0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object Q(a aVar, b5y0 b5y0Var, ContinuationImpl continuationImpl) {
        TaxiOrderRootRouterImpl$createOrder$1 taxiOrderRootRouterImpl$createOrder$1;
        int i;
        aVar.getClass();
        if (continuationImpl instanceof TaxiOrderRootRouterImpl$createOrder$1) {
            taxiOrderRootRouterImpl$createOrder$1 = (TaxiOrderRootRouterImpl$createOrder$1) continuationImpl;
            int i2 = taxiOrderRootRouterImpl$createOrder$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                taxiOrderRootRouterImpl$createOrder$1.label = i2 - Integer.MIN_VALUE;
                Object obj = taxiOrderRootRouterImpl$createOrder$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = taxiOrderRootRouterImpl$createOrder$1.label;
                if (i != 0) {
                    b.b(obj);
                    aVar.Z.getClass();
                    a3y0.h(new String[]{"createOrder"});
                    hst hstVar = jst.e;
                    Preorder b = b5y0Var.b();
                    d0l0 d0l0Var = b.G;
                    t41 t41Var = aVar.W;
                    Address h = d0l0Var.h();
                    Address b2 = d0l0Var.b();
                    String str = b.a;
                    if (str == null) {
                        str = b.b;
                    }
                    ((e) t41Var).b(h, b2, str);
                    com.yandex.go.taxi.order.provider.a aVar2 = aVar.N;
                    Preorder b3 = b5y0Var.b();
                    taxiOrderRootRouterImpl$createOrder$1.L$0 = b5y0Var;
                    taxiOrderRootRouterImpl$createOrder$1.label = 1;
                    obj = aVar2.c(b3, taxiOrderRootRouterImpl$createOrder$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b5y0Var = (b5y0) taxiOrderRootRouterImpl$createOrder$1.L$0;
                    b.b(obj);
                }
                R(aVar, b5y0Var, (o2y0) obj, false, 4);
                return zy11.a;
            }
        }
        taxiOrderRootRouterImpl$createOrder$1 = new TaxiOrderRootRouterImpl$createOrder$1(aVar, continuationImpl);
        Object obj2 = taxiOrderRootRouterImpl$createOrder$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = taxiOrderRootRouterImpl$createOrder$1.label;
        if (i != 0) {
        }
        R(aVar, b5y0Var, (o2y0) obj2, false, 4);
        return zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void R(a aVar, d5y0 d5y0Var, o2y0 o2y0Var, boolean z, int i) {
        boolean z2;
        int i2 = 1;
        if ((i & 4) != 0) {
            z = true;
        }
        if (!z) {
            aVar.getClass();
        } else if (!aVar.P.d()) {
            z2 = false;
            a3y0 a3y0Var = aVar.Z;
            if (z2) {
                a3y0Var.b("launchControllerFragment", new IllegalArgumentException("No orders can be displayed"), new f5y0(aVar, i2));
                aVar.i();
                return;
            }
            a3y0Var.getClass();
            a3y0.h(new String[]{"launchControllerFragment"});
            hst hstVar = jst.e;
            n1u0 n1u0Var = aVar.G;
            String a = d5y0Var.a();
            n1u0Var.getClass();
            HashMap hashMap = new HashMap();
            if (a != null) {
                hashMap.put(CRLReasonCodeExtension.REASON, a);
            }
            n1u0Var.a.a("StartOrderController", hashMap, 1, new HashMap());
            a5y0 a5y0Var = d5y0Var instanceof a5y0 ? (a5y0) d5y0Var : null;
            aVar.E((m950) aVar.O.get(), new vzx0(o2y0Var, a5y0Var != null ? a5y0Var.b() : false), new h5y0(aVar), hxx.a);
            return;
        }
        z2 = true;
        a3y0 a3y0Var2 = aVar.Z;
        if (z2) {
        }
    }

    @Override // defpackage.h55
    public final void G(Object obj) {
        this.Z.getClass();
        a3y0.h(new String[]{"onAttach"});
        hst hstVar = jst.e;
    }

    @Override // defpackage.h55
    public final void H(Object obj) {
        this.Z.getClass();
        a3y0.h(new String[]{"onDetach"});
        hst hstVar = jst.e;
    }

    @Override // defpackage.h55
    public final void I(Object obj) {
        this.Z.getClass();
        a3y0.h(new String[]{"onDismiss"});
        hst hstVar = jst.e;
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        d5y0 d5y0Var = (d5y0) obj;
        a3y0 a3y0Var = this.Z;
        a3y0Var.getClass();
        a3y0.h(new String[]{"onLaunch"});
        hst hstVar = jst.e;
        f fVar = this.K;
        pzt0 pzt0Var = fVar.i;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        fVar.i = null;
        int i = 0;
        this.L.a.d(false);
        if (!((c) this.M.get()).a()) {
            tje.N(o(), null, null, new TaxiOrderRootRouterImpl$onLaunch$3(this, d5y0Var, null), 3);
        } else {
            a3y0.d(a3y0Var, "onLaunch", null, new f5y0(this, i), 2);
            i();
        }
    }

    @Override // defpackage.h55
    public final void K(Object obj) {
        this.Z.getClass();
        a3y0.h(new String[]{"onResume"});
        hst hstVar = jst.e;
    }

    @Override // defpackage.h55
    public final void L(Object obj) {
        this.Z.getClass();
        a3y0.h(new String[]{"onSuspend"});
        hst hstVar = jst.e;
    }

    @Override // com.yandex.go.navigation.api.router.BaseRootNavigationRouter
    public final BaseRootNavigationRouter.a P() {
        return this.a0;
    }

    public final void S() {
        tje.N(this.D, null, null, new TaxiOrderRootRouterImpl$maybeBackToActiveOrder$1(this, null), 3);
    }
}
