package com.yandex.plus.core.network.okhttp.call;

import defpackage.hw60;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sq50;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"T", "Lhw60;", "callContext", "<anonymous>"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.core.network.okhttp.call.OkHttpNetworkCall$CallFactoryWithNetworkContext$withContext$1", f = "OkHttpNetworkCall.kt", l = {151}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class OkHttpNetworkCall$CallFactoryWithNetworkContext$withContext$1 extends SuspendLambda implements wls {
    final /* synthetic */ wls $block;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OkHttpNetworkCall$CallFactoryWithNetworkContext$withContext$1(wls wlsVar, Continuation continuation) {
        super(2, continuation);
        this.$block = wlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        OkHttpNetworkCall$CallFactoryWithNetworkContext$withContext$1 okHttpNetworkCall$CallFactoryWithNetworkContext$withContext$1 = new OkHttpNetworkCall$CallFactoryWithNetworkContext$withContext$1(this.$block, continuation);
        okHttpNetworkCall$CallFactoryWithNetworkContext$withContext$1.L$0 = obj;
        return okHttpNetworkCall$CallFactoryWithNetworkContext$withContext$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OkHttpNetworkCall$CallFactoryWithNetworkContext$withContext$1) create((hw60) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        hw60 hw60Var = (hw60) this.L$0;
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
        wls wlsVar = this.$block;
        sq50 sq50Var = hw60Var.a;
        this.L$0 = null;
        this.label = 1;
        Object invoke = wlsVar.invoke(sq50Var, this);
        return invoke == coroutineSingletons ? coroutineSingletons : invoke;
    }
}
