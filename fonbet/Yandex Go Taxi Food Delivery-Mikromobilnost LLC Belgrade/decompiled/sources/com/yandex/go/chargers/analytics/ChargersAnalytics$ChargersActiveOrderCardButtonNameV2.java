package com.yandex.go.chargers.analytics;

import com.adjust.sdk.Constants;
import com.yandex.messaging.core.net.entities.FoldersConfig;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0016"}, d2 = {"com/yandex/go/chargers/analytics/ChargersAnalytics$ChargersActiveOrderCardButtonNameV2", "", "Lcom/yandex/go/chargers/analytics/ChargersAnalytics$ChargersActiveOrderCardButtonNameV2;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "BannerHowToReturn", "FinishOrder", "TakeMore", "Promotion", "Geo", "Back", "Deeplink", "Details", "Support", "PlusOptionOffer", "PlusOptionDetail", "PartnerSubscription", "Switcher", "Unknown", "common"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersAnalytics$ChargersActiveOrderCardButtonNameV2 {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ChargersAnalytics$ChargersActiveOrderCardButtonNameV2[] $VALUES;
    public static final ChargersAnalytics$ChargersActiveOrderCardButtonNameV2 Back;
    public static final ChargersAnalytics$ChargersActiveOrderCardButtonNameV2 BannerHowToReturn;
    public static final ChargersAnalytics$ChargersActiveOrderCardButtonNameV2 Deeplink;
    public static final ChargersAnalytics$ChargersActiveOrderCardButtonNameV2 Details;
    public static final ChargersAnalytics$ChargersActiveOrderCardButtonNameV2 FinishOrder;
    public static final ChargersAnalytics$ChargersActiveOrderCardButtonNameV2 Geo;
    public static final ChargersAnalytics$ChargersActiveOrderCardButtonNameV2 PartnerSubscription;
    public static final ChargersAnalytics$ChargersActiveOrderCardButtonNameV2 PlusOptionDetail;
    public static final ChargersAnalytics$ChargersActiveOrderCardButtonNameV2 PlusOptionOffer;
    public static final ChargersAnalytics$ChargersActiveOrderCardButtonNameV2 Promotion;
    public static final ChargersAnalytics$ChargersActiveOrderCardButtonNameV2 Support;
    public static final ChargersAnalytics$ChargersActiveOrderCardButtonNameV2 Switcher;
    public static final ChargersAnalytics$ChargersActiveOrderCardButtonNameV2 TakeMore;
    public static final ChargersAnalytics$ChargersActiveOrderCardButtonNameV2 Unknown;
    private final String eventValue;

    static {
        ChargersAnalytics$ChargersActiveOrderCardButtonNameV2 chargersAnalytics$ChargersActiveOrderCardButtonNameV2 = new ChargersAnalytics$ChargersActiveOrderCardButtonNameV2("BannerHowToReturn", 0, "banner_how_to_return");
        BannerHowToReturn = chargersAnalytics$ChargersActiveOrderCardButtonNameV2;
        ChargersAnalytics$ChargersActiveOrderCardButtonNameV2 chargersAnalytics$ChargersActiveOrderCardButtonNameV22 = new ChargersAnalytics$ChargersActiveOrderCardButtonNameV2("FinishOrder", 1, "finish_order");
        FinishOrder = chargersAnalytics$ChargersActiveOrderCardButtonNameV22;
        ChargersAnalytics$ChargersActiveOrderCardButtonNameV2 chargersAnalytics$ChargersActiveOrderCardButtonNameV23 = new ChargersAnalytics$ChargersActiveOrderCardButtonNameV2("TakeMore", 2, "take_more");
        TakeMore = chargersAnalytics$ChargersActiveOrderCardButtonNameV23;
        ChargersAnalytics$ChargersActiveOrderCardButtonNameV2 chargersAnalytics$ChargersActiveOrderCardButtonNameV24 = new ChargersAnalytics$ChargersActiveOrderCardButtonNameV2("Promotion", 3, "promotion");
        Promotion = chargersAnalytics$ChargersActiveOrderCardButtonNameV24;
        ChargersAnalytics$ChargersActiveOrderCardButtonNameV2 chargersAnalytics$ChargersActiveOrderCardButtonNameV25 = new ChargersAnalytics$ChargersActiveOrderCardButtonNameV2("Geo", 4, "geo");
        Geo = chargersAnalytics$ChargersActiveOrderCardButtonNameV25;
        ChargersAnalytics$ChargersActiveOrderCardButtonNameV2 chargersAnalytics$ChargersActiveOrderCardButtonNameV26 = new ChargersAnalytics$ChargersActiveOrderCardButtonNameV2("Back", 5, "back");
        Back = chargersAnalytics$ChargersActiveOrderCardButtonNameV26;
        ChargersAnalytics$ChargersActiveOrderCardButtonNameV2 chargersAnalytics$ChargersActiveOrderCardButtonNameV27 = new ChargersAnalytics$ChargersActiveOrderCardButtonNameV2("Deeplink", 6, Constants.DEEPLINK);
        Deeplink = chargersAnalytics$ChargersActiveOrderCardButtonNameV27;
        ChargersAnalytics$ChargersActiveOrderCardButtonNameV2 chargersAnalytics$ChargersActiveOrderCardButtonNameV28 = new ChargersAnalytics$ChargersActiveOrderCardButtonNameV2("Details", 7, "details");
        Details = chargersAnalytics$ChargersActiveOrderCardButtonNameV28;
        ChargersAnalytics$ChargersActiveOrderCardButtonNameV2 chargersAnalytics$ChargersActiveOrderCardButtonNameV29 = new ChargersAnalytics$ChargersActiveOrderCardButtonNameV2("Support", 8, FoldersConfig.SUPPORT_FILTER_ID);
        Support = chargersAnalytics$ChargersActiveOrderCardButtonNameV29;
        ChargersAnalytics$ChargersActiveOrderCardButtonNameV2 chargersAnalytics$ChargersActiveOrderCardButtonNameV210 = new ChargersAnalytics$ChargersActiveOrderCardButtonNameV2("PlusOptionOffer", 9, "plus_option_offer");
        PlusOptionOffer = chargersAnalytics$ChargersActiveOrderCardButtonNameV210;
        ChargersAnalytics$ChargersActiveOrderCardButtonNameV2 chargersAnalytics$ChargersActiveOrderCardButtonNameV211 = new ChargersAnalytics$ChargersActiveOrderCardButtonNameV2("PlusOptionDetail", 10, "plus_option_detail");
        PlusOptionDetail = chargersAnalytics$ChargersActiveOrderCardButtonNameV211;
        ChargersAnalytics$ChargersActiveOrderCardButtonNameV2 chargersAnalytics$ChargersActiveOrderCardButtonNameV212 = new ChargersAnalytics$ChargersActiveOrderCardButtonNameV2("PartnerSubscription", 11, "partner_subscription");
        PartnerSubscription = chargersAnalytics$ChargersActiveOrderCardButtonNameV212;
        ChargersAnalytics$ChargersActiveOrderCardButtonNameV2 chargersAnalytics$ChargersActiveOrderCardButtonNameV213 = new ChargersAnalytics$ChargersActiveOrderCardButtonNameV2("Switcher", 12, "switcher");
        Switcher = chargersAnalytics$ChargersActiveOrderCardButtonNameV213;
        ChargersAnalytics$ChargersActiveOrderCardButtonNameV2 chargersAnalytics$ChargersActiveOrderCardButtonNameV214 = new ChargersAnalytics$ChargersActiveOrderCardButtonNameV2("Unknown", 13, "unknown");
        Unknown = chargersAnalytics$ChargersActiveOrderCardButtonNameV214;
        ChargersAnalytics$ChargersActiveOrderCardButtonNameV2[] chargersAnalytics$ChargersActiveOrderCardButtonNameV2Arr = {chargersAnalytics$ChargersActiveOrderCardButtonNameV2, chargersAnalytics$ChargersActiveOrderCardButtonNameV22, chargersAnalytics$ChargersActiveOrderCardButtonNameV23, chargersAnalytics$ChargersActiveOrderCardButtonNameV24, chargersAnalytics$ChargersActiveOrderCardButtonNameV25, chargersAnalytics$ChargersActiveOrderCardButtonNameV26, chargersAnalytics$ChargersActiveOrderCardButtonNameV27, chargersAnalytics$ChargersActiveOrderCardButtonNameV28, chargersAnalytics$ChargersActiveOrderCardButtonNameV29, chargersAnalytics$ChargersActiveOrderCardButtonNameV210, chargersAnalytics$ChargersActiveOrderCardButtonNameV211, chargersAnalytics$ChargersActiveOrderCardButtonNameV212, chargersAnalytics$ChargersActiveOrderCardButtonNameV213, chargersAnalytics$ChargersActiveOrderCardButtonNameV214};
        $VALUES = chargersAnalytics$ChargersActiveOrderCardButtonNameV2Arr;
        $ENTRIES = a.a(chargersAnalytics$ChargersActiveOrderCardButtonNameV2Arr);
    }

    public ChargersAnalytics$ChargersActiveOrderCardButtonNameV2(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static ChargersAnalytics$ChargersActiveOrderCardButtonNameV2 valueOf(String str) {
        return (ChargersAnalytics$ChargersActiveOrderCardButtonNameV2) Enum.valueOf(ChargersAnalytics$ChargersActiveOrderCardButtonNameV2.class, str);
    }

    public static ChargersAnalytics$ChargersActiveOrderCardButtonNameV2[] values() {
        return (ChargersAnalytics$ChargersActiveOrderCardButtonNameV2[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
