package defpackage;

import com.yandex.plus.log.api.LogPriority;
import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class f5r implements qqd {
    public final mdd0 a;

    public f5r(mdd0 mdd0Var) {
        this.a = mdd0Var;
    }

    @Override // defpackage.qqd
    public final Object a(PlusPayCompositeOffers plusPayCompositeOffers, ContinuationImpl continuationImpl) {
        LogPriority logPriority = LogPriority.DEBUG;
        mdd0 mdd0Var = this.a;
        mdd0Var.getClass();
        ndd0 ndd0Var = (ndd0) mdd0Var;
        ndd0Var.a(logPriority, "FilterUnknownVendorPostProcessor", "Filtering offers with unknown vendors");
        List<PlusPayCompositeOffers.Offer> offers = plusPayCompositeOffers.getOffers();
        ArrayList arrayList = new ArrayList();
        for (Object obj : offers) {
            PlusPayCompositeOffers.Offer offer = (PlusPayCompositeOffers.Offer) obj;
            PlusPayCompositeOffers.Offer.Tariff tariffOffer = offer.getTariffOffer();
            if ((tariffOffer != null ? tariffOffer.getVendor() : null) != PlusPayCompositeOffers.Offer.Vendor.UNKNOWN) {
                List<PlusPayCompositeOffers.Offer.Option> optionOffers = offer.getOptionOffers();
                if (!(optionOffers instanceof Collection) || !optionOffers.isEmpty()) {
                    Iterator<T> it = optionOffers.iterator();
                    while (it.hasNext()) {
                        if (((PlusPayCompositeOffers.Offer.Option) it.next()).getVendor() != PlusPayCompositeOffers.Offer.Vendor.UNKNOWN) {
                        }
                    }
                }
                arrayList.add(obj);
            }
        }
        PlusPayCompositeOffers plusPayCompositeOffers2 = new PlusPayCompositeOffers(plusPayCompositeOffers.getSessionId(), plusPayCompositeOffers.getOffersBatchId(), arrayList, plusPayCompositeOffers.getTarget());
        ndd0Var.a(LogPriority.DEBUG, "FilterUnknownVendorPostProcessor", "Filtering is done: " + plusPayCompositeOffers2);
        return plusPayCompositeOffers2;
    }
}
