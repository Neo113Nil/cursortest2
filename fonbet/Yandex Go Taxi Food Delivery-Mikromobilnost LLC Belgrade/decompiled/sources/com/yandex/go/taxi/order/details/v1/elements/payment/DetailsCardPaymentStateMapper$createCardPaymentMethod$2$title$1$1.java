package com.yandex.go.taxi.order.details.v1.elements.payment;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import defpackage.ief;
import defpackage.kub1;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.MSException;
import ru.yandex.taxi.common_models.net.FormattedText;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "", "<anonymous>", "(Ltse;)Ljava/lang/CharSequence;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.details.v1.elements.payment.DetailsCardPaymentStateMapper$createCardPaymentMethod$2$title$1$1", f = "DetailsCardPaymentStateMapper.kt", l = {MSException.ERROR_INVALID_PARAMETER}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class DetailsCardPaymentStateMapper$createCardPaymentMethod$2$title$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ FormattedText $it;
    final /* synthetic */ TaxiOrder $order;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DetailsCardPaymentStateMapper$createCardPaymentMethod$2$title$1$1(b bVar, FormattedText formattedText, TaxiOrder taxiOrder, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$it = formattedText;
        this.$order = taxiOrder;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DetailsCardPaymentStateMapper$createCardPaymentMethod$2$title$1$1(this.this$0, this.$it, this.$order, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DetailsCardPaymentStateMapper$createCardPaymentMethod$2$title$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
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
        ru.yandex.taxi.widget.c cVar = bVar.b;
        FormattedText formattedText = this.$it;
        ief iefVar = this.$order.V().K;
        List<Object> list = formattedText.a;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        for (Object obj2 : list) {
            if (obj2 instanceof FormattedText.h) {
                FormattedText.h hVar = (FormattedText.h) obj2;
                obj2 = FormattedText.h.e(hVar, kub1.e(bVar.c, iefVar, hVar.a), null, null, 2046);
            }
            arrayList.add(obj2);
        }
        FormattedText formattedText2 = new FormattedText(arrayList);
        this.label = 1;
        Object i2 = ru.yandex.taxi.widget.c.i(cVar, formattedText2, null, this, 30);
        return i2 == coroutineSingletons ? coroutineSingletons : i2;
    }
}
