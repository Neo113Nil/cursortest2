package com.yandex.go.taxi.order.details.v1.elements.route_point;

import com.yandex.go.taxi.order.models.api.response.OrderDetailsCardResponse;
import com.yandex.go.taxi.order.models.api.response.OrderDetailsCardResponse$CardElement$AddRoutePointElement;
import defpackage.evu0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.w6j;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.common_models.net.FormattedText;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lw6j;", "<anonymous>", "(Ltse;)Lw6j;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.details.v1.elements.route_point.DetailsCardRoutePointsIntegrityVerifier$addRoutePointContractModelOrNull$2", f = "DetailsCardRoutePointsIntegrityVerifier.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class DetailsCardRoutePointsIntegrityVerifier$addRoutePointContractModelOrNull$2 extends SuspendLambda implements wls {
    final /* synthetic */ OrderDetailsCardResponse$CardElement$AddRoutePointElement $addRoutePointElement;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DetailsCardRoutePointsIntegrityVerifier$addRoutePointContractModelOrNull$2(OrderDetailsCardResponse$CardElement$AddRoutePointElement orderDetailsCardResponse$CardElement$AddRoutePointElement, Continuation continuation) {
        super(2, continuation);
        this.$addRoutePointElement = orderDetailsCardResponse$CardElement$AddRoutePointElement;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DetailsCardRoutePointsIntegrityVerifier$addRoutePointContractModelOrNull$2(this.$addRoutePointElement, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DetailsCardRoutePointsIntegrityVerifier$addRoutePointContractModelOrNull$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        FormattedText formattedText;
        OrderDetailsCardResponse$CardElement$AddRoutePointElement orderDetailsCardResponse$CardElement$AddRoutePointElement;
        OrderDetailsCardResponse.CardIcon cardIcon;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        OrderDetailsCardResponse$CardElement$AddRoutePointElement orderDetailsCardResponse$CardElement$AddRoutePointElement2 = this.$addRoutePointElement;
        if (orderDetailsCardResponse$CardElement$AddRoutePointElement2 == null || (formattedText = orderDetailsCardResponse$CardElement$AddRoutePointElement2.d) == null) {
            return null;
        }
        String a = formattedText.a();
        if (a == null || a.length() == 0 || evu0.J(formattedText.b()) || formattedText.c() == null) {
            formattedText = null;
        }
        if (formattedText == null || (cardIcon = (orderDetailsCardResponse$CardElement$AddRoutePointElement = this.$addRoutePointElement).b) == null) {
            return null;
        }
        return new w6j(formattedText, cardIcon, orderDetailsCardResponse$CardElement$AddRoutePointElement.c);
    }
}
