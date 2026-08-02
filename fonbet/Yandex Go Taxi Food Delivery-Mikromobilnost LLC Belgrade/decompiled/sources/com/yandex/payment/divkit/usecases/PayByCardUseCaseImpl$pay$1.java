package com.yandex.payment.divkit.usecases;

import com.yandex.payment.sdk.core.data.PaymentMethod;
import com.yandex.xplat.payment.sdk.NewCard;
import defpackage.a8a0;
import defpackage.bgc;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pgk0;
import defpackage.rs90;
import defpackage.suf;
import defpackage.wls;
import defpackage.y6f0;
import defpackage.zbq0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ly6f0;", "Lqyj0;", "Lsm0;", "Lzy11;", "<anonymous>", "(Ly6f0;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.payment.divkit.usecases.PayByCardUseCaseImpl$pay$1", f = "PayByCardUseCase.kt", l = {71}, m = "invokeSuspend", v = 1)
/* loaded from: classes2.dex */
final class PayByCardUseCaseImpl$pay$1 extends SuspendLambda implements wls {
    final /* synthetic */ NewCard $newCard;
    final /* synthetic */ PaymentMethod $selectedMethod;
    final /* synthetic */ String $userEmail;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ q this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PayByCardUseCaseImpl$pay$1(PaymentMethod paymentMethod, NewCard newCard, q qVar, String str, Continuation continuation) {
        super(2, continuation);
        this.$selectedMethod = paymentMethod;
        this.$newCard = newCard;
        this.this$0 = qVar;
        this.$userEmail = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PayByCardUseCaseImpl$pay$1 payByCardUseCaseImpl$pay$1 = new PayByCardUseCaseImpl$pay$1(this.$selectedMethod, this.$newCard, this.this$0, this.$userEmail, continuation);
        payByCardUseCaseImpl$pay$1.L$0 = obj;
        return payByCardUseCaseImpl$pay$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PayByCardUseCaseImpl$pay$1) create((y6f0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        y6f0 y6f0Var = (y6f0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            rs90 rs90Var = new rs90(y6f0Var);
            if (jl40.l(this.$selectedMethod, PaymentMethod.NewCard.INSTANCE) || a8a0.d(this.$selectedMethod)) {
                NewCard newCard = this.$newCard;
                if (newCard != null) {
                    q qVar = this.this$0;
                    ((zbq0) qVar.a.b).H().d(newCard, this.$userEmail, rs90Var);
                }
            } else if (jl40.l(this.$selectedMethod, PaymentMethod.GooglePay.INSTANCE)) {
                pgk0 pgk0Var = this.this$0.a;
                ((zbq0) pgk0Var.b).H().a(this.$userEmail, rs90Var);
            } else {
                PaymentMethod paymentMethod = this.$selectedMethod;
                if (((paymentMethod instanceof PaymentMethod.Card) && !a8a0.d(paymentMethod)) || (this.$selectedMethod instanceof PaymentMethod.YBMethod)) {
                    pgk0 pgk0Var2 = this.this$0.a;
                    ((zbq0) pgk0Var2.b).H().c(this.$selectedMethod, new suf(0), this.$userEmail, rs90Var);
                }
            }
            bgc bgcVar = new bgc(12);
            this.L$0 = null;
            this.L$1 = null;
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
