package com.yandex.go.image.internal.coil.fetcher;

import defpackage.iz50;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oc7;
import defpackage.ojt0;
import defpackage.oz50;
import defpackage.qc7;
import defpackage.tls;
import defpackage.wls;
import defpackage.xt50;
import defpackage.yp6;
import defpackage.yt50;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lyt50;", "<anonymous>", "()Lyt50;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.image.internal.coil.fetcher.RemoteImageNetworkFetcher$fetch$calculation$1", f = "RemoteImageNetworkFetcher.kt", l = {HProv.PP_ENUM_LOG, 166}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class RemoteImageNetworkFetcher$fetch$calculation$1 extends SuspendLambda implements tls {
    final /* synthetic */ Ref$ObjectRef<oz50> $cacheResponse;
    final /* synthetic */ qc7 $cacheStrategy;
    final /* synthetic */ Ref$ObjectRef<oc7> $readResult;
    final /* synthetic */ String $url;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ e this$0;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Loz50;", "response", "Lxt50;", "<anonymous>", "(Loz50;)Lxt50;"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.image.internal.coil.fetcher.RemoteImageNetworkFetcher$fetch$calculation$1$1", f = "RemoteImageNetworkFetcher.kt", l = {167}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.image.internal.coil.fetcher.RemoteImageNetworkFetcher$fetch$calculation$1$1, reason: invalid class name */
    /* loaded from: classes11.dex */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        /* synthetic */ Object L$0;
        int label;

        public AnonymousClass1() {
            super(2, null);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(2, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((oz50) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            oz50 oz50Var = (oz50) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                ojt0 ojt0Var = oz50Var.e;
                if (ojt0Var == null) {
                    ny61.r("body == null");
                    return null;
                }
                this.L$0 = oz50Var;
                this.label = 1;
                obj = com.yandex.go.image.internal.coil.utils.a.b(ojt0Var, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
            }
            return new xt50((yp6) obj, oz50Var);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteImageNetworkFetcher$fetch$calculation$1(Ref$ObjectRef ref$ObjectRef, e eVar, String str, Ref$ObjectRef ref$ObjectRef2, qc7 qc7Var, Continuation continuation) {
        super(1, continuation);
        this.$readResult = ref$ObjectRef;
        this.this$0 = eVar;
        this.$url = str;
        this.$cacheResponse = ref$ObjectRef2;
        this.$cacheStrategy = qc7Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new RemoteImageNetworkFetcher$fetch$calculation$1(this.$readResult, this.this$0, this.$url, this.$cacheResponse, this.$cacheStrategy, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((RemoteImageNetworkFetcher$fetch$calculation$1) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0074, code lost:
    
        if (r12 == r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0076, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0056, code lost:
    
        if (r12 == r0) goto L24;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        iz50 f;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            oc7 oc7Var = this.$readResult.element;
            if (oc7Var == null || (f = oc7Var.a) == null) {
                f = this.this$0.f(this.$url);
            }
            iz50 iz50Var = f;
            e eVar = this.this$0;
            RemoteImageNetworkFetcher$fetch$calculation$1$fetchResult$1 remoteImageNetworkFetcher$fetch$calculation$1$fetchResult$1 = new RemoteImageNetworkFetcher$fetch$calculation$1$fetchResult$1(eVar, this.$cacheResponse, iz50Var, this.$cacheStrategy, null);
            this.L$0 = null;
            this.label = 1;
            obj = e.b(eVar, iz50Var, remoteImageNetworkFetcher$fetch$calculation$1$fetchResult$1, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return (yt50) obj;
            }
            kotlin.b.b(obj);
        }
        yt50 yt50Var = (yt50) obj;
        if (yt50Var != null) {
            return yt50Var;
        }
        e eVar2 = this.this$0;
        iz50 f2 = eVar2.f(this.$url);
        AnonymousClass1 anonymousClass1 = new AnonymousClass1();
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
        obj = e.b(eVar2, f2, anonymousClass1, this);
    }
}
