package com.yandex.go.taxi.order.details.v1.elements.payment;

import com.yandex.go.taxi.order.models.api.response.OrderDetailsCardResponse$CardElement$PaymentElement;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lcom/yandex/go/taxi/order/details/v1/ui/f;", "<anonymous>", "(Ltse;)Lcom/yandex/go/taxi/order/details/v1/ui/f;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.details.v1.elements.payment.DetailsCardPaymentStateMapper$createCardPaymentMethod$2$interactionMode$1", f = "DetailsCardPaymentStateMapper.kt", l = {100}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class DetailsCardPaymentStateMapper$createCardPaymentMethod$2$interactionMode$1 extends SuspendLambda implements wls {
    final /* synthetic */ OrderDetailsCardResponse$CardElement$PaymentElement $element;
    final /* synthetic */ boolean $isChangesEnabled;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DetailsCardPaymentStateMapper$createCardPaymentMethod$2$interactionMode$1(b bVar, OrderDetailsCardResponse$CardElement$PaymentElement orderDetailsCardResponse$CardElement$PaymentElement, boolean z, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$element = orderDetailsCardResponse$CardElement$PaymentElement;
        this.$isChangesEnabled = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DetailsCardPaymentStateMapper$createCardPaymentMethod$2$interactionMode$1(this.this$0, this.$element, this.$isChangesEnabled, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DetailsCardPaymentStateMapper$createCardPaymentMethod$2$interactionMode$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        b bVar = this.this$0;
        OrderDetailsCardResponse$CardElement$PaymentElement orderDetailsCardResponse$CardElement$PaymentElement = this.$element;
        boolean z = this.$isChangesEnabled;
        this.label = 1;
        Object a = b.a(bVar, orderDetailsCardResponse$CardElement$PaymentElement, z, this);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
