package com.yandex.plus.acquisition.adapter.internal.controller;

import com.yandex.plus.acquisition.adapter.api.PlusAcquisitionSdkPurchaseResult;
import com.yandex.plus.acquisition.sdk.pay.common.api.PlusAcquisitionPaymentAnalytics$Params;
import com.yandex.plus.acquisition.sdk.pay.common.api.PlusAcquisitionSmartOffer;
import com.yandex.plus.acquisition.sdk.pay.common.api.PlusAcquisitionSmartOfferPurchaseResult;
import defpackage.c0d0;
import defpackage.f0d0;
import defpackage.jl40;
import defpackage.ls90;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.w511;
import defpackage.zy11;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lcom/yandex/plus/acquisition/adapter/api/PlusAcquisitionSdkPurchaseResult;"}, k = 3, mv = {2, 2, 0}, xi = 48)
@mvg(c = "com.yandex.plus.acquisition.adapter.internal.controller.ButtonSectionController$proxyController$2$1$1$1", f = "ButtonSectionController.kt", l = {46}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class ButtonSectionController$proxyController$2$1$1$1 extends SuspendLambda implements tls {
    final /* synthetic */ PlusAcquisitionPaymentAnalytics$Params $acquisitionAnalyticsParams;
    final /* synthetic */ Map<String, String> $payload;
    final /* synthetic */ c0d0 $plusAcqPay;
    final /* synthetic */ PlusAcquisitionSmartOffer $smartOffer;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ButtonSectionController$proxyController$2$1$1$1(c0d0 c0d0Var, PlusAcquisitionSmartOffer plusAcquisitionSmartOffer, PlusAcquisitionPaymentAnalytics$Params plusAcquisitionPaymentAnalytics$Params, Map map, b bVar, Continuation continuation) {
        super(1, continuation);
        this.$plusAcqPay = c0d0Var;
        this.$smartOffer = plusAcquisitionSmartOffer;
        this.$acquisitionAnalyticsParams = plusAcquisitionPaymentAnalytics$Params;
        this.$payload = map;
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new ButtonSectionController$proxyController$2$1$1$1(this.$plusAcqPay, this.$smartOffer, this.$acquisitionAnalyticsParams, this.$payload, this.this$0, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((ButtonSectionController$proxyController$2$1$1$1) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            f0d0 f0d0Var = (f0d0) ((ls90) this.$plusAcqPay).g.getValue();
            PlusAcquisitionSmartOffer plusAcquisitionSmartOffer = this.$smartOffer;
            PlusAcquisitionPaymentAnalytics$Params plusAcquisitionPaymentAnalytics$Params = this.$acquisitionAnalyticsParams;
            Map<String, String> map = this.$payload;
            this.label = 1;
            obj = ((com.yandex.plus.acquisition.sdk.pay.impl.purchase.a) f0d0Var).a(plusAcquisitionSmartOffer, plusAcquisitionPaymentAnalytics$Params, map, this);
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
        PlusAcquisitionSmartOfferPurchaseResult plusAcquisitionSmartOfferPurchaseResult = (PlusAcquisitionSmartOfferPurchaseResult) obj;
        this.this$0.getClass();
        if (plusAcquisitionSmartOfferPurchaseResult instanceof PlusAcquisitionSmartOfferPurchaseResult.Success) {
            return PlusAcquisitionSdkPurchaseResult.Success.INSTANCE;
        }
        if (plusAcquisitionSmartOfferPurchaseResult instanceof PlusAcquisitionSmartOfferPurchaseResult.Error.Back) {
            return new PlusAcquisitionSdkPurchaseResult.Error.Back(((PlusAcquisitionSmartOfferPurchaseResult.Error.Back) plusAcquisitionSmartOfferPurchaseResult).getMessage());
        }
        if (jl40.l(plusAcquisitionSmartOfferPurchaseResult, PlusAcquisitionSmartOfferPurchaseResult.Error.Connection.INSTANCE)) {
            return PlusAcquisitionSdkPurchaseResult.Error.Connection.INSTANCE;
        }
        if (plusAcquisitionSmartOfferPurchaseResult instanceof PlusAcquisitionSmartOfferPurchaseResult.Error.GooglePlay) {
            return new PlusAcquisitionSdkPurchaseResult.Error.GooglePlay(((PlusAcquisitionSmartOfferPurchaseResult.Error.GooglePlay) plusAcquisitionSmartOfferPurchaseResult).getMessage());
        }
        if (plusAcquisitionSmartOfferPurchaseResult instanceof PlusAcquisitionSmartOfferPurchaseResult.Error.PaymentMethodSelection) {
            return new PlusAcquisitionSdkPurchaseResult.Error.PaymentMethodSelection(((PlusAcquisitionSmartOfferPurchaseResult.Error.PaymentMethodSelection) plusAcquisitionSmartOfferPurchaseResult).getMessage());
        }
        if (jl40.l(plusAcquisitionSmartOfferPurchaseResult, PlusAcquisitionSmartOfferPurchaseResult.Error.Unauthorized.INSTANCE)) {
            return PlusAcquisitionSdkPurchaseResult.Error.Unauthorized.INSTANCE;
        }
        if (jl40.l(plusAcquisitionSmartOfferPurchaseResult, PlusAcquisitionSmartOfferPurchaseResult.Error.Unexpected.INSTANCE)) {
            return PlusAcquisitionSdkPurchaseResult.Error.Unexpected.INSTANCE;
        }
        if (jl40.l(plusAcquisitionSmartOfferPurchaseResult, PlusAcquisitionSmartOfferPurchaseResult.Cancel.INSTANCE)) {
            return PlusAcquisitionSdkPurchaseResult.Cancel.INSTANCE;
        }
        w511.b();
        return null;
    }
}
