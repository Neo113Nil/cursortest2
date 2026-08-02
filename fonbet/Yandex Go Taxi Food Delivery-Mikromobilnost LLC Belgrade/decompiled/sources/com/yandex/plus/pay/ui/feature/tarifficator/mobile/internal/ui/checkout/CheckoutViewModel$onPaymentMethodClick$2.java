package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.checkout;

import com.yandex.plus.pay.internal.model.PlusPayCompositeOfferDetails;
import com.yandex.plus.pay.ui.core.tarifficator.api.data.common.PlusTarifficatorPurchase;
import defpackage.ind0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.checkout.CheckoutViewModel$onPaymentMethodClick$2", f = "CheckoutViewModel.kt", l = {HProv.PP_ENUM_LOG}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class CheckoutViewModel$onPaymentMethodClick$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $clickedPaymentMethodId;
    final /* synthetic */ PlusPayCompositeOfferDetails $offerDetails;
    final /* synthetic */ PlusTarifficatorPurchase $purchase;
    final /* synthetic */ ind0 $scenarioContext;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckoutViewModel$onPaymentMethodClick$2(d dVar, PlusTarifficatorPurchase plusTarifficatorPurchase, String str, PlusPayCompositeOfferDetails plusPayCompositeOfferDetails, ind0 ind0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$purchase = plusTarifficatorPurchase;
        this.$clickedPaymentMethodId = str;
        this.$offerDetails = plusPayCompositeOfferDetails;
        this.$scenarioContext = ind0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CheckoutViewModel$onPaymentMethodClick$2(this.this$0, this.$purchase, this.$clickedPaymentMethodId, this.$offerDetails, this.$scenarioContext, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CheckoutViewModel$onPaymentMethodClick$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            d dVar = this.this$0;
            PlusTarifficatorPurchase plusTarifficatorPurchase = this.$purchase;
            String str = this.$clickedPaymentMethodId;
            PlusPayCompositeOfferDetails plusPayCompositeOfferDetails = this.$offerDetails;
            this.label = 1;
            obj = d.X(dVar, plusTarifficatorPurchase, str, plusPayCompositeOfferDetails, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        String str2 = (String) obj;
        if (str2 != null) {
            d.Y(this.this$0, ind0.a(this.$scenarioContext, PlusTarifficatorPurchase.copy$default(this.$purchase, null, null, str2, null, null, null, null, HProv.PP_PASSWD_TERM, null), null, 29));
        }
        return zy11.a;
    }
}
