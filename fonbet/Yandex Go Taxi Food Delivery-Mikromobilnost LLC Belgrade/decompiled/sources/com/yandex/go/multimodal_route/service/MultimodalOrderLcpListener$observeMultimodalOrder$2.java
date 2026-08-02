package com.yandex.go.multimodal_route.service;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Ll8x;", "<anonymous>", "(Ltse;)Ll8x;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.multimodal_route.service.MultimodalOrderLcpListener$observeMultimodalOrder$2", f = "MultimodalOrderLcpListener.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
final class MultimodalOrderLcpListener$observeMultimodalOrder$2 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultimodalOrderLcpListener$observeMultimodalOrder$2(c cVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MultimodalOrderLcpListener$observeMultimodalOrder$2 multimodalOrderLcpListener$observeMultimodalOrder$2 = new MultimodalOrderLcpListener$observeMultimodalOrder$2(this.this$0, continuation);
        multimodalOrderLcpListener$observeMultimodalOrder$2.L$0 = obj;
        return multimodalOrderLcpListener$observeMultimodalOrder$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MultimodalOrderLcpListener$observeMultimodalOrder$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        tje.N(tseVar, null, null, new MultimodalOrderLcpListener$observeMultimodalOrder$2$invokeSuspend$$inlined$collectLatestIn$1(e.t(new b(this.this$0.d.a(false))), null, this.this$0), 3);
        return tje.N(tseVar, null, null, new MultimodalOrderLcpListener$observeMultimodalOrder$2$invokeSuspend$$inlined$collectLatestIn$2(e.c(this.this$0.f.a), null, this.this$0), 3);
    }
}
