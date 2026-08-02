package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.counter_offers;

import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.internal.model.PlusPayCounterOffers;
import com.yandex.plus.pay.internal.model.PlusPayCounterOffersReason;
import com.yandex.plus.pay.ui.core.tarifficator.api.data.common.PlusTarifficatorPurchase;
import defpackage.dio;
import defpackage.eu90;
import defpackage.i0f;
import defpackage.ind0;
import defpackage.j0f;
import defpackage.jnd0;
import defpackage.knd0;
import defpackage.tcc;
import defpackage.tls;
import defpackage.xvz;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.b;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* synthetic */ class CounterOffersFragment$onViewCreated$counterOffersViewController$3 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int intValue = ((Number) obj).intValue();
        a aVar = (a) this.receiver;
        jnd0 jnd0Var = aVar.c;
        PlusPayCounterOffers plusPayCounterOffers = aVar.F;
        if (plusPayCounterOffers != null) {
            PlusPayCompositeOffers.Offer offer = plusPayCounterOffers.getOffers().get(intValue).getOffer();
            i0f i0fVar = aVar.C;
            knd0 knd0Var = jnd0Var.a;
            ind0 a = knd0Var.a();
            PlusPayCounterOffersReason plusPayCounterOffersReason = aVar.E;
            j0f j0fVar = (j0f) i0fVar;
            eu90 eu90Var = j0fVar.a;
            String d = dio.d(a.a);
            PlusTarifficatorPurchase plusTarifficatorPurchase = a.b;
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
            String productTarget = offer.getMeta().getProductTarget();
            String code = plusPayCounterOffersReason.getCode();
            PlusPayCompositeOffers.Offer.Tariff tariffOffer2 = offer.getTariffOffer();
            String id2 = tariffOffer2 != null ? tariffOffer2.getId() : null;
            String str = id2 != null ? id2 : "no_value";
            List<PlusPayCompositeOffers.Offer.Option> optionOffers2 = offer.getOptionOffers();
            ArrayList arrayList2 = new ArrayList(tcc.n(optionOffers2, 10));
            Iterator<T> it2 = optionOffers2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((PlusPayCompositeOffers.Offer.Option) it2.next()).getId());
            }
            LinkedHashMap t = xvz.t(eu90Var, "purchase_session_id", d, "product_id", id);
            t.put("options_id", arrayList);
            t.put("target", productTarget);
            t.put(CRLReasonCodeExtension.REASON, code);
            t.put("counter_offer_product_id", str);
            t.put("counter_offer_options_id", arrayList2);
            t.put("counter_offer_position", String.valueOf(intValue));
            t.put("_meta", eu90.c(new HashMap()));
            eu90Var.f("CounterOffers.Offer.Clicked", t);
            j0fVar.b.b(offer, intValue, "counter_offer", "checkout_counter_offers_page", null, b.f());
            ind0 a2 = knd0Var.a();
            knd0Var.a = ind0.a(a2, PlusTarifficatorPurchase.copy$default(a2.b, offer, null, null, null, PlusTarifficatorPurchase.Source.COUNTER_OFFERS, null, null, 108, null), null, 29);
            aVar.b.b();
        }
        return zy11.a;
    }
}
