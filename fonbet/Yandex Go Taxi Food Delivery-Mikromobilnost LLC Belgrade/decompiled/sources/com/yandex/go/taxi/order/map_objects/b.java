package com.yandex.go.taxi.order.map_objects;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.objects.MapObject;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class b implements vpr {
    public final /* synthetic */ vpr a;

    public b(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        OrderMapObjectsInteractor$orderMapObjectsFlow$$inlined$map$1$2$1 orderMapObjectsInteractor$orderMapObjectsFlow$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof OrderMapObjectsInteractor$orderMapObjectsFlow$$inlined$map$1$2$1) {
            orderMapObjectsInteractor$orderMapObjectsFlow$$inlined$map$1$2$1 = (OrderMapObjectsInteractor$orderMapObjectsFlow$$inlined$map$1$2$1) continuation;
            int i2 = orderMapObjectsInteractor$orderMapObjectsFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                orderMapObjectsInteractor$orderMapObjectsFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = orderMapObjectsInteractor$orderMapObjectsFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = orderMapObjectsInteractor$orderMapObjectsFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    vpr vprVar = this.a;
                    TaxiOrder taxiOrder = (TaxiOrder) obj;
                    List list = taxiOrder.V().s;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : list) {
                        if (!taxiOrder.l.b0.contains(((MapObject) obj3).a)) {
                            arrayList.add(obj3);
                        }
                    }
                    orderMapObjectsInteractor$orderMapObjectsFlow$$inlined$map$1$2$1.L$0 = null;
                    orderMapObjectsInteractor$orderMapObjectsFlow$$inlined$map$1$2$1.L$1 = null;
                    orderMapObjectsInteractor$orderMapObjectsFlow$$inlined$map$1$2$1.L$2 = null;
                    orderMapObjectsInteractor$orderMapObjectsFlow$$inlined$map$1$2$1.L$3 = null;
                    orderMapObjectsInteractor$orderMapObjectsFlow$$inlined$map$1$2$1.label = 1;
                    if (vprVar.emit(arrayList, orderMapObjectsInteractor$orderMapObjectsFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        orderMapObjectsInteractor$orderMapObjectsFlow$$inlined$map$1$2$1 = new OrderMapObjectsInteractor$orderMapObjectsFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = orderMapObjectsInteractor$orderMapObjectsFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = orderMapObjectsInteractor$orderMapObjectsFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
