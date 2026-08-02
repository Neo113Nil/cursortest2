package com.yandex.go.taxi.order.details.v1.elements.destination;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.response.OrderDetailsCardResponse;
import com.yandex.go.taxi.order.models.api.response.OrderDetailsCardResponse$CardElement$AddDestinationElement;
import com.yandex.go.taxi.order.models.api.response.OrderDetailsCardResponse$CardElement$DestinationElement;
import com.yandex.go.taxi.order.models.api.response.e2;
import defpackage.i5j;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.details.v1.elements.destination.DetailsCardDestinationStyleInteractor$onOrderUpdated$2", f = "DetailsCardDestinationStyleInteractor.kt", l = {91, HProv.PP_RESERVED1, 103}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class DetailsCardDestinationStyleInteractor$onOrderUpdated$2 extends SuspendLambda implements wls {
    final /* synthetic */ TaxiOrder $order;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DetailsCardDestinationStyleInteractor$onOrderUpdated$2(TaxiOrder taxiOrder, c cVar, Continuation continuation) {
        super(2, continuation);
        this.$order = taxiOrder;
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DetailsCardDestinationStyleInteractor$onOrderUpdated$2(this.$order, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DetailsCardDestinationStyleInteractor$onOrderUpdated$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ca, code lost:
    
        if (com.yandex.go.taxi.order.details.v1.elements.destination.c.d(r1, r12, r11) == r0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x008c, code lost:
    
        if (com.yandex.go.taxi.order.details.v1.elements.destination.c.c(r8, r12, r11) == r0) goto L49;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00d6  */
    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayList] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        OrderDetailsCardResponse orderDetailsCardResponse;
        ArrayList arrayList;
        List list;
        List list2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        ?? r3 = EmptyList.a;
        if (i == 0) {
            kotlin.b.b(obj);
            orderDetailsCardResponse = this.$order.V().n0;
            e2 e2Var = OrderDetailsCardResponse.Companion;
            if (orderDetailsCardResponse == null || (list = orderDetailsCardResponse.a) == null) {
                arrayList = r3;
            } else {
                arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (obj2 instanceof OrderDetailsCardResponse$CardElement$AddDestinationElement) {
                        arrayList.add(obj2);
                    }
                }
            }
            OrderDetailsCardResponse$CardElement$AddDestinationElement orderDetailsCardResponse$CardElement$AddDestinationElement = (OrderDetailsCardResponse$CardElement$AddDestinationElement) kotlin.collections.a.R(arrayList);
            if (orderDetailsCardResponse$CardElement$AddDestinationElement != null) {
                c cVar = this.this$0;
                this.L$0 = orderDetailsCardResponse;
                this.L$1 = null;
                this.label = 1;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    return zy11Var;
                }
                kotlin.b.b(obj);
                if (!this.$order.J()) {
                    c cVar2 = this.this$0;
                    i5j i5jVar = cVar2.e;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 3;
                    if (c.e(cVar2, i5jVar, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return zy11Var;
            }
            orderDetailsCardResponse = (OrderDetailsCardResponse) this.L$0;
            kotlin.b.b(obj);
        }
        e2 e2Var2 = OrderDetailsCardResponse.Companion;
        if (orderDetailsCardResponse != null && (list2 = orderDetailsCardResponse.a) != null) {
            r3 = new ArrayList();
            for (Object obj3 : list2) {
                if (obj3 instanceof OrderDetailsCardResponse$CardElement$DestinationElement) {
                    r3.add(obj3);
                }
            }
        }
        OrderDetailsCardResponse$CardElement$DestinationElement orderDetailsCardResponse$CardElement$DestinationElement = (OrderDetailsCardResponse$CardElement$DestinationElement) kotlin.collections.a.R(r3);
        if (orderDetailsCardResponse$CardElement$DestinationElement != null) {
            c cVar3 = this.this$0;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 2;
        }
        if (!this.$order.J()) {
        }
        return zy11Var;
    }
}
