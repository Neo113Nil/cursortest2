package defpackage;

import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import java.util.Iterator;
import kotlin.collections.a;

/* loaded from: classes2.dex */
public abstract class bu60 {
    public static final String a(PlusPayCompositeOffers.Offer offer) {
        Object obj;
        String id;
        PlusPayCompositeOffers.Offer.Tariff tariffOffer = offer.getTariffOffer();
        if (tariffOffer != null) {
            if (tariffOffer.getVendor() != PlusPayCompositeOffers.Offer.Vendor.GOOGLE_PLAY) {
                tariffOffer = null;
            }
            if (tariffOffer != null && (id = tariffOffer.getId()) != null) {
                return id;
            }
        }
        Iterator<T> it = offer.getOptionOffers().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((PlusPayCompositeOffers.Offer.Option) obj).getVendor() == PlusPayCompositeOffers.Offer.Vendor.GOOGLE_PLAY) {
                break;
            }
        }
        PlusPayCompositeOffers.Offer.Option option = (PlusPayCompositeOffers.Offer.Option) obj;
        if (option != null) {
            return option.getId();
        }
        return null;
    }

    public static final String b(PlusPayCompositeOffers.Offer offer) {
        String id;
        StringBuilder sb = new StringBuilder();
        PlusPayCompositeOffers.Offer.Tariff tariffOffer = offer.getTariffOffer();
        String concat = (tariffOffer == null || (id = tariffOffer.getId()) == null) ? null : id.concat(":");
        if (concat == null) {
            concat = "";
        }
        sb.append(concat);
        sb.append(a.X(offer.getOptionOffers(), ":", null, null, new fd60(13), 30));
        return sb.toString();
    }
}
