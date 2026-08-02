package com.yandex.go.taxi.order.details.v1.elements.route_point;

import com.yandex.go.taxi.order.models.api.response.OrderDetailsCardResponse;
import com.yandex.go.taxi.order.models.api.response.OrderDetailsCardResponse$CardElement$RoutePointElement;
import defpackage.evu0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.x6j;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.common_models.net.FormattedText;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lx6j;", "<anonymous>", "(Ltse;)Lx6j;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.details.v1.elements.route_point.DetailsCardRoutePointsIntegrityVerifier$routePointContractModelOrNull$2", f = "DetailsCardRoutePointsIntegrityVerifier.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class DetailsCardRoutePointsIntegrityVerifier$routePointContractModelOrNull$2 extends SuspendLambda implements wls {
    final /* synthetic */ OrderDetailsCardResponse$CardElement$RoutePointElement $routePointElement;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DetailsCardRoutePointsIntegrityVerifier$routePointContractModelOrNull$2(OrderDetailsCardResponse$CardElement$RoutePointElement orderDetailsCardResponse$CardElement$RoutePointElement, Continuation continuation) {
        super(2, continuation);
        this.$routePointElement = orderDetailsCardResponse$CardElement$RoutePointElement;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DetailsCardRoutePointsIntegrityVerifier$routePointContractModelOrNull$2(this.$routePointElement, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DetailsCardRoutePointsIntegrityVerifier$routePointContractModelOrNull$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        FormattedText formattedText;
        FormattedText formattedText2;
        OrderDetailsCardResponse$CardElement$RoutePointElement orderDetailsCardResponse$CardElement$RoutePointElement;
        OrderDetailsCardResponse.CardIcon cardIcon;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        OrderDetailsCardResponse$CardElement$RoutePointElement orderDetailsCardResponse$CardElement$RoutePointElement2 = this.$routePointElement;
        if (orderDetailsCardResponse$CardElement$RoutePointElement2 == null || (formattedText = orderDetailsCardResponse$CardElement$RoutePointElement2.e) == null) {
            return null;
        }
        String a = formattedText.a();
        if (a == null || a.length() == 0 || evu0.J(formattedText.b()) || formattedText.c() == null) {
            formattedText = null;
        }
        if (formattedText == null || (formattedText2 = this.$routePointElement.d) == null) {
            return null;
        }
        String a2 = formattedText2.a();
        if (a2 == null || a2.length() == 0 || evu0.J(formattedText2.b()) || formattedText2.c() == null) {
            formattedText2 = null;
        }
        if (formattedText2 == null || (cardIcon = (orderDetailsCardResponse$CardElement$RoutePointElement = this.$routePointElement).b) == null) {
            return null;
        }
        return new x6j(formattedText, formattedText2, cardIcon, orderDetailsCardResponse$CardElement$RoutePointElement.c);
    }
}
