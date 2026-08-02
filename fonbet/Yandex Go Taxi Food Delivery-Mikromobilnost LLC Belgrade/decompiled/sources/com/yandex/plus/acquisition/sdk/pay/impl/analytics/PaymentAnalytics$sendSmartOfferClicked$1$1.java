package com.yandex.plus.acquisition.sdk.pay.impl.analytics;

import com.yandex.plus.acquisition.sdk.pay.common.api.PlusAcquisitionPaymentAnalytics$Params;
import com.yandex.plus.acquisition.sdk.pay.common.api.PlusAcquisitionSmartOffer;
import com.yandex.plus.pay.api.analytics.PlusPayPaymentAnalyticsParams;
import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import defpackage.au90;
import defpackage.dad0;
import defpackage.i3y;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.ubd0;
import defpackage.vfd0;
import defpackage.wls;
import defpackage.zt90;
import defpackage.zy11;
import java.util.Map;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.acquisition.sdk.pay.impl.analytics.PaymentAnalytics$sendSmartOfferClicked$1$1", f = "PaymentAnalytics.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class PaymentAnalytics$sendSmartOfferClicked$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ PlusAcquisitionPaymentAnalytics$Params $analyticsParams;
    final /* synthetic */ PlusPayCompositeOffers.Offer $payCompositeOffer;
    final /* synthetic */ PlusAcquisitionSmartOffer $smartOffer;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentAnalytics$sendSmartOfferClicked$1$1(a aVar, PlusPayCompositeOffers.Offer offer, PlusAcquisitionSmartOffer plusAcquisitionSmartOffer, PlusAcquisitionPaymentAnalytics$Params plusAcquisitionPaymentAnalytics$Params, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$payCompositeOffer = offer;
        this.$smartOffer = plusAcquisitionSmartOffer;
        this.$analyticsParams = plusAcquisitionPaymentAnalytics$Params;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PaymentAnalytics$sendSmartOfferClicked$1$1(this.this$0, this.$payCompositeOffer, this.$smartOffer, this.$analyticsParams, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        PaymentAnalytics$sendSmartOfferClicked$1$1 paymentAnalytics$sendSmartOfferClicked$1$1 = (PaymentAnalytics$sendSmartOfferClicked$1$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        paymentAnalytics$sendSmartOfferClicked$1$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        dad0 a = ((com.yandex.plus.pay.internal.b) this.this$0.a).a();
        PlusPayCompositeOffers.Offer offer = this.$payCompositeOffer;
        zt90 zt90Var = this.this$0.c;
        this.$smartOffer.getPlace();
        this.$smartOffer.getPage();
        String from = this.$analyticsParams.getFrom();
        Map<String, String> customParams = this.$analyticsParams.getCustomParams();
        ((au90) zt90Var).getClass();
        PlusPayPaymentAnalyticsParams.Companion.getClass();
        PlusPayPaymentAnalyticsParams.a aVar = new PlusPayPaymentAnalyticsParams.a();
        aVar.a = from;
        for (Map.Entry<String, String> entry : customParams.entrySet()) {
            aVar.a(entry.getValue(), entry.getKey());
        }
        ((ubd0) a).a(new PlusPayPaymentAnalyticsParams(aVar.a, aVar.b, aVar.c, aVar.d, null), offer);
        ((vfd0) ((i3y) ((com.yandex.plus.pay.internal.b) this.this$0.a).b.c.i).getValue()).b(this.$payCompositeOffer, this.$smartOffer.getPriority(), this.$smartOffer.getPlace(), this.$smartOffer.getPage(), this.$analyticsParams.getFrom(), this.$analyticsParams.getCustomParams());
        return zy11.a;
    }
}
