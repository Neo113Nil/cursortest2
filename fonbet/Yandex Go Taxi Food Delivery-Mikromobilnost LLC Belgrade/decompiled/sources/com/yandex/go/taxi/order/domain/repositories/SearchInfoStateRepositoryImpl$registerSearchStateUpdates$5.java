package com.yandex.go.taxi.order.domain.repositories;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.wls;
import defpackage.zy11;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lo2y0;", "orders", "Lzy11;", "<anonymous>", "(Ljava/util/List;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.domain.repositories.SearchInfoStateRepositoryImpl$registerSearchStateUpdates$5", f = "SearchInfoStateRepositoryImpl.kt", l = {80}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class SearchInfoStateRepositoryImpl$registerSearchStateUpdates$5 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ n this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchInfoStateRepositoryImpl$registerSearchStateUpdates$5(n nVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = nVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SearchInfoStateRepositoryImpl$registerSearchStateUpdates$5 searchInfoStateRepositoryImpl$registerSearchStateUpdates$5 = new SearchInfoStateRepositoryImpl$registerSearchStateUpdates$5(this.this$0, continuation);
        searchInfoStateRepositoryImpl$registerSearchStateUpdates$5.L$0 = obj;
        return searchInfoStateRepositoryImpl$registerSearchStateUpdates$5;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SearchInfoStateRepositoryImpl$registerSearchStateUpdates$5) create((List) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Iterator it;
        n nVar;
        List list = (List) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            n nVar2 = this.this$0;
            it = list.iterator();
            nVar = nVar2;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            it = (Iterator) this.L$3;
            nVar = (n) this.L$2;
            kotlin.b.b(obj);
        }
        while (it.hasNext()) {
            o2y0 o2y0Var = (o2y0) it.next();
            Set set = nVar.l;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = nVar;
            this.L$3 = it;
            this.L$4 = null;
            this.L$5 = null;
            this.label = 1;
            if (n.b(nVar, o2y0Var, set, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return zy11.a;
    }
}
