package com.yandex.go.taxi.order.domain.repositories;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo2y0;", "orderHolder", "Lzy11;", "<anonymous>", "(Lo2y0;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.domain.repositories.SearchInfoStateRepositoryImpl$activeOrderFlow$1", f = "SearchInfoStateRepositoryImpl.kt", l = {398}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class SearchInfoStateRepositoryImpl$activeOrderFlow$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ n this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchInfoStateRepositoryImpl$activeOrderFlow$1(n nVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = nVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SearchInfoStateRepositoryImpl$activeOrderFlow$1 searchInfoStateRepositoryImpl$activeOrderFlow$1 = new SearchInfoStateRepositoryImpl$activeOrderFlow$1(this.this$0, continuation);
        searchInfoStateRepositoryImpl$activeOrderFlow$1.L$0 = obj;
        return searchInfoStateRepositoryImpl$activeOrderFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SearchInfoStateRepositoryImpl$activeOrderFlow$1) create((o2y0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        o2y0 o2y0Var = (o2y0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            if (o2y0Var != null) {
                n nVar = this.this$0;
                this.L$0 = null;
                this.label = 1;
                obj = nVar.f(o2y0Var, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return zy11.a;
        }
        if (i != 1) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        return zy11.a;
    }
}
