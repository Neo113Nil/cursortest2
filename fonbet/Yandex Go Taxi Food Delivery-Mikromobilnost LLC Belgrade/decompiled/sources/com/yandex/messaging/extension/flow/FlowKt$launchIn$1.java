package com.yandex.messaging.extension.flow;

import defpackage.e9e;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n"}, d2 = {"T", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.extension.flow.FlowKt$launchIn$1", f = "Flow.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class FlowKt$launchIn$1 extends SuspendLambda implements wls {
    final /* synthetic */ e9e $consumer;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt$launchIn$1(e9e e9eVar, Continuation continuation) {
        super(2, continuation);
        this.$consumer = e9eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        FlowKt$launchIn$1 flowKt$launchIn$1 = new FlowKt$launchIn$1(this.$consumer, continuation);
        flowKt$launchIn$1.L$0 = obj;
        return flowKt$launchIn$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        FlowKt$launchIn$1 flowKt$launchIn$1 = (FlowKt$launchIn$1) create(obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        flowKt$launchIn$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        this.$consumer.accept(this.L$0);
        return zy11.a;
    }
}
