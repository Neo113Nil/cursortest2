package com.yandex.go.taxi.order.details.v1.elements.destination;

import com.yandex.go.taxi.order.models.api.response.OrderDetailsCardResponse;
import com.yandex.go.taxi.order.models.api.response.OrderDetailsCardResponse$CardElement$AddDestinationElement;
import defpackage.evu0;
import defpackage.f5j;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.common_models.net.FormattedText;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lf5j;", "<anonymous>", "(Ltse;)Lf5j;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.details.v1.elements.destination.DetailsCardDestinationIntegrityVerifier$addDestinationContractModelOrNull$2", f = "DetailsCardDestinationIntegrityVerifier.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class DetailsCardDestinationIntegrityVerifier$addDestinationContractModelOrNull$2 extends SuspendLambda implements wls {
    final /* synthetic */ OrderDetailsCardResponse$CardElement$AddDestinationElement $cardElement;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DetailsCardDestinationIntegrityVerifier$addDestinationContractModelOrNull$2(OrderDetailsCardResponse$CardElement$AddDestinationElement orderDetailsCardResponse$CardElement$AddDestinationElement, Continuation continuation) {
        super(2, continuation);
        this.$cardElement = orderDetailsCardResponse$CardElement$AddDestinationElement;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DetailsCardDestinationIntegrityVerifier$addDestinationContractModelOrNull$2(this.$cardElement, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DetailsCardDestinationIntegrityVerifier$addDestinationContractModelOrNull$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        FormattedText formattedText;
        OrderDetailsCardResponse$CardElement$AddDestinationElement orderDetailsCardResponse$CardElement$AddDestinationElement;
        OrderDetailsCardResponse.CardIcon cardIcon;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        OrderDetailsCardResponse$CardElement$AddDestinationElement orderDetailsCardResponse$CardElement$AddDestinationElement2 = this.$cardElement;
        if (orderDetailsCardResponse$CardElement$AddDestinationElement2 == null || (formattedText = orderDetailsCardResponse$CardElement$AddDestinationElement2.d) == null) {
            return null;
        }
        String a = formattedText.a();
        if (a == null || a.length() == 0 || evu0.J(formattedText.b()) || formattedText.c() == null) {
            formattedText = null;
        }
        if (formattedText == null || (cardIcon = (orderDetailsCardResponse$CardElement$AddDestinationElement = this.$cardElement).b) == null) {
            return null;
        }
        return new f5j(formattedText, cardIcon, orderDetailsCardResponse$CardElement$AddDestinationElement.c);
    }
}
