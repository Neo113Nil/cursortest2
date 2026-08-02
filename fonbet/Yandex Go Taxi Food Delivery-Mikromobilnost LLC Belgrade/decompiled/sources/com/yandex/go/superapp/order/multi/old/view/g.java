package com.yandex.go.superapp.order.multi.old.view;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import com.yandex.go.taxi.order.analytics.DetailsOpenReason;
import com.yandex.go.taxi.order.api.details.TaxiCardNavigationAction;
import com.yandex.go.taxi.order.logger.TaxiOrderLogGroup;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.screen.OrderScreen;
import defpackage.a3y0;
import defpackage.clk0;
import defpackage.k48;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.oep0;
import defpackage.pzt0;
import defpackage.qa80;
import defpackage.ra80;
import defpackage.tse;
import defpackage.yvf0;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes14.dex */
public final class g {
    public final Context a;
    public final tse b;
    public final com.yandex.go.taxi.order.provider.a c;
    public final oep0 d;
    public final com.yandex.go.taxi.order.view.l e;
    public final k48 f;
    public final yvf0 g;
    public final com.yandex.go.navigation.screen.c h;
    public final clk0 i;
    public final com.yandex.go.taxi.order.multi.feed.domain.a j;
    public final a3y0 k = new a3y0(TaxiOrderLogGroup.NAVIGATION.getTag(), "OrderStackViewRouter");
    public pzt0 l;
    public pzt0 m;
    public pzt0 n;

