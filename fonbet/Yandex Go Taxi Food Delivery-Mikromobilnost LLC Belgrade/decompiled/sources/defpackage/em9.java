package defpackage;

import com.yandex.go.chargers.analytics.ChargersAnalytics$ChargersActiveMultiOrderCardButtonName;
import com.yandex.go.chargers.analytics.ChargersAnalytics$ChargersActiveMultiOrderCardModeId;
import com.yandex.go.chargers.analytics.ChargersAnalytics$ChargersActiveOrderCardButtonNameV2;
import com.yandex.go.chargers.analytics.ChargersAnalytics$ChargersActiveOrderCardScreenState;
import com.yandex.go.chargers.analytics.ChargersAnalytics$ChargersCreatingOrderCloseReason;
import com.yandex.go.chargers.analytics.ChargersAnalytics$ChargersDebtCardButtonName;
import com.yandex.go.chargers.analytics.ChargersAnalytics$ChargersDiscountDetailsButton;
import com.yandex.go.chargers.analytics.ChargersAnalytics$ChargersErrorCardButtonName;
import com.yandex.go.chargers.analytics.ChargersAnalytics$ChargersErrorCardCloseReason;
import com.yandex.go.chargers.analytics.ChargersAnalytics$ChargersFeedbackCardButtonNameV4;
import com.yandex.go.chargers.analytics.ChargersAnalytics$ChargersFeedbackCardScreenState;
import com.yandex.go.chargers.analytics.ChargersAnalytics$ChargersFinishCardCloseReason;
import com.yandex.go.chargers.analytics.ChargersAnalytics$ChargersFinishCardState;
import com.yandex.go.chargers.analytics.ChargersAnalytics$ChargersLocationCardButtonNameV3;
import com.yandex.go.chargers.analytics.ChargersAnalytics$ChargersOfferCardButtonNameV6;
import com.yandex.go.chargers.analytics.ChargersAnalytics$ChargersOfferCardCloseReason;
import com.yandex.go.chargers.analytics.ChargersAnalytics$ChargersOfferCardOpenReason;
import com.yandex.go.chargers.analytics.ChargersAnalytics$ChargersOfferCardToggleType;
import com.yandex.go.chargers.analytics.ChargersAnalytics$ChargersOrderStatus;
import com.yandex.go.chargers.analytics.ChargersAnalytics$ChargersPlusOptionPaymentResult;
import com.yandex.go.chargers.analytics.ChargersAnalytics$ChargersSubscriptionToggleState;
import com.yandex.go.chargers.analytics.ChargersAnalytics$ChargersTariffCardCloseReason;
import java.util.HashMap;
import java.util.List;
import ru.yandex.common.clid.ClidProvider;

/* loaded from: classes.dex */
public final class em9 {
    public final pho a;

    public em9(pho phoVar) {
        this.a = phoVar;
    }

