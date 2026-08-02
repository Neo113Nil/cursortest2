package com.yandex.go.delivery.tracking.di;

import defpackage.a0t;
import defpackage.doe;
import defpackage.ny61;
import defpackage.oo0;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class e implements vpr {
    public final /* synthetic */ vpr a;

    public e(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        DeliveryTrackingModule$providePromotionScreenEngine$$inlined$mapNotNull$1$2$1 deliveryTrackingModule$providePromotionScreenEngine$$inlined$mapNotNull$1$2$1;
        int i;
        a0t a0tVar;
        if (continuation instanceof DeliveryTrackingModule$providePromotionScreenEngine$$inlined$mapNotNull$1$2$1) {
            deliveryTrackingModule$providePromotionScreenEngine$$inlined$mapNotNull$1$2$1 = (DeliveryTrackingModule$providePromotionScreenEngine$$inlined$mapNotNull$1$2$1) continuation;
            int i2 = deliveryTrackingModule$providePromotionScreenEngine$$inlined$mapNotNull$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                deliveryTrackingModule$providePromotionScreenEngine$$inlined$mapNotNull$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = deliveryTrackingModule$providePromotionScreenEngine$$inlined$mapNotNull$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = deliveryTrackingModule$providePromotionScreenEngine$$inlined$mapNotNull$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    oo0 oo0Var = (oo0) obj;
                    doe doeVar = (oo0Var == null || (a0tVar = oo0Var.f) == null) ? null : new doe(a0tVar.a, a0tVar.b);
                    if (doeVar != null) {
                        deliveryTrackingModule$providePromotionScreenEngine$$inlined$mapNotNull$1$2$1.L$0 = null;
                        deliveryTrackingModule$providePromotionScreenEngine$$inlined$mapNotNull$1$2$1.L$1 = null;
                        deliveryTrackingModule$providePromotionScreenEngine$$inlined$mapNotNull$1$2$1.L$2 = null;
                        deliveryTrackingModule$providePromotionScreenEngine$$inlined$mapNotNull$1$2$1.L$3 = null;
                        deliveryTrackingModule$providePromotionScreenEngine$$inlined$mapNotNull$1$2$1.L$4 = null;
                        deliveryTrackingModule$providePromotionScreenEngine$$inlined$mapNotNull$1$2$1.label = 1;
                        if (this.a.emit(doeVar, deliveryTrackingModule$providePromotionScreenEngine$$inlined$mapNotNull$1$2$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
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
        deliveryTrackingModule$providePromotionScreenEngine$$inlined$mapNotNull$1$2$1 = new DeliveryTrackingModule$providePromotionScreenEngine$$inlined$mapNotNull$1$2$1(this, continuation);
        Object obj22 = deliveryTrackingModule$providePromotionScreenEngine$$inlined$mapNotNull$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = deliveryTrackingModule$providePromotionScreenEngine$$inlined$mapNotNull$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
