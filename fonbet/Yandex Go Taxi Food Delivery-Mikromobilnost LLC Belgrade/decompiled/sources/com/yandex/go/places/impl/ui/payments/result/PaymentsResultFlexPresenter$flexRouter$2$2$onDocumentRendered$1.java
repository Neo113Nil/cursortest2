package com.yandex.go.places.impl.ui.payments.result;

import defpackage.c9c0;
import defpackage.hoa0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.places.impl.ui.payments.result.PaymentsResultFlexPresenter$flexRouter$2$2$onDocumentRendered$1", f = "PaymentsResultFlexPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class PaymentsResultFlexPresenter$flexRouter$2$2$onDocumentRendered$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ hoa0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentsResultFlexPresenter$flexRouter$2$2$onDocumentRendered$1(hoa0 hoa0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = hoa0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PaymentsResultFlexPresenter$flexRouter$2$2$onDocumentRendered$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        PaymentsResultFlexPresenter$flexRouter$2$2$onDocumentRendered$1 paymentsResultFlexPresenter$flexRouter$2$2$onDocumentRendered$1 = (PaymentsResultFlexPresenter$flexRouter$2$2$onDocumentRendered$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        paymentsResultFlexPresenter$flexRouter$2$2$onDocumentRendered$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        hoa0 hoa0Var = this.this$0;
        if (!hoa0Var.E) {
            hoa0Var.E = true;
            ((c9c0) hoa0Var.H.getValue()).b0(true);
        }
        return zy11.a;
    }
}
