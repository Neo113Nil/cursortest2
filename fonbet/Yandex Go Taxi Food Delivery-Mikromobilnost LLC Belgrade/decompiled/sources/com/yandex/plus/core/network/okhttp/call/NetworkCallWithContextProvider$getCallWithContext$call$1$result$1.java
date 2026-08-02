package com.yandex.plus.core.network.okhttp.call;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.sq50;
import defpackage.wls;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n"}, d2 = {"", "Dto", "Lsq50;", "it", "<anonymous>"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.core.network.okhttp.call.NetworkCallWithContextProvider$getCallWithContext$call$1$result$1", f = "NetworkCallWithContextProvider.kt", l = {22}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class NetworkCallWithContextProvider$getCallWithContext$call$1$result$1 extends SuspendLambda implements wls {
    final /* synthetic */ sq50 $context;
    final /* synthetic */ zls $get;
    final /* synthetic */ Object $source;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkCallWithContextProvider$getCallWithContext$call$1$result$1(zls zlsVar, sq50 sq50Var, Object obj, Continuation continuation) {
        super(2, continuation);
        this.$get = zlsVar;
        this.$context = sq50Var;
        this.$source = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new NetworkCallWithContextProvider$getCallWithContext$call$1$result$1(this.$get, this.$context, this.$source, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((NetworkCallWithContextProvider$getCallWithContext$call$1$result$1) create((sq50) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
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
        zls zlsVar = this.$get;
        sq50 sq50Var = this.$context;
        Object obj2 = this.$source;
        this.label = 1;
        Object invoke = zlsVar.invoke(sq50Var, obj2, this);
        return invoke == coroutineSingletons ? coroutineSingletons : invoke;
    }
}
