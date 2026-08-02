package com.yandex.go.scooters.subscription.data.mapper;

import defpackage.eyo0;
import defpackage.fyo0;
import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.scooters.subscription.data.mapper.ScootersSubscriptionStartPurchaseMapper", f = "ScootersSubscriptionStartPurchaseMapper.kt", l = {33}, m = "mapStartPurchaseErrorResponse-nHJUlW8", v = 2)
/* loaded from: classes13.dex */
final class ScootersSubscriptionStartPurchaseMapper$mapStartPurchaseErrorResponse$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersSubscriptionStartPurchaseMapper$mapStartPurchaseErrorResponse$1(c cVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object a = this.this$0.a(null, this);
        return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : new fyo0((eyo0) a);
    }
}
