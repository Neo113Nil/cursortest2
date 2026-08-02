package com.yandex.plus.home.feature.webviews.internal.purchase.button.delegates.sdk.home;

import com.yandex.plus.home.auth.b;
import com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.PlusPayButtonDiagnostic$ButtonType;
import com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.PlusPayButtonDiagnostic$PaymentType;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.InMessage$PurchaseProductClick$Type;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.OfferTypeDto;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.PurchaseStatusTypeDto;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.PurchaseTypeDto;
import com.yandex.plus.home.repository.api.model.webconfig.SubscriptionConfiguration;
import com.yandex.plus.pay.adapter.api.PlusPaySdkAdapter$CompositeOffer;
import defpackage.EvgenDiagnostic$SubscriptionButtonType;
import defpackage.EvgenDiagnostic$SubscriptionPaymentType;
import defpackage.EvgenDiagnostic$WebViewType;
import defpackage.cnv;
import defpackage.f27;
import defpackage.fnv;
import defpackage.pzf0;
import defpackage.qio;
import defpackage.qzf0;
import defpackage.rpu;
import defpackage.rzf0;
import defpackage.sls;
import defpackage.tje;
import defpackage.tls;
import defpackage.tse;
import defpackage.u350;
import defpackage.uho;
import defpackage.vmv;
import defpackage.w511;
import defpackage.y250;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;

/* loaded from: classes2.dex */
public final class a {
    public final tse a;
    public final rzf0 b;
    public final com.yandex.plus.home.feature.webviews.internal.purchase.button.delegates.sdk.home.payment.a c;
    public final b d;
    public final boolean e;
    public final tls f;
    public final sls g;

    public a(tse tseVar, rzf0 rzf0Var, com.yandex.plus.home.feature.webviews.internal.purchase.button.delegates.sdk.home.payment.a aVar, b bVar, boolean z, tls tlsVar, sls slsVar) {
        this.a = tseVar;
        this.b = rzf0Var;
        this.c = aVar;
        this.d = bVar;
        this.e = z;
        this.f = tlsVar;
        this.g = slsVar;
    }

    public static PurchaseTypeDto d(SubscriptionConfiguration.Subscription.PaymentMethod paymentMethod) {
        int i = rpu.a[paymentMethod.ordinal()];
        if (i == 1) {
            return PurchaseTypeDto.NATIVE;
        }
        if (i == 2) {
            return PurchaseTypeDto.INAPP;
        }
        if (i == 3) {
            return PurchaseTypeDto.UNKNOWN;
        }
        w511.b();
        return null;
    }

    public final void a(f27 f27Var) {
        SubscriptionConfiguration subscriptionConfiguration = f27Var.b;
        y250 y250Var = f27Var.c;
        if (y250Var != null) {
            String str = y250Var.c;
            PlusPaySdkAdapter$CompositeOffer plusPaySdkAdapter$CompositeOffer = y250Var.a;
            PurchaseTypeDto d = d(subscriptionConfiguration.getSubscription().getPaymentMethod());
            tje.N(this.a, null, null, new HomeSdkPayButtonDelegateImpl$onHomeSdkPayButtonClicked$1$1(this, plusPaySdkAdapter$CompositeOffer, null), 3);
            rzf0 rzf0Var = this.b;
            rzf0Var.f(f27Var);
            rzf0Var.g.invoke(new cnv(str, d, InMessage$PurchaseProductClick$Type.BUTTON));
            if (this.d.c()) {
                b(str, subscriptionConfiguration, plusPaySdkAdapter$CompositeOffer);
            }
        }
    }

    public final void b(String str, SubscriptionConfiguration subscriptionConfiguration, PlusPaySdkAdapter$CompositeOffer plusPaySdkAdapter$CompositeOffer) {
        this.b.g.invoke(new fnv(str, PurchaseTypeDto.NATIVE, PurchaseStatusTypeDto.SUCCESS));
        tje.N(this.a, null, null, new HomeSdkPayButtonDelegateImpl$purchaseSubscription$1(this, str, subscriptionConfiguration, plusPaySdkAdapter$CompositeOffer, null), 3);
    }

