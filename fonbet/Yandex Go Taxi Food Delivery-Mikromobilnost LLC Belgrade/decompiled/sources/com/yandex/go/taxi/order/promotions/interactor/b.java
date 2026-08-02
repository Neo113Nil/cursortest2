package com.yandex.go.taxi.order.promotions.interactor;

import defpackage.d480;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class b implements tpr {
    public final /* synthetic */ kotlinx.coroutines.flow.internal.g a;
    public final /* synthetic */ d480 b;

    public b(kotlinx.coroutines.flow.internal.g gVar, d480 d480Var) {
        this.a = gVar;
        this.b = d480Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        OrderPopupPromotionInteractor$dataFlow$$inlined$map$1$1 orderPopupPromotionInteractor$dataFlow$$inlined$map$1$1;
        int i;
        if (continuation instanceof OrderPopupPromotionInteractor$dataFlow$$inlined$map$1$1) {
            orderPopupPromotionInteractor$dataFlow$$inlined$map$1$1 = (OrderPopupPromotionInteractor$dataFlow$$inlined$map$1$1) continuation;
            int i2 = orderPopupPromotionInteractor$dataFlow$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                orderPopupPromotionInteractor$dataFlow$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = orderPopupPromotionInteractor$dataFlow$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = orderPopupPromotionInteractor$dataFlow$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    a aVar = new a(vprVar, this.b);
                    orderPopupPromotionInteractor$dataFlow$$inlined$map$1$1.L$0 = null;
                    orderPopupPromotionInteractor$dataFlow$$inlined$map$1$1.L$1 = null;
                    orderPopupPromotionInteractor$dataFlow$$inlined$map$1$1.L$2 = null;
                    orderPopupPromotionInteractor$dataFlow$$inlined$map$1$1.label = 1;
                    if (this.a.collect(aVar, orderPopupPromotionInteractor$dataFlow$$inlined$map$1$1) == coroutineSingletons) {
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
        orderPopupPromotionInteractor$dataFlow$$inlined$map$1$1 = new OrderPopupPromotionInteractor$dataFlow$$inlined$map$1$1(this, continuation);
        Object obj2 = orderPopupPromotionInteractor$dataFlow$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = orderPopupPromotionInteractor$dataFlow$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