    public g(Context context, tse tseVar, com.yandex.go.taxi.order.provider.a aVar, oep0 oep0Var, com.yandex.go.taxi.order.view.l lVar, k48 k48Var, yvf0 yvf0Var, com.yandex.go.navigation.screen.c cVar, clk0 clk0Var, com.yandex.go.taxi.order.multi.feed.domain.a aVar2) {
        this.a = context;
        this.b = tseVar;
        this.c = aVar;
        this.d = oep0Var;
        this.e = lVar;
        this.f = k48Var;
        this.g = yvf0Var;
        this.h = cVar;
        this.i = clk0Var;
        this.j = aVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(g gVar, o2y0 o2y0Var, boolean z, DetailsOpenReason detailsOpenReason, TaxiCardNavigationAction taxiCardNavigationAction, ContinuationImpl continuationImpl) {
        OrderStackViewRouter$showTaxiOrderDetails$2 orderStackViewRouter$showTaxiOrderDetails$2;
        int i;
        boolean z2;
        o2y0 o2y0Var2;
        boolean z3;
        DetailsOpenReason detailsOpenReason2;
        TaxiCardNavigationAction taxiCardNavigationAction2;
        Object obj;
        AccessibilityManager accessibilityManager;
        gVar.getClass();
        if (continuationImpl instanceof OrderStackViewRouter$showTaxiOrderDetails$2) {
            orderStackViewRouter$showTaxiOrderDetails$2 = (OrderStackViewRouter$showTaxiOrderDetails$2) continuationImpl;
            int i2 = orderStackViewRouter$showTaxiOrderDetails$2.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                orderStackViewRouter$showTaxiOrderDetails$2.label = i2 - Integer.MIN_VALUE;
                Object obj2 = orderStackViewRouter$showTaxiOrderDetails$2.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = orderStackViewRouter$showTaxiOrderDetails$2.label;
                z2 = true;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    com.yandex.go.taxi.order.provider.a aVar = gVar.c;
                    orderStackViewRouter$showTaxiOrderDetails$2.L$0 = o2y0Var;
                    orderStackViewRouter$showTaxiOrderDetails$2.L$1 = detailsOpenReason;
                    orderStackViewRouter$showTaxiOrderDetails$2.L$2 = taxiCardNavigationAction;
                    orderStackViewRouter$showTaxiOrderDetails$2.Z$0 = z;
                    orderStackViewRouter$showTaxiOrderDetails$2.label = 1;
                    if (aVar.s(o2y0Var, orderStackViewRouter$showTaxiOrderDetails$2) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    o2y0Var2 = o2y0Var;
                    z3 = z;
                    detailsOpenReason2 = detailsOpenReason;
                    taxiCardNavigationAction2 = taxiCardNavigationAction;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    boolean z4 = orderStackViewRouter$showTaxiOrderDetails$2.Z$0;
                    taxiCardNavigationAction2 = (TaxiCardNavigationAction) orderStackViewRouter$showTaxiOrderDetails$2.L$2;
                    detailsOpenReason2 = (DetailsOpenReason) orderStackViewRouter$showTaxiOrderDetails$2.L$1;
                    o2y0 o2y0Var3 = (o2y0) orderStackViewRouter$showTaxiOrderDetails$2.L$0;
                    kotlin.b.b(obj2);
                    z3 = z4;
                    o2y0Var2 = o2y0Var3;
                }
                if (!z3 && ((accessibilityManager = (AccessibilityManager) gVar.a.getSystemService(AccessibilityManager.class)) == null || !accessibilityManager.isTouchExplorationEnabled())) {
                    z2 = false;
                }
                obj = taxiCardNavigationAction2 != TaxiCardNavigationAction.EMPTY ? taxiCardNavigationAction2 : null;
                if (obj == null) {
                    obj = ((ra80) gVar.e.j.getValue()).e;
                }
                gVar.e.h(OrderScreen.ORDER_DETAILS, z2, new qa80(o2y0Var2.b().b.g0, gVar.c(o2y0Var2.b()), o2y0Var2.b().a, o2y0Var2.d()), detailsOpenReason2, obj);
                return zy11.a;
            }
        }
        orderStackViewRouter$showTaxiOrderDetails$2 = new OrderStackViewRouter$showTaxiOrderDetails$2(gVar, continuationImpl);
        Object obj22 = orderStackViewRouter$showTaxiOrderDetails$2.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = orderStackViewRouter$showTaxiOrderDetails$2.label;
        z2 = true;
        if (i != 0) {
        }
        if (!z3) {
            z2 = false;
        }
        if (taxiCardNavigationAction2 != TaxiCardNavigationAction.EMPTY) {
        }
        if (obj == null) {
        }
        gVar.e.h(OrderScreen.ORDER_DETAILS, z2, new qa80(o2y0Var2.b().b.g0, gVar.c(o2y0Var2.b()), o2y0Var2.b().a, o2y0Var2.d()), detailsOpenReason2, obj);
        return zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(g gVar, o2y0 o2y0Var, DetailsOpenReason detailsOpenReason, ContinuationImpl continuationImpl) {
        OrderStackViewRouter$showTaxiOrderTrackingInternal$1 orderStackViewRouter$showTaxiOrderTrackingInternal$1;
        int i;
        boolean c;
        gVar.getClass();
        if (continuationImpl instanceof OrderStackViewRouter$showTaxiOrderTrackingInternal$1) {
            orderStackViewRouter$showTaxiOrderTrackingInternal$1 = (OrderStackViewRouter$showTaxiOrderTrackingInternal$1) continuationImpl;
            int i2 = orderStackViewRouter$showTaxiOrderTrackingInternal$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                orderStackViewRouter$showTaxiOrderTrackingInternal$1.label = i2 - Integer.MIN_VALUE;
                Object obj = orderStackViewRouter$showTaxiOrderTrackingInternal$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = orderStackViewRouter$showTaxiOrderTrackingInternal$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    c = gVar.c(o2y0Var.b());
                    com.yandex.go.taxi.order.provider.a aVar = gVar.c;
                    orderStackViewRouter$showTaxiOrderTrackingInternal$1.L$0 = o2y0Var;
                    orderStackViewRouter$showTaxiOrderTrackingInternal$1.L$1 = detailsOpenReason;
                    orderStackViewRouter$showTaxiOrderTrackingInternal$1.Z$0 = c;
                    orderStackViewRouter$showTaxiOrderTrackingInternal$1.label = 1;
                    if (aVar.s(o2y0Var, orderStackViewRouter$showTaxiOrderTrackingInternal$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    boolean z = orderStackViewRouter$showTaxiOrderTrackingInternal$1.Z$0;
                    detailsOpenReason = (DetailsOpenReason) orderStackViewRouter$showTaxiOrderTrackingInternal$1.L$1;
                    o2y0 o2y0Var2 = (o2y0) orderStackViewRouter$showTaxiOrderTrackingInternal$1.L$0;
                    kotlin.b.b(obj);
                    c = z;
                    o2y0Var = o2y0Var2;
                }
                DetailsOpenReason detailsOpenReason2 = detailsOpenReason;
                gVar.e.h(OrderScreen.ORDER_TRACKING, false, new qa80(o2y0Var.b().b.g0, c, o2y0Var.b().a, o2y0Var.d()), detailsOpenReason2, Boolean.FALSE);
                return zy11.a;
            }
        }
        orderStackViewRouter$showTaxiOrderTrackingInternal$1 = new OrderStackViewRouter$showTaxiOrderTrackingInternal$1(gVar, continuationImpl);
        Object obj2 = orderStackViewRouter$showTaxiOrderTrackingInternal$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = orderStackViewRouter$showTaxiOrderTrackingInternal$1.label;
        if (i != 0) {
        }
        DetailsOpenReason detailsOpenReason22 = detailsOpenReason;
        gVar.e.h(OrderScreen.ORDER_TRACKING, false, new qa80(o2y0Var.b().b.g0, c, o2y0Var.b().a, o2y0Var.d()), detailsOpenReason22, Boolean.FALSE);
        return zy11.a;
    }

    public final boolean c(TaxiOrder taxiOrder) {
        return this.i.d() ? this.i.g() : taxiOrder.l.getY();
    }

    public final void d(String str, boolean z, DetailsOpenReason detailsOpenReason, TaxiCardNavigationAction taxiCardNavigationAction) {
        pzt0 pzt0Var = this.m;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.m = com.yandex.go.coroutines.b.g(this.b, null, null, new OrderStackViewRouter$showTaxiOrderDetails$1(this, str, z, detailsOpenReason, taxiCardNavigationAction, null), 3);
    }

    public final void e(o2y0 o2y0Var, boolean z, DetailsOpenReason detailsOpenReason) {
        pzt0 pzt0Var = this.m;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.m = com.yandex.go.coroutines.b.g(this.b, null, null, new OrderStackViewRouter$showTaxiOrderDetailsWithOrderHolder$1(this, o2y0Var, z, detailsOpenReason, null), 3);
    }

    public final void f(DetailsOpenReason detailsOpenReason, String str) {
        pzt0 pzt0Var = this.n;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.n = com.yandex.go.coroutines.b.g(this.b, null, null, new OrderStackViewRouter$showTaxiOrderTracking$1(this, str, detailsOpenReason, null), 3);
    }
}
