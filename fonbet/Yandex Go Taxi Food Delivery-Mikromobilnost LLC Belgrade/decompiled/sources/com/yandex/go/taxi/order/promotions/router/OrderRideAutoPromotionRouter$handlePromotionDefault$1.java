package com.yandex.go.taxi.order.promotions.router;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.taxi.order.promotions.router.OrderRideAutoPromotionRouter", f = "OrderRideAutoPromotionRouter.kt", l = {HProv.PP_DELETE_SAVED_PASSWD}, m = "handlePromotionDefault", v = 2)
/* loaded from: classes14.dex */
final class OrderRideAutoPromotionRouter$handlePromotionDefault$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderRideAutoPromotionRouter$handlePromotionDefault$1(c cVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return c.P(this.this$0, null, null, this);
    }
}
