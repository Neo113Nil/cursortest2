package com.yandex.go.scooters.offers.v2.details.mapper;

import defpackage.b9j;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lf1j;", "<anonymous>", "(Ltse;)Lf1j;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.offers.v2.details.mapper.ScootersOfferDetailItemsMapper$mapToDetailItems$2$1$1", f = "ScootersOfferDetailItemsMapper.kt", l = {27}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersOfferDetailItemsMapper$mapToDetailItems$2$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ tse $$this$coroutineScope;
    final /* synthetic */ b9j $it;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersOfferDetailItemsMapper$mapToDetailItems$2$1$1(a aVar, tse tseVar, b9j b9jVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$$this$coroutineScope = tseVar;
        this.$it = b9jVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersOfferDetailItemsMapper$mapToDetailItems$2$1$1(this.this$0, this.$$this$coroutineScope, this.$it, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersOfferDetailItemsMapper$mapToDetailItems$2$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        a aVar = this.this$0;
        tse tseVar = this.$$this$coroutineScope;
        b9j b9jVar = this.$it;
        this.label = 1;
        Object a = a.a(aVar, tseVar, b9jVar, this);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
