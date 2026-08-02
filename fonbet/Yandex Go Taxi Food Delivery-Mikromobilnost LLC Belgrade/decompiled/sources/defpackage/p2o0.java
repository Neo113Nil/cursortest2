package defpackage;

import com.yandex.go.scooters.analytics.ScootersOfferCardAnalytics$CardButton;
import com.yandex.go.scooters.analytics.ScootersOfferCardAnalytics$CardShownState;
import com.yandex.go.scooters.analytics.ScootersOfferCardAnalytics$InsuranceState;
import com.yandex.go.scooters.analytics.ScootersOfferCardAnalytics$SubscriptionPromoblockToggleState;
import com.yandex.go.scooters.analytics.ScootersOfferCardAnalytics$TariffIdentifier;
import java.util.HashMap;
import ru.yandex.common.clid.ClidProvider;

/* loaded from: classes13.dex */
public final class p2o0 {
    public final pho a;

    public p2o0(pho phoVar) {
        this.a = phoVar;
    }

    public static void a(p2o0 p2o0Var, Integer num, String str, ScootersOfferCardAnalytics$InsuranceState scootersOfferCardAnalytics$InsuranceState, String str2, String str3, Double d, Integer num2, String str4, ScootersOfferCardAnalytics$TariffIdentifier scootersOfferCardAnalytics$TariffIdentifier, ScootersOfferCardAnalytics$CardShownState scootersOfferCardAnalytics$CardShownState, String str5) {
        p2o0Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("charge_level", num);
        hashMap.put("from_screen", str);
        if (scootersOfferCardAnalytics$InsuranceState != null) {
            hashMap.put("insurance_state", scootersOfferCardAnalytics$InsuranceState.getEventValue());
        }
        hashMap.put("offers", str2);
        if (str3 != null) {
            hashMap.put("open_reason", str3);
        }
        hashMap.put("remaining_distance_km", d);
        hashMap.put("remaining_time_sec", num2);
        if (str4 != null) {
            hashMap.put("scooter_number", str4);
        }
        if (scootersOfferCardAnalytics$TariffIdentifier != null) {
            hashMap.put("selected_offer", scootersOfferCardAnalytics$TariffIdentifier.getEventValue());
        }
        if (scootersOfferCardAnalytics$CardShownState != null) {
            hashMap.put(ClidProvider.STATE, scootersOfferCardAnalytics$CardShownState.getEventValue());
        }
        if (str5 != null) {
            hashMap.put("visible_offers", str5);
        }
        p2o0Var.a.a("ScootersOfferCard.Shown", hashMap, 1, new HashMap());
    }

    public static void b(p2o0 p2o0Var, ScootersOfferCardAnalytics$CardButton scootersOfferCardAnalytics$CardButton, Integer num, String str, ScootersOfferCardAnalytics$InsuranceState scootersOfferCardAnalytics$InsuranceState, String str2, String str3, Double d, Integer num2, String str4, ScootersOfferCardAnalytics$TariffIdentifier scootersOfferCardAnalytics$TariffIdentifier, ScootersOfferCardAnalytics$CardShownState scootersOfferCardAnalytics$CardShownState, ScootersOfferCardAnalytics$SubscriptionPromoblockToggleState scootersOfferCardAnalytics$SubscriptionPromoblockToggleState) {
        p2o0Var.getClass();
        HashMap hashMap = new HashMap();
        if (scootersOfferCardAnalytics$CardButton != null) {
            hashMap.put("button_name", scootersOfferCardAnalytics$CardButton.getEventValue());
        }
        hashMap.put("charge_level", num);
        hashMap.put("from_screen", str);
        if (scootersOfferCardAnalytics$InsuranceState != null) {
            hashMap.put("insurance_state", scootersOfferCardAnalytics$InsuranceState.getEventValue());
        }
        if (str2 != null) {
            hashMap.put("open_reason", str2);
        }
        if (str3 != null) {
            hashMap.put("package_product_id", str3);
        }
        hashMap.put("remaining_distance_km", d);
        hashMap.put("remaining_time_sec", num2);
        if (str4 != null) {
            hashMap.put("scooter_number", str4);
        }
        if (scootersOfferCardAnalytics$TariffIdentifier != null) {
            hashMap.put("selected_offer", scootersOfferCardAnalytics$TariffIdentifier.getEventValue());
        }
        if (scootersOfferCardAnalytics$CardShownState != null) {
            hashMap.put(ClidProvider.STATE, scootersOfferCardAnalytics$CardShownState.getEventValue());
        }
        if (scootersOfferCardAnalytics$SubscriptionPromoblockToggleState != null) {
            hashMap.put("toggle_state", scootersOfferCardAnalytics$SubscriptionPromoblockToggleState.getEventValue());
        }
        p2o0Var.a.a("ScootersOfferCard.Tapped", hashMap, 1, new HashMap());
    }
}
