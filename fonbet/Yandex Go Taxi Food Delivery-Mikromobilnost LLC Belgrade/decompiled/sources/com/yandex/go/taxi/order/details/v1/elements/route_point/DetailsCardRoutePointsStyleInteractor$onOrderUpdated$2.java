package com.yandex.go.taxi.order.details.v1.elements.route_point;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.response.OrderDetailsCardResponse;
import com.yandex.go.taxi.order.models.api.response.OrderDetailsCardResponse$CardElement$AddRoutePointElement;
import com.yandex.go.taxi.order.models.api.response.OrderDetailsCardResponse$CardElement$RoutePointElement;
import com.yandex.go.taxi.order.models.api.response.e2;
import defpackage.a7j;
import defpackage.g050;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.z6j;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.details.v1.elements.route_point.DetailsCardRoutePointsStyleInteractor$onOrderUpdated$2", f = "DetailsCardRoutePointsStyleInteractor.kt", l = {72, 167, 80, MSException.ERROR_INVALID_PARAMETER}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class DetailsCardRoutePointsStyleInteractor$onOrderUpdated$2 extends SuspendLambda implements wls {
    final /* synthetic */ TaxiOrder $order;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DetailsCardRoutePointsStyleInteractor$onOrderUpdated$2(TaxiOrder taxiOrder, c cVar, Continuation continuation) {
        super(2, continuation);
        this.$order = taxiOrder;
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DetailsCardRoutePointsStyleInteractor$onOrderUpdated$2(this.$order, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DetailsCardRoutePointsStyleInteractor$onOrderUpdated$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x00ba, code lost:
    
        if (com.yandex.go.taxi.order.details.v1.elements.route_point.c.c(r9, r13, r12) == r0) goto L61;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0112  */
    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.ArrayList] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        OrderDetailsCardResponse orderDetailsCardResponse;
        OrderDetailsCardResponse$CardElement$AddRoutePointElement orderDetailsCardResponse$CardElement$AddRoutePointElement;
        ArrayList arrayList;
        List list;
        c cVar;
        g050 g050Var;
        List list2;
        Iterator it;
        c cVar2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        ?? r3 = EmptyList.a;
        if (i == 0) {
            kotlin.b.b(obj);
            orderDetailsCardResponse = this.$order.V().n0;
            if (orderDetailsCardResponse != null) {
                e2 e2Var = OrderDetailsCardResponse.Companion;
                List list3 = orderDetailsCardResponse.a;
                if (list3 != null) {
                    arrayList = new ArrayList();
                    for (Object obj2 : list3) {
                        if (obj2 instanceof OrderDetailsCardResponse$CardElement$AddRoutePointElement) {
                            arrayList.add(obj2);
                        }
                    }
                } else {
                    arrayList = r3;
                }
                orderDetailsCardResponse$CardElement$AddRoutePointElement = (OrderDetailsCardResponse$CardElement$AddRoutePointElement) kotlin.collections.a.R(arrayList);
            } else {
                orderDetailsCardResponse$CardElement$AddRoutePointElement = null;
            }
            if (orderDetailsCardResponse$CardElement$AddRoutePointElement != null) {
                c cVar3 = this.this$0;
                this.L$0 = orderDetailsCardResponse;
                this.L$1 = null;
                this.label = 1;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    cVar = (c) this.L$4;
                    g050Var = (g050) this.L$3;
                    list2 = (List) this.L$2;
                    kotlin.b.b(obj);
                    try {
                        cVar.g.clear();
                        if (list2 != null) {
                            c cVar4 = this.this$0;
                            it = list2.iterator();
                            cVar2 = cVar4;
                            while (it.hasNext()) {
                            }
                        }
                        if (!this.$order.J()) {
                        }
                        return zy11Var;
                    } finally {
                        g050Var.d(null);
                    }
                }
                if (i != 3) {
                    if (i != 4) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    return zy11Var;
                }
                it = (Iterator) this.L$5;
                cVar2 = (c) this.L$4;
                kotlin.b.b(obj);
                while (it.hasNext()) {
                    OrderDetailsCardResponse$CardElement$RoutePointElement orderDetailsCardResponse$CardElement$RoutePointElement = (OrderDetailsCardResponse$CardElement$RoutePointElement) it.next();
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = cVar2;
                    this.L$5 = it;
                    this.L$6 = null;
                    this.L$7 = null;
                    this.label = 3;
                    if (c.d(cVar2, orderDetailsCardResponse$CardElement$RoutePointElement, this) == coroutineSingletons) {
                        break;
                    }
                }
                if (!this.$order.J()) {
                    c cVar5 = this.this$0;
                    z6j z6jVar = cVar5.e;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = null;
                    this.L$6 = null;
                    this.L$7 = null;
                    this.label = 4;
                    if (c.e(cVar5, z6jVar, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return zy11Var;
            }
            orderDetailsCardResponse = (OrderDetailsCardResponse) this.L$0;
            kotlin.b.b(obj);
        }
        if (orderDetailsCardResponse != null) {
            e2 e2Var2 = OrderDetailsCardResponse.Companion;
            List list4 = orderDetailsCardResponse.a;
            if (list4 != null) {
                r3 = new ArrayList();
                for (Object obj3 : list4) {
                    if (obj3 instanceof OrderDetailsCardResponse$CardElement$RoutePointElement) {
                        r3.add(obj3);
                    }
                }
            }
            list = kotlin.collections.a.x0((Iterable) r3, new a7j());
        } else {
            list = null;
        }
        cVar = this.this$0;
        g050Var = cVar.d;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = list;
        this.L$3 = g050Var;
        this.L$4 = cVar;
        this.label = 2;
        if (g050Var.a(this) != coroutineSingletons) {
            list2 = list;
            cVar.g.clear();
            if (list2 != null) {
            }
            if (!this.$order.J()) {
            }
            return zy11Var;
        }
        return coroutineSingletons;
    }
}
