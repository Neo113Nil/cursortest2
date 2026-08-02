package com.yandex.go.taxi.order.details.v1.elements.complete_button;

import com.yandex.go.taxi.order.models.api.response.OrderDetailsCardResponse$CardElement$Action$CloseAndDeeplink;
import com.yandex.go.taxi.order.models.api.response.OrderDetailsCardResponse$CardElement$CompleteButtonElement;
import com.yandex.go.taxi.order.models.api.response.n1;
import defpackage.c5j;
import defpackage.d5j;
import defpackage.h9k0;
import defpackage.i3y;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.widget.c;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lc5j;", "<anonymous>", "(Ltse;)Lc5j;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.details.v1.elements.complete_button.DetailsCardCompleteButtonStateMapper$map$2", f = "DetailsCardCompleteButtonStateMapper.kt", l = {24}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class DetailsCardCompleteButtonStateMapper$map$2 extends SuspendLambda implements wls {
    final /* synthetic */ OrderDetailsCardResponse$CardElement$CompleteButtonElement $completeButtonElement;
    Object L$0;
    int label;
    final /* synthetic */ d5j this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DetailsCardCompleteButtonStateMapper$map$2(OrderDetailsCardResponse$CardElement$CompleteButtonElement orderDetailsCardResponse$CardElement$CompleteButtonElement, d5j d5jVar, Continuation continuation) {
        super(2, continuation);
        this.$completeButtonElement = orderDetailsCardResponse$CardElement$CompleteButtonElement;
        this.this$0 = d5jVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DetailsCardCompleteButtonStateMapper$map$2(this.$completeButtonElement, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DetailsCardCompleteButtonStateMapper$map$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        n1 n1Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            OrderDetailsCardResponse$CardElement$CompleteButtonElement orderDetailsCardResponse$CardElement$CompleteButtonElement = this.$completeButtonElement;
            n1 n1Var2 = orderDetailsCardResponse$CardElement$CompleteButtonElement.c;
            boolean z = n1Var2 instanceof OrderDetailsCardResponse$CardElement$Action$CloseAndDeeplink;
            d5j d5jVar = this.this$0;
            if (!z) {
                return (c5j) ((i3y) d5jVar.b.b).getValue();
            }
            c cVar = d5jVar.c;
            FormattedText formattedText = orderDetailsCardResponse$CardElement$CompleteButtonElement.b;
            this.L$0 = n1Var2;
            this.label = 1;
            obj = c.e(cVar, formattedText, null, false, this, 30);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            n1Var = n1Var2;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            n1Var = (n1) this.L$0;
            b.b(obj);
        }
        return new c5j((CharSequence) obj, new h9k0("CLOSE_AND_DEEPLINK".toLowerCase(Locale.ROOT), ((OrderDetailsCardResponse$CardElement$Action$CloseAndDeeplink) n1Var).a));
    }
}
