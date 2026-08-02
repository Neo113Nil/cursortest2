package com.yandex.go.taxi.order.domain.repositories;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lo2y0;", "orders", "Lzy11;", "<anonymous>", "(Ljava/util/List;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.domain.repositories.SearchInfoStateRepositoryImpl$registerSearchStateUpdates$4", f = "SearchInfoStateRepositoryImpl.kt", l = {HProv.ALG_SID_SHA3_256}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class SearchInfoStateRepositoryImpl$registerSearchStateUpdates$4 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ n this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchInfoStateRepositoryImpl$registerSearchStateUpdates$4(n nVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = nVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SearchInfoStateRepositoryImpl$registerSearchStateUpdates$4 searchInfoStateRepositoryImpl$registerSearchStateUpdates$4 = new SearchInfoStateRepositoryImpl$registerSearchStateUpdates$4(this.this$0, continuation);
        searchInfoStateRepositoryImpl$registerSearchStateUpdates$4.L$0 = obj;
        return searchInfoStateRepositoryImpl$registerSearchStateUpdates$4;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SearchInfoStateRepositoryImpl$registerSearchStateUpdates$4) create((List) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List list = (List) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            n nVar = this.this$0;
            this.L$0 = null;
            this.label = 1;
            if (n.a(nVar, list, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