    public static void g(em9 em9Var, String str, String str2, String str3, int i) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        em9Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("input", str);
        if (str2 != null) {
            hashMap.put("discount_id", str2);
        }
        if (str3 != null) {
            hashMap.put("error", str3);
        }
        em9Var.a.a("Chargers.EnterPromocodeScreen.Tapped", hashMap, 1, new HashMap());
    }

    public static void j(em9 em9Var, ChargersAnalytics$ChargersFeedbackCardButtonNameV4 chargersAnalytics$ChargersFeedbackCardButtonNameV4, ChargersAnalytics$ChargersFeedbackCardScreenState chargersAnalytics$ChargersFeedbackCardScreenState, Integer num, List list, String str, int i) {
        if ((i & 8) != 0) {
            list = null;
        }
        if ((i & 16) != 0) {
            str = null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("button_name", chargersAnalytics$ChargersFeedbackCardButtonNameV4.getEventValue());
        if (num != null) {
            hashMap.put("rating", num);
        }
        hashMap.put("screen_state", chargersAnalytics$ChargersFeedbackCardScreenState.getEventValue());
        if (list != null) {
            hashMap.put("problem_detailed", list);
        }
        if (str != null) {
            hashMap.put("promoplate_id", str);
        }
        em9Var.a.a("Chargers.FeedbackCard.Tapped", hashMap, 5, new HashMap());
    }

    public static void p(em9 em9Var, ChargersAnalytics$ChargersOfferCardButtonNameV6 chargersAnalytics$ChargersOfferCardButtonNameV6, ChargersAnalytics$ChargersSubscriptionToggleState chargersAnalytics$ChargersSubscriptionToggleState, String str, String str2, String str3, ChargersAnalytics$ChargersOfferCardToggleType chargersAnalytics$ChargersOfferCardToggleType, int i) {
        if ((i & 2) != 0) {
            chargersAnalytics$ChargersSubscriptionToggleState = null;
        }
        if ((i & 4) != 0) {
            str = null;
        }
        if ((i & 8) != 0) {
            str2 = null;
        }
        if ((i & 16) != 0) {
            str3 = null;
        }
        if ((i & 32) != 0) {
            chargersAnalytics$ChargersOfferCardToggleType = null;
        }
        HashMap w = b64.w(em9Var);
        w.put("button_name", chargersAnalytics$ChargersOfferCardButtonNameV6.getEventValue());
        if (chargersAnalytics$ChargersSubscriptionToggleState != null) {
            w.put("subscription_toggle_state", chargersAnalytics$ChargersSubscriptionToggleState.getEventValue());
        }
        if (str != null) {
            w.put("promo_bar", str);
        }
        if (str2 != null) {
            w.put("badge_id", str2);
        }
        if (str3 != null) {
            w.put("discount_id", str3);
        }
        if (chargersAnalytics$ChargersOfferCardToggleType != null) {
            w.put("toggle_type", chargersAnalytics$ChargersOfferCardToggleType.getEventValue());
        }
        em9Var.a.a("Chargers.OfferCard.Tapped", w, 7, new HashMap());
    }

    public final void a(ChargersAnalytics$ChargersActiveMultiOrderCardButtonName chargersAnalytics$ChargersActiveMultiOrderCardButtonName, ChargersAnalytics$ChargersActiveMultiOrderCardModeId chargersAnalytics$ChargersActiveMultiOrderCardModeId) {
        HashMap hashMap = new HashMap();
        hashMap.put("button_name", chargersAnalytics$ChargersActiveMultiOrderCardButtonName.getEventValue());
        if (chargersAnalytics$ChargersActiveMultiOrderCardModeId != null) {
            hashMap.put("mode_id", chargersAnalytics$ChargersActiveMultiOrderCardModeId.getEventValue());
        }
        this.a.a("Chargers.ActiveMultiOrderCard.Tapped", hashMap, 2, new HashMap());
    }

    public final void b(ChargersAnalytics$ChargersActiveOrderCardButtonNameV2 chargersAnalytics$ChargersActiveOrderCardButtonNameV2, ChargersAnalytics$ChargersActiveOrderCardScreenState chargersAnalytics$ChargersActiveOrderCardScreenState, String str, Integer num) {
        HashMap hashMap = new HashMap();
        hashMap.put("button_name", chargersAnalytics$ChargersActiveOrderCardButtonNameV2.getEventValue());
        if (str != null) {
            hashMap.put("mode_id", str);
        }
        hashMap.put("screen_state", chargersAnalytics$ChargersActiveOrderCardScreenState.getEventValue());
        if (num != null) {
            hashMap.put("holdout_start_ttl", num);
        }
        this.a.a("Chargers.ActiveOrderCard.Tapped", hashMap, 4, new HashMap());
    }

    public final void c(ChargersAnalytics$ChargersCreatingOrderCloseReason chargersAnalytics$ChargersCreatingOrderCloseReason, ChargersAnalytics$ChargersOrderStatus chargersAnalytics$ChargersOrderStatus, String str) {
        HashMap hashMap = new HashMap();
        if (chargersAnalytics$ChargersOrderStatus != null) {
            hashMap.put("order_status", chargersAnalytics$ChargersOrderStatus.getEventValue());
        }
        if (str != null) {
            hashMap.put("order_id", str);
        }
        hashMap.put("close_reason", chargersAnalytics$ChargersCreatingOrderCloseReason.getEventValue());
        this.a.a("Chargers.CreatingOrder.Closed", hashMap, 1, new HashMap());
    }

    public final void d(ChargersAnalytics$ChargersDebtCardButtonName chargersAnalytics$ChargersDebtCardButtonName) {
        HashMap hashMap = new HashMap();
        hashMap.put("button_name", chargersAnalytics$ChargersDebtCardButtonName.getEventValue());
        this.a.a("Chargers.DebtCard.Tapped", hashMap, 1, new HashMap());
    }

    public final void e(ChargersAnalytics$ChargersDiscountDetailsButton chargersAnalytics$ChargersDiscountDetailsButton) {
        HashMap hashMap = new HashMap();
        hashMap.put("button", chargersAnalytics$ChargersDiscountDetailsButton.getEventValue());
        this.a.a("Chargers.DiscountDetails.Tapped", hashMap, 1, new HashMap());
    }

    public final void f(String str) {
        this.a.a("Chargers.DiscountError.Shown", x4e.p("trace_id", str), 1, new HashMap());
    }

    public final void h(String str, ChargersAnalytics$ChargersErrorCardCloseReason chargersAnalytics$ChargersErrorCardCloseReason, String str2) {
        HashMap p = x4e.p("error_code", str);
        p.put("close_reason", chargersAnalytics$ChargersErrorCardCloseReason.getEventValue());
        if (str2 != null) {
            p.put("trace_id", str2);
        }
        this.a.a("Chargers.ErrorCard.Closed", p, 2, new HashMap());
    }

    public final void i(String str, ChargersAnalytics$ChargersErrorCardButtonName chargersAnalytics$ChargersErrorCardButtonName, String str2) {
        HashMap p = x4e.p("error_code", str);
        p.put("button_name", chargersAnalytics$ChargersErrorCardButtonName.getEventValue());
        if (str2 != null) {
            p.put("trace_id", str2);
        }
        this.a.a("Chargers.ErrorCard.Tapped", p, 2, new HashMap());
    }

    public final void k(ChargersAnalytics$ChargersFinishCardCloseReason chargersAnalytics$ChargersFinishCardCloseReason) {
        HashMap hashMap = new HashMap();
        hashMap.put("close_reason", chargersAnalytics$ChargersFinishCardCloseReason.getEventValue());
        this.a.a("Chargers.FinishCard.Closed", hashMap, 1, new HashMap());
    }

    public final void l(ChargersAnalytics$ChargersFinishCardState chargersAnalytics$ChargersFinishCardState) {
        HashMap hashMap = new HashMap();
        hashMap.put(ClidProvider.STATE, chargersAnalytics$ChargersFinishCardState.getEventValue());
        this.a.a("Chargers.FinishCard.Shown", hashMap, 1, new HashMap());
    }

    public final void m(ChargersAnalytics$ChargersLocationCardButtonNameV3 chargersAnalytics$ChargersLocationCardButtonNameV3, boolean z, String str, String str2) {
        HashMap hashMap = new HashMap();
        if (str != null) {
            hashMap.put("badge_id", str);
        }
        hashMap.put("button_name", chargersAnalytics$ChargersLocationCardButtonNameV3.getEventValue());
        hashMap.put("promo_badge", Boolean.valueOf(z));
        if (str2 != null) {
            hashMap.put("trace_id", str2);
        }
        this.a.a("Chargers.LocationCard.Tapped", hashMap, 5, new HashMap());
    }

    public final void n(ChargersAnalytics$ChargersOfferCardCloseReason chargersAnalytics$ChargersOfferCardCloseReason) {
        HashMap hashMap = new HashMap();
        hashMap.put("close_reason", chargersAnalytics$ChargersOfferCardCloseReason.getEventValue());
        this.a.a("Chargers.OfferCard.Closed", hashMap, 1, new HashMap());
    }

    public final void o(String str, ChargersAnalytics$ChargersOfferCardOpenReason chargersAnalytics$ChargersOfferCardOpenReason, boolean z, boolean z2, String str2, ChargersAnalytics$ChargersSubscriptionToggleState chargersAnalytics$ChargersSubscriptionToggleState, Integer num, String str3, String str4, String str5, String str6, String str7) {
        HashMap hashMap = new HashMap();
        if (str2 != null) {
            hashMap.put("banner", str2);
        }
        hashMap.put("offer_id", str);
        hashMap.put("offer_card_open_reason", chargersAnalytics$ChargersOfferCardOpenReason.getEventValue());
        if (chargersAnalytics$ChargersSubscriptionToggleState != null) {
            hashMap.put("subscription_toggle_state", chargersAnalytics$ChargersSubscriptionToggleState.getEventValue());
        }
        if (num != null) {
            hashMap.put("surge_gauge_value", num);
        }
        hashMap.put("is_surge_action_available", Boolean.valueOf(z));
        if (str3 != null) {
            hashMap.put("discount_id", str3);
        }
        if (str4 != null) {
            hashMap.put("cumulative_discount", str4);
        }
        hashMap.put("promo_badge", Boolean.valueOf(z2));
        if (str5 != null) {
            hashMap.put("trace_id", str5);
        }
        if (str6 != null) {
            hashMap.put("promo_bar", str6);
        }
        if (str7 != null) {
            hashMap.put("deeplink_value", str7);
        }
        this.a.a("Chargers.OfferCard.Shown", hashMap, 9, new HashMap());
    }

    public final void q(ChargersAnalytics$ChargersPlusOptionPaymentResult chargersAnalytics$ChargersPlusOptionPaymentResult) {
        HashMap hashMap = new HashMap();
        hashMap.put("type", chargersAnalytics$ChargersPlusOptionPaymentResult.getEventValue());
        this.a.a("Chargers.PlusOptionPayment.Closed", hashMap, 1, new HashMap());
    }

    public final void r(ChargersAnalytics$ChargersTariffCardCloseReason chargersAnalytics$ChargersTariffCardCloseReason) {
        HashMap hashMap = new HashMap();
        hashMap.put("close_reason", chargersAnalytics$ChargersTariffCardCloseReason.getEventValue());
        this.a.a("Chargers.TariffCard.Closed", hashMap, 1, new HashMap());
    }
}
