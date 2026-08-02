package com.yandex.go.taxi.order.domain.repositories;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lo2y0;", "<anonymous>", "(Ltse;)Lo2y0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.domain.repositories.TaxiOrderHolderRepositoryImpl$getHolderWithIdBlocking$1", f = "TaxiOrderHolderRepositoryImpl.kt", l = {231}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class TaxiOrderHolderRepositoryImpl$getHolderWithIdBlocking$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $orderId;
    int label;
    final /* synthetic */ e0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaxiOrderHolderRepositoryImpl$getHolderWithIdBlocking$1(e0 e0Var, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = e0Var;
        this.$orderId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TaxiOrderHolderRepositoryImpl$getHolderWithIdBlocking$1(this.this$0, this.$orderId, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TaxiOrderHolderRepositoryImpl$getHolderWithIdBlocking$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
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
        e0 e0Var = this.this$0;
        String str = this.$orderId;
        this.label = 1;
        Object p = e0Var.p(str, this);
        return p == coroutineSingletons ? coroutineSingletons : p;
    }
}
