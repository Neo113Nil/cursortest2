package com.yandex.plus.pay.internal.model;

import com.yandex.plus.pay.internal.feature.offers.PlusPayOfferDetailsConfiguration;
import defpackage.tcc;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0007\u001a\f\u0010\u0003\u001a\u00020\u0004*\u00020\u0002H\u0007¨\u0006\u0005"}, d2 = {"getSwitchOffer", "Lcom/yandex/plus/pay/internal/model/PlusPayAdditionalOffer;", "Lcom/yandex/plus/pay/internal/model/PlusPayAdditionalOffers;", "toOfferDetailsConfiguration", "Lcom/yandex/plus/pay/internal/feature/offers/PlusPayOfferDetailsConfiguration$AdditionalOffers;", "pay-sdk_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PlusPayAdditionalOffersKt {
    public static final PlusPayAdditionalOffer getSwitchOffer(PlusPayAdditionalOffers plusPayAdditionalOffers) {
        Object obj;
        Iterator<T> it = plusPayAdditionalOffers.getOffers().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((PlusPayAdditionalOffer) obj).getOfferSwitchToggle() != null) {
                break;
            }
        }
        return (PlusPayAdditionalOffer) obj;
    }

    public static final PlusPayOfferDetailsConfiguration.AdditionalOffers toOfferDetailsConfiguration(PlusPayAdditionalOffers plusPayAdditionalOffers) {
        List<PlusPayUpsaleStep> passedUpsaleSteps = plusPayAdditionalOffers.getPassedUpsaleSteps();
        List<PlusPayAdditionalOffer> offers = plusPayAdditionalOffers.getOffers();
        ArrayList arrayList = new ArrayList(tcc.n(offers, 10));
        for (PlusPayAdditionalOffer plusPayAdditionalOffer : offers) {
            arrayList.add(new PlusPayOfferDetailsConfiguration.AdditionalOffers.Offer(plusPayAdditionalOffer.getOffer().getOfferName(), plusPayAdditionalOffer.getOffer().getOffersBatchId(), plusPayAdditionalOffer.getOffer().getPositionId(), plusPayAdditionalOffer.getUpsaleStep(), plusPayAdditionalOffer.isSelected()));
        }
        return new PlusPayOfferDetailsConfiguration.AdditionalOffers(passedUpsaleSteps, arrayList);
    }
}
