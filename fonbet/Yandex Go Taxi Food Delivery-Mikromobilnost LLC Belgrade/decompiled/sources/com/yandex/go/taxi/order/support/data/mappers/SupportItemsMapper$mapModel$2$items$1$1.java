package com.yandex.go.taxi.order.support.data.mappers;

import com.yandex.go.taxi.order.models.api.ride_support.OrderRideSupportNotification;
import defpackage.bvf0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lijw0;", "<anonymous>", "(Ltse;)Lijw0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.support.data.mappers.SupportItemsMapper$mapModel$2$items$1$1", f = "SupportItemsMapper.kt", l = {19}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class SupportItemsMapper$mapModel$2$items$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ OrderRideSupportNotification.SupportItemDto $it;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SupportItemsMapper$mapModel$2$items$1$1(b bVar, OrderRideSupportNotification.SupportItemDto supportItemDto, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$it = supportItemDto;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SupportItemsMapper$mapModel$2$items$1$1(this.this$0, this.$it, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SupportItemsMapper$mapModel$2$items$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        a aVar = this.this$0.a;
        OrderRideSupportNotification.SupportItemDto supportItemDto = this.$it;
        this.label = 1;
        aVar.getClass();
        Object n = bvf0.n(new SupportItemMapper$mapModel$2(supportItemDto, aVar, null), this);
        return n == coroutineSingletons ? coroutineSingletons : n;
    }
}
