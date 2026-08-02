package com.yandex.go.superapp.order.multi.old.view;

import androidx.lifecycle.Lifecycle;
import com.yandex.go.superapp.order.multi.old.recenter.SuperAppRecenterInteractor$resume$$inlined$flatMapLatest$1;
import com.yandex.go.superapp.order.multi.old.recenter.SuperAppRecenterInteractor$resume$$inlined$safeCollectIn$1;
import com.yandex.go.taxi.order.analytics.DetailsOpenReason;
import com.yandex.go.taxi.order.api.multi.TaxiOrderPresentationType;
import com.yandex.go.taxi.order.domain.repositories.f0;
import com.yandex.go.taxi.order.logger.TaxiOrderLogGroup;
import com.yandex.go.taxi.order.models.api.screen.OrderScreen;
import com.yandex.go.taxi.order.stack.OrderStackMvpView;
import defpackage.a3v;
import defpackage.a3y0;
import defpackage.a850;
import defpackage.bc00;
import defpackage.bt00;
import defpackage.co40;
import defpackage.dz00;
import defpackage.f9j0;
import defpackage.g18;
import defpackage.g6y0;
import defpackage.h3y;
import defpackage.hc00;
import defpackage.hc80;
import defpackage.i3y;
import defpackage.ic00;
import defpackage.jc00;
import defpackage.jqr;
import defpackage.k110;
import defpackage.kc00;
import defpackage.m6w0;
import defpackage.mjg0;
import defpackage.mw40;
import defpackage.ny61;
import defpackage.oa1;
import defpackage.oep0;
import defpackage.p370;
import defpackage.pw40;
import defpackage.pzt0;
import defpackage.qa80;
import defpackage.qc5;
import defpackage.ra80;
import defpackage.rut;
import defpackage.tje;
import defpackage.u4y0;
import defpackage.x980;
import defpackage.xoy;
import defpackage.y3y0;
import defpackage.yih;
import defpackage.yvf0;
import defpackage.zi60;
import defpackage.zo70;
import java.util.HashMap;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineStart;

/* loaded from: classes14.dex */
public final class f extends qc5 {
    public final oep0 A;
    public final com.yandex.go.taxi.order.view.l B;
    public final com.yandex.go.taxi.order.provider.a C;
    public final l D;
    public final g E;
    public final mw40 F;
    public final hc80 G;
    public final p370 H;
    public final com.yandex.go.taxi.order.tariff_upgrade.domain.c I;
    public final m6w0 J;
    public final yvf0 K;
    public final f0 L;
    public final a3v M;
    public final a850 N;
    public final bt00 O;
    public final dz00 P;
    public final com.yandex.go.taxi.order.recalculation.domain.a Q;
    public final h3y R;
    public final pw40 S;
    public final x980 T;
    public final com.yandex.go.taxi.order.multi.feed.domain.a U;
    public final jc00 V;
    public final com.yandex.go.taxi.order.details.v2.navigation.c W;
    public final mjg0 Z;
    public final oa1 a0;
    public final com.yandex.go.inapp_calls.navigation.fullscreenintent.d b0;
    public final g6y0 c0;
    public final yih d0;
    public final y3y0 e0;
    public final a3y0 f0;
    public OrderScreen g0;
    public OrderScreen h0;
    public ra80 i0;
    public boolean j0;
    public g18 k0;
    public pzt0 l0;
    public pzt0 m0;
    public xoy n0;
    public final i3y o0;

