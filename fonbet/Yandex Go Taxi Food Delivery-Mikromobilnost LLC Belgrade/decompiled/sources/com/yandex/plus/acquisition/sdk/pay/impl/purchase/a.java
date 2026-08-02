package com.yandex.plus.acquisition.sdk.pay.impl.purchase;

import com.yandex.plus.acquisition.sdk.pay.common.api.PlusAcquisitionPaymentAnalytics$Params;
import com.yandex.plus.acquisition.sdk.pay.common.api.PlusAcquisitionSmartOffer;
import com.yandex.plus.acquisition.sdk.pay.common.api.PlusAcquisitionSmartOfferPurchaseResult;
import com.yandex.plus.pay.api.analytics.PlusPayPaymentAnalyticsParams;
import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.ui.api.feature.payment.PlusPaymentFlowErrorReason;
import com.yandex.plus.pay.ui.tarifficator.api.PlusTarifficatorPaymentConfiguration$PreferredMode;
import defpackage.apd0;
import defpackage.au90;
import defpackage.bpd0;
import defpackage.f0d0;
import defpackage.fu91;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.kzs0;
import defpackage.lzs0;
import defpackage.mgd0;
import defpackage.mpd0;
import defpackage.ny61;
import defpackage.oo2;
import defpackage.qgd0;
import defpackage.tt20;
import defpackage.vnd0;
import defpackage.w511;
import defpackage.wnd0;
import defpackage.yod0;
import defpackage.zod0;
import defpackage.zt90;
import java.util.Locale;
import java.util.Map;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class a implements f0d0 {
    public final qgd0 a;
    public final zt90 b;
    public final kzs0 c;

    public a(qgd0 qgd0Var, zt90 zt90Var, kzs0 kzs0Var) {
        this.a = qgd0Var;
        this.b = zt90Var;
        this.c = kzs0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0146, code lost:
    
        if (r3 != r5) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(PlusAcquisitionSmartOffer plusAcquisitionSmartOffer, PlusAcquisitionPaymentAnalytics$Params plusAcquisitionPaymentAnalytics$Params, Map map, ContinuationImpl continuationImpl) {
        PurchaseSmartOfferFacade$purchaseSmartOffer$1 purchaseSmartOfferFacade$purchaseSmartOffer$1;
        int i;
        PlusPayCompositeOffers.Offer a;
        int i2;
        Object obj;
        wnd0 wnd0Var;
        PlusPayPaymentAnalyticsParams plusPayPaymentAnalyticsParams;
        Object obj2;
        Object paymentMethodSelection;
        a aVar = this;
        PlusAcquisitionSmartOffer plusAcquisitionSmartOffer2 = plusAcquisitionSmartOffer;
        if (continuationImpl instanceof PurchaseSmartOfferFacade$purchaseSmartOffer$1) {
            purchaseSmartOfferFacade$purchaseSmartOffer$1 = (PurchaseSmartOfferFacade$purchaseSmartOffer$1) continuationImpl;
            int i3 = purchaseSmartOfferFacade$purchaseSmartOffer$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                purchaseSmartOfferFacade$purchaseSmartOffer$1.label = i3 - Integer.MIN_VALUE;
                Object obj3 = purchaseSmartOfferFacade$purchaseSmartOffer$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = purchaseSmartOfferFacade$purchaseSmartOffer$1.label;
                if (i != 0) {
                    b.b(obj3);
                    vnd0 vnd0Var = new vnd0();
                    if (plusAcquisitionSmartOffer2.isOneClickEnabled()) {
                        vnd0Var.a = PlusTarifficatorPaymentConfiguration$PreferredMode.SILENT;
                    }
                    vnd0Var.b = map;
                    wnd0 wnd0Var2 = new wnd0(vnd0Var.a, map);
                    plusAcquisitionSmartOffer2.getPlace();
                    plusAcquisitionSmartOffer2.getPage();
                    String from = plusAcquisitionPaymentAnalytics$Params.getFrom();
                    Map<String, String> customParams = plusAcquisitionPaymentAnalytics$Params.getCustomParams();
                    ((au90) aVar.b).getClass();
                    PlusPayPaymentAnalyticsParams.Companion.getClass();
                    PlusPayPaymentAnalyticsParams.a aVar2 = new PlusPayPaymentAnalyticsParams.a();
                    aVar2.a = from;
                    for (Map.Entry<String, String> entry : customParams.entrySet()) {
                        aVar2.a(entry.getValue(), entry.getKey());
                    }
                    PlusPayPaymentAnalyticsParams plusPayPaymentAnalyticsParams2 = new PlusPayPaymentAnalyticsParams(aVar2.a, aVar2.b, aVar2.c, aVar2.d, null);
                    a = ((lzs0) aVar.c).a(plusAcquisitionSmartOffer2);
                    if (a != null) {
                        purchaseSmartOfferFacade$purchaseSmartOffer$1.L$0 = plusAcquisitionSmartOffer2;
                        purchaseSmartOfferFacade$purchaseSmartOffer$1.L$1 = null;
                        purchaseSmartOfferFacade$purchaseSmartOffer$1.L$2 = null;
                        purchaseSmartOfferFacade$purchaseSmartOffer$1.L$3 = wnd0Var2;
                        purchaseSmartOfferFacade$purchaseSmartOffer$1.L$4 = plusPayPaymentAnalyticsParams2;
                        purchaseSmartOfferFacade$purchaseSmartOffer$1.L$5 = a;
                        purchaseSmartOfferFacade$purchaseSmartOffer$1.L$6 = aVar;
                        i2 = 0;
                        purchaseSmartOfferFacade$purchaseSmartOffer$1.I$0 = 0;
                        purchaseSmartOfferFacade$purchaseSmartOffer$1.label = 1;
                        obj = (com.yandex.plus.pay.ui.core.internal.a) ((i3y) ((oo2) ((mgd0) aVar.a).a.a).x).getValue();
                        if (obj != coroutineSingletons) {
                            wnd0Var = wnd0Var2;
                            plusPayPaymentAnalyticsParams = plusPayPaymentAnalyticsParams2;
                        }
                        return coroutineSingletons;
                    }
                    return PlusAcquisitionSmartOfferPurchaseResult.Cancel.INSTANCE;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    aVar = (a) purchaseSmartOfferFacade$purchaseSmartOffer$1.L$6;
                    plusAcquisitionSmartOffer2 = (PlusAcquisitionSmartOffer) purchaseSmartOfferFacade$purchaseSmartOffer$1.L$0;
                    b.b(obj3);
                    bpd0 bpd0Var = (bpd0) obj3;
                    aVar.getClass();
                    if (bpd0Var instanceof apd0) {
                        obj2 = new PlusAcquisitionSmartOfferPurchaseResult.Success(plusAcquisitionSmartOffer2);
                    } else if (bpd0Var instanceof zod0) {
                        PlusPaymentFlowErrorReason plusPaymentFlowErrorReason = ((zod0) bpd0Var).a;
                        if (plusPaymentFlowErrorReason instanceof PlusPaymentFlowErrorReason.Backend) {
                            paymentMethodSelection = new PlusAcquisitionSmartOfferPurchaseResult.Error.Back(((PlusPaymentFlowErrorReason.Backend) plusPaymentFlowErrorReason).getKind().name().toLowerCase(Locale.ROOT));
                        } else if (plusPaymentFlowErrorReason instanceof PlusPaymentFlowErrorReason.GooglePlay) {
                            paymentMethodSelection = new PlusAcquisitionSmartOfferPurchaseResult.Error.GooglePlay(((PlusPaymentFlowErrorReason.GooglePlay) plusPaymentFlowErrorReason).getKind().name().toLowerCase(Locale.ROOT));
                        } else if (jl40.l(plusPaymentFlowErrorReason, PlusPaymentFlowErrorReason.Connection.INSTANCE)) {
                            obj2 = PlusAcquisitionSmartOfferPurchaseResult.Error.Connection.INSTANCE;
                        } else if (plusPaymentFlowErrorReason instanceof PlusPaymentFlowErrorReason.PaymentMethodSelection) {
                            StringBuilder sb = new StringBuilder("message = ");
                            PlusPaymentFlowErrorReason.PaymentMethodSelection paymentMethodSelection2 = (PlusPaymentFlowErrorReason.PaymentMethodSelection) plusPaymentFlowErrorReason;
                            sb.append(paymentMethodSelection2.getErrorState().getMessage());
                            sb.append(", code = ");
                            sb.append(paymentMethodSelection2.getErrorState().getCode());
                            sb.append(", status = ");
                            sb.append(paymentMethodSelection2.getErrorState().getStatus());
                            sb.append(", kind = ");
                            sb.append(paymentMethodSelection2.getErrorState().getKind());
                            sb.append(", trigger = ");
                            sb.append(paymentMethodSelection2.getErrorState().getTrigger());
                            paymentMethodSelection = new PlusAcquisitionSmartOfferPurchaseResult.Error.PaymentMethodSelection(sb.toString());
                        } else if (jl40.l(plusPaymentFlowErrorReason, PlusPaymentFlowErrorReason.Unauthorized.INSTANCE)) {
                            obj2 = PlusAcquisitionSmartOfferPurchaseResult.Error.Unauthorized.INSTANCE;
                        } else {
                            if (!jl40.l(plusPaymentFlowErrorReason, PlusPaymentFlowErrorReason.Unexpected.INSTANCE)) {
                                w511.b();
                                return null;
                            }
                            obj2 = PlusAcquisitionSmartOfferPurchaseResult.Error.Unexpected.INSTANCE;
                        }
                        obj2 = paymentMethodSelection;
                    } else {
                        if (!(bpd0Var instanceof yod0)) {
                            w511.b();
                            return null;
                        }
                        obj2 = PlusAcquisitionSmartOfferPurchaseResult.Cancel.INSTANCE;
                    }
                    if (obj2 != null) {
                        return obj2;
                    }
                    return PlusAcquisitionSmartOfferPurchaseResult.Cancel.INSTANCE;
                }
                int i4 = purchaseSmartOfferFacade$purchaseSmartOffer$1.I$0;
                a aVar3 = (a) purchaseSmartOfferFacade$purchaseSmartOffer$1.L$6;
                a = (PlusPayCompositeOffers.Offer) purchaseSmartOfferFacade$purchaseSmartOffer$1.L$5;
                plusPayPaymentAnalyticsParams = (PlusPayPaymentAnalyticsParams) purchaseSmartOfferFacade$purchaseSmartOffer$1.L$4;
                wnd0 wnd0Var3 = (wnd0) purchaseSmartOfferFacade$purchaseSmartOffer$1.L$3;
                PlusAcquisitionSmartOffer plusAcquisitionSmartOffer3 = (PlusAcquisitionSmartOffer) purchaseSmartOfferFacade$purchaseSmartOffer$1.L$0;
                b.b(obj3);
                i2 = i4;
                aVar = aVar3;
                plusAcquisitionSmartOffer2 = plusAcquisitionSmartOffer3;
                wnd0Var = wnd0Var3;
                obj = obj3;
                mpd0 h = fu91.h((com.yandex.plus.pay.ui.core.internal.a) obj);
                purchaseSmartOfferFacade$purchaseSmartOffer$1.L$0 = plusAcquisitionSmartOffer2;
                purchaseSmartOfferFacade$purchaseSmartOffer$1.L$1 = null;
                purchaseSmartOfferFacade$purchaseSmartOffer$1.L$2 = null;
                purchaseSmartOfferFacade$purchaseSmartOffer$1.L$3 = null;
                purchaseSmartOfferFacade$purchaseSmartOffer$1.L$4 = null;
                purchaseSmartOfferFacade$purchaseSmartOffer$1.L$5 = null;
                purchaseSmartOfferFacade$purchaseSmartOffer$1.L$6 = aVar;
                purchaseSmartOfferFacade$purchaseSmartOffer$1.I$0 = i2;
                purchaseSmartOfferFacade$purchaseSmartOffer$1.label = 2;
                obj3 = ((tt20) h).a(a, plusPayPaymentAnalyticsParams, wnd0Var, purchaseSmartOfferFacade$purchaseSmartOffer$1);
            }
        }
        purchaseSmartOfferFacade$purchaseSmartOffer$1 = new PurchaseSmartOfferFacade$purchaseSmartOffer$1(aVar, continuationImpl);
        Object obj32 = purchaseSmartOfferFacade$purchaseSmartOffer$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = purchaseSmartOfferFacade$purchaseSmartOffer$1.label;
        if (i != 0) {
        }
        mpd0 h2 = fu91.h((com.yandex.plus.pay.ui.core.internal.a) obj);
        purchaseSmartOfferFacade$purchaseSmartOffer$1.L$0 = plusAcquisitionSmartOffer2;
        purchaseSmartOfferFacade$purchaseSmartOffer$1.L$1 = null;
        purchaseSmartOfferFacade$purchaseSmartOffer$1.L$2 = null;
        purchaseSmartOfferFacade$purchaseSmartOffer$1.L$3 = null;
        purchaseSmartOfferFacade$purchaseSmartOffer$1.L$4 = null;
        purchaseSmartOfferFacade$purchaseSmartOffer$1.L$5 = null;
        purchaseSmartOfferFacade$purchaseSmartOffer$1.L$6 = aVar;
        purchaseSmartOfferFacade$purchaseSmartOffer$1.I$0 = i2;
        purchaseSmartOfferFacade$purchaseSmartOffer$1.label = 2;
        obj32 = ((tt20) h2).a(a, plusPayPaymentAnalyticsParams, wnd0Var, purchaseSmartOfferFacade$purchaseSmartOffer$1);
    }
}
