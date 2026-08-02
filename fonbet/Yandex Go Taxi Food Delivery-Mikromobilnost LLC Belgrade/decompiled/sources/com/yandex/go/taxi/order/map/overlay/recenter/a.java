package com.yandex.go.taxi.order.map.overlay.recenter;

import com.yandex.go.taxi.order.models.api.response.typed_experiments.WalkRouteOrderExperiment;
import com.yandex.mapkit.geometry.Point;
import defpackage.agi0;
import defpackage.cgi0;
import defpackage.el00;
import defpackage.fi6;
import defpackage.g18;
import defpackage.igi0;
import defpackage.jdj;
import defpackage.l1t;
import defpackage.m1t;
import defpackage.mvd0;
import defpackage.n6w0;
import defpackage.ny61;
import defpackage.nz2;
import defpackage.o2y0;
import defpackage.p201;
import defpackage.pzt0;
import defpackage.ry70;
import defpackage.tje;
import defpackage.tse;
import defpackage.wt1;
import defpackage.y980;
import defpackage.yay0;
import defpackage.zw70;
import defpackage.zy11;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import ru.yandex.taxi.map.overlay.RecenterType;

/* loaded from: classes14.dex */
public final class a implements cgi0 {
    public final tse a;
    public final o2y0 b;
    public final igi0 c;
    public final wt1 d;
    public final mvd0 e;
    public final nz2 f;
    public final agi0 g;
    public final ry70 h;
    public final l1t i;
    public final n6w0 j;
    public final y980 k;
    public final el00 l;
    public List m;
    public pzt0 n;
    public g18 o = g18.u1;
    public final zw70 p = new zw70(1, this);

    public a(tse tseVar, o2y0 o2y0Var, igi0 igi0Var, wt1 wt1Var, mvd0 mvd0Var, nz2 nz2Var, agi0 agi0Var, ry70 ry70Var, l1t l1tVar, n6w0 n6w0Var, y980 y980Var, el00 el00Var) {
        this.a = tseVar;
        this.b = o2y0Var;
        this.c = igi0Var;
        this.d = wt1Var;
        this.e = mvd0Var;
        this.f = nz2Var;
        this.g = agi0Var;
        this.h = ry70Var;
        this.i = l1tVar;
        this.j = n6w0Var;
        this.k = y980Var;
        this.l = el00Var;
    }

    @Override // defpackage.cgi0
    public final Point a(WalkRouteOrderExperiment.OrderStatusRule.PointType pointType) {
        return this.e.a(pointType);
    }

    @Override // defpackage.cgi0
    public final boolean b() {
        jdj jdjVar = this.f.f;
        p201 Q2 = ((yay0) jdjVar.c).a((o2y0) jdjVar.w).Q2();
        return Q2 != null && Q2.a;
    }

    @Override // defpackage.cgi0
    public final void c() {
    }

    @Override // defpackage.cgi0
    public final void d() {
    }

    @Override // defpackage.cgi0
    public final Object e(RecenterType recenterType, boolean z, Continuation continuation) {
        return zy11.a;
    }

    @Override // defpackage.cgi0
    public final boolean f() {
        return this.c.a();
    }

    @Override // defpackage.cgi0
    public final void g(List list) {
        this.m = list;
    }

    @Override // defpackage.cgi0
    public final Object h(Continuation continuation) {
        return l(continuation);
    }

    @Override // defpackage.cgi0
    public final Object i(boolean z, boolean z2, Continuation continuation) {
        return l(continuation);
    }

    @Override // defpackage.cgi0
    public final void j() {
    }

    @Override // defpackage.cgi0
    public final Object k(SuspendLambda suspendLambda) {
        return l(suspendLambda);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(Continuation continuation) {
        OrderListOverlayRecenterInteractor$autoRecenter$1 orderListOverlayRecenterInteractor$autoRecenter$1;
        int i;
        fi6 fi6Var;
        if (continuation instanceof OrderListOverlayRecenterInteractor$autoRecenter$1) {
            orderListOverlayRecenterInteractor$autoRecenter$1 = (OrderListOverlayRecenterInteractor$autoRecenter$1) continuation;
            int i2 = orderListOverlayRecenterInteractor$autoRecenter$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                orderListOverlayRecenterInteractor$autoRecenter$1.label = i2 - Integer.MIN_VALUE;
                Object obj = orderListOverlayRecenterInteractor$autoRecenter$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = orderListOverlayRecenterInteractor$autoRecenter$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (this.k.b()) {
                        fi6 fi6Var2 = new fi6();
                        this.d.f(fi6Var2, this.m);
                        fi6Var2.e(this.j.a());
                        if (!fi6Var2.i()) {
                            orderListOverlayRecenterInteractor$autoRecenter$1.L$0 = fi6Var2;
                            orderListOverlayRecenterInteractor$autoRecenter$1.label = 1;
                            if (this.l.a(orderListOverlayRecenterInteractor$autoRecenter$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            fi6Var = fi6Var2;
                        }
                    }
                    return zy11Var;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                fi6Var = (fi6) orderListOverlayRecenterInteractor$autoRecenter$1.L$0;
                kotlin.b.b(obj);
                this.g.Sb(this.b, fi6Var.g());
                return zy11Var;
            }
        }
        orderListOverlayRecenterInteractor$autoRecenter$1 = new OrderListOverlayRecenterInteractor$autoRecenter$1(this, continuation);
        Object obj2 = orderListOverlayRecenterInteractor$autoRecenter$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = orderListOverlayRecenterInteractor$autoRecenter$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        this.g.Sb(this.b, fi6Var.g());
        return zy11Var2;
    }

    @Override // defpackage.cgi0
    public final void onPause() {
        this.o.cancel();
        pzt0 pzt0Var = this.n;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
    }

    @Override // defpackage.cgi0
    public final void onResume() {
        this.o = ((m1t) this.i).a.h(this.p);
        this.n = tje.N(this.a, null, null, new OrderListOverlayRecenterInteractor$onResume$$inlined$safeCollectIn$1(e.t(new ru.yandex.taxi.superapp.orders.ui.e(this.h.a)), null, this), 3);
    }
}
