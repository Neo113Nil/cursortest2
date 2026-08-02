package com.yandex.go.taxi.order.promotions.interactor;

import defpackage.d480;
import defpackage.d4y0;
import defpackage.g4y0;
import defpackage.k4y0;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ d480 b;

    public a(vpr vprVar, d480 d480Var) {
        this.a = vprVar;
        this.b = d480Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0095, code lost:
    
        if (r7.emit(r9, r0) != r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        OrderPopupPromotionInteractor$dataFlow$$inlined$map$1$2$1 orderPopupPromotionInteractor$dataFlow$$inlined$map$1$2$1;
        int i;
        vpr vprVar;
        if (continuation instanceof OrderPopupPromotionInteractor$dataFlow$$inlined$map$1$2$1) {
            orderPopupPromotionInteractor$dataFlow$$inlined$map$1$2$1 = (OrderPopupPromotionInteractor$dataFlow$$inlined$map$1$2$1) continuation;
            int i2 = orderPopupPromotionInteractor$dataFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                orderPopupPromotionInteractor$dataFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = orderPopupPromotionInteractor$dataFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = orderPopupPromotionInteractor$dataFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    g4y0 g4y0Var = (g4y0) obj;
                    orderPopupPromotionInteractor$dataFlow$$inlined$map$1$2$1.L$0 = null;
                    orderPopupPromotionInteractor$dataFlow$$inlined$map$1$2$1.L$1 = null;
                    orderPopupPromotionInteractor$dataFlow$$inlined$map$1$2$1.L$2 = null;
                    orderPopupPromotionInteractor$dataFlow$$inlined$map$1$2$1.L$3 = null;
                    vpr vprVar2 = this.a;
                    orderPopupPromotionInteractor$dataFlow$$inlined$map$1$2$1.L$4 = vprVar2;
                    orderPopupPromotionInteractor$dataFlow$$inlined$map$1$2$1.L$5 = null;
                    orderPopupPromotionInteractor$dataFlow$$inlined$map$1$2$1.L$6 = null;
                    orderPopupPromotionInteractor$dataFlow$$inlined$map$1$2$1.label = 1;
                    Object a = g4y0Var instanceof d4y0 ? this.b.c.a(((d4y0) g4y0Var).e, orderPopupPromotionInteractor$dataFlow$$inlined$map$1$2$1) : k4y0.a;
                    if (a != coroutineSingletons) {
                        obj2 = a;
                        vprVar = vprVar2;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                    return zy11.a;
                }
                vprVar = (vpr) orderPopupPromotionInteractor$dataFlow$$inlined$map$1$2$1.L$4;
                kotlin.b.b(obj2);
                orderPopupPromotionInteractor$dataFlow$$inlined$map$1$2$1.L$0 = null;
                orderPopupPromotionInteractor$dataFlow$$inlined$map$1$2$1.L$1 = null;
                orderPopupPromotionInteractor$dataFlow$$inlined$map$1$2$1.L$2 = null;
                orderPopupPromotionInteractor$dataFlow$$inlined$map$1$2$1.L$3 = null;
                orderPopupPromotionInteractor$dataFlow$$inlined$map$1$2$1.L$4 = null;
                orderPopupPromotionInteractor$dataFlow$$inlined$map$1$2$1.L$5 = null;
                orderPopupPromotionInteractor$dataFlow$$inlined$map$1$2$1.L$6 = null;
                orderPopupPromotionInteractor$dataFlow$$inlined$map$1$2$1.label = 2;
            }
        }
        orderPopupPromotionInteractor$dataFlow$$inlined$map$1$2$1 = new OrderPopupPromotionInteractor$dataFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = orderPopupPromotionInteractor$dataFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = orderPopupPromotionInteractor$dataFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        orderPopupPromotionInteractor$dataFlow$$inlined$map$1$2$1.L$0 = null;
        orderPopupPromotionInteractor$dataFlow$$inlined$map$1$2$1.L$1 = null;
        orderPopupPromotionInteractor$dataFlow$$inlined$map$1$2$1.L$2 = null;
        orderPopupPromotionInteractor$dataFlow$$inlined$map$1$2$1.L$3 = null;
        orderPopupPromotionInteractor$dataFlow$$inlined$map$1$2$1.L$4 = null;
        orderPopupPromotionInteractor$dataFlow$$inlined$map$1$2$1.L$5 = null;
        orderPopupPromotionInteractor$dataFlow$$inlined$map$1$2$1.L$6 = null;
        orderPopupPromotionInteractor$dataFlow$$inlined$map$1$2$1.label = 2;
    }
}
