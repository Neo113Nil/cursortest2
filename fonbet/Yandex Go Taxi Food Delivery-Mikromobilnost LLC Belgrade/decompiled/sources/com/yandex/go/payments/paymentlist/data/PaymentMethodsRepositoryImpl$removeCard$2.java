package com.yandex.go.payments.paymentlist.data;

import com.yandex.go.payments.data.model.response.Card;
import com.yandex.go.payments.data.model.response.PaymentMethods;
import defpackage.fga0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.kjz;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pme0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.paymentlist.data.PaymentMethodsRepositoryImpl$removeCard$2", f = "PaymentMethodsRepositoryImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class PaymentMethodsRepositoryImpl$removeCard$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $cardId;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentMethodsRepositoryImpl$removeCard$2(c cVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$cardId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PaymentMethodsRepositoryImpl$removeCard$2(this.this$0, this.$cardId, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        PaymentMethodsRepositoryImpl$removeCard$2 paymentMethodsRepositoryImpl$removeCard$2 = (PaymentMethodsRepositoryImpl$removeCard$2) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        paymentMethodsRepositoryImpl$removeCard$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        fga0 fga0Var = this.this$0.g;
        String str = this.$cardId;
        kjz kjzVar = fga0Var.b;
        PaymentMethods g = kjzVar.g();
        PaymentMethods.CardPaymentMethods cardPaymentMethods = g.a;
        List list = cardPaymentMethods.a;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (!jl40.l(((Card) obj2).b, str)) {
                arrayList.add(obj2);
            }
        }
        List list2 = cardPaymentMethods.b;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : list2) {
            if (!jl40.l(((Card) obj3).b, str)) {
                arrayList2.add(obj3);
            }
        }
        PaymentMethods a = PaymentMethods.a(g, new PaymentMethods.CardPaymentMethods(arrayList, arrayList2, cardPaymentMethods.c, cardPaymentMethods.d), null, null, null, null, null, 4194302);
        ((pme0) ((i3y) kjzVar.b).getValue()).a(a);
        kjzVar.j(a);
        if (jl40.l(this.$cardId, this.this$0.g.q(PaymentMethod$Type.CARD))) {
            this.this$0.g.A();
        }
        return zy11.a;
    }
}
