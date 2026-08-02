package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.presale;

import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.internal.model.PlusPayPresale;
import com.yandex.plus.pay.ui.core.tarifficator.api.data.common.PlusTarifficatorPurchase;
import defpackage.dio;
import defpackage.eu90;
import defpackage.g8e;
import defpackage.ind0;
import defpackage.sls;
import defpackage.tcc;
import defpackage.vod0;
import defpackage.wod0;
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
public final /* synthetic */ class PresaleFragment$onViewCreated$presaleContentViewController$3 extends FunctionReferenceImpl implements sls {
    @Override // defpackage.sls
    public final Object invoke() {
        a aVar = (a) this.receiver;
        PlusPayPresale plusPayPresale = aVar.B;
        if (plusPayPresale != null) {
            vod0 vod0Var = aVar.x;
            ind0 a = aVar.b.a.a();
            eu90 eu90Var = ((wod0) vod0Var).b;
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
            String productTarget = plusPayPresale.getSuggestedOffer().getMeta().getProductTarget();
            long loadingDelayMillis = plusPayPresale.getLoadingDelayMillis();
            PlusPayCompositeOffers.Offer.Tariff tariffOffer2 = plusPayPresale.getSuggestedOffer().getTariffOffer();
            String id2 = tariffOffer2 != null ? tariffOffer2.getId() : null;
            String str = id2 != null ? id2 : "no_value";
            List<PlusPayCompositeOffers.Offer.Option> optionOffers2 = plusPayPresale.getSuggestedOffer().getOptionOffers();
            ArrayList arrayList2 = new ArrayList(tcc.n(optionOffers2, 10));
            Iterator<T> it2 = optionOffers2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((PlusPayCompositeOffers.Offer.Option) it2.next()).getId());
            }
            String text = plusPayPresale.getAssets().getOriginalOfferButtonText().getText();
            eu90Var.getClass();
            LinkedHashMap y = g8e.y("purchase_session_id", d, "product_id", id);
            y.put("options_id", arrayList);
            y.put("target", productTarget);
            y.put("loading_duration_millis", String.valueOf(loadingDelayMillis));
            y.put("presale_product_id", str);
            y.put("presale_options_id", arrayList2);
            y.put("button_text", text);
            y.put("_meta", eu90.c(new HashMap()));
            eu90Var.f("Presale.Reject.Clicked", y);
        }
        aVar.X();
        return zy11.a;
    }
}
