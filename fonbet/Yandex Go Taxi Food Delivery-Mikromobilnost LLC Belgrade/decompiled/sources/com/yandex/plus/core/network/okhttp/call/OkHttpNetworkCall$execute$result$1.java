package com.yandex.plus.core.network.okhttp.call;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.sq50;
import defpackage.zls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "Model", "Lsq50;", "context", "Lzy11;", "<unused var>", "Lsz50;", "<anonymous>", "(Lcom/yandex/plus/core/network/context/NetworkContext;V)Lcom/yandex/plus/core/network/call/NetworkResult;"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.core.network.okhttp.call.OkHttpNetworkCall$execute$result$1", f = "OkHttpNetworkCall.kt", l = {43}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class OkHttpNetworkCall$execute$result$1 extends SuspendLambda implements zls {
    final /* synthetic */ List<com.yandex.plus.core.network.okhttp.interceptor.a> $interceptors;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OkHttpNetworkCall$execute$result$1(c cVar, List list, Continuation continuation) {
        super(3, continuation);
        this.this$0 = cVar;
        this.$interceptors = list;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        OkHttpNetworkCall$execute$result$1 okHttpNetworkCall$execute$result$1 = new OkHttpNetworkCall$execute$result$1(this.this$0, this.$interceptors, (Continuation) obj3);
        okHttpNetworkCall$execute$result$1.L$0 = (sq50) obj;
        return okHttpNetworkCall$execute$result$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        sq50 sq50Var = (sq50) this.L$0;
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
        List<com.yandex.plus.core.network.okhttp.interceptor.a> list = this.$interceptors;
        this.L$0 = null;
        this.label = 1;
        Object a = c.a(cVar, sq50Var, list, this);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
