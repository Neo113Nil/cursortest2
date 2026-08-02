package com.yandex.go.image.internal.coil.fetcher;

import defpackage.iz50;
import defpackage.kbv;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.ojt0;
import defpackage.oz50;
import defpackage.qc7;
import defpackage.qci0;
import defpackage.wls;
import defpackage.wt50;
import defpackage.xt50;
import defpackage.yp6;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Loz50;", "response", "Lyt50;", "<anonymous>", "(Loz50;)Lyt50;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.image.internal.coil.fetcher.RemoteImageNetworkFetcher$fetch$calculation$1$fetchResult$1", f = "RemoteImageNetworkFetcher.kt", l = {139, 152}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class RemoteImageNetworkFetcher$fetch$calculation$1$fetchResult$1 extends SuspendLambda implements wls {
    final /* synthetic */ Ref$ObjectRef<oz50> $cacheResponse;
    final /* synthetic */ qc7 $cacheStrategy;
    final /* synthetic */ iz50 $networkRequest;
    /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteImageNetworkFetcher$fetch$calculation$1$fetchResult$1(e eVar, Ref$ObjectRef ref$ObjectRef, iz50 iz50Var, qc7 qc7Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
        this.$cacheResponse = ref$ObjectRef;
        this.$networkRequest = iz50Var;
        this.$cacheStrategy = qc7Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RemoteImageNetworkFetcher$fetch$calculation$1$fetchResult$1 remoteImageNetworkFetcher$fetch$calculation$1$fetchResult$1 = new RemoteImageNetworkFetcher$fetch$calculation$1$fetchResult$1(this.this$0, this.$cacheResponse, this.$networkRequest, this.$cacheStrategy, continuation);
        remoteImageNetworkFetcher$fetch$calculation$1$fetchResult$1.L$0 = obj;
        return remoteImageNetworkFetcher$fetch$calculation$1$fetchResult$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RemoteImageNetworkFetcher$fetch$calculation$1$fetchResult$1) create((oz50) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x006c, code lost:
    
        if (r13 == r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006e, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0041, code lost:
    
        if (r13 == r0) goto L21;
     */
    /* JADX WARN: Type inference failed for: r1v3, types: [T, oz50] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        oz50 oz50Var = (oz50) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            e eVar = this.this$0;
            c cVar = eVar.h;
            kbv kbvVar = eVar.a;
            RemoteImageNetworkFetcher$fetch$calculation$1$fetchResult$1$newSnapshot$1 remoteImageNetworkFetcher$fetch$calculation$1$fetchResult$1$newSnapshot$1 = new RemoteImageNetworkFetcher$fetch$calculation$1$fetchResult$1$newSnapshot$1(eVar, this.$cacheResponse, this.$networkRequest, oz50Var, this.$cacheStrategy, null);
            this.L$0 = oz50Var;
            this.label = 1;
            obj = cVar.e(kbvVar, remoteImageNetworkFetcher$fetch$calculation$1$fetchResult$1$newSnapshot$1, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                yp6 yp6Var = (yp6) obj;
                if (yp6Var.b > 0) {
                    return new xt50(yp6Var, oz50Var);
                }
                return null;
            }
            kotlin.b.b(obj);
        }
        qci0 qci0Var = (qci0) obj;
        if (qci0Var != null) {
            this.$cacheResponse.element = this.this$0.h(qci0Var);
            return new wt50(qci0Var, this.$cacheResponse.element);
        }
        ojt0 ojt0Var = oz50Var.e;
        if (ojt0Var == null) {
            ny61.r("body == null");
            return null;
        }
        this.L$0 = oz50Var;
        this.L$1 = null;
        this.label = 2;
        obj = com.yandex.go.image.internal.coil.utils.a.b(ojt0Var, this);
    }
}
