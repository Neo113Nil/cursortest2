package com.yandex.go.taxi.order.promotions.router;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.taxi.order.promotions.router.OrderRideAutoPromotionRouter$handlePromotionRobotaxi$2", f = "OrderRideAutoPromotionRouter.kt", l = {HProv.PP_SET_PIN}, m = "emit", v = 2)
/* loaded from: classes14.dex */
final class OrderRideAutoPromotionRouter$handlePromotionRobotaxi$2$emit$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderRideAutoPromotionRouter$handlePromotionRobotaxi$2$emit$1(b bVar, Continuation continuation) {
        super(continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, this);
    }
}
