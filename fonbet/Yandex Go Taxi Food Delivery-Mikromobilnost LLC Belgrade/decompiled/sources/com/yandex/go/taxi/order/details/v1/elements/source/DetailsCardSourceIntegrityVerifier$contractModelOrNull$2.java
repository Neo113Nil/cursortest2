package com.yandex.go.taxi.order.details.v1.elements.source;

import com.yandex.go.taxi.order.models.api.response.OrderDetailsCardResponse;
import com.yandex.go.taxi.order.models.api.response.OrderDetailsCardResponse$CardElement$SourceElement;
import defpackage.evu0;
import defpackage.h7j;
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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lh7j;", "<anonymous>", "(Ltse;)Lh7j;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.details.v1.elements.source.DetailsCardSourceIntegrityVerifier$contractModelOrNull$2", f = "DetailsCardSourceIntegrityVerifier.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class DetailsCardSourceIntegrityVerifier$contractModelOrNull$2 extends SuspendLambda implements wls {
    final /* synthetic */ OrderDetailsCardResponse$CardElement$SourceElement $cardElement;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DetailsCardSourceIntegrityVerifier$contractModelOrNull$2(OrderDetailsCardResponse$CardElement$SourceElement orderDetailsCardResponse$CardElement$SourceElement, Continuation continuation) {
        super(2, continuation);
        this.$cardElement = orderDetailsCardResponse$CardElement$SourceElement;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DetailsCardSourceIntegrityVerifier$contractModelOrNull$2(this.$cardElement, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DetailsCardSourceIntegrityVerifier$contractModelOrNull$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        FormattedText formattedText;
        FormattedText formattedText2;
        OrderDetailsCardResponse$CardElement$SourceElement orderDetailsCardResponse$CardElement$SourceElement;
        OrderDetailsCardResponse.CardIcon cardIcon;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        OrderDetailsCardResponse$CardElement$SourceElement orderDetailsCardResponse$CardElement$SourceElement2 = this.$cardElement;
        if (orderDetailsCardResponse$CardElement$SourceElement2 == null || (formattedText = orderDetailsCardResponse$CardElement$SourceElement2.e) == null) {
            return null;
        }
        String a = formattedText.a();
        if (a == null || a.length() == 0 || evu0.J(formattedText.b()) || formattedText.c() == null) {
            formattedText = null;
        }
        if (formattedText == null || (formattedText2 = this.$cardElement.d) == null) {
            return null;
        }
        String a2 = formattedText2.a();
        if (a2 == null || a2.length() == 0 || evu0.J(formattedText2.b()) || formattedText2.c() == null) {
            formattedText2 = null;
        }
        if (formattedText2 == null || (cardIcon = (orderDetailsCardResponse$CardElement$SourceElement = this.$cardElement).b) == null) {
            return null;
        }
        return new h7j(formattedText, formattedText2, cardIcon, orderDetailsCardResponse$CardElement$SourceElement.c);
    }
}
