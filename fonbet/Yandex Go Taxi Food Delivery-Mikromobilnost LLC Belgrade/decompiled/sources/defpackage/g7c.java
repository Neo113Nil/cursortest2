package defpackage;

import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.internal.model.PlusPayClosingOffer;
import com.yandex.plus.pay.ui.core.tarifficator.api.data.common.PlusTarifficatorPurchase;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes2.dex */
public final class g7c implements f7c {
    public final eu90 a;
    public final vfd0 b;

    public g7c(eu90 eu90Var, vfd0 vfd0Var) {
        this.a = eu90Var;
        this.b = vfd0Var;
    }

    public final void a(ind0 ind0Var, PlusPayClosingOffer plusPayClosingOffer) {
        PlusTarifficatorPurchase c = ind0Var.c();
        PayUIEvgenAnalytics$PaymentOption a = dio.a(c.getOffer());
        if (a != null) {
            String d = dio.d(ind0Var.a);
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
            eu90 eu90Var = this.a;
            eu90Var.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            xvz.x(a, linkedHashMap, "payment_option", "payment_method_id", paymentMethodId);
            linkedHashMap.put("purchase_session_id", d);
            linkedHashMap.put("product_id", id);
            linkedHashMap.put("options_id", arrayList);
            linkedHashMap.put("closing_offer_product_id", str);
            linkedHashMap.put("closing_offer_options_id", arrayList2);
            linkedHashMap.put("_meta", eu90.c(new HashMap()));
            eu90Var.f("ClosingOffer.Button.Close.Clicked", linkedHashMap);
        }
    }
}
