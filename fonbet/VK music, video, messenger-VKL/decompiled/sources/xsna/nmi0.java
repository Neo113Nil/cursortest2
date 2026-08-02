package xsna;

import com.android.billingclient.api.ProductDetails;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* compiled from: SerializationUtil.kt */
/* loaded from: classes15.dex */
public final class nmi0 {
    public static final JSONObject a(ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails, String str) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("price", oneTimePurchaseOfferDetails.getFormattedPrice());
        jSONObject.put("price_buy", oneTimePurchaseOfferDetails.getFormattedPrice());
        jSONObject.put("priceCurrencyCode", oneTimePurchaseOfferDetails.getPriceCurrencyCode());
        jSONObject.put("price_amount_micros", oneTimePurchaseOfferDetails.getPriceAmountMicros());
        jSONObject.put("title", str);
        return jSONObject;
    }

    public static final JSONObject b(String str, List list) {
        Object next;
        Object next2;
        ArrayList arrayList = new ArrayList(3);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            g5g.y(((ProductDetails.SubscriptionOfferDetails) it.next()).getPricingPhases().getPricingPhaseList(), arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next3 = it2.next();
            if (((ProductDetails.PricingPhase) next3).getRecurrenceMode() == 2) {
                arrayList2.add(next3);
            }
        }
        Iterator it3 = arrayList2.iterator();
        if (it3.hasNext()) {
            next = it3.next();
            if (it3.hasNext()) {
                long priceAmountMicros = ((ProductDetails.PricingPhase) next).getPriceAmountMicros();
                do {
                    Object next4 = it3.next();
                    long priceAmountMicros2 = ((ProductDetails.PricingPhase) next4).getPriceAmountMicros();
                    if (priceAmountMicros > priceAmountMicros2) {
                        next = next4;
                        priceAmountMicros = priceAmountMicros2;
                    }
                } while (it3.hasNext());
            }
        } else {
            next = null;
        }
        ProductDetails.PricingPhase pricingPhase = (ProductDetails.PricingPhase) next;
        Iterator it4 = arrayList.iterator();
        if (it4.hasNext()) {
            next2 = it4.next();
            if (it4.hasNext()) {
                long priceAmountMicros3 = ((ProductDetails.PricingPhase) next2).getPriceAmountMicros();
                do {
                    Object next5 = it4.next();
                    long priceAmountMicros4 = ((ProductDetails.PricingPhase) next5).getPriceAmountMicros();
                    if (priceAmountMicros3 < priceAmountMicros4) {
                        next2 = next5;
                        priceAmountMicros3 = priceAmountMicros4;
                    }
                } while (it4.hasNext());
            }
        } else {
            next2 = null;
        }
        ProductDetails.PricingPhase pricingPhase2 = (ProductDetails.PricingPhase) next2;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("price", pricingPhase2 != null ? pricingPhase2.getFormattedPrice() : null);
        jSONObject.put("price_amount_micros", pricingPhase2 != null ? Long.valueOf(pricingPhase2.getPriceAmountMicros()) : null);
        jSONObject.put("priceCurrencyCode", pricingPhase2 != null ? pricingPhase2.getPriceCurrencyCode() : null);
        jSONObject.put("introductoryPrice", pricingPhase != null ? pricingPhase.getFormattedPrice() : null);
        jSONObject.put("introductoryPricePeriod", pricingPhase != null ? pricingPhase.getBillingPeriod() : null);
        jSONObject.put("introductoryPriceCycles", pricingPhase != null ? Integer.valueOf(pricingPhase.getBillingCycleCount()) : null);
        jSONObject.put("basePricePeriod", pricingPhase2 != null ? pricingPhase2.getBillingPeriod() : null);
        jSONObject.put("title", str);
        return jSONObject;
    }
}
