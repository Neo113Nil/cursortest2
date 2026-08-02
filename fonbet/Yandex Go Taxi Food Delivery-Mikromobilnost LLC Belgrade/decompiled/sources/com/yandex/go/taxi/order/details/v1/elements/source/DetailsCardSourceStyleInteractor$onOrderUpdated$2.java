package com.yandex.go.taxi.order.details.v1.elements.source;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.response.OrderDetailsCardResponse;
import com.yandex.go.taxi.order.models.api.response.OrderDetailsCardResponse$CardElement$SourceElement;
import com.yandex.go.taxi.order.models.api.response.e2;
import defpackage.j7j;
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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.details.v1.elements.source.DetailsCardSourceStyleInteractor$onOrderUpdated$2", f = "DetailsCardSourceStyleInteractor.kt", l = {101, 108}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class DetailsCardSourceStyleInteractor$onOrderUpdated$2 extends SuspendLambda implements wls {
    final /* synthetic */ TaxiOrder $order;
    Object L$0;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DetailsCardSourceStyleInteractor$onOrderUpdated$2(TaxiOrder taxiOrder, c cVar, Continuation continuation) {
        super(2, continuation);
        this.$order = taxiOrder;
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DetailsCardSourceStyleInteractor$onOrderUpdated$2(this.$order, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DetailsCardSourceStyleInteractor$onOrderUpdated$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x006b, code lost:
    
        if (com.yandex.go.taxi.order.details.v1.elements.source.c.c(r1, r9, r8) == r0) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.ArrayList] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        OrderDetailsCardResponse$CardElement$SourceElement orderDetailsCardResponse$CardElement$SourceElement;
        ?? r1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            OrderDetailsCardResponse orderDetailsCardResponse = this.$order.V().n0;
            if (orderDetailsCardResponse != null) {
                e2 e2Var = OrderDetailsCardResponse.Companion;
                List list = orderDetailsCardResponse.a;
                if (list != null) {
                    r1 = new ArrayList();
                    for (Object obj2 : list) {
                        if (obj2 instanceof OrderDetailsCardResponse$CardElement$SourceElement) {
                            r1.add(obj2);
                        }
                    }
                } else {
                    r1 = EmptyList.a;
                }
                orderDetailsCardResponse$CardElement$SourceElement = (OrderDetailsCardResponse$CardElement$SourceElement) kotlin.collections.a.R(r1);
            } else {
                orderDetailsCardResponse$CardElement$SourceElement = null;
            }
            if (orderDetailsCardResponse$CardElement$SourceElement != null) {
                c cVar = this.this$0;
                this.L$0 = null;
                this.label = 1;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return zy11Var;
            }
            kotlin.b.b(obj);
        }
        if (!this.$order.J()) {
            c cVar2 = this.this$0;
            j7j j7jVar = cVar2.f;
            this.L$0 = null;
            this.label = 2;
            if (c.d(cVar2, j7jVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return zy11Var;
    }
}
