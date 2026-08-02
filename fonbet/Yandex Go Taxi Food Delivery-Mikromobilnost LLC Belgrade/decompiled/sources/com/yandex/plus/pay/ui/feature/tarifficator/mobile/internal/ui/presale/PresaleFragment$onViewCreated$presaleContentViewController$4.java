package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.presale;

import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.api.model.PlusPayLegalInfo;
import com.yandex.plus.pay.internal.model.PlusPayPresale;
import com.yandex.plus.pay.internal.model.PlusPayRichText;
import com.yandex.plus.pay.ui.core.tarifficator.api.data.common.PlusTarifficatorPurchase;
import defpackage.dio;
import defpackage.eu90;
import defpackage.ind0;
import defpackage.sls;
import defpackage.tcc;
import defpackage.vod0;
import defpackage.wod0;
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
public final /* synthetic */ class PresaleFragment$onViewCreated$presaleContentViewController$4 extends FunctionReferenceImpl implements sls {
    @Override // defpackage.sls
    public final Object invoke() {
        PlusPayRichText fromLegalInfo;
        a aVar = (a) this.receiver;
        PlusPayPresale plusPayPresale = aVar.B;
        if (plusPayPresale != null && !aVar.A) {
            aVar.A = true;
            vod0 vod0Var = aVar.x;
            ind0 a = aVar.b.a.a();
            eu90 eu90Var = ((wod0) vod0Var).b;
            String d = dio.d(a.a);
            PlusTarifficatorPurchase plusTarifficatorPurchase = a.b;
            PlusPayCompositeOffers.Offer.Tariff tariffOffer = plusTarifficatorPurchase.getOffer().getTariffOffer();
            String str = null;
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
            if (id2 == null) {
                id2 = "no_value";
            }
            List<PlusPayCompositeOffers.Offer.Option> optionOffers2 = plusPayPresale.getSuggestedOffer().getOptionOffers();
            ArrayList arrayList2 = new ArrayList(tcc.n(optionOffers2, 10));
            Iterator<T> it2 = optionOffers2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((PlusPayCompositeOffers.Offer.Option) it2.next()).getId());
            }
            PlusPayLegalInfo legalInfo = plusPayPresale.getSuggestedOffer().getLegalInfo();
            if (legalInfo != null && (fromLegalInfo = PlusPayRichText.INSTANCE.fromLegalInfo(legalInfo)) != null) {
                str = com.yandex.plus.pay.ui.common.api.utils.a.c(fromLegalInfo);
            }
            String str2 = str != null ? str : "no_value";
            LinkedHashMap t = xvz.t(eu90Var, "purchase_session_id", d, "product_id", id);
            t.put("options_id", arrayList);
            t.put("target", productTarget);
            t.put("loading_duration_millis", String.valueOf(loadingDelayMillis));
            t.put("presale_product_id", id2);
            t.put("presale_options_id", arrayList2);
            t.put("presale_legal_text", str2);
            t.put("_meta", eu90.c(new HashMap()));
            eu90Var.f("Presale.LegalText.Shown", t);
        }
        return zy11.a;
    }
}
