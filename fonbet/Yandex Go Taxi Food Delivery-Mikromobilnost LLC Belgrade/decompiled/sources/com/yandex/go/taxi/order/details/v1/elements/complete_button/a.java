package com.yandex.go.taxi.order.details.v1.elements.complete_button;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.response.OrderDetailsCardResponse;
import com.yandex.go.taxi.order.models.api.response.OrderDetailsCardResponse$CardElement$CompleteButtonElement;
import com.yandex.go.taxi.order.models.api.response.c2;
import com.yandex.go.taxi.order.models.api.response.e2;
import defpackage.c5j;
import defpackage.d5j;
import defpackage.e5j;
import defpackage.gci0;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.q8j;
import defpackage.sjh;
import defpackage.tje;
import defpackage.uyj;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class a implements q8j {
    public final e5j a;
    public final d5j b;
    public final gci0 c;

    public a(e5j e5jVar, d5j d5jVar) {
        this.a = e5jVar;
        this.b = d5jVar;
        this.c = e5jVar.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r8v3, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.util.ArrayList] */
    @Override // defpackage.q8j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(TaxiOrder taxiOrder, Continuation continuation) {
        DetailsCardCompleteButtonStateInteractor$onOrderUpdated$1 detailsCardCompleteButtonStateInteractor$onOrderUpdated$1;
        int i;
        ?? r8;
        List list;
        if (continuation instanceof DetailsCardCompleteButtonStateInteractor$onOrderUpdated$1) {
            detailsCardCompleteButtonStateInteractor$onOrderUpdated$1 = (DetailsCardCompleteButtonStateInteractor$onOrderUpdated$1) continuation;
            int i2 = detailsCardCompleteButtonStateInteractor$onOrderUpdated$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                detailsCardCompleteButtonStateInteractor$onOrderUpdated$1.label = i2 - Integer.MIN_VALUE;
                Object obj = detailsCardCompleteButtonStateInteractor$onOrderUpdated$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = detailsCardCompleteButtonStateInteractor$onOrderUpdated$1.label;
                if (i != 0) {
                    b.b(obj);
                    e2 e2Var = OrderDetailsCardResponse.Companion;
                    OrderDetailsCardResponse orderDetailsCardResponse = taxiOrder.V().n0;
                    if (orderDetailsCardResponse == null || (list = orderDetailsCardResponse.a) == null) {
                        r8 = EmptyList.a;
                    } else {
                        r8 = new ArrayList();
                        for (Object obj2 : list) {
                            if (obj2 instanceof OrderDetailsCardResponse$CardElement$CompleteButtonElement) {
                                r8.add(obj2);
                            }
                        }
                    }
                    OrderDetailsCardResponse$CardElement$CompleteButtonElement orderDetailsCardResponse$CardElement$CompleteButtonElement = (OrderDetailsCardResponse$CardElement$CompleteButtonElement) ((c2) kotlin.collections.a.R(r8));
                    if (orderDetailsCardResponse$CardElement$CompleteButtonElement != null) {
                        detailsCardCompleteButtonStateInteractor$onOrderUpdated$1.L$0 = null;
                        detailsCardCompleteButtonStateInteractor$onOrderUpdated$1.L$1 = null;
                        detailsCardCompleteButtonStateInteractor$onOrderUpdated$1.label = 1;
                        d5j d5jVar = this.b;
                        d5jVar.a.getClass();
                        sjh sjhVar = uyj.a;
                        obj = tje.k0(mdh.b, new DetailsCardCompleteButtonStateMapper$map$2(orderDetailsCardResponse$CardElement$CompleteButtonElement, d5jVar, null), detailsCardCompleteButtonStateInteractor$onOrderUpdated$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    return zy11.a;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                this.a.a.l((c5j) obj);
                return zy11.a;
            }
        }
        detailsCardCompleteButtonStateInteractor$onOrderUpdated$1 = new DetailsCardCompleteButtonStateInteractor$onOrderUpdated$1(this, continuation);
        Object obj3 = detailsCardCompleteButtonStateInteractor$onOrderUpdated$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = detailsCardCompleteButtonStateInteractor$onOrderUpdated$1.label;
        if (i != 0) {
        }
        this.a.a.l((c5j) obj3);
        return zy11.a;
    }
}
