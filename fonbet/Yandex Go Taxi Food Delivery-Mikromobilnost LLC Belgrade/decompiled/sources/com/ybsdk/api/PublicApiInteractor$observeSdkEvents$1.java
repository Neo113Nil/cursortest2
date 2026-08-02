package com.ybsdk.api;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lfh51;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.api.PublicApiInteractor$observeSdkEvents$1", f = "PublicApiInteractor.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class PublicApiInteractor$observeSdkEvents$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PublicApiInteractor$observeSdkEvents$1(e eVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PublicApiInteractor$observeSdkEvents$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        PublicApiInteractor$observeSdkEvents$1 publicApiInteractor$observeSdkEvents$1 = (PublicApiInteractor$observeSdkEvents$1) create((vpr) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        publicApiInteractor$observeSdkEvents$1.invokeSuspend(zy11Var);
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
        this.this$0.f.o.a.a("public_events.subscription.started", null);
        return zy11.a;
    }
}