    public f(Lifecycle lifecycle, oep0 oep0Var, com.yandex.go.taxi.order.view.l lVar, com.yandex.go.taxi.order.provider.a aVar, l lVar2, g gVar, mw40 mw40Var, hc80 hc80Var, p370 p370Var, com.yandex.go.taxi.order.tariff_upgrade.domain.c cVar, m6w0 m6w0Var, rut rutVar, f0 f0Var, a3v a3vVar, a850 a850Var, bt00 bt00Var, dz00 dz00Var, zi60 zi60Var, com.yandex.go.taxi.order.recalculation.domain.a aVar2, h3y h3yVar, pw40 pw40Var, x980 x980Var, com.yandex.go.taxi.order.multi.feed.domain.a aVar3, jc00 jc00Var, com.yandex.go.taxi.order.details.v2.navigation.c cVar2, mjg0 mjg0Var, oa1 oa1Var, com.yandex.go.inapp_calls.navigation.fullscreenintent.d dVar, g6y0 g6y0Var, yih yihVar, y3y0 y3y0Var) {
        super(OrderStackMvpView.class, lifecycle);
        this.A = oep0Var;
        this.B = lVar;
        this.C = aVar;
        this.D = lVar2;
        this.E = gVar;
        this.F = mw40Var;
        this.G = hc80Var;
        this.H = p370Var;
        this.I = cVar;
        this.J = m6w0Var;
        this.K = rutVar;
        this.L = f0Var;
        this.M = a3vVar;
        this.N = a850Var;
        this.O = bt00Var;
        this.P = dz00Var;
        this.Q = aVar2;
        this.R = h3yVar;
        this.S = pw40Var;
        this.T = x980Var;
        this.U = aVar3;
        this.V = jc00Var;
        this.W = cVar2;
        this.Z = mjg0Var;
        this.a0 = oa1Var;
        this.b0 = dVar;
        this.c0 = g6y0Var;
        this.d0 = yihVar;
        this.e0 = y3y0Var;
        this.f0 = new a3y0(TaxiOrderLogGroup.NAVIGATION.getTag(), "OrderStackViewPresenter");
        this.o0 = kotlin.a.b(LazyThreadSafetyMode.NONE, new OrderStackViewPresenter$bundledOrdersRouter$2(0, zi60Var, yvf0.class, "get", "get()Ljava/lang/Object;", 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object Mg(f fVar, ContinuationImpl continuationImpl) {
        OrderStackViewPresenter$getMapStyle$1 orderStackViewPresenter$getMapStyle$1;
        int i;
        fVar.getClass();
        if (continuationImpl instanceof OrderStackViewPresenter$getMapStyle$1) {
            orderStackViewPresenter$getMapStyle$1 = (OrderStackViewPresenter$getMapStyle$1) continuationImpl;
            int i2 = orderStackViewPresenter$getMapStyle$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                orderStackViewPresenter$getMapStyle$1.label = i2 - Integer.MIN_VALUE;
                Object obj = orderStackViewPresenter$getMapStyle$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = orderStackViewPresenter$getMapStyle$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    dz00 dz00Var = fVar.P;
                    orderStackViewPresenter$getMapStyle$1.label = 1;
                    obj = dz00Var.a.b(orderStackViewPresenter$getMapStyle$1);
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
                k110 k110Var = (k110) obj;
                String str = k110Var.g ? k110Var.f : null;
                return str != null ? "" : str;
            }
        }
        orderStackViewPresenter$getMapStyle$1 = new OrderStackViewPresenter$getMapStyle$1(fVar, continuationImpl);
        Object obj2 = orderStackViewPresenter$getMapStyle$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = orderStackViewPresenter$getMapStyle$1.label;
        if (i != 0) {
        }
        k110 k110Var2 = (k110) obj2;
        if (k110Var2.g) {
        }
        if (str != null) {
        }
    }

    public static final Object Ng(f fVar, String str, SuspendLambda suspendLambda) {
        com.yandex.go.taxi.order.provider.a aVar = fVar.C;
        return (str == null || str.length() == 0) ? kotlinx.coroutines.flow.e.y(aVar.v(), suspendLambda) : aVar.m(str, suspendLambda);
    }

    @Override // defpackage.qc5, defpackage.ad5, defpackage.zc5
    public final void Cg() {
        super.Cg();
        this.W.f.b();
        com.yandex.go.inapp_calls.navigation.fullscreenintent.d dVar = this.b0;
        ((f9j0) dVar.j.getValue()).i();
        dVar.i.b();
    }

    @Override // defpackage.qc5, defpackage.zc5
    public final void Fg() {
        super.Fg();
        this.F.a = null;
        ((OrderStackMvpView) Dg()).pauseShortcuts();
        this.D.e.b();
        m6w0 m6w0Var = this.J;
        m6w0Var.h.b();
        m6w0Var.k.cancel();
        m6w0Var.j.a(null);
        m6w0Var.i.a(null);
        g gVar = this.E;
        pzt0 pzt0Var = gVar.l;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        pzt0 pzt0Var2 = gVar.m;
        if (pzt0Var2 != null) {
            pzt0Var2.a(null);
        }
        pzt0 pzt0Var3 = gVar.n;
        if (pzt0Var3 != null) {
            pzt0Var3.a(null);
        }
    }

    @Override // defpackage.qc5, defpackage.zc5
    public final void Gg() {
        super.Gg();
        g gVar = this.E;
        gVar.l = com.yandex.go.coroutines.b.h(gVar.b, new jqr(kotlinx.coroutines.flow.e.t(gVar.h.c()), new OrderStackViewRouter$resume$1(gVar, null), 3));
        ((OrderStackMvpView) Dg()).resumeShortcuts();
        p370 p370Var = this.H;
        bc00 bc00Var = (bc00) p370Var.b;
        if (!bc00Var.b) {
            Map d = ((ru.yandex.taxi.perf.b) p370Var.w).d();
            co40 co40Var = (co40) p370Var.c;
            Object obj = d.get("app_launch_type");
            String str = obj instanceof String ? (String) obj : null;
            Object obj2 = d.get("timeSinceAppLaunch");
            String str2 = obj2 instanceof String ? (String) obj2 : null;
            Object obj3 = d.get("time_since_app_launch_sec");
            String str3 = obj3 instanceof String ? (String) obj3 : null;
            HashMap hashMap = new HashMap();
            if (str != null) {
                hashMap.put("app_launch_type", str);
            }
            if (str2 != null) {
                hashMap.put("time_since_app_launch", str2);
            }
            if (str3 != null) {
                hashMap.put("time_since_app_launch_sec", str3);
            }
            co40Var.a.a("Order.OrderListScreenShown", hashMap, 1, new HashMap());
            bc00Var.b = true;
        }
        tje.N(Kg(), null, null, new OrderStackViewPresenter$onResume$1(this, null), 3);
        com.yandex.go.taxi.order.view.l lVar = this.B;
        tje.N(Kg(), null, null, new OrderStackViewPresenter$onResume$$inlined$safeCollectIn$1(lVar.j, null, this, this), 3);
        tje.N(Kg(), null, null, new OrderStackViewPresenter$onResume$$inlined$safeCollectIn$2(lVar.k, null, this), 3);
        tje.N(Kg(), null, null, new OrderStackViewPresenter$onResume$$inlined$safeCollectIn$3(this.Q.c, null, this), 3);
        tje.N(Kg(), null, null, new OrderStackViewPresenter$onResume$$inlined$safeCollectIn$4(this.I.a(), null, this), 3);
        l lVar2 = this.D;
        lVar2.e.a();
        com.yandex.go.coroutines.b.g(lVar2.e, null, CoroutineStart.UNDISPATCHED, new RedirectToCompletedInteractor$resume$1(lVar2, null), 1);
        m6w0 m6w0Var = this.J;
        m6w0Var.h.a();
        tje.N(m6w0Var.h, null, null, new SuperAppRecenterInteractor$resume$$inlined$safeCollectIn$1(kotlinx.coroutines.flow.e.t(kotlinx.coroutines.flow.e.X(m6w0Var.d.h(), new SuperAppRecenterInteractor$resume$$inlined$flatMapLatest$1(null, m6w0Var))), null, m6w0Var), 3);
        m6w0Var.b(m6w0Var.c());
    }

    public final void Og(DetailsOpenReason detailsOpenReason) {
        ic00 ic00Var = ((kc00) this.V).a;
        ic00Var.getClass();
        boolean z = ic00Var instanceof hc00;
        x980 x980Var = this.T;
        if (z) {
            ru.yandex.taxi.order.f fVar = (ru.yandex.taxi.order.f) x980Var;
            fVar.getClass();
            fVar.r(new zo70(fVar, 3));
        } else if (this.S.a) {
            Pg(detailsOpenReason);
        } else {
            ((ru.yandex.taxi.order.f) x980Var).t0();
        }
    }

    public final void Pg(DetailsOpenReason detailsOpenReason) {
        tje.N(Jg(), null, null, new OrderStackViewPresenter$showOrderView$1(this, this.U.a(), detailsOpenReason, null), 3);
    }

    public final void Qg(u4y0 u4y0Var) {
        OrderScreen orderScreen = OrderScreen.ORDER_TRACKING;
        com.yandex.go.taxi.order.view.l lVar = this.B;
        lVar.getClass();
        String str = u4y0Var != null ? u4y0Var.a : null;
        String str2 = u4y0Var != null ? u4y0Var.b : null;
        boolean z = false;
        boolean z2 = u4y0Var != null && u4y0Var.c;
        if (u4y0Var != null && u4y0Var.d) {
            z = true;
        }
        lVar.h(orderScreen, false, new qa80(z2, z, str, str2), null, null);
    }

    public final boolean onBackPressed() {
        com.yandex.go.taxi.order.view.l lVar = this.B;
        ra80 ra80Var = (ra80) lVar.j.getValue();
        OrderScreen orderScreen = ra80Var.a;
        int i = 0;
        boolean z = orderScreen == OrderScreen.ORDER_DETAILS || orderScreen == OrderScreen.BUNDLED_ORDER_DETAILS;
        OrderScreen orderScreen2 = OrderScreen.ORDER_TRACKING;
        boolean z2 = orderScreen == orderScreen2;
        ic00 ic00Var = ((kc00) this.V).a;
        ic00Var.getClass();
        boolean z3 = ic00Var instanceof hc00;
        qa80 qa80Var = ra80Var.c;
        u4y0 u4y0Var = new u4y0(qa80Var.c, qa80Var.d, qa80Var.a, qa80Var.b);
        TaxiOrderPresentationType c = this.U.c(u4y0Var);
        g18 g18Var = this.k0;
        if (g18Var != null) {
            g18Var.cancel();
            this.k0 = null;
            return true;
        }
        if (z || z2) {
            if (z3 && (z2 || !c.a())) {
                x980 x980Var = this.T;
                if (!z2) {
                    ru.yandex.taxi.order.f fVar = (ru.yandex.taxi.order.f) x980Var;
                    fVar.getClass();
                    fVar.r(new zo70(fVar, 3));
                    return true;
                }
                ((OrderStackMvpView) Dg()).jd();
                ru.yandex.taxi.order.f fVar2 = (ru.yandex.taxi.order.f) x980Var;
                fVar2.getClass();
                fVar2.r(new zo70(fVar2, i));
                return true;
            }
            boolean z4 = c.a() && z;
            if (!z3 && z4 && this.h0 == orderScreen2) {
                Qg(u4y0Var);
                return true;
            }
            if (z3 && z4) {
                Qg(u4y0Var);
                return true;
            }
            this.d0.getClass();
            if (lVar.f() || z2) {
                lVar.h(OrderScreen.ORDER_LIST, false, new qa80((String) null), null, null);
                return true;
            }
        }
        return false;
    }
}
