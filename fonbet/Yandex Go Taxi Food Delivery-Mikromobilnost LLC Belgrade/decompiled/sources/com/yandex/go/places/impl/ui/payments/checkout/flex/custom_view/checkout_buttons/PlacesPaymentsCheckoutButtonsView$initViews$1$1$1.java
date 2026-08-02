package com.yandex.go.places.impl.ui.payments.checkout.flex.custom_view.checkout_buttons;

import defpackage.lcc0;
import defpackage.lea0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.places.impl.ui.payments.checkout.flex.custom_view.checkout_buttons.PlacesPaymentsCheckoutButtonsView$initViews$1$1$1", f = "PlacesPaymentsCheckoutButtonsView.kt", l = {81}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
public final class PlacesPaymentsCheckoutButtonsView$initViews$1$1$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ PlacesPaymentsCheckoutButtonsView this$0;

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    /* renamed from: com.yandex.go.places.impl.ui.payments.checkout.flex.custom_view.checkout_buttons.PlacesPaymentsCheckoutButtonsView$initViews$1$1$1$1, reason: invalid class name */
    final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements tls {
        @Override // defpackage.tls
        public final Object invoke(Object obj) {
            ((PlacesPaymentsCheckoutButtonsView) this.receiver).setPaymentMethod((lea0) obj);
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlacesPaymentsCheckoutButtonsView$initViews$1$1$1(PlacesPaymentsCheckoutButtonsView placesPaymentsCheckoutButtonsView, Continuation continuation) {
        super(2, continuation);
        this.this$0 = placesPaymentsCheckoutButtonsView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PlacesPaymentsCheckoutButtonsView$initViews$1$1$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PlacesPaymentsCheckoutButtonsView$initViews$1$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        lcc0 lcc0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            lcc0Var = this.this$0.paymentsCheckoutInteractor;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(1, this.this$0, PlacesPaymentsCheckoutButtonsView.class, "setPaymentMethod", "setPaymentMethod(Lcom/yandex/go/payments/payment/PaymentModel;)V", 0);
            this.label = 1;
            if (lcc0Var.a(anonymousClass1, this) == coroutineSingletons) {
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
