package com.yandex.payment.divkit.select;

import com.yandex.payment.sdk.core.data.PaymentMethod;
import defpackage.a8a0;
import defpackage.cvf;
import defpackage.ds31;
import defpackage.geq0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tje;
import defpackage.tse;
import defpackage.uv90;
import defpackage.wga0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.n0;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.payment.divkit.select.DKSelectViewModelRefactor$init$1", f = "DKSelectViewModelRefactor.kt", l = {173, 175}, m = "invokeSuspend", v = 1)
/* loaded from: classes2.dex */
final class DKSelectViewModelRefactor$init$1 extends SuspendLambda implements wls {
    final /* synthetic */ PaymentMethod $preferredMethod;
    final /* synthetic */ uv90 $preloadedPayment;
    int label;
    final /* synthetic */ n this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DKSelectViewModelRefactor$init$1(PaymentMethod paymentMethod, uv90 uv90Var, n nVar, Continuation continuation) {
        super(2, continuation);
        this.$preferredMethod = paymentMethod;
        this.$preloadedPayment = uv90Var;
        this.this$0 = nVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DKSelectViewModelRefactor$init$1(this.$preferredMethod, this.$preloadedPayment, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DKSelectViewModelRefactor$init$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0053, code lost:
    
        if (r1.emit(r7, r6) == r0) goto L25;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            if (!(this.$preferredMethod instanceof PaymentMethod.Split)) {
                uv90 uv90Var = this.$preloadedPayment;
                n nVar = this.this$0;
                if (uv90Var == null) {
                    r0 r0Var = nVar.J;
                    geq0 geq0Var = new geq0(false, false);
                    r0Var.getClass();
                    r0Var.m(null, geq0Var);
                    tje.N(ds31.a(nVar), null, null, new DKSelectViewModelRefactor$loadPaymentDetails$1(nVar, null), 3);
                    return zy11Var;
                }
                nVar.c0 = uv90Var;
                n0 n0Var = nVar.U;
                this.label = 1;
            }
            return zy11Var;
        }
        if (i != 1) {
            if (i == 2) {
                kotlin.b.b(obj);
                return zy11Var;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        if (!a8a0.e(this.$preferredMethod)) {
            n0 n0Var2 = this.this$0.W;
            cvf cvfVar = new cvf(a8a0.a(((wga0) this.$preloadedPayment).e()), ((wga0) this.$preloadedPayment).g());
            this.label = 2;
            if (n0Var2.emit(cvfVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return zy11Var;
    }
}
