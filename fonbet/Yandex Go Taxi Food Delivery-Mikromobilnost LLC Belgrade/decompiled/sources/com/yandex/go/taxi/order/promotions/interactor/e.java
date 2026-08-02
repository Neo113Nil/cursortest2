package com.yandex.go.taxi.order.promotions.interactor;

import defpackage.gci0;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class e implements tpr {
    public final /* synthetic */ gci0 a;
    public final /* synthetic */ h b;

    public e(gci0 gci0Var, h hVar) {
        this.a = gci0Var;
        this.b = hVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        OrderPromotionsUpdateInteractor$firstNotCompletedPopup$$inlined$map$1$1 orderPromotionsUpdateInteractor$firstNotCompletedPopup$$inlined$map$1$1;
        int i;
        if (continuation instanceof OrderPromotionsUpdateInteractor$firstNotCompletedPopup$$inlined$map$1$1) {
            orderPromotionsUpdateInteractor$firstNotCompletedPopup$$inlined$map$1$1 = (OrderPromotionsUpdateInteractor$firstNotCompletedPopup$$inlined$map$1$1) continuation;
            int i2 = orderPromotionsUpdateInteractor$firstNotCompletedPopup$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                orderPromotionsUpdateInteractor$firstNotCompletedPopup$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = orderPromotionsUpdateInteractor$firstNotCompletedPopup$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = orderPromotionsUpdateInteractor$firstNotCompletedPopup$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    d dVar = new d(vprVar, this.b);
                    orderPromotionsUpdateInteractor$firstNotCompletedPopup$$inlined$map$1$1.L$0 = null;
                    orderPromotionsUpdateInteractor$firstNotCompletedPopup$$inlined$map$1$1.L$1 = null;
                    orderPromotionsUpdateInteractor$firstNotCompletedPopup$$inlined$map$1$1.L$2 = null;
                    orderPromotionsUpdateInteractor$firstNotCompletedPopup$$inlined$map$1$1.label = 1;
                    if (this.a.a.collect(dVar, orderPromotionsUpdateInteractor$firstNotCompletedPopup$$inlined$map$1$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return zy11.a;
            }
        }
        orderPromotionsUpdateInteractor$firstNotCompletedPopup$$inlined$map$1$1 = new OrderPromotionsUpdateInteractor$firstNotCompletedPopup$$inlined$map$1$1(this, continuation);
        Object obj2 = orderPromotionsUpdateInteractor$firstNotCompletedPopup$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = orderPromotionsUpdateInteractor$firstNotCompletedPopup$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
