package com.yandex.go.taxi.order.details.v1.elements.payment;

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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "", "<anonymous>", "(Ltse;)Ljava/lang/CharSequence;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.details.v1.elements.payment.DetailsCardPaymentStateMapper$createCardPaymentMethod$2$subtitle$1$1", f = "DetailsCardPaymentStateMapper.kt", l = {91}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class DetailsCardPaymentStateMapper$createCardPaymentMethod$2$subtitle$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ FormattedText $it;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DetailsCardPaymentStateMapper$createCardPaymentMethod$2$subtitle$1$1(b bVar, FormattedText formattedText, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$it = formattedText;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DetailsCardPaymentStateMapper$createCardPaymentMethod$2$subtitle$1$1(this.this$0, this.$it, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DetailsCardPaymentStateMapper$createCardPaymentMethod$2$subtitle$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
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
        ru.yandex.taxi.widget.c cVar = this.this$0.b;
        FormattedText formattedText = this.$it;
        this.label = 1;
        Object i2 = ru.yandex.taxi.widget.c.i(cVar, formattedText, null, this, 30);
        return i2 == coroutineSingletons ? coroutineSingletons : i2;
    }
}
