package com.ybsdk.common;

import defpackage.i5z0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lzy11;", "<anonymous>", "(J)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.common.SdkStateDispatcher$authorizeAndSendState$1", f = "SdkStateDispatcher.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class SdkStateDispatcher$authorizeAndSendState$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SdkStateDispatcher$authorizeAndSendState$1 sdkStateDispatcher$authorizeAndSendState$1 = new SdkStateDispatcher$authorizeAndSendState$1(2, continuation);
        sdkStateDispatcher$authorizeAndSendState$1.L$0 = obj;
        return sdkStateDispatcher$authorizeAndSendState$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        SdkStateDispatcher$authorizeAndSendState$1 sdkStateDispatcher$authorizeAndSendState$1 = (SdkStateDispatcher$authorizeAndSendState$1) create((Long) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        sdkStateDispatcher$authorizeAndSendState$1.invokeSuspend(zy11Var);
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
        Long l = (Long) this.L$0;
        i5z0.a.a("SdkStateDispatcher: uid received: " + l, new Object[0]);
        return zy11.a;
    }
}
