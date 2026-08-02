package com.yandex.go.taxi.order.details.v1.elements.info;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.response.OrderDetailsCardResponse;
import com.yandex.go.taxi.order.models.api.response.OrderDetailsCardResponse$CardElement$DetailsElement;
import com.yandex.go.taxi.order.models.api.response.OrderDetailsCardResponse$CardElement$Type;
import com.yandex.go.taxi.order.models.api.response.c2;
import defpackage.bvf0;
import defpackage.gci0;
import defpackage.ny61;
import defpackage.o6j;
import defpackage.q8j;
import defpackage.t6j;
import defpackage.zy11;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class a implements q8j {
    public final o6j a;
    public final b b;
    public final gci0 c;

    public a(o6j o6jVar, b bVar) {
        this.a = o6jVar;
        this.b = bVar;
        this.c = o6jVar.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.q8j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(TaxiOrder taxiOrder, Continuation continuation) {
        DetailsCardInfoStateInteractor$onOrderUpdated$1 detailsCardInfoStateInteractor$onOrderUpdated$1;
        int i;
        Object obj;
        Object a;
        if (continuation instanceof DetailsCardInfoStateInteractor$onOrderUpdated$1) {
            detailsCardInfoStateInteractor$onOrderUpdated$1 = (DetailsCardInfoStateInteractor$onOrderUpdated$1) continuation;
            int i2 = detailsCardInfoStateInteractor$onOrderUpdated$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                detailsCardInfoStateInteractor$onOrderUpdated$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = detailsCardInfoStateInteractor$onOrderUpdated$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = detailsCardInfoStateInteractor$onOrderUpdated$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    detailsCardInfoStateInteractor$onOrderUpdated$1.L$0 = null;
                    detailsCardInfoStateInteractor$onOrderUpdated$1.label = 1;
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
                        if (((c2) obj).a() == OrderDetailsCardResponse$CardElement$Type.DETAILS) {
                            break;
                        }
                    }
                    OrderDetailsCardResponse$CardElement$DetailsElement orderDetailsCardResponse$CardElement$DetailsElement = obj instanceof OrderDetailsCardResponse$CardElement$DetailsElement ? (OrderDetailsCardResponse$CardElement$DetailsElement) obj : null;
                    b bVar = this.b;
                    if (orderDetailsCardResponse$CardElement$DetailsElement != null) {
                        a = bvf0.n(new DetailsCardInfoStateMapper$createCardDetails$2(orderDetailsCardResponse$CardElement$DetailsElement, bVar, taxiOrder, null), detailsCardInfoStateInteractor$onOrderUpdated$1);
                        if (a != CoroutineSingletons.COROUTINE_SUSPENDED) {
                            a = (t6j) a;
                        }
                    } else {
                        a = bVar.a(taxiOrder, detailsCardInfoStateInteractor$onOrderUpdated$1);
                    }
                    obj2 = a;
                    if (obj2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                this.a.a.l((t6j) obj2);
                return zy11.a;
            }
        }
        detailsCardInfoStateInteractor$onOrderUpdated$1 = new DetailsCardInfoStateInteractor$onOrderUpdated$1(this, continuation);
        Object obj22 = detailsCardInfoStateInteractor$onOrderUpdated$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = detailsCardInfoStateInteractor$onOrderUpdated$1.label;
        if (i != 0) {
        }
        this.a.a.l((t6j) obj22);
        return zy11.a;
    }
}
