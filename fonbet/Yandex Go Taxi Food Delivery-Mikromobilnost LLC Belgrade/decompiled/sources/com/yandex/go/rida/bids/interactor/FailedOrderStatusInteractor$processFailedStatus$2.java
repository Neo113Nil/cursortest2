package com.yandex.go.rida.bids.interactor;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.xq5;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.rida.bids.interactor.FailedOrderStatusInteractor$processFailedStatus$2", f = "FailedOrderStatusInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class FailedOrderStatusInteractor$processFailedStatus$2 extends SuspendLambda implements tls {
    final /* synthetic */ xq5 $navigator;
    int label;
    final /* synthetic */ s this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FailedOrderStatusInteractor$processFailedStatus$2(s sVar, xq5 xq5Var, Continuation continuation) {
        super(1, continuation);
        this.this$0 = sVar;
        this.$navigator = xq5Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new FailedOrderStatusInteractor$processFailedStatus$2(this.this$0, this.$navigator, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        FailedOrderStatusInteractor$processFailedStatus$2 failedOrderStatusInteractor$processFailedStatus$2 = (FailedOrderStatusInteractor$processFailedStatus$2) create((Continuation) obj);
        zy11 zy11Var = zy11.a;
        failedOrderStatusInteractor$processFailedStatus$2.invokeSuspend(zy11Var);
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
        this.this$0.b(this.$navigator);
        return zy11.a;
    }
}
