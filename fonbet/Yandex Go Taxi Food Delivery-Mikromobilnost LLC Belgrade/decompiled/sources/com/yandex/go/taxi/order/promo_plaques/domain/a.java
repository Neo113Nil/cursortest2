package com.yandex.go.taxi.order.promo_plaques.domain;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ c b;

    public a(vpr vprVar, c cVar) {
        this.a = vprVar;
        this.b = cVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0096, code lost:
    
        if (r7.emit(r9, r0) != r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        AvailableOrderCommunicationsInteractor$availableCommunicationsFlow$$inlined$map$1$2$1 availableOrderCommunicationsInteractor$availableCommunicationsFlow$$inlined$map$1$2$1;
        int i;
        vpr vprVar;
        if (continuation instanceof AvailableOrderCommunicationsInteractor$availableCommunicationsFlow$$inlined$map$1$2$1) {
            availableOrderCommunicationsInteractor$availableCommunicationsFlow$$inlined$map$1$2$1 = (AvailableOrderCommunicationsInteractor$availableCommunicationsFlow$$inlined$map$1$2$1) continuation;
            int i2 = availableOrderCommunicationsInteractor$availableCommunicationsFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                availableOrderCommunicationsInteractor$availableCommunicationsFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = availableOrderCommunicationsInteractor$availableCommunicationsFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = availableOrderCommunicationsInteractor$availableCommunicationsFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    vpr vprVar2 = this.a;
                    TaxiOrder taxiOrder = (TaxiOrder) obj;
                    ru.yandex.taxi.communications.b bVar = this.b.a;
                    List g = taxiOrder.V().g();
                    Set set = taxiOrder.l.U;
                    availableOrderCommunicationsInteractor$availableCommunicationsFlow$$inlined$map$1$2$1.L$0 = null;
                    availableOrderCommunicationsInteractor$availableCommunicationsFlow$$inlined$map$1$2$1.L$1 = null;
                    availableOrderCommunicationsInteractor$availableCommunicationsFlow$$inlined$map$1$2$1.L$2 = null;
                    availableOrderCommunicationsInteractor$availableCommunicationsFlow$$inlined$map$1$2$1.L$3 = null;
                    availableOrderCommunicationsInteractor$availableCommunicationsFlow$$inlined$map$1$2$1.L$4 = vprVar2;
                    availableOrderCommunicationsInteractor$availableCommunicationsFlow$$inlined$map$1$2$1.L$5 = null;
                    availableOrderCommunicationsInteractor$availableCommunicationsFlow$$inlined$map$1$2$1.L$6 = null;
                    availableOrderCommunicationsInteractor$availableCommunicationsFlow$$inlined$map$1$2$1.label = 1;
                    Object a = bVar.a(g, set, availableOrderCommunicationsInteractor$availableCommunicationsFlow$$inlined$map$1$2$1);
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
                vprVar = (vpr) availableOrderCommunicationsInteractor$availableCommunicationsFlow$$inlined$map$1$2$1.L$4;
                kotlin.b.b(obj2);
                availableOrderCommunicationsInteractor$availableCommunicationsFlow$$inlined$map$1$2$1.L$0 = null;
                availableOrderCommunicationsInteractor$availableCommunicationsFlow$$inlined$map$1$2$1.L$1 = null;
                availableOrderCommunicationsInteractor$availableCommunicationsFlow$$inlined$map$1$2$1.L$2 = null;
                availableOrderCommunicationsInteractor$availableCommunicationsFlow$$inlined$map$1$2$1.L$3 = null;
                availableOrderCommunicationsInteractor$availableCommunicationsFlow$$inlined$map$1$2$1.L$4 = null;
                availableOrderCommunicationsInteractor$availableCommunicationsFlow$$inlined$map$1$2$1.L$5 = null;
                availableOrderCommunicationsInteractor$availableCommunicationsFlow$$inlined$map$1$2$1.L$6 = null;
                availableOrderCommunicationsInteractor$availableCommunicationsFlow$$inlined$map$1$2$1.label = 2;
            }
        }
        availableOrderCommunicationsInteractor$availableCommunicationsFlow$$inlined$map$1$2$1 = new AvailableOrderCommunicationsInteractor$availableCommunicationsFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = availableOrderCommunicationsInteractor$availableCommunicationsFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = availableOrderCommunicationsInteractor$availableCommunicationsFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        availableOrderCommunicationsInteractor$availableCommunicationsFlow$$inlined$map$1$2$1.L$0 = null;
        availableOrderCommunicationsInteractor$availableCommunicationsFlow$$inlined$map$1$2$1.L$1 = null;
        availableOrderCommunicationsInteractor$availableCommunicationsFlow$$inlined$map$1$2$1.L$2 = null;
        availableOrderCommunicationsInteractor$availableCommunicationsFlow$$inlined$map$1$2$1.L$3 = null;
        availableOrderCommunicationsInteractor$availableCommunicationsFlow$$inlined$map$1$2$1.L$4 = null;
        availableOrderCommunicationsInteractor$availableCommunicationsFlow$$inlined$map$1$2$1.L$5 = null;
        availableOrderCommunicationsInteractor$availableCommunicationsFlow$$inlined$map$1$2$1.L$6 = null;
        availableOrderCommunicationsInteractor$availableCommunicationsFlow$$inlined$map$1$2$1.label = 2;
    }
}
