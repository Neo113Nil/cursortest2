package com.yandex.payment.divkit.usecases;

import defpackage.bgc;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oy80;
import defpackage.oy90;
import defpackage.pgk0;
import defpackage.tf4;
import defpackage.wls;
import defpackage.y6f0;
import defpackage.yv90;
import defpackage.zbq0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ly6f0;", "Lqyj0;", "Luv90;", "Lzy11;", "<anonymous>", "(Ly6f0;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.payment.divkit.usecases.FetchPaymentDetailsUseCaseImpl$fetch$1", f = "FetchPaymentDetailsUseCase.kt", l = {32}, m = "invokeSuspend", v = 1)
/* loaded from: classes2.dex */
final class FetchPaymentDetailsUseCaseImpl$fetch$1 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ i this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FetchPaymentDetailsUseCaseImpl$fetch$1(i iVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        FetchPaymentDetailsUseCaseImpl$fetch$1 fetchPaymentDetailsUseCaseImpl$fetch$1 = new FetchPaymentDetailsUseCaseImpl$fetch$1(this.this$0, continuation);
        fetchPaymentDetailsUseCaseImpl$fetch$1.L$0 = obj;
        return fetchPaymentDetailsUseCaseImpl$fetch$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((FetchPaymentDetailsUseCaseImpl$fetch$1) create((y6f0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        y6f0 y6f0Var = (y6f0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            pgk0 pgk0Var = this.this$0.a;
            tf4 tf4Var = new tf4(y6f0Var, 2);
            oy90 H = ((zbq0) pgk0Var.b).H();
            ((yv90) H.d).i(H.b, H.c, new oy80(5, H, tf4Var));
            bgc bgcVar = new bgc(12);
            this.L$0 = null;
            this.label = 1;
            if (kotlinx.coroutines.channels.b.a(y6f0Var, bgcVar, this) == coroutineSingletons) {
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
