package com.yandex.go.taxi.order.details.v1.elements.ride_support;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.response.OrderDetailsCardResponse;
import com.yandex.go.taxi.order.models.api.response.OrderDetailsCardResponse$CardElement$RideSupportElement;
import com.yandex.go.taxi.order.models.api.response.OrderDetailsCardResponse$CardElement$Type;
import com.yandex.go.taxi.order.models.api.response.c2;
import defpackage.bvf0;
import defpackage.gci0;
import defpackage.iqk0;
import defpackage.jqk0;
import defpackage.nqk0;
import defpackage.ny61;
import defpackage.oqk0;
import defpackage.q8j;
import defpackage.zy11;
import java.util.Iterator;
import java.util.List;
import kotlin.b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class a implements q8j {
    public final jqk0 a;
    public final iqk0 b;
    public final gci0 c;

    public a(jqk0 jqk0Var, iqk0 iqk0Var) {
        this.a = jqk0Var;
        this.b = iqk0Var;
        this.c = jqk0Var.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.q8j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(TaxiOrder taxiOrder, Continuation continuation) {
        RideSupportStateInteractor$onOrderUpdated$1 rideSupportStateInteractor$onOrderUpdated$1;
        int i;
        Object obj;
        Object obj2;
        if (continuation instanceof RideSupportStateInteractor$onOrderUpdated$1) {
            rideSupportStateInteractor$onOrderUpdated$1 = (RideSupportStateInteractor$onOrderUpdated$1) continuation;
            int i2 = rideSupportStateInteractor$onOrderUpdated$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rideSupportStateInteractor$onOrderUpdated$1.label = i2 - Integer.MIN_VALUE;
                Object obj3 = rideSupportStateInteractor$onOrderUpdated$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = rideSupportStateInteractor$onOrderUpdated$1.label;
                if (i != 0) {
                    b.b(obj3);
                    rideSupportStateInteractor$onOrderUpdated$1.L$0 = null;
                    rideSupportStateInteractor$onOrderUpdated$1.label = 1;
                    OrderDetailsCardResponse orderDetailsCardResponse = taxiOrder.V().n0;
                    List list = orderDetailsCardResponse != null ? orderDetailsCardResponse.a : null;
                    if (list == null) {
                        list = EmptyList.a;
                    }
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (((c2) obj).a() == OrderDetailsCardResponse$CardElement$Type.RIDE_SUPPORT) {
                            break;
                        }
                    }
                    OrderDetailsCardResponse$CardElement$RideSupportElement orderDetailsCardResponse$CardElement$RideSupportElement = obj instanceof OrderDetailsCardResponse$CardElement$RideSupportElement ? (OrderDetailsCardResponse$CardElement$RideSupportElement) obj : null;
                    if (orderDetailsCardResponse$CardElement$RideSupportElement == null || taxiOrder.V().P.b("order_support_notification") == null) {
                        obj2 = nqk0.a;
                    } else {
                        obj2 = bvf0.n(new RideSupportStateMapper$createRideSupportUiState$2(this.b, orderDetailsCardResponse$CardElement$RideSupportElement, null), rideSupportStateInteractor$onOrderUpdated$1);
                        if (obj2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                            obj2 = (oqk0) obj2;
                        }
                    }
                    obj3 = obj2;
                    if (obj3 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj3);
                }
                this.a.a.l((oqk0) obj3);
                return zy11.a;
            }
        }
        rideSupportStateInteractor$onOrderUpdated$1 = new RideSupportStateInteractor$onOrderUpdated$1(this, continuation);
        Object obj32 = rideSupportStateInteractor$onOrderUpdated$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = rideSupportStateInteractor$onOrderUpdated$1.label;
        if (i != 0) {
        }
        this.a.a.l((oqk0) obj32);
        return zy11.a;
    }
}
