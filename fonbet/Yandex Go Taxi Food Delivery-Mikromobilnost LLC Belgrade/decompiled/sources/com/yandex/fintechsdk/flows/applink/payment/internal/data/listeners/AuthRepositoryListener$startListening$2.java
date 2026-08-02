package com.yandex.fintechsdk.flows.applink.payment.internal.data.listeners;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.xk3;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lxk3;", "authState", "", "merchantId", "Lkotlin/Pair;", "<anonymous>", "(Lxk3;Ljava/lang/String;)Lkotlin/Pair;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.fintechsdk.flows.applink.payment.internal.data.listeners.AuthRepositoryListener$startListening$2", f = "AuthRepositoryListener.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class AuthRepositoryListener$startListening$2 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        AuthRepositoryListener$startListening$2 authRepositoryListener$startListening$2 = new AuthRepositoryListener$startListening$2(3, (Continuation) obj3);
        authRepositoryListener$startListening$2.L$0 = (xk3) obj;
        authRepositoryListener$startListening$2.L$1 = (String) obj2;
        return authRepositoryListener$startListening$2.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return new Pair((xk3) this.L$0, (String) this.L$1);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
