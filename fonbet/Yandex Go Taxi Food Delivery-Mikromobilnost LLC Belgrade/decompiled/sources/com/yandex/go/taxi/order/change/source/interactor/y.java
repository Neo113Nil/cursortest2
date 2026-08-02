package com.yandex.go.taxi.order.change.source.interactor;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.object.DriveState;

/* loaded from: classes14.dex */
public final class y implements vpr {
    public final /* synthetic */ vpr a;

    public y(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        OrderSourcePinWithStyleInteractor$pinStateFlow$$inlined$map$1$2$1 orderSourcePinWithStyleInteractor$pinStateFlow$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof OrderSourcePinWithStyleInteractor$pinStateFlow$$inlined$map$1$2$1) {
            orderSourcePinWithStyleInteractor$pinStateFlow$$inlined$map$1$2$1 = (OrderSourcePinWithStyleInteractor$pinStateFlow$$inlined$map$1$2$1) continuation;
            int i2 = orderSourcePinWithStyleInteractor$pinStateFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                orderSourcePinWithStyleInteractor$pinStateFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = orderSourcePinWithStyleInteractor$pinStateFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = orderSourcePinWithStyleInteractor$pinStateFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    vpr vprVar = this.a;
                    DriveState driveState = ((TaxiOrder) obj).h.b;
                    orderSourcePinWithStyleInteractor$pinStateFlow$$inlined$map$1$2$1.L$0 = null;
                    orderSourcePinWithStyleInteractor$pinStateFlow$$inlined$map$1$2$1.L$1 = null;
                    orderSourcePinWithStyleInteractor$pinStateFlow$$inlined$map$1$2$1.L$2 = null;
                    orderSourcePinWithStyleInteractor$pinStateFlow$$inlined$map$1$2$1.L$3 = null;
                    orderSourcePinWithStyleInteractor$pinStateFlow$$inlined$map$1$2$1.label = 1;
                    if (vprVar.emit(driveState, orderSourcePinWithStyleInteractor$pinStateFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        orderSourcePinWithStyleInteractor$pinStateFlow$$inlined$map$1$2$1 = new OrderSourcePinWithStyleInteractor$pinStateFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = orderSourcePinWithStyleInteractor$pinStateFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = orderSourcePinWithStyleInteractor$pinStateFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
