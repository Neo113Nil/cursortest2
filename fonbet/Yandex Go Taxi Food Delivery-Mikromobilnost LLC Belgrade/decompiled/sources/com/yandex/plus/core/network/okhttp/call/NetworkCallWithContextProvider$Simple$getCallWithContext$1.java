package com.yandex.plus.core.network.okhttp.call;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00028\u0000H\n"}, d2 = {"", "Model", "Lsq50;", "<unused var>", "model", "<anonymous>"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.core.network.okhttp.call.NetworkCallWithContextProvider$Simple$getCallWithContext$1", f = "NetworkCallWithContextProvider.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class NetworkCallWithContextProvider$Simple$getCallWithContext$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        NetworkCallWithContextProvider$Simple$getCallWithContext$1 networkCallWithContextProvider$Simple$getCallWithContext$1 = new NetworkCallWithContextProvider$Simple$getCallWithContext$1(3, (Continuation) obj3);
        networkCallWithContextProvider$Simple$getCallWithContext$1.L$0 = obj2;
        return networkCallWithContextProvider$Simple$getCallWithContext$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2 = this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return obj2;
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
