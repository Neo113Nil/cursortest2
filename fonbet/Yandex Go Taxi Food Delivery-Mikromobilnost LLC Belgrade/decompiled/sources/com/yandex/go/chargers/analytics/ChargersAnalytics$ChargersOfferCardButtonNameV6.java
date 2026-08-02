package com.yandex.go.chargers.analytics;

import com.yandex.auth.LegacyAccountType;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0015"}, d2 = {"com/yandex/go/chargers/analytics/ChargersAnalytics$ChargersOfferCardButtonNameV6", "", "Lcom/yandex/go/chargers/analytics/ChargersAnalytics$ChargersOfferCardButtonNameV6;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "CreateOrder", "ShowLegalTerms", "SelectPaymentMethod", "Login", "Back", "PricingHint", "PromoBar", "SubscriptionToggle", "Surge", "SurgeIcon", "Badge", "DiscountsAndPromocodes", "PromoNotch", "common"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersAnalytics$ChargersOfferCardButtonNameV6 {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ChargersAnalytics$ChargersOfferCardButtonNameV6[] $VALUES;
    public static final ChargersAnalytics$ChargersOfferCardButtonNameV6 Back;
    public static final ChargersAnalytics$ChargersOfferCardButtonNameV6 Badge;
    public static final ChargersAnalytics$ChargersOfferCardButtonNameV6 CreateOrder;
    public static final ChargersAnalytics$ChargersOfferCardButtonNameV6 DiscountsAndPromocodes;
    public static final ChargersAnalytics$ChargersOfferCardButtonNameV6 Login;
    public static final ChargersAnalytics$ChargersOfferCardButtonNameV6 PricingHint;
    public static final ChargersAnalytics$ChargersOfferCardButtonNameV6 PromoBar;
    public static final ChargersAnalytics$ChargersOfferCardButtonNameV6 PromoNotch;
    public static final ChargersAnalytics$ChargersOfferCardButtonNameV6 SelectPaymentMethod;
    public static final ChargersAnalytics$ChargersOfferCardButtonNameV6 ShowLegalTerms;
    public static final ChargersAnalytics$ChargersOfferCardButtonNameV6 SubscriptionToggle;
    public static final ChargersAnalytics$ChargersOfferCardButtonNameV6 Surge;
    public static final ChargersAnalytics$ChargersOfferCardButtonNameV6 SurgeIcon;
    private final String eventValue;

    static {
        ChargersAnalytics$ChargersOfferCardButtonNameV6 chargersAnalytics$ChargersOfferCardButtonNameV6 = new ChargersAnalytics$ChargersOfferCardButtonNameV6("CreateOrder", 0, "create_order");
        CreateOrder = chargersAnalytics$ChargersOfferCardButtonNameV6;
        ChargersAnalytics$ChargersOfferCardButtonNameV6 chargersAnalytics$ChargersOfferCardButtonNameV62 = new ChargersAnalytics$ChargersOfferCardButtonNameV6("ShowLegalTerms", 1, "show_legal_terms");
        ShowLegalTerms = chargersAnalytics$ChargersOfferCardButtonNameV62;
        ChargersAnalytics$ChargersOfferCardButtonNameV6 chargersAnalytics$ChargersOfferCardButtonNameV63 = new ChargersAnalytics$ChargersOfferCardButtonNameV6("SelectPaymentMethod", 2, "select_payment_method");
        SelectPaymentMethod = chargersAnalytics$ChargersOfferCardButtonNameV63;
        ChargersAnalytics$ChargersOfferCardButtonNameV6 chargersAnalytics$ChargersOfferCardButtonNameV64 = new ChargersAnalytics$ChargersOfferCardButtonNameV6("Login", 3, LegacyAccountType.STRING_LOGIN);
        Login = chargersAnalytics$ChargersOfferCardButtonNameV64;
        ChargersAnalytics$ChargersOfferCardButtonNameV6 chargersAnalytics$ChargersOfferCardButtonNameV65 = new ChargersAnalytics$ChargersOfferCardButtonNameV6("Back", 4, "back");
        Back = chargersAnalytics$ChargersOfferCardButtonNameV65;
        ChargersAnalytics$ChargersOfferCardButtonNameV6 chargersAnalytics$ChargersOfferCardButtonNameV66 = new ChargersAnalytics$ChargersOfferCardButtonNameV6("PricingHint", 5, "pricing_hint");
        PricingHint = chargersAnalytics$ChargersOfferCardButtonNameV66;
        ChargersAnalytics$ChargersOfferCardButtonNameV6 chargersAnalytics$ChargersOfferCardButtonNameV67 = new ChargersAnalytics$ChargersOfferCardButtonNameV6("PromoBar", 6, "promo_bar");
        PromoBar = chargersAnalytics$ChargersOfferCardButtonNameV67;
        ChargersAnalytics$ChargersOfferCardButtonNameV6 chargersAnalytics$ChargersOfferCardButtonNameV68 = new ChargersAnalytics$ChargersOfferCardButtonNameV6("SubscriptionToggle", 7, "subscription_toggle");
        SubscriptionToggle = chargersAnalytics$ChargersOfferCardButtonNameV68;
        ChargersAnalytics$ChargersOfferCardButtonNameV6 chargersAnalytics$ChargersOfferCardButtonNameV69 = new ChargersAnalytics$ChargersOfferCardButtonNameV6("Surge", 8, "surge");
        Surge = chargersAnalytics$ChargersOfferCardButtonNameV69;
        ChargersAnalytics$ChargersOfferCardButtonNameV6 chargersAnalytics$ChargersOfferCardButtonNameV610 = new ChargersAnalytics$ChargersOfferCardButtonNameV6("SurgeIcon", 9, "surge_icon");
        SurgeIcon = chargersAnalytics$ChargersOfferCardButtonNameV610;
        ChargersAnalytics$ChargersOfferCardButtonNameV6 chargersAnalytics$ChargersOfferCardButtonNameV611 = new ChargersAnalytics$ChargersOfferCardButtonNameV6("Badge", 10, "badge");
        Badge = chargersAnalytics$ChargersOfferCardButtonNameV611;
        ChargersAnalytics$ChargersOfferCardButtonNameV6 chargersAnalytics$ChargersOfferCardButtonNameV612 = new ChargersAnalytics$ChargersOfferCardButtonNameV6("DiscountsAndPromocodes", 11, "discounts_and_promocodes");
        DiscountsAndPromocodes = chargersAnalytics$ChargersOfferCardButtonNameV612;
        ChargersAnalytics$ChargersOfferCardButtonNameV6 chargersAnalytics$ChargersOfferCardButtonNameV613 = new ChargersAnalytics$ChargersOfferCardButtonNameV6("PromoNotch", 12, "promo_notch");
        PromoNotch = chargersAnalytics$ChargersOfferCardButtonNameV613;
        ChargersAnalytics$ChargersOfferCardButtonNameV6[] chargersAnalytics$ChargersOfferCardButtonNameV6Arr = {chargersAnalytics$ChargersOfferCardButtonNameV6, chargersAnalytics$ChargersOfferCardButtonNameV62, chargersAnalytics$ChargersOfferCardButtonNameV63, chargersAnalytics$ChargersOfferCardButtonNameV64, chargersAnalytics$ChargersOfferCardButtonNameV65, chargersAnalytics$ChargersOfferCardButtonNameV66, chargersAnalytics$ChargersOfferCardButtonNameV67, chargersAnalytics$ChargersOfferCardButtonNameV68, chargersAnalytics$ChargersOfferCardButtonNameV69, chargersAnalytics$ChargersOfferCardButtonNameV610, chargersAnalytics$ChargersOfferCardButtonNameV611, chargersAnalytics$ChargersOfferCardButtonNameV612, chargersAnalytics$ChargersOfferCardButtonNameV613};
        $VALUES = chargersAnalytics$ChargersOfferCardButtonNameV6Arr;
        $ENTRIES = a.a(chargersAnalytics$ChargersOfferCardButtonNameV6Arr);
    }

    public ChargersAnalytics$ChargersOfferCardButtonNameV6(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static ChargersAnalytics$ChargersOfferCardButtonNameV6 valueOf(String str) {
        return (ChargersAnalytics$ChargersOfferCardButtonNameV6) Enum.valueOf(ChargersAnalytics$ChargersOfferCardButtonNameV6.class, str);
    }

    public static ChargersAnalytics$ChargersOfferCardButtonNameV6[] values() {
        return (ChargersAnalytics$ChargersOfferCardButtonNameV6[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
