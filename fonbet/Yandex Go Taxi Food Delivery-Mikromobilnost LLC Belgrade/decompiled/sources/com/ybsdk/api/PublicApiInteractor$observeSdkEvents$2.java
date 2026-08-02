package com.ybsdk.api;

import defpackage.em3;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lvpr;", "Lfh51;", "", "error", "Lzy11;", "<anonymous>", "(Lvpr;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.api.PublicApiInteractor$observeSdkEvents$2", f = "PublicApiInteractor.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class PublicApiInteractor$observeSdkEvents$2 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PublicApiInteractor$observeSdkEvents$2(e eVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = eVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        PublicApiInteractor$observeSdkEvents$2 publicApiInteractor$observeSdkEvents$2 = new PublicApiInteractor$observeSdkEvents$2(this.this$0, (Continuation) obj3);
        publicApiInteractor$observeSdkEvents$2.L$0 = (Throwable) obj2;
        zy11 zy11Var = zy11.a;
        publicApiInteractor$observeSdkEvents$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        Throwable th = (Throwable) this.L$0;
        em3 em3Var = this.this$0.f.o;
        String message = th != null ? th.getMessage() : null;
        LinkedHashMap linkedHashMap = new LinkedHashMap(1);
        if (message != null) {
            linkedHashMap.put("error", message);
        }
        em3Var.a.a("public_events.subscription.finished", linkedHashMap);
        return zy11.a;
    }
}
