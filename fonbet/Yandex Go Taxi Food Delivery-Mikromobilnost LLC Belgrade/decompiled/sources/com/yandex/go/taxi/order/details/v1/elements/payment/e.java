package com.yandex.go.taxi.order.details.v1.elements.payment;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.response.OrderDetailsCardResponse;
import com.yandex.go.taxi.order.models.api.response.OrderDetailsCardResponse$CardElement$PaymentElement;
import com.yandex.go.taxi.order.models.api.response.OrderDetailsCardResponse$CardElement$Type;
import com.yandex.go.taxi.order.models.api.response.c2;
import defpackage.bvf0;
import defpackage.ny61;
import defpackage.u6j;
import defpackage.vpr;
import defpackage.zy11;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class e implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ u6j b;

    public e(vpr vprVar, u6j u6jVar) {
        this.a = vprVar;
        this.b = u6jVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00cc, code lost:
    
        if (r8.emit(r10, r0) != r1) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00ce, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b5, code lost:
    
        if (r10 == r1) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        DetailsCardPaymentStateRepository$special$$inlined$map$1$2$1 detailsCardPaymentStateRepository$special$$inlined$map$1$2$1;
        int i;
        vpr vprVar;
        Object obj2;
        if (continuation instanceof DetailsCardPaymentStateRepository$special$$inlined$map$1$2$1) {
            detailsCardPaymentStateRepository$special$$inlined$map$1$2$1 = (DetailsCardPaymentStateRepository$special$$inlined$map$1$2$1) continuation;
            int i2 = detailsCardPaymentStateRepository$special$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                detailsCardPaymentStateRepository$special$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj3 = detailsCardPaymentStateRepository$special$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = detailsCardPaymentStateRepository$special$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj3);
                    TaxiOrder taxiOrder = (TaxiOrder) obj;
                    b bVar = this.b.b;
                    detailsCardPaymentStateRepository$special$$inlined$map$1$2$1.L$0 = null;
                    detailsCardPaymentStateRepository$special$$inlined$map$1$2$1.L$1 = null;
                    detailsCardPaymentStateRepository$special$$inlined$map$1$2$1.L$2 = null;
                    detailsCardPaymentStateRepository$special$$inlined$map$1$2$1.L$3 = null;
                    vprVar = this.a;
                    detailsCardPaymentStateRepository$special$$inlined$map$1$2$1.L$4 = vprVar;
                    detailsCardPaymentStateRepository$special$$inlined$map$1$2$1.L$5 = null;
                    detailsCardPaymentStateRepository$special$$inlined$map$1$2$1.L$6 = null;
                    detailsCardPaymentStateRepository$special$$inlined$map$1$2$1.label = 1;
                    OrderDetailsCardResponse orderDetailsCardResponse = taxiOrder.V().n0;
                    List list = orderDetailsCardResponse != null ? orderDetailsCardResponse.a : null;
                    if (list == null) {
                        list = EmptyList.a;
                    }
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it.next();
                        if (((c2) obj2).a() == OrderDetailsCardResponse$CardElement$Type.PAYMENT_METHOD) {
                            break;
                        }
                    }
                    OrderDetailsCardResponse$CardElement$PaymentElement orderDetailsCardResponse$CardElement$PaymentElement = obj2 instanceof OrderDetailsCardResponse$CardElement$PaymentElement ? (OrderDetailsCardResponse$CardElement$PaymentElement) obj2 : null;
                    obj3 = orderDetailsCardResponse$CardElement$PaymentElement != null ? bvf0.n(new DetailsCardPaymentStateMapper$createCardPaymentMethod$2(orderDetailsCardResponse$CardElement$PaymentElement, bVar, taxiOrder, null), detailsCardPaymentStateRepository$special$$inlined$map$1$2$1) : bVar.c(taxiOrder, detailsCardPaymentStateRepository$special$$inlined$map$1$2$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj3);
                        return zy11.a;
                    }
                    vprVar = (vpr) detailsCardPaymentStateRepository$special$$inlined$map$1$2$1.L$4;
                    kotlin.b.b(obj3);
                }
                detailsCardPaymentStateRepository$special$$inlined$map$1$2$1.L$0 = null;
                detailsCardPaymentStateRepository$special$$inlined$map$1$2$1.L$1 = null;
                detailsCardPaymentStateRepository$special$$inlined$map$1$2$1.L$2 = null;
                detailsCardPaymentStateRepository$special$$inlined$map$1$2$1.L$3 = null;
                detailsCardPaymentStateRepository$special$$inlined$map$1$2$1.L$4 = null;
                detailsCardPaymentStateRepository$special$$inlined$map$1$2$1.L$5 = null;
                detailsCardPaymentStateRepository$special$$inlined$map$1$2$1.L$6 = null;
                detailsCardPaymentStateRepository$special$$inlined$map$1$2$1.label = 2;
            }
        }
        detailsCardPaymentStateRepository$special$$inlined$map$1$2$1 = new DetailsCardPaymentStateRepository$special$$inlined$map$1$2$1(this, continuation);
        Object obj32 = detailsCardPaymentStateRepository$special$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = detailsCardPaymentStateRepository$special$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        detailsCardPaymentStateRepository$special$$inlined$map$1$2$1.L$0 = null;
        detailsCardPaymentStateRepository$special$$inlined$map$1$2$1.L$1 = null;
        detailsCardPaymentStateRepository$special$$inlined$map$1$2$1.L$2 = null;
        detailsCardPaymentStateRepository$special$$inlined$map$1$2$1.L$3 = null;
        detailsCardPaymentStateRepository$special$$inlined$map$1$2$1.L$4 = null;
        detailsCardPaymentStateRepository$special$$inlined$map$1$2$1.L$5 = null;
        detailsCardPaymentStateRepository$special$$inlined$map$1$2$1.L$6 = null;
        detailsCardPaymentStateRepository$special$$inlined$map$1$2$1.label = 2;
    }
}
