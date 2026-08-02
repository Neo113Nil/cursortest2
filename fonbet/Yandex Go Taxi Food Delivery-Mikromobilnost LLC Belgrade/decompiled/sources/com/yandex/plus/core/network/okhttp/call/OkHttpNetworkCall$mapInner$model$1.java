package com.yandex.plus.core.network.okhttp.call;

import defpackage.jt50;
import defpackage.kw60;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sq50;
import defpackage.wls;
import defpackage.zls;
import defpackage.zs50;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00028\u0001H\n"}, d2 = {"", "Model", "Dto", "Lsq50;", "context", "dto", "Lsz50;", "<anonymous>"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.core.network.okhttp.call.OkHttpNetworkCall$mapInner$model$1", f = "OkHttpNetworkCall.kt", l = {103}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class OkHttpNetworkCall$mapInner$model$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ c this$0;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* renamed from: com.yandex.plus.core.network.okhttp.call.OkHttpNetworkCall$mapInner$model$1$1, reason: invalid class name */
    final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements wls {
        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            jt50 jt50Var = (jt50) obj2;
            return ((kw60) ((zs50) this.receiver)).a(jt50Var, (Throwable) obj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OkHttpNetworkCall$mapInner$model$1(c cVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = cVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        OkHttpNetworkCall$mapInner$model$1 okHttpNetworkCall$mapInner$model$1 = new OkHttpNetworkCall$mapInner$model$1(this.this$0, (Continuation) obj3);
        okHttpNetworkCall$mapInner$model$1.L$0 = (sq50) obj;
        okHttpNetworkCall$mapInner$model$1.L$1 = obj2;
        return okHttpNetworkCall$mapInner$model$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        sq50 sq50Var = (sq50) this.L$0;
        Object obj2 = this.L$1;
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
        com.yandex.plus.core.network.client.a aVar = this.this$0.c;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(2, this.this$0.f, zs50.class, "adapt", "adapt(Ljava/lang/Throwable;Lcom/yandex/plus/core/network/error/NetworkException$ErrorType;)Lcom/yandex/plus/core/network/error/NetworkException;", 0);
        this.L$0 = null;
        this.L$1 = null;
        this.label = 1;
        Object a = aVar.a(sq50Var, obj2, anonymousClass1, this);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
