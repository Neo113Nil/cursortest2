package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.checkout;

import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.api.model.PlusPayLegalInfo;
import com.yandex.plus.pay.internal.model.PlusPayCompositeOfferDetails;
import com.yandex.plus.pay.internal.model.PlusPayRichText;
import com.yandex.plus.pay.ui.core.tarifficator.api.data.common.PlusTarifficatorPurchase;
import defpackage.PayUIEvgenAnalytics$PaymentOption;
import defpackage.dio;
import defpackage.eu90;
import defpackage.fnd0;
import defpackage.hnd0;
import defpackage.ind0;
import defpackage.rcc;
import defpackage.sls;
import defpackage.tcc;
import defpackage.xvz;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* synthetic */ class CheckoutFragment$onViewCreated$checkoutContentViewController$6 extends FunctionReferenceImpl implements sls {
    @Override // defpackage.sls
    public final Object invoke() {
        PlusPayRichText promoLegalInfo;
        PlusPayLegalInfo legalInfo;
        PlusPayRichText fromLegalInfo;
        d dVar = (d) this.receiver;
        if (!dVar.P) {
            dVar.P = true;
            fnd0 fnd0Var = dVar.G;
            ind0 a = dVar.c.a.a();
            hnd0 hnd0Var = (hnd0) fnd0Var;
            hnd0Var.getClass();
            PlusTarifficatorPurchase plusTarifficatorPurchase = a.b;
            PayUIEvgenAnalytics$PaymentOption a2 = dio.a(plusTarifficatorPurchase.getOffer());
            String paymentMethodId = plusTarifficatorPurchase.getPaymentMethodId();
            ListBuilder a3 = rcc.a();
            PlusPayCompositeOfferDetails offerDetails = plusTarifficatorPurchase.getOfferDetails();
            if (offerDetails != null && (legalInfo = offerDetails.getLegalInfo()) != null && (fromLegalInfo = PlusPayRichText.INSTANCE.fromLegalInfo(legalInfo)) != null) {
                a3.add(com.yandex.plus.pay.ui.common.api.utils.a.c(fromLegalInfo));
            }
            if (offerDetails != null && (promoLegalInfo = offerDetails.getPromoLegalInfo()) != null) {
                if (!((Boolean) hnd0Var.d.invoke()).booleanValue()) {
                    promoLegalInfo = null;
                }
                if (promoLegalInfo != null) {
                    a3.add(com.yandex.plus.pay.ui.common.api.utils.a.c(promoLegalInfo));
                }
            }
            ListBuilder j = a3.j();
            if (a2 != null) {
                eu90 eu90Var = hnd0Var.a;
                String d = dio.d(a.a);
                PlusPayCompositeOffers.Offer.Tariff tariffOffer = plusTarifficatorPurchase.getOffer().getTariffOffer();
                String id = tariffOffer != null ? tariffOffer.getId() : null;
                if (id == null) {
                    id = "no_value";
                }
                List<PlusPayCompositeOffers.Offer.Option> optionOffers = plusTarifficatorPurchase.getOffer().getOptionOffers();
                ArrayList arrayList = new ArrayList(tcc.n(optionOffers, 10));
                Iterator<T> it = optionOffers.iterator();
                while (it.hasNext()) {
                    arrayList.add(((PlusPayCompositeOffers.Offer.Option) it.next()).getId());
                }
                if (paymentMethodId == null) {
                    paymentMethodId = "no_value";
                }
                LinkedHashMap t = xvz.t(eu90Var, "purchase_session_id", d, "product_id", id);
                xvz.A(t, "options_id", arrayList, true, "is_tarifficator");
                xvz.x(a2, t, "payment_option", "payment_method_id", paymentMethodId);
                t.put("legal_text", j);
                t.put("_meta", eu90.c(new HashMap()));
                eu90Var.f("Checkout.LegalText.Shown", t);
            }
        }
        return zy11.a;
    }
}
