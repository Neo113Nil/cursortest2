package com.yandex.go.litert.service;

import defpackage.b8n;
import defpackage.c8n;
import defpackage.d8n;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.y7n;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ld8n;", "Lcom/yandex/go/litert/contract/LiteRtDynamicApi;", "it", "", "<anonymous>", "(Ld8n;)Z"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.litert.service.LiteRtServiceImpl$loadReadyApi$2$finalState$1", f = "LiteRtServiceImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class LiteRtServiceImpl$loadReadyApi$2$finalState$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        LiteRtServiceImpl$loadReadyApi$2$finalState$1 liteRtServiceImpl$loadReadyApi$2$finalState$1 = new LiteRtServiceImpl$loadReadyApi$2$finalState$1(2, continuation);
        liteRtServiceImpl$loadReadyApi$2$finalState$1.L$0 = obj;
        return liteRtServiceImpl$loadReadyApi$2$finalState$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((LiteRtServiceImpl$loadReadyApi$2$finalState$1) create((d8n) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        d8n d8nVar = (d8n) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            b.b(obj);
            return Boolean.valueOf((d8nVar instanceof b8n) || (d8nVar instanceof y7n) || (d8nVar instanceof c8n));
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
