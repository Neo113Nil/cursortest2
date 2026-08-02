package com.yandex.go.taxi.order.promotions.interactor;

import defpackage.a4y0;
import defpackage.g4y0;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class f implements vpr {
    public final /* synthetic */ vpr a;

    public f(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        OrderPromotionsUpdateInteractor$updatePopupPromotion$$inlined$map$1$2$1 orderPromotionsUpdateInteractor$updatePopupPromotion$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof OrderPromotionsUpdateInteractor$updatePopupPromotion$$inlined$map$1$2$1) {
            orderPromotionsUpdateInteractor$updatePopupPromotion$$inlined$map$1$2$1 = (OrderPromotionsUpdateInteractor$updatePopupPromotion$$inlined$map$1$2$1) continuation;
            int i2 = orderPromotionsUpdateInteractor$updatePopupPromotion$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                orderPromotionsUpdateInteractor$updatePopupPromotion$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = orderPromotionsUpdateInteractor$updatePopupPromotion$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = orderPromotionsUpdateInteractor$updatePopupPromotion$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    g4y0 g4y0Var = (g4y0) obj;
                    a4y0 a4y0Var = g4y0Var != null ? new a4y0(g4y0Var.a(), g4y0Var.b(), g4y0Var.d()) : null;
                    orderPromotionsUpdateInteractor$updatePopupPromotion$$inlined$map$1$2$1.L$0 = null;
                    orderPromotionsUpdateInteractor$updatePopupPromotion$$inlined$map$1$2$1.L$1 = null;
                    orderPromotionsUpdateInteractor$updatePopupPromotion$$inlined$map$1$2$1.L$2 = null;
                    orderPromotionsUpdateInteractor$updatePopupPromotion$$inlined$map$1$2$1.L$3 = null;
                    orderPromotionsUpdateInteractor$updatePopupPromotion$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(a4y0Var, orderPromotionsUpdateInteractor$updatePopupPromotion$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        orderPromotionsUpdateInteractor$updatePopupPromotion$$inlined$map$1$2$1 = new OrderPromotionsUpdateInteractor$updatePopupPromotion$$inlined$map$1$2$1(this, continuation);
        Object obj22 = orderPromotionsUpdateInteractor$updatePopupPromotion$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = orderPromotionsUpdateInteractor$updatePopupPromotion$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
