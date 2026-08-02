package com.yandex.go.multimodal_route.service;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.multimodal_route.service.MultimodalOrderLcpListener$observeMultimodalOrder$2$invokeSuspend$$inlined$collectLatestIn$1", f = "MultimodalOrderLcpListener.kt", l = {54}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
public final class MultimodalOrderLcpListener$observeMultimodalOrder$2$invokeSuspend$$inlined$collectLatestIn$1 extends SuspendLambda implements wls {
    final /* synthetic */ tpr $this_collectLatestIn;
    int label;
    final /* synthetic */ c this$0;

    @Metadata(d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n"}, d2 = {"T", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.multimodal_route.service.MultimodalOrderLcpListener$observeMultimodalOrder$2$invokeSuspend$$inlined$collectLatestIn$1$1", f = "MultimodalOrderLcpListener.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.SODA_DE_DE_VALUE}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.multimodal_route.service.MultimodalOrderLcpListener$observeMultimodalOrder$2$invokeSuspend$$inlined$collectLatestIn$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends SuspendLambda implements wls {
        /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
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

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object obj2 = this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                com.yandex.go.multimodal_route.store.a aVar = this.this$0.e;
                List J0 = kotlin.collections.a.J0((Set) obj2);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 1;
                if (aVar.a(J0, this) == coroutineSingletons) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultimodalOrderLcpListener$observeMultimodalOrder$2$invokeSuspend$$inlined$collectLatestIn$1(tpr tprVar, Continuation continuation, c cVar) {
        super(2, continuation);
        this.$this_collectLatestIn = tprVar;
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MultimodalOrderLcpListener$observeMultimodalOrder$2$invokeSuspend$$inlined$collectLatestIn$1(this.$this_collectLatestIn, continuation, this.this$0);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MultimodalOrderLcpListener$observeMultimodalOrder$2$invokeSuspend$$inlined$collectLatestIn$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
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
