package com.yandex.go.payments.paymentlist.domain.preselect;

import com.yandex.go.payments.data.model.response.PaymentMethods;
import defpackage.e4a0;
import defpackage.fga0;
import defpackage.g050;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.ysx;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.paymentlist.domain.preselect.LastPaymentMethodApplyInteractor$tryApply$2", f = "LastPaymentMethodApplyInteractor.kt", l = {53}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
final class LastPaymentMethodApplyInteractor$tryApply$2 extends SuspendLambda implements wls {
    final /* synthetic */ PaymentMethods $paymentMethods;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LastPaymentMethodApplyInteractor$tryApply$2(a aVar, PaymentMethods paymentMethods, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$paymentMethods = paymentMethods;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LastPaymentMethodApplyInteractor$tryApply$2(this.this$0, this.$paymentMethods, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((LastPaymentMethodApplyInteractor$tryApply$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Finally extract failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        a aVar;
        g050 g050Var;
        PaymentMethods paymentMethods;
        PaymentMethods.LastPaymentMethod c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            a aVar2 = this.this$0;
            kotlinx.coroutines.sync.a aVar3 = aVar2.d;
            PaymentMethods paymentMethods2 = this.$paymentMethods;
            this.L$0 = aVar3;
            this.L$1 = paymentMethods2;
            this.L$2 = aVar2;
            this.label = 1;
            if (aVar3.a(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            aVar = aVar2;
            g050Var = aVar3;
            paymentMethods = paymentMethods2;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            aVar = (a) this.L$2;
            paymentMethods = (PaymentMethods) this.L$1;
            g050Var = (g050) this.L$0;
            b.b(obj);
        }
        try {
            PaymentMethods.LastPaymentMethod lastPaymentMethod = paymentMethods.k;
            if (lastPaymentMethod != null) {
                Long b = ysx.b(lastPaymentMethod);
                if (b != null) {
                    if (aVar.c.a.j("last_payment_method_last_applied_updated_at_ms", 0L) >= b.longValue()) {
                    }
                }
                if ((b != null || aVar.b.c().a() == null) && (c = ysx.c(paymentMethods)) != null) {
                    fga0 fga0Var = aVar.b;
                    e4a0 e4a0Var = c.b;
                    if (e4a0Var == null) {
                        e4a0Var = e4a0.R3;
                    }
                    fga0Var.B(e4a0Var, c.a);
                    if (b != null) {
                        aVar.c.a.q(b.longValue(), "last_payment_method_last_applied_updated_at_ms");
                    }
                }
            }
            g050Var.d(null);
            return zy11.a;
        } catch (Throwable th) {
            g050Var.d(null);
            throw th;
        }
    }
}
