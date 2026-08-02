package com.yandex.go.delivery.tracking.di;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class f implements tpr {
    public final /* synthetic */ ru.yandex.taxi.delivery.d a;

    public f(ru.yandex.taxi.delivery.d dVar) {
        this.a = dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        DeliveryTrackingModule$providePromotionScreenEngine$$inlined$mapNotNull$1$1 deliveryTrackingModule$providePromotionScreenEngine$$inlined$mapNotNull$1$1;
        int i;
        if (continuation instanceof DeliveryTrackingModule$providePromotionScreenEngine$$inlined$mapNotNull$1$1) {
            deliveryTrackingModule$providePromotionScreenEngine$$inlined$mapNotNull$1$1 = (DeliveryTrackingModule$providePromotionScreenEngine$$inlined$mapNotNull$1$1) continuation;
            int i2 = deliveryTrackingModule$providePromotionScreenEngine$$inlined$mapNotNull$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                deliveryTrackingModule$providePromotionScreenEngine$$inlined$mapNotNull$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = deliveryTrackingModule$providePromotionScreenEngine$$inlined$mapNotNull$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = deliveryTrackingModule$providePromotionScreenEngine$$inlined$mapNotNull$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    e eVar = new e(vprVar);
                    deliveryTrackingModule$providePromotionScreenEngine$$inlined$mapNotNull$1$1.L$0 = null;
                    deliveryTrackingModule$providePromotionScreenEngine$$inlined$mapNotNull$1$1.L$1 = null;
                    deliveryTrackingModule$providePromotionScreenEngine$$inlined$mapNotNull$1$1.L$2 = null;
                    deliveryTrackingModule$providePromotionScreenEngine$$inlined$mapNotNull$1$1.label = 1;
                    if (this.a.collect(eVar, deliveryTrackingModule$providePromotionScreenEngine$$inlined$mapNotNull$1$1) == coroutineSingletons) {
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
        deliveryTrackingModule$providePromotionScreenEngine$$inlined$mapNotNull$1$1 = new DeliveryTrackingModule$providePromotionScreenEngine$$inlined$mapNotNull$1$1(this, continuation);
        Object obj2 = deliveryTrackingModule$providePromotionScreenEngine$$inlined$mapNotNull$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = deliveryTrackingModule$providePromotionScreenEngine$$inlined$mapNotNull$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
