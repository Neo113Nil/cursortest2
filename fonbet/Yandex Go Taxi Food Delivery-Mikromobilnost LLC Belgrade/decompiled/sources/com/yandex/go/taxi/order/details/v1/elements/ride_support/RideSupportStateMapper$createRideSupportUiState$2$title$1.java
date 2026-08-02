package com.yandex.go.taxi.order.details.v1.elements.ride_support;

import com.yandex.go.taxi.order.models.api.response.OrderDetailsCardResponse$CardElement$RideSupportElement;
import defpackage.iqk0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.widget.c;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "", "<anonymous>", "(Ltse;)Ljava/lang/CharSequence;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.details.v1.elements.ride_support.RideSupportStateMapper$createRideSupportUiState$2$title$1", f = "RideSupportStateMapper.kt", l = {39}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class RideSupportStateMapper$createRideSupportUiState$2$title$1 extends SuspendLambda implements wls {
    final /* synthetic */ OrderDetailsCardResponse$CardElement$RideSupportElement $element;
    int label;
    final /* synthetic */ iqk0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RideSupportStateMapper$createRideSupportUiState$2$title$1(iqk0 iqk0Var, OrderDetailsCardResponse$CardElement$RideSupportElement orderDetailsCardResponse$CardElement$RideSupportElement, Continuation continuation) {
        super(2, continuation);
        this.this$0 = iqk0Var;
        this.$element = orderDetailsCardResponse$CardElement$RideSupportElement;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RideSupportStateMapper$createRideSupportUiState$2$title$1(this.this$0, this.$element, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RideSupportStateMapper$createRideSupportUiState$2$title$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        c cVar = this.this$0.c;
        FormattedText formattedText = this.$element.d;
        this.label = 1;
        Object i2 = c.i(cVar, formattedText, null, this, 30);
        return i2 == coroutineSingletons ? coroutineSingletons : i2;
    }
}
