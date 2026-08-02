package com.yandex.go.taxi.order.promotions.interactor;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.cprocsp.NGate.tools.Constants;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.taxi.order.promotions.interactor.OrderPromotionsUpdateInteractor", f = "OrderPromotionsUpdateInteractor.kt", l = {Constants.VPN_TRAFFIC}, m = "findPromotionToShow", v = 2)
/* loaded from: classes14.dex */
final class OrderPromotionsUpdateInteractor$findPromotionToShow$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ h this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderPromotionsUpdateInteractor$findPromotionToShow$1(h hVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return h.a(this.this$0, null, this);
    }
}
