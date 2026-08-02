package com.yandex.go.taxi.order.details.v1.elements.driver_phone;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.response.OrderDetailsCardResponse;
import com.yandex.go.taxi.order.models.api.response.OrderDetailsCardResponse$CardElement$DriverPhoneButtonElement;
import com.yandex.go.taxi.order.models.api.response.c2;
import com.yandex.go.taxi.order.models.api.response.e2;
import defpackage.gci0;
import defpackage.ny61;
import defpackage.q8j;
import defpackage.xim;
import defpackage.yim;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class a implements q8j {
    public final yim a;
    public final b b;
    public final gci0 c;

    public a(yim yimVar, b bVar) {
        this.a = yimVar;
        this.b = bVar;
        this.c = yimVar.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r9v3, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.util.ArrayList] */
    @Override // defpackage.q8j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(TaxiOrder taxiOrder, Continuation continuation) {
        DriverPhoneStateInteractor$onOrderUpdated$1 driverPhoneStateInteractor$onOrderUpdated$1;
        int i;
        ?? r9;
        List list;
        if (continuation instanceof DriverPhoneStateInteractor$onOrderUpdated$1) {
            driverPhoneStateInteractor$onOrderUpdated$1 = (DriverPhoneStateInteractor$onOrderUpdated$1) continuation;
            int i2 = driverPhoneStateInteractor$onOrderUpdated$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                driverPhoneStateInteractor$onOrderUpdated$1.label = i2 - Integer.MIN_VALUE;
                Object obj = driverPhoneStateInteractor$onOrderUpdated$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = driverPhoneStateInteractor$onOrderUpdated$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    e2 e2Var = OrderDetailsCardResponse.Companion;
                    OrderDetailsCardResponse orderDetailsCardResponse = taxiOrder.V().n0;
                    if (orderDetailsCardResponse == null || (list = orderDetailsCardResponse.a) == null) {
                        r9 = EmptyList.a;
                    } else {
                        r9 = new ArrayList();
                        for (Object obj2 : list) {
                            if (obj2 instanceof OrderDetailsCardResponse$CardElement$DriverPhoneButtonElement) {
                                r9.add(obj2);
                            }
                        }
                    }
                    OrderDetailsCardResponse$CardElement$DriverPhoneButtonElement orderDetailsCardResponse$CardElement$DriverPhoneButtonElement = (OrderDetailsCardResponse$CardElement$DriverPhoneButtonElement) ((c2) kotlin.collections.a.R(r9));
                    if (orderDetailsCardResponse$CardElement$DriverPhoneButtonElement == null) {
                        return zy11Var;
                    }
                    driverPhoneStateInteractor$onOrderUpdated$1.L$0 = null;
                    driverPhoneStateInteractor$onOrderUpdated$1.L$1 = null;
                    driverPhoneStateInteractor$onOrderUpdated$1.label = 1;
                    obj = this.b.a(orderDetailsCardResponse$CardElement$DriverPhoneButtonElement, driverPhoneStateInteractor$onOrderUpdated$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                this.a.a.l((xim) obj);
                return zy11Var;
            }
        }
        driverPhoneStateInteractor$onOrderUpdated$1 = new DriverPhoneStateInteractor$onOrderUpdated$1(this, continuation);
        Object obj3 = driverPhoneStateInteractor$onOrderUpdated$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = driverPhoneStateInteractor$onOrderUpdated$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        this.a.a.l((xim) obj3);
        return zy11Var2;
    }
}