    public final void c(f27 f27Var) {
        Pair pair;
        OfferTypeDto offerTypeDto;
        rzf0 rzf0Var = this.b;
        tls tlsVar = rzf0Var.g;
        SubscriptionConfiguration subscriptionConfiguration = f27Var.b;
        PurchaseTypeDto d = d(subscriptionConfiguration.getSubscription().getPaymentMethod());
        y250 y250Var = f27Var.c;
        if (y250Var == null) {
            pzf0.a(rzf0Var, null, d, PurchaseStatusTypeDto.FAILURE, f27Var.a.getError(), 1);
            PlusPayButtonDiagnostic$ButtonType plusPayButtonDiagnostic$ButtonType = PlusPayButtonDiagnostic$ButtonType.NATIVE_SDK;
            PlusPayButtonDiagnostic$PaymentType plusPayButtonDiagnostic$PaymentType = PlusPayButtonDiagnostic$PaymentType.TARIFFICATOR;
            qio qioVar = rzf0Var.f;
            uho uhoVar = qioVar.a;
            EvgenDiagnostic$WebViewType evgenDiagnostic$WebViewType = qioVar.b;
            EvgenDiagnostic$SubscriptionButtonType c = qio.c(plusPayButtonDiagnostic$ButtonType);
            EvgenDiagnostic$SubscriptionPaymentType d2 = qio.d(plusPayButtonDiagnostic$PaymentType);
            Map f = kotlin.collections.b.f();
            uhoVar.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("webview_type", evgenDiagnostic$WebViewType.getEventValue());
            linkedHashMap.put("additional_params", f);
            linkedHashMap.put("button_type", c.getEventValue());
            linkedHashMap.put("payment_type", d2.getEventValue());
            linkedHashMap.put("_meta", uho.b(new HashMap()));
            uhoVar.c("Error.WebView.BuySubscription.Button.Loading.Products", linkedHashMap);
            return;
        }
        String str = y250Var.c;
        PlusPaySdkAdapter$CompositeOffer plusPaySdkAdapter$CompositeOffer = y250Var.a;
        boolean z = y250Var.b;
        boolean z2 = ((PlusPaySdkAdapter$CompositeOffer.Invoice) kotlin.collections.a.P(plusPaySdkAdapter$CompositeOffer.getInvoices())).getPrice().getAmount().compareTo(BigDecimal.ZERO) == 0;
        PlusPaySdkAdapter$CompositeOffer.Assets assets = plusPaySdkAdapter$CompositeOffer.getAssets();
        String buttonText = assets != null ? assets.getButtonText() : null;
        PlusPaySdkAdapter$CompositeOffer.Assets assets2 = plusPaySdkAdapter$CompositeOffer.getAssets();
        String buttonTextWithDetails = assets2 != null ? assets2.getButtonTextWithDetails() : null;
        PlusPaySdkAdapter$CompositeOffer.Tariff tariffOffer = plusPaySdkAdapter$CompositeOffer.getTariffOffer();
        if (tariffOffer != null) {
            pair = new Pair(tariffOffer.getText(), tariffOffer.getAdditionalText());
        } else {
            PlusPaySdkAdapter$CompositeOffer.Option option = (PlusPaySdkAdapter$CompositeOffer.Option) kotlin.collections.a.P(plusPaySdkAdapter$CompositeOffer.getOptionOffers());
            pair = new Pair(option.getText(), option.getAdditionalText());
        }
        String str2 = (String) pair.getFirst();
        String str3 = (String) pair.getSecond();
        if (buttonTextWithDetails == null) {
            buttonTextWithDetails = str3;
        }
        boolean z3 = this.e;
        this.f.invoke(new u350(subscriptionConfiguration, str2, buttonTextWithDetails, buttonText, z2, z || z3));
        pzf0.a(rzf0Var, str, d, PurchaseStatusTypeDto.SUCCESS, null, 8);
        if (z) {
            int i = qzf0.c[plusPaySdkAdapter$CompositeOffer.getStructureType().ordinal()];
            if (i == 1) {
                offerTypeDto = OfferTypeDto.TARIFF;
            } else if (i == 2) {
                offerTypeDto = OfferTypeDto.OPTION;
            } else {
                if (i != 3) {
                    w511.b();
                    return;
                }
                offerTypeDto = OfferTypeDto.COMPOSITE;
            }
            tlsVar.invoke(new vmv(str, d, offerTypeDto));
        } else {
            tje.N(this.a, null, null, new HomeSdkPayButtonDelegateImpl$showHomeSdkPayButton$1$1(this, plusPaySdkAdapter$CompositeOffer, null), 3);
            rzf0Var.b(subscriptionConfiguration, plusPaySdkAdapter$CompositeOffer, null, null);
            if (z3) {
                tlsVar.invoke(new cnv(str, d, InMessage$PurchaseProductClick$Type.BUTTON));
            }
        }
        if (this.d.c()) {
            if (z || z3) {
                b(str, subscriptionConfiguration, plusPaySdkAdapter$CompositeOffer);
            }
        }
    }
}
