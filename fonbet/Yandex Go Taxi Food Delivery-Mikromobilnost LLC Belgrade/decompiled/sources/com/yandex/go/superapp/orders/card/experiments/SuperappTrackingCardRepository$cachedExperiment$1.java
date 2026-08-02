package com.yandex.go.superapp.orders.card.experiments;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lcom/yandex/go/superapp/orders/card/experiments/SuperappTrackingCardExperiment;"}, k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.superapp.orders.card.experiments.SuperappTrackingCardRepository$cachedExperiment$1", f = "SuperappTrackingCardRepository.kt", l = {23}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
final class SuperappTrackingCardRepository$cachedExperiment$1 extends SuspendLambda implements tls {
    int label;
    final /* synthetic */ y this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperappTrackingCardRepository$cachedExperiment$1(y yVar, Continuation continuation) {
        super(1, continuation);
        this.this$0 = yVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new SuperappTrackingCardRepository$cachedExperiment$1(this.this$0, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((SuperappTrackingCardRepository$cachedExperiment$1) create((Continuation) obj)).invokeSuspend(zy11.a);
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
        y yVar = this.this$0;
        this.label = 1;
        Object b = yVar.a.b(this);
        return b == coroutineSingletons ? coroutineSingletons : b;
    }
}
