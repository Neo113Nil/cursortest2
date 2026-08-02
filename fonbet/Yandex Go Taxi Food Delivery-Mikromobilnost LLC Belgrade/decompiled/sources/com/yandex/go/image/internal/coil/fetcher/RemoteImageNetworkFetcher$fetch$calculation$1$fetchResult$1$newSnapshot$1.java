package com.yandex.go.image.internal.coil.fetcher;

import defpackage.iz50;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oz50;
import defpackage.qc7;
import defpackage.qci0;
import defpackage.sci0;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lqci0;", "<anonymous>", "()Lqci0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.image.internal.coil.fetcher.RemoteImageNetworkFetcher$fetch$calculation$1$fetchResult$1$newSnapshot$1", f = "RemoteImageNetworkFetcher.kt", l = {141}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class RemoteImageNetworkFetcher$fetch$calculation$1$fetchResult$1$newSnapshot$1 extends SuspendLambda implements tls {
    final /* synthetic */ Ref$ObjectRef<oz50> $cacheResponse;
    final /* synthetic */ qc7 $cacheStrategy;
    final /* synthetic */ iz50 $networkRequest;
    final /* synthetic */ oz50 $response;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteImageNetworkFetcher$fetch$calculation$1$fetchResult$1$newSnapshot$1(e eVar, Ref$ObjectRef ref$ObjectRef, iz50 iz50Var, oz50 oz50Var, qc7 qc7Var, Continuation continuation) {
        super(1, continuation);
        this.this$0 = eVar;
        this.$cacheResponse = ref$ObjectRef;
        this.$networkRequest = iz50Var;
        this.$response = oz50Var;
        this.$cacheStrategy = qc7Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new RemoteImageNetworkFetcher$fetch$calculation$1$fetchResult$1$newSnapshot$1(this.this$0, this.$cacheResponse, this.$networkRequest, this.$response, this.$cacheStrategy, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((RemoteImageNetworkFetcher$fetch$calculation$1$fetchResult$1$newSnapshot$1) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        sci0 sci0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        qci0 qci0Var = null;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        e eVar = this.this$0;
        if (eVar.b.g.getReadEnabled() && (sci0Var = (sci0) eVar.d.getValue()) != null) {
            eVar.b.getClass();
            qci0Var = sci0Var.a(eVar.a.getKey());
        }
        oz50 oz50Var = this.$cacheResponse.element;
        iz50 iz50Var = this.$networkRequest;
        oz50 oz50Var2 = this.$response;
        qc7 qc7Var = this.$cacheStrategy;
        this.label = 1;
        Object c = e.c(eVar, qci0Var, oz50Var, iz50Var, oz50Var2, qc7Var, this);
        return c == coroutineSingletons ? coroutineSingletons : c;
    }
}
