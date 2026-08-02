package com.yandex.payment.divkit.usecases;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltmk;", "<anonymous>", "()Ltmk;"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.payment.divkit.usecases.FetchExitScreenUseCaseImpl$fetch$2", f = "FetchExitScreenUseCase.kt", l = {42}, m = "invokeSuspend", v = 1)
/* loaded from: classes2.dex */
final class FetchExitScreenUseCaseImpl$fetch$2 extends SuspendLambda implements tls {
    final /* synthetic */ boolean $isPaymentContext;
    int label;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FetchExitScreenUseCaseImpl$fetch$2(g gVar, boolean z, Continuation continuation) {
        super(1, continuation);
        this.this$0 = gVar;
        this.$isPaymentContext = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new FetchExitScreenUseCaseImpl$fetch$2(this.this$0, this.$isPaymentContext, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((FetchExitScreenUseCaseImpl$fetch$2) create((Continuation) obj)).invokeSuspend(zy11.a);
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
        g gVar = this.this$0;
        boolean z = this.$isPaymentContext;
        this.label = 1;
        Object a = g.a(gVar, z, this);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
