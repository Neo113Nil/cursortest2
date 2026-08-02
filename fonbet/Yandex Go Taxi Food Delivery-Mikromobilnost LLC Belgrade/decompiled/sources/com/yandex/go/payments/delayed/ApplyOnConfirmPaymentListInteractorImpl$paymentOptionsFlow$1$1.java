package com.yandex.go.payments.delayed;

import defpackage.d33;
import defpackage.e33;
import defpackage.edi0;
import defpackage.jfa0;
import defpackage.jl40;
import defpackage.lea0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rhq0;
import defpackage.vez0;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ljfa0;", "paymentOptionsForPmlScreen", "Le33;", "paymentChanges", "<anonymous>", "(Ljfa0;Le33;)Ljfa0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.delayed.ApplyOnConfirmPaymentListInteractorImpl$paymentOptionsFlow$1$1", f = "ApplyOnConfirmPaymentListInteractor.kt", l = {44}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ApplyOnConfirmPaymentListInteractorImpl$paymentOptionsFlow$1$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApplyOnConfirmPaymentListInteractorImpl$paymentOptionsFlow$1$1(a aVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = aVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ApplyOnConfirmPaymentListInteractorImpl$paymentOptionsFlow$1$1 applyOnConfirmPaymentListInteractorImpl$paymentOptionsFlow$1$1 = new ApplyOnConfirmPaymentListInteractorImpl$paymentOptionsFlow$1$1(this.this$0, (Continuation) obj3);
        applyOnConfirmPaymentListInteractorImpl$paymentOptionsFlow$1$1.L$0 = (jfa0) obj;
        applyOnConfirmPaymentListInteractorImpl$paymentOptionsFlow$1$1.L$1 = (e33) obj2;
        return applyOnConfirmPaymentListInteractorImpl$paymentOptionsFlow$1$1.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0060, code lost:
    
        if (r5 != r0.a) goto L34;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        edi0 b;
        rhq0 rhq0Var;
        edi0 edi0Var;
        lea0 lea0Var;
        edi0 edi0Var2;
        jfa0 jfa0Var = (jfa0) this.L$0;
        e33 e33Var = (e33) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            a aVar = this.this$0;
            this.L$0 = null;
            this.L$1 = e33Var;
            this.label = 1;
            obj = a.a(aVar, jfa0Var, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        jfa0 jfa0Var2 = (jfa0) obj;
        this.this$0.getClass();
        if (e33Var != null) {
            lea0 lea0Var2 = e33Var.a;
            d33 d33Var = e33Var.b;
            if (lea0Var2 != null || d33Var != null) {
                rhq0 rhq0Var2 = jfa0Var2.b;
                if (rhq0Var2 == null || (edi0Var2 = rhq0Var2.a) == null || vez0.O(edi0Var2.a, lea0Var2)) {
                    boolean z = (rhq0Var2 != null ? rhq0Var2.b : null) != null;
                    if (d33Var != null) {
                    }
                }
                rhq0 rhq0Var3 = jfa0Var2.b;
                if (rhq0Var3 != null) {
                    Boolean valueOf = d33Var != null ? Boolean.valueOf(d33Var.a) : null;
                    if (!jl40.l(valueOf, Boolean.TRUE)) {
                        lea0Var = (jl40.l(valueOf, Boolean.FALSE) || (edi0Var = rhq0Var3.b) == null) ? null : edi0Var.a;
                    } else {
                        if (d33Var == null) {
                            ny61.g("Required value was null.");
                            return null;
                        }
                        lea0Var = d33Var.b;
                    }
                    edi0 b2 = a.b(jfa0Var2, lea0Var2);
                    edi0 b3 = a.b(jfa0Var2, lea0Var);
                    if (b2 == null) {
                        b2 = rhq0Var3.a;
                    }
                    rhq0Var = new rhq0(b2, b3);
                } else if (lea0Var2 == null || (b = a.b(jfa0Var2, lea0Var2)) == null) {
                    rhq0Var = null;
                } else {
                    rhq0Var = new rhq0(b, a.b(jfa0Var2, d33Var != null ? d33Var.b : null));
                }
                return jfa0.a(jfa0Var2, null, rhq0Var, 5);
            }
        }
        return jfa0Var2;
    }
}
