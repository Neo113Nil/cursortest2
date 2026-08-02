package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.closing;

import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.internal.model.PlusPayClosingOffer;
import com.yandex.plus.pay.ui.core.tarifficator.api.data.common.PlusTarifficatorPurchase;
import defpackage.PayUIEvgenAnalytics$PaymentOption;
import defpackage.dio;
import defpackage.eu90;
import defpackage.f7c;
import defpackage.g7c;
import defpackage.ind0;
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
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* synthetic */ class ClosingOfferFragment$onViewCreated$closingOfferViewController$3 extends FunctionReferenceImpl implements sls {
    @Override // defpackage.sls
    public final Object invoke() {
        a aVar = (a) this.receiver;
        PlusPayClosingOffer plusPayClosingOffer = aVar.A;
        if (plusPayClosingOffer != null) {
            f7c f7cVar = aVar.z;
            ind0 a = aVar.x.a.a();
            g7c g7cVar = (g7c) f7cVar;
            g7cVar.getClass();
            PlusTarifficatorPurchase c = a.c();
            PayUIEvgenAnalytics$PaymentOption a2 = dio.a(c.getOffer());
            if (a2 != null) {
                eu90 eu90Var = g7cVar.a;
                String d = dio.d(a.a);
                PlusPayCompositeOffers.Offer.Tariff tariffOffer = c.getOffer().getTariffOffer();
                String id = tariffOffer != null ? tariffOffer.getId() : null;
                if (id == null) {
                    id = "no_value";
                }
                List<PlusPayCompositeOffers.Offer.Option> optionOffers = c.getOffer().getOptionOffers();
                ArrayList arrayList = new ArrayList(tcc.n(optionOffers, 10));
                Iterator<T> it = optionOffers.iterator();
                while (it.hasNext()) {
                    arrayList.add(((PlusPayCompositeOffers.Offer.Option) it.next()).getId());
                }
                String paymentMethodId = c.getPaymentMethodId();
                if (paymentMethodId == null) {
                    paymentMethodId = "no_value";
                }
                PlusPayCompositeOffers.Offer.Tariff tariffOffer2 = plusPayClosingOffer.getOffer().getTariffOffer();
                String id2 = tariffOffer2 != null ? tariffOffer2.getId() : null;
                String str = id2 != null ? id2 : "no_value";
                List<PlusPayCompositeOffers.Offer.Option> optionOffers2 = plusPayClosingOffer.getOffer().getOptionOffers();
                ArrayList arrayList2 = new ArrayList(tcc.n(optionOffers2, 10));
                Iterator<T> it2 = optionOffers2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((PlusPayCompositeOffers.Offer.Option) it2.next()).getId());
                }
                String rejectButtonText = plusPayClosingOffer.getRejectButtonText();
                eu90Var.getClass();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                xvz.x(a2, linkedHashMap, "payment_option", "payment_method_id", paymentMethodId);
                linkedHashMap.put("purchase_session_id", d);
                linkedHashMap.put("product_id", id);
                linkedHashMap.put("options_id", arrayList);
                linkedHashMap.put("closing_offer_product_id", str);
                linkedHashMap.put("closing_offer_options_id", arrayList2);
                linkedHashMap.put("button_text", rejectButtonText);
                linkedHashMap.put("_meta", eu90.c(new HashMap()));
                eu90Var.f("ClosingOffer.Button.Reject.Clicked", linkedHashMap);
            }
        }
        aVar.b.a();
        return zy11.a;
    }
}
