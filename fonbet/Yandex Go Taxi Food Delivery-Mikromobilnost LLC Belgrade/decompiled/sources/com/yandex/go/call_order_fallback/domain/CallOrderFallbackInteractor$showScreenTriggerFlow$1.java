package com.yandex.go.call_order_fallback.domain;

import defpackage.c2t;
import defpackage.jj7;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ljj7;", ClidProvider.STATE, "Lc2t;", "loadingState", "<anonymous>", "(Ljj7;Lc2t;)Ljj7;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.call_order_fallback.domain.CallOrderFallbackInteractor$showScreenTriggerFlow$1", f = "CallOrderFallbackInteractor.kt", l = {46}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class CallOrderFallbackInteractor$showScreenTriggerFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CallOrderFallbackInteractor$showScreenTriggerFlow$1(c cVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = cVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        CallOrderFallbackInteractor$showScreenTriggerFlow$1 callOrderFallbackInteractor$showScreenTriggerFlow$1 = new CallOrderFallbackInteractor$showScreenTriggerFlow$1(this.this$0, (Continuation) obj3);
        callOrderFallbackInteractor$showScreenTriggerFlow$1.L$0 = (jj7) obj;
        callOrderFallbackInteractor$showScreenTriggerFlow$1.L$1 = (c2t) obj2;
        return callOrderFallbackInteractor$showScreenTriggerFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        jj7 jj7Var = (jj7) this.L$0;
        c2t c2tVar = (c2t) this.L$1;
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
        c cVar = this.this$0;
        this.L$0 = null;
        this.L$1 = null;
        this.label = 1;
        Object a = c.a(cVar, jj7Var, c2tVar, this);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
