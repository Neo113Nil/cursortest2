package com.yandex.messaging.internal.net;

import defpackage.e1k;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.suspend.SuspendDisposableKt$disposableCoroutineWrapper$2$1$1$1", f = "SuspendDisposable.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
public final class AuthorizedApiCallsExtensionsKt$getBuckets$$inlined$makeCall$1$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ e1k $disposable;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthorizedApiCallsExtensionsKt$getBuckets$$inlined$makeCall$1$1$1(e1k e1kVar, Continuation continuation) {
        super(2, continuation);
        this.$disposable = e1kVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AuthorizedApiCallsExtensionsKt$getBuckets$$inlined$makeCall$1$1$1(this.$disposable, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        AuthorizedApiCallsExtensionsKt$getBuckets$$inlined$makeCall$1$1$1 authorizedApiCallsExtensionsKt$getBuckets$$inlined$makeCall$1$1$1 = (AuthorizedApiCallsExtensionsKt$getBuckets$$inlined$makeCall$1$1$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        authorizedApiCallsExtensionsKt$getBuckets$$inlined$makeCall$1$1$1.invokeSuspend(zy11Var);
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
        e1k e1kVar = this.$disposable;
        if (e1kVar != null) {
            e1kVar.close();
        }
        return zy11.a;
    }
}
