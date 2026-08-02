package com.yandex.go.taxi.order.cancel.paid.navigation;

import com.yandex.go.taxi.order.domain.repositories.e0;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import defpackage.alb1;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.p2y0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lcom/yandex/go/taxi/order/models/api/TaxiOrder;", "<anonymous>", "(Ltse;)Lcom/yandex/go/taxi/order/models/api/TaxiOrder;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.cancel.paid.navigation.PaidCancelIntentHandler$processIntent$cancelledOrder$1", f = "PaidCancelIntentHandler.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class PaidCancelIntentHandler$processIntent$cancelledOrder$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $orderId;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaidCancelIntentHandler$processIntent$cancelledOrder$1(a aVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$orderId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PaidCancelIntentHandler$processIntent$cancelledOrder$1(this.this$0, this.$orderId, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PaidCancelIntentHandler$processIntent$cancelledOrder$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        TaxiOrder i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        p2y0 p2y0Var = this.this$0.c;
        String str = this.$orderId;
        if (str == null || str.length() == 0 || (i = ((e0) p2y0Var).i(str)) == null || !alb1.g(i.h.b, i.V().k, i.V().u)) {
            return null;
        }
        return i;
    }
}
