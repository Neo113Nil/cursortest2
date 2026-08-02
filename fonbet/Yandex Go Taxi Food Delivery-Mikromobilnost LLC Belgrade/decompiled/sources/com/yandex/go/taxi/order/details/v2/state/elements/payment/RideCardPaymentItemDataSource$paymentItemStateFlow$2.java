package com.yandex.go.taxi.order.details.v2.state.elements.payment;

import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$Payment;
import defpackage.css0;
import defpackage.ilk0;
import defpackage.kdc;
import defpackage.klk0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rss0;
import defpackage.tss0;
import defpackage.wls;
import defpackage.xss0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lxss0;", "it", "Lklk0;", "<anonymous>", "(Lxss0;)Lklk0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.details.v2.state.elements.payment.RideCardPaymentItemDataSource$paymentItemStateFlow$2", f = "RideCardPaymentItemDataSource.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class RideCardPaymentItemDataSource$paymentItemStateFlow$2 extends SuspendLambda implements wls {
    final /* synthetic */ boolean $canChangePayment;
    final /* synthetic */ kdc $color;
    final /* synthetic */ boolean $isLoading;
    final /* synthetic */ RideCardItemDto$Payment $item;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RideCardPaymentItemDataSource$paymentItemStateFlow$2(RideCardItemDto$Payment rideCardItemDto$Payment, boolean z, kdc kdcVar, boolean z2, Continuation continuation) {
        super(2, continuation);
        this.$item = rideCardItemDto$Payment;
        this.$isLoading = z;
        this.$color = kdcVar;
        this.$canChangePayment = z2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RideCardPaymentItemDataSource$paymentItemStateFlow$2 rideCardPaymentItemDataSource$paymentItemStateFlow$2 = new RideCardPaymentItemDataSource$paymentItemStateFlow$2(this.$item, this.$isLoading, this.$color, this.$canChangePayment, continuation);
        rideCardPaymentItemDataSource$paymentItemStateFlow$2.L$0 = obj;
        return rideCardPaymentItemDataSource$paymentItemStateFlow$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RideCardPaymentItemDataSource$paymentItemStateFlow$2) create((xss0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        xss0 xss0Var = (xss0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        RideCardItemDto$Payment rideCardItemDto$Payment = this.$item;
        String str = rideCardItemDto$Payment.a;
        String str2 = rideCardItemDto$Payment.b;
        ilk0 ilk0Var = new ilk0(xss0Var.a);
        css0 css0Var = xss0Var.b;
        tss0 tss0Var = this.$canChangePayment ? xss0Var.c : null;
        if (tss0Var == null) {
            tss0Var = rss0.a;
        }
        return new klk0(str, str2, ilk0Var, css0Var, tss0Var, xss0Var.d, this.$isLoading, this.$color);
    }
}
