package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.upsale;

import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.api.model.PlusPayCompositeUpsale;
import com.yandex.plus.pay.ui.core.tarifficator.api.data.common.PlusTarifficatorPurchase;
import defpackage.PayUIEvgenAnalytics$PaymentOption;
import defpackage.dio;
import defpackage.eu90;
import defpackage.ind0;
import defpackage.opd0;
import defpackage.ppd0;
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
public final /* synthetic */ class UpsaleFragment$onViewCreated$upsaleContentViewController$2 extends FunctionReferenceImpl implements sls {
    @Override // defpackage.sls
    public final Object invoke() {
        b bVar = (b) this.receiver;
        PlusPayCompositeUpsale plusPayCompositeUpsale = bVar.G;
        if (plusPayCompositeUpsale != null) {
            opd0 opd0Var = bVar.C;
            ind0 a = bVar.c.a.a();
            ppd0 ppd0Var = (ppd0) opd0Var;
            ppd0Var.getClass();
            PlusTarifficatorPurchase c = a.c();
            PayUIEvgenAnalytics$PaymentOption a2 = dio.a(c.getOffer());
            String paymentMethodId = c.getPaymentMethodId();
            if (a2 != null) {
                eu90 eu90Var = ppd0Var.a;
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
                if (paymentMethodId == null) {
                    paymentMethodId = "no_value";
                }
                PlusPayCompositeOffers.Offer.Tariff tariffOffer2 = plusPayCompositeUpsale.getOffer().getTariffOffer();
                String id2 = tariffOffer2 != null ? tariffOffer2.getId() : null;
                String str = id2 != null ? id2 : "no_value";
                List<PlusPayCompositeOffers.Offer.Option> optionOffers2 = plusPayCompositeUpsale.getOffer().getOptionOffers();
                ArrayList arrayList2 = new ArrayList(tcc.n(optionOffers2, 10));
                Iterator<T> it2 = optionOffers2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((PlusPayCompositeOffers.Offer.Option) it2.next()).getId());
                }
                boolean z = c.getType() == PlusTarifficatorPurchase.Type.SILENT;
                LinkedHashMap t = xvz.t(eu90Var, "purchase_session_id", d, "product_id", id);
                xvz.A(t, "options_id", arrayList, true, "is_tarifficator");
                xvz.x(a2, t, "payment_option", "payment_method_id", paymentMethodId);
                t.put("card_linked", String.valueOf(false));
                t.put("upsale_product_id", str);
                t.put("upsale_options_id", arrayList2);
                t.put("silent", String.valueOf(z));
                t.put("_meta", eu90.c(new HashMap()));
                eu90Var.f("Upsale.Skip.Clicked", t);
            }
        }
        bVar.Y();
        return zy11.a;
    }
}
