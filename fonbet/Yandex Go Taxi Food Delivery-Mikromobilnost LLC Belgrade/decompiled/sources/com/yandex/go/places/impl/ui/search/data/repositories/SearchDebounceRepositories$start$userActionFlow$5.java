package com.yandex.go.places.impl.ui.search.data.repositories;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.wtp0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lwtp0;", "it", "Lzy11;", "<anonymous>", "(Lwtp0;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.places.impl.ui.search.data.repositories.SearchDebounceRepositories$start$userActionFlow$5", f = "SearchDebounceRepositories.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class SearchDebounceRepositories$start$userActionFlow$5 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchDebounceRepositories$start$userActionFlow$5(c cVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SearchDebounceRepositories$start$userActionFlow$5 searchDebounceRepositories$start$userActionFlow$5 = new SearchDebounceRepositories$start$userActionFlow$5(this.this$0, continuation);
        searchDebounceRepositories$start$userActionFlow$5.L$0 = obj;
        return searchDebounceRepositories$start$userActionFlow$5;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        SearchDebounceRepositories$start$userActionFlow$5 searchDebounceRepositories$start$userActionFlow$5 = (SearchDebounceRepositories$start$userActionFlow$5) create((wtp0) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        searchDebounceRepositories$start$userActionFlow$5.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        wtp0 wtp0Var = (wtp0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        this.this$0.e = wtp0Var;
        return zy11.a;
    }
}
