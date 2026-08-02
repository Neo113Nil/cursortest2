package com.yandex.go.chargers.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"com/yandex/go/chargers/analytics/ChargersAnalytics$ChargersFeedbackCardButtonNameV4", "", "Lcom/yandex/go/chargers/analytics/ChargersAnalytics$ChargersFeedbackCardButtonNameV4;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Rating", "Done", "PromoBar", "SurgeIcon", "Promoplate", "common"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersAnalytics$ChargersFeedbackCardButtonNameV4 {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ChargersAnalytics$ChargersFeedbackCardButtonNameV4[] $VALUES;
    public static final ChargersAnalytics$ChargersFeedbackCardButtonNameV4 Done;
    public static final ChargersAnalytics$ChargersFeedbackCardButtonNameV4 PromoBar;
    public static final ChargersAnalytics$ChargersFeedbackCardButtonNameV4 Promoplate;
    public static final ChargersAnalytics$ChargersFeedbackCardButtonNameV4 Rating;
    public static final ChargersAnalytics$ChargersFeedbackCardButtonNameV4 SurgeIcon;
    private final String eventValue;

    static {
        ChargersAnalytics$ChargersFeedbackCardButtonNameV4 chargersAnalytics$ChargersFeedbackCardButtonNameV4 = new ChargersAnalytics$ChargersFeedbackCardButtonNameV4("Rating", 0, "rating");
        Rating = chargersAnalytics$ChargersFeedbackCardButtonNameV4;
        ChargersAnalytics$ChargersFeedbackCardButtonNameV4 chargersAnalytics$ChargersFeedbackCardButtonNameV42 = new ChargersAnalytics$ChargersFeedbackCardButtonNameV4("Done", 1, "done");
        Done = chargersAnalytics$ChargersFeedbackCardButtonNameV42;
        ChargersAnalytics$ChargersFeedbackCardButtonNameV4 chargersAnalytics$ChargersFeedbackCardButtonNameV43 = new ChargersAnalytics$ChargersFeedbackCardButtonNameV4("PromoBar", 2, "promo_bar");
        PromoBar = chargersAnalytics$ChargersFeedbackCardButtonNameV43;
        ChargersAnalytics$ChargersFeedbackCardButtonNameV4 chargersAnalytics$ChargersFeedbackCardButtonNameV44 = new ChargersAnalytics$ChargersFeedbackCardButtonNameV4("SurgeIcon", 3, "surge_icon");
        SurgeIcon = chargersAnalytics$ChargersFeedbackCardButtonNameV44;
        ChargersAnalytics$ChargersFeedbackCardButtonNameV4 chargersAnalytics$ChargersFeedbackCardButtonNameV45 = new ChargersAnalytics$ChargersFeedbackCardButtonNameV4("Promoplate", 4, "promoplate");
        Promoplate = chargersAnalytics$ChargersFeedbackCardButtonNameV45;
        ChargersAnalytics$ChargersFeedbackCardButtonNameV4[] chargersAnalytics$ChargersFeedbackCardButtonNameV4Arr = {chargersAnalytics$ChargersFeedbackCardButtonNameV4, chargersAnalytics$ChargersFeedbackCardButtonNameV42, chargersAnalytics$ChargersFeedbackCardButtonNameV43, chargersAnalytics$ChargersFeedbackCardButtonNameV44, chargersAnalytics$ChargersFeedbackCardButtonNameV45};
        $VALUES = chargersAnalytics$ChargersFeedbackCardButtonNameV4Arr;
        $ENTRIES = a.a(chargersAnalytics$ChargersFeedbackCardButtonNameV4Arr);
    }

    public ChargersAnalytics$ChargersFeedbackCardButtonNameV4(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static ChargersAnalytics$ChargersFeedbackCardButtonNameV4 valueOf(String str) {
        return (ChargersAnalytics$ChargersFeedbackCardButtonNameV4) Enum.valueOf(ChargersAnalytics$ChargersFeedbackCardButtonNameV4.class, str);
    }

    public static ChargersAnalytics$ChargersFeedbackCardButtonNameV4[] values() {
        return (ChargersAnalytics$ChargersFeedbackCardButtonNameV4[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
