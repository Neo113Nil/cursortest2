package com.yandex.go.payments.paymentlist.domain;

import com.yandex.go.payments.api.GooglePayInteractor$GooglePayTokenResult;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import defpackage.eba0;
import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rif0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.t;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.paymentlist.domain.PaymentMethodsInteractorImpl$setSelectedOptionForOrder$1", f = "PaymentMethodsInteractorImpl.kt", l = {183, 185}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class PaymentMethodsInteractorImpl$setSelectedOptionForOrder$1 extends SuspendLambda implements wls {
    final /* synthetic */ rif0 $callback;
    final /* synthetic */ TaxiOrder $order;
    Object L$0;
    int label;
    final /* synthetic */ i this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentMethodsInteractorImpl$setSelectedOptionForOrder$1(i iVar, TaxiOrder taxiOrder, rif0 rif0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = iVar;
        this.$order = taxiOrder;
        this.$callback = rif0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PaymentMethodsInteractorImpl$setSelectedOptionForOrder$1(this.this$0, this.$order, this.$callback, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PaymentMethodsInteractorImpl$setSelectedOptionForOrder$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0053, code lost:
    
        if (com.yandex.go.payments.paymentlist.domain.i.a(r6, r1, r4, r5) == r0) goto L26;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
        } catch (Exception e) {
            jst.e.k(e, "Google Pay: failed to change payment method to Google Pay");
            this.$callback.o();
        }
        if (i == 0) {
            kotlin.b.b(obj);
            t h = this.this$0.d.h();
            this.label = 1;
            obj = kotlinx.coroutines.flow.e.A(h, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return zy11.a;
            }
            kotlin.b.b(obj);
        }
        GooglePayInteractor$GooglePayTokenResult googlePayInteractor$GooglePayTokenResult = (GooglePayInteractor$GooglePayTokenResult) obj;
        if ((googlePayInteractor$GooglePayTokenResult == null ? -1 : eba0.a[googlePayInteractor$GooglePayTokenResult.ordinal()]) == 1) {
            i iVar = this.this$0;
            TaxiOrder taxiOrder = this.$order;
            rif0 rif0Var = this.$callback;
            this.L$0 = null;
            this.label = 2;
        } else {
            this.$callback.o();
        }
        return zy11.a;
    }
}
