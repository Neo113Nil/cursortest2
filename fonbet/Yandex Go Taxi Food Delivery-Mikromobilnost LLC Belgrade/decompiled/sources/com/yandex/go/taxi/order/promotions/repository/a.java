package com.yandex.go.taxi.order.promotions.repository;

import defpackage.a4y0;
import defpackage.g4y0;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import java.util.Iterator;
import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ a4y0 b;

    public a(vpr vprVar, a4y0 a4y0Var) {
        this.a = vprVar;
        this.b = a4y0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        OrdersPromotionsRepository$promotionFlow$$inlined$map$1$2$1 ordersPromotionsRepository$promotionFlow$$inlined$map$1$2$1;
        int i;
        Object obj2;
        if (continuation instanceof OrdersPromotionsRepository$promotionFlow$$inlined$map$1$2$1) {
            ordersPromotionsRepository$promotionFlow$$inlined$map$1$2$1 = (OrdersPromotionsRepository$promotionFlow$$inlined$map$1$2$1) continuation;
            int i2 = ordersPromotionsRepository$promotionFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ordersPromotionsRepository$promotionFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj3 = ordersPromotionsRepository$promotionFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = ordersPromotionsRepository$promotionFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj3);
                    Iterator it = ((Set) obj).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it.next();
                        g4y0 g4y0Var = (g4y0) obj2;
                        String a = g4y0Var.a();
                        a4y0 a4y0Var = this.b;
                        if (jl40.l(a, a4y0Var != null ? a4y0Var.a : null) && jl40.l(g4y0Var.b(), a4y0Var.b)) {
                            break;
                        }
                    }
                    ordersPromotionsRepository$promotionFlow$$inlined$map$1$2$1.L$0 = null;
                    ordersPromotionsRepository$promotionFlow$$inlined$map$1$2$1.L$1 = null;
                    ordersPromotionsRepository$promotionFlow$$inlined$map$1$2$1.L$2 = null;
                    ordersPromotionsRepository$promotionFlow$$inlined$map$1$2$1.L$3 = null;
                    ordersPromotionsRepository$promotionFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(obj2, ordersPromotionsRepository$promotionFlow$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj3);
                }
                return zy11.a;
            }
        }
        ordersPromotionsRepository$promotionFlow$$inlined$map$1$2$1 = new OrdersPromotionsRepository$promotionFlow$$inlined$map$1$2$1(this, continuation);
        Object obj32 = ordersPromotionsRepository$promotionFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = ordersPromotionsRepository$promotionFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
