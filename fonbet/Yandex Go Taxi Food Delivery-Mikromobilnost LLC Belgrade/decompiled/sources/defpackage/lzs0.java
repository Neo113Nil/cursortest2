package defpackage;

import com.yandex.plus.acquisition.sdk.api.offers.PlusAcquisitionOffer;
import com.yandex.plus.acquisition.sdk.api.offers.PlusAcquisitionProduct;
import com.yandex.plus.acquisition.sdk.pay.common.api.PlusAcquisitionSmartOffer;
import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.api.model.PlusPaySmartOffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.a;

/* loaded from: classes2.dex */
public final class lzs0 implements kzs0 {
    public final ConcurrentHashMap a = new ConcurrentHashMap();

    public final PlusPayCompositeOffers.Offer a(PlusAcquisitionSmartOffer plusAcquisitionSmartOffer) {
        Object obj;
        List list = (List) this.a.get(plusAcquisitionSmartOffer.getMeta().getSessionId());
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                PlusAcquisitionOffer compositeOffer = plusAcquisitionSmartOffer.getCompositeOffer();
                PlusPayCompositeOffers.Offer compositeOffer2 = ((PlusPaySmartOffer) obj).getCompositeOffer();
                List<PlusAcquisitionProduct> options = compositeOffer.getOptions();
                ArrayList arrayList = new ArrayList(tcc.n(options, 10));
                Iterator<T> it2 = options.iterator();
                while (it2.hasNext()) {
                    arrayList.add(((PlusAcquisitionProduct) it2.next()).getName());
                }
                Set N0 = a.N0(arrayList);
                List<PlusPayCompositeOffers.Offer.Option> optionOffers = compositeOffer2.getOptionOffers();
                ArrayList arrayList2 = new ArrayList(tcc.n(optionOffers, 10));
                Iterator<T> it3 = optionOffers.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(((PlusPayCompositeOffers.Offer.Option) it3.next()).getId());
                }
                Set N02 = a.N0(arrayList2);
                PlusAcquisitionProduct tariff = compositeOffer.getTariff();
                String name = tariff != null ? tariff.getName() : null;
                PlusPayCompositeOffers.Offer.Tariff tariffOffer = compositeOffer2.getTariffOffer();
                boolean l = jl40.l(name, tariffOffer != null ? tariffOffer.getId() : null);
                boolean z = N0.size() == N02.size() && N0.equals(N02);
                if (l && z) {
                    break;
                }
            }
            PlusPaySmartOffer plusPaySmartOffer = (PlusPaySmartOffer) obj;
            if (plusPaySmartOffer != null) {
                return plusPaySmartOffer.getCompositeOffer();
            }
        }
        return null;
    }
}
