package com.yandex.go.taxi.order.promotions.interactor;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import defpackage.j73;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.ur70;
import defpackage.wls;
import defpackage.zy11;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/yandex/go/taxi/order/models/api/TaxiOrder;", "it", "Lzy11;", "<anonymous>", "(Lkotlin/Array;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.promotions.interactor.OrderPromotionsUpdateInteractor$collectPromotions$3", f = "OrderPromotionsUpdateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class OrderPromotionsUpdateInteractor$collectPromotions$3 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ h this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderPromotionsUpdateInteractor$collectPromotions$3(h hVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        OrderPromotionsUpdateInteractor$collectPromotions$3 orderPromotionsUpdateInteractor$collectPromotions$3 = new OrderPromotionsUpdateInteractor$collectPromotions$3(this.this$0, continuation);
        orderPromotionsUpdateInteractor$collectPromotions$3.L$0 = obj;
        return orderPromotionsUpdateInteractor$collectPromotions$3;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        OrderPromotionsUpdateInteractor$collectPromotions$3 orderPromotionsUpdateInteractor$collectPromotions$3 = (OrderPromotionsUpdateInteractor$collectPromotions$3) create((TaxiOrder[]) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        orderPromotionsUpdateInteractor$collectPromotions$3.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        TaxiOrder[] taxiOrderArr = (TaxiOrder[]) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        h hVar = this.this$0;
        hVar.getClass();
        Set u = kotlin.sequences.b.u(kotlin.sequences.b.k(j73.v(taxiOrderArr), new ur70(10)));
        r0 r0Var = hVar.c.b;
        r0Var.getClass();
        r0Var.m(null, u);
        return zy11.a;
    }
}
