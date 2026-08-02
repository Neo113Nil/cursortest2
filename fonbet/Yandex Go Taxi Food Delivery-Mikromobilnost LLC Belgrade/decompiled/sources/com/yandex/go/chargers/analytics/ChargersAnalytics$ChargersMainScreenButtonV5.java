package com.yandex.go.chargers.analytics;

import com.yandex.messaging.core.net.entities.FoldersConfig;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"com/yandex/go/chargers/analytics/ChargersAnalytics$ChargersMainScreenButtonV5", "", "Lcom/yandex/go/chargers/analytics/ChargersAnalytics$ChargersMainScreenButtonV5;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Qr", "Support", "Geo", "Back", "PlusOptionOffer", "PlusOptionDetail", "PartnerSubscription", "BluetoothBeacon", "DiscountsAndPromocodes", "common"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersAnalytics$ChargersMainScreenButtonV5 {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ChargersAnalytics$ChargersMainScreenButtonV5[] $VALUES;
    public static final ChargersAnalytics$ChargersMainScreenButtonV5 Back;
    public static final ChargersAnalytics$ChargersMainScreenButtonV5 BluetoothBeacon;
    public static final ChargersAnalytics$ChargersMainScreenButtonV5 DiscountsAndPromocodes;
    public static final ChargersAnalytics$ChargersMainScreenButtonV5 Geo;
    public static final ChargersAnalytics$ChargersMainScreenButtonV5 PartnerSubscription;
    public static final ChargersAnalytics$ChargersMainScreenButtonV5 PlusOptionDetail;
    public static final ChargersAnalytics$ChargersMainScreenButtonV5 PlusOptionOffer;
    public static final ChargersAnalytics$ChargersMainScreenButtonV5 Qr;
    public static final ChargersAnalytics$ChargersMainScreenButtonV5 Support;
    private final String eventValue;

    static {
        ChargersAnalytics$ChargersMainScreenButtonV5 chargersAnalytics$ChargersMainScreenButtonV5 = new ChargersAnalytics$ChargersMainScreenButtonV5("Qr", 0, "qr");
        Qr = chargersAnalytics$ChargersMainScreenButtonV5;
        ChargersAnalytics$ChargersMainScreenButtonV5 chargersAnalytics$ChargersMainScreenButtonV52 = new ChargersAnalytics$ChargersMainScreenButtonV5("Support", 1, FoldersConfig.SUPPORT_FILTER_ID);
        Support = chargersAnalytics$ChargersMainScreenButtonV52;
        ChargersAnalytics$ChargersMainScreenButtonV5 chargersAnalytics$ChargersMainScreenButtonV53 = new ChargersAnalytics$ChargersMainScreenButtonV5("Geo", 2, "geo");
        Geo = chargersAnalytics$ChargersMainScreenButtonV53;
        ChargersAnalytics$ChargersMainScreenButtonV5 chargersAnalytics$ChargersMainScreenButtonV54 = new ChargersAnalytics$ChargersMainScreenButtonV5("Back", 3, "back");
        Back = chargersAnalytics$ChargersMainScreenButtonV54;
        ChargersAnalytics$ChargersMainScreenButtonV5 chargersAnalytics$ChargersMainScreenButtonV55 = new ChargersAnalytics$ChargersMainScreenButtonV5("PlusOptionOffer", 4, "plus_option_offer");
        PlusOptionOffer = chargersAnalytics$ChargersMainScreenButtonV55;
        ChargersAnalytics$ChargersMainScreenButtonV5 chargersAnalytics$ChargersMainScreenButtonV56 = new ChargersAnalytics$ChargersMainScreenButtonV5("PlusOptionDetail", 5, "plus_option_detail");
        PlusOptionDetail = chargersAnalytics$ChargersMainScreenButtonV56;
        ChargersAnalytics$ChargersMainScreenButtonV5 chargersAnalytics$ChargersMainScreenButtonV57 = new ChargersAnalytics$ChargersMainScreenButtonV5("PartnerSubscription", 6, "partner_subscription");
        PartnerSubscription = chargersAnalytics$ChargersMainScreenButtonV57;
        ChargersAnalytics$ChargersMainScreenButtonV5 chargersAnalytics$ChargersMainScreenButtonV58 = new ChargersAnalytics$ChargersMainScreenButtonV5("BluetoothBeacon", 7, "bluetooth_beacon");
        BluetoothBeacon = chargersAnalytics$ChargersMainScreenButtonV58;
        ChargersAnalytics$ChargersMainScreenButtonV5 chargersAnalytics$ChargersMainScreenButtonV59 = new ChargersAnalytics$ChargersMainScreenButtonV5("DiscountsAndPromocodes", 8, "discounts_and_promocodes");
        DiscountsAndPromocodes = chargersAnalytics$ChargersMainScreenButtonV59;
        ChargersAnalytics$ChargersMainScreenButtonV5[] chargersAnalytics$ChargersMainScreenButtonV5Arr = {chargersAnalytics$ChargersMainScreenButtonV5, chargersAnalytics$ChargersMainScreenButtonV52, chargersAnalytics$ChargersMainScreenButtonV53, chargersAnalytics$ChargersMainScreenButtonV54, chargersAnalytics$ChargersMainScreenButtonV55, chargersAnalytics$ChargersMainScreenButtonV56, chargersAnalytics$ChargersMainScreenButtonV57, chargersAnalytics$ChargersMainScreenButtonV58, chargersAnalytics$ChargersMainScreenButtonV59};
        $VALUES = chargersAnalytics$ChargersMainScreenButtonV5Arr;
        $ENTRIES = a.a(chargersAnalytics$ChargersMainScreenButtonV5Arr);
    }

    public ChargersAnalytics$ChargersMainScreenButtonV5(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static ChargersAnalytics$ChargersMainScreenButtonV5 valueOf(String str) {
        return (ChargersAnalytics$ChargersMainScreenButtonV5) Enum.valueOf(ChargersAnalytics$ChargersMainScreenButtonV5.class, str);
    }

    public static ChargersAnalytics$ChargersMainScreenButtonV5[] values() {
        return (ChargersAnalytics$ChargersMainScreenButtonV5[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
