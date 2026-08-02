package com.yandex.go.multimodal_route.service;

import defpackage.dyn0;
import defpackage.evu0;
import defpackage.eyn0;
import defpackage.gyn0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.multimodal_route.service.MultimodalOrderLcpListener$observeMultimodalOrder$2$invokeSuspend$$inlined$collectLatestIn$2", f = "MultimodalOrderLcpListener.kt", l = {54}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
public final class MultimodalOrderLcpListener$observeMultimodalOrder$2$invokeSuspend$$inlined$collectLatestIn$2 extends SuspendLambda implements wls {
    final /* synthetic */ tpr $this_collectLatestIn;
    int label;
    final /* synthetic */ c this$0;

    @Metadata(d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n"}, d2 = {"T", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.multimodal_route.service.MultimodalOrderLcpListener$observeMultimodalOrder$2$invokeSuspend$$inlined$collectLatestIn$2$1", f = "MultimodalOrderLcpListener.kt", l = {58, 59}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.multimodal_route.service.MultimodalOrderLcpListener$observeMultimodalOrder$2$invokeSuspend$$inlined$collectLatestIn$2$1, reason: invalid class name */
    public final class AnonymousClass1 extends SuspendLambda implements wls {
        /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        final /* synthetic */ c this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(c cVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create(obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0076, code lost:
        
            if (r7.a(r0, r6) == r1) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0078, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0061, code lost:
        
            if (r7.a(r0, r6) == r1) goto L17;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            String Q;
            Object obj2 = this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                gyn0 gyn0Var = (gyn0) obj2;
                if (!(gyn0Var instanceof dyn0)) {
                    if (gyn0Var instanceof eyn0) {
                        this.this$0.i.a = (eyn0) gyn0Var;
                    }
                    return zy11.a;
                }
                Q = evu0.Q("mm_route_", ((dyn0) gyn0Var).a());
                com.yandex.go.multimodal_route.repositories.b bVar = this.this$0.h;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = Q;
                this.label = 1;
            } else {
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                Q = (String) this.L$3;
                kotlin.b.b(obj);
                ((Result) obj).getClass();
                com.yandex.go.multimodal_route.interactors.a aVar = this.this$0.g;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.label = 2;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultimodalOrderLcpListener$observeMultimodalOrder$2$invokeSuspend$$inlined$collectLatestIn$2(tpr tprVar, Continuation continuation, c cVar) {
        super(2, continuation);
        this.$this_collectLatestIn = tprVar;
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MultimodalOrderLcpListener$observeMultimodalOrder$2$invokeSuspend$$inlined$collectLatestIn$2(this.$this_collectLatestIn, continuation, this.this$0);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MultimodalOrderLcpListener$observeMultimodalOrder$2$invokeSuspend$$inlined$collectLatestIn$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            tpr tprVar = this.$this_collectLatestIn;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (e.k(tprVar, anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
