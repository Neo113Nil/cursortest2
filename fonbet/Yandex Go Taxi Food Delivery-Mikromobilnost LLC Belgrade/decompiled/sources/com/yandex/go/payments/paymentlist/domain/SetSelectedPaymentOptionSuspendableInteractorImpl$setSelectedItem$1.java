package com.yandex.go.payments.paymentlist.domain;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import defpackage.b4r0;
import defpackage.bgc;
import defpackage.lv90;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.y6f0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ly6f0;", "Lrc9;", "Lzy11;", "<anonymous>", "(Ly6f0;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.paymentlist.domain.SetSelectedPaymentOptionSuspendableInteractorImpl$setSelectedItem$1", f = "SetSelectedPaymentOptionSuspendableInteractorImpl.kt", l = {38}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class SetSelectedPaymentOptionSuspendableInteractorImpl$setSelectedItem$1 extends SuspendLambda implements wls {
    final /* synthetic */ TaxiOrder $order;
    final /* synthetic */ lv90 $payment;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ n this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetSelectedPaymentOptionSuspendableInteractorImpl$setSelectedItem$1(n nVar, lv90 lv90Var, TaxiOrder taxiOrder, Continuation continuation) {
        super(2, continuation);
        this.this$0 = nVar;
        this.$payment = lv90Var;
        this.$order = taxiOrder;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SetSelectedPaymentOptionSuspendableInteractorImpl$setSelectedItem$1 setSelectedPaymentOptionSuspendableInteractorImpl$setSelectedItem$1 = new SetSelectedPaymentOptionSuspendableInteractorImpl$setSelectedItem$1(this.this$0, this.$payment, this.$order, continuation);
        setSelectedPaymentOptionSuspendableInteractorImpl$setSelectedItem$1.L$0 = obj;
        return setSelectedPaymentOptionSuspendableInteractorImpl$setSelectedItem$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SetSelectedPaymentOptionSuspendableInteractorImpl$setSelectedItem$1) create((y6f0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        y6f0 y6f0Var = (y6f0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            n nVar = this.this$0;
            nVar.b.l(this.$payment, this.$order, new b4r0(y6f0Var, nVar.a));
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
