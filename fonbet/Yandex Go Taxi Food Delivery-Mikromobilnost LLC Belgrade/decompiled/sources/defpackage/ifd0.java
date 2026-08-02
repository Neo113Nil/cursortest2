package defpackage;

import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.api.model.PlusPayPrice;
import com.yandex.plus.pay.repository.api.model.offers.Price;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.a;
import kotlin.collections.builders.ListBuilder;

/* loaded from: classes2.dex */
public final class ifd0 {
    public static ListBuilder a(PlusPayCompositeOffers.Offer offer) {
        PlusPayCompositeOffers.Offer.Tariff tariffOffer = offer.getTariffOffer();
        sju0 sju0Var = null;
        if (tariffOffer != null) {
            if (tariffOffer.getVendor() != PlusPayCompositeOffers.Offer.Vendor.GOOGLE_PLAY) {
                tariffOffer = null;
            }
            if (tariffOffer != null) {
                List<PlusPayCompositeOffers.Offer.Plan> plans = tariffOffer.getPlans();
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = plans.iterator();
                while (it.hasNext()) {
                    rju0 b = b((PlusPayCompositeOffers.Offer.Plan) it.next(), tariffOffer.getCommonPrice().getCurrency());
                    if (b != null) {
                        arrayList.add(b);
                    }
                }
                String commonPeriod = tariffOffer.getCommonPeriod();
                PlusPayPrice commonPrice = tariffOffer.getCommonPrice();
                sju0Var = new sju0(tariffOffer.getId(), a.o0(arrayList, new rju0(commonPeriod, new Price(commonPrice.getAmount(), commonPrice.getCurrency()), 0)));
            }
        }
        List<PlusPayCompositeOffers.Offer.Option> optionOffers = offer.getOptionOffers();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : optionOffers) {
            if (((PlusPayCompositeOffers.Offer.Option) obj).getVendor() == PlusPayCompositeOffers.Offer.Vendor.GOOGLE_PLAY) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(tcc.n(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            PlusPayCompositeOffers.Offer.Option option = (PlusPayCompositeOffers.Offer.Option) it2.next();
            List<PlusPayCompositeOffers.Offer.Plan> plans2 = option.getPlans();
            ArrayList arrayList4 = new ArrayList();
            Iterator<T> it3 = plans2.iterator();
            while (it3.hasNext()) {
                rju0 b2 = b((PlusPayCompositeOffers.Offer.Plan) it3.next(), option.getCommonPrice().getCurrency());
                if (b2 != null) {
                    arrayList4.add(b2);
                }
            }
            String commonPeriod2 = option.getCommonPeriod();
            PlusPayPrice commonPrice2 = option.getCommonPrice();
            arrayList3.add(new sju0(option.getId(), a.o0(arrayList4, new rju0(commonPeriod2, new Price(commonPrice2.getAmount(), commonPrice2.getCurrency()), 0))));
        }
        ListBuilder a = rcc.a();
        if (sju0Var != null) {
            a.add(sju0Var);
        }
        a.addAll(arrayList3);
        return a.j();
    }

    public static rju0 b(PlusPayCompositeOffers.Offer.Plan plan, String str) {
        if (plan instanceof PlusPayCompositeOffers.Offer.Plan.Intro) {
            PlusPayCompositeOffers.Offer.Plan.Intro intro = (PlusPayCompositeOffers.Offer.Plan.Intro) plan;
            String period = intro.getPeriod();
            PlusPayPrice price = intro.getPrice();
            return new rju0(period, new Price(price.getAmount(), price.getCurrency()), intro.getRepetitionCount());
        }
        if (plan instanceof PlusPayCompositeOffers.Offer.Plan.Trial) {
            return new rju0(((PlusPayCompositeOffers.Offer.Plan.Trial) plan).getPeriod(), new Price(BigDecimal.valueOf(0L), str), 1);
        }
        if (!(plan instanceof PlusPayCompositeOffers.Offer.Plan.IntroUntil) && !(plan instanceof PlusPayCompositeOffers.Offer.Plan.TrialUntil)) {
            w511.b();
        }
        return null;
    }
}
