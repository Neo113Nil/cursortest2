package com.yandex.go.payments.paymentlist.details;

import defpackage.bjm0;
import defpackage.fl8;
import defpackage.jst;
import defpackage.lea0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.q4a0;
import defpackage.tse;
import defpackage.wls;
import defpackage.xw91;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.paymentlist.details.PaymentMethodDetailsPresenter$createDetailsView$1", f = "PaymentMethodDetailsPresenter.kt", l = {37, 38}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class PaymentMethodDetailsPresenter$createDetailsView$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentMethodDetailsPresenter$createDetailsView$1(c cVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PaymentMethodDetailsPresenter$createDetailsView$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PaymentMethodDetailsPresenter$createDetailsView$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
    
        if (r7.Kg(r1, r6) == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0062, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0060, code lost:
    
        if (r7.Kg(r1, r6) == r0) goto L19;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            c cVar = this.this$0;
            lea0 lea0Var = cVar.A;
            xw91 xw91Var = cVar.B;
            if (lea0Var instanceof fl8) {
                fl8 fl8Var = (fl8) lea0Var;
                this.label = 1;
                ((q4a0) cVar.Dg()).f9(fl8Var);
                ((q4a0) cVar.Dg()).C6(fl8Var, xw91Var);
            } else if (lea0Var instanceof bjm0) {
                bjm0 bjm0Var = (bjm0) lea0Var;
                this.label = 2;
                ((q4a0) cVar.Dg()).j7(bjm0Var);
                ((q4a0) cVar.Dg()).Zf(bjm0Var, xw91Var);
            } else {
                jst.e.c("Unsupported payment type " + lea0Var.c());
            }
        } else {
            if (i != 1 && i != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
