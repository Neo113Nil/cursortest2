package com.yandex.go.chargers.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"com/yandex/go/chargers/analytics/ChargersAnalytics$ChargersQrScanOpenReason", "", "Lcom/yandex/go/chargers/analytics/ChargersAnalytics$ChargersQrScanOpenReason;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Discovery", "StationCard", "ReturnCharger", "ActiveOrderCard", "common"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersAnalytics$ChargersQrScanOpenReason {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ChargersAnalytics$ChargersQrScanOpenReason[] $VALUES;
    public static final ChargersAnalytics$ChargersQrScanOpenReason ActiveOrderCard;
    public static final ChargersAnalytics$ChargersQrScanOpenReason Discovery;
    public static final ChargersAnalytics$ChargersQrScanOpenReason ReturnCharger;
    public static final ChargersAnalytics$ChargersQrScanOpenReason StationCard;
    private final String eventValue;

    static {
        ChargersAnalytics$ChargersQrScanOpenReason chargersAnalytics$ChargersQrScanOpenReason = new ChargersAnalytics$ChargersQrScanOpenReason("Discovery", 0, "discovery");
        Discovery = chargersAnalytics$ChargersQrScanOpenReason;
        ChargersAnalytics$ChargersQrScanOpenReason chargersAnalytics$ChargersQrScanOpenReason2 = new ChargersAnalytics$ChargersQrScanOpenReason("StationCard", 1, "station_card");
        StationCard = chargersAnalytics$ChargersQrScanOpenReason2;
        ChargersAnalytics$ChargersQrScanOpenReason chargersAnalytics$ChargersQrScanOpenReason3 = new ChargersAnalytics$ChargersQrScanOpenReason("ReturnCharger", 2, "return_charger");
        ReturnCharger = chargersAnalytics$ChargersQrScanOpenReason3;
        ChargersAnalytics$ChargersQrScanOpenReason chargersAnalytics$ChargersQrScanOpenReason4 = new ChargersAnalytics$ChargersQrScanOpenReason("ActiveOrderCard", 3, "active_order_card");
        ActiveOrderCard = chargersAnalytics$ChargersQrScanOpenReason4;
        ChargersAnalytics$ChargersQrScanOpenReason[] chargersAnalytics$ChargersQrScanOpenReasonArr = {chargersAnalytics$ChargersQrScanOpenReason, chargersAnalytics$ChargersQrScanOpenReason2, chargersAnalytics$ChargersQrScanOpenReason3, chargersAnalytics$ChargersQrScanOpenReason4};
        $VALUES = chargersAnalytics$ChargersQrScanOpenReasonArr;
        $ENTRIES = a.a(chargersAnalytics$ChargersQrScanOpenReasonArr);
    }

    public ChargersAnalytics$ChargersQrScanOpenReason(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static ChargersAnalytics$ChargersQrScanOpenReason valueOf(String str) {
        return (ChargersAnalytics$ChargersQrScanOpenReason) Enum.valueOf(ChargersAnalytics$ChargersQrScanOpenReason.class, str);
    }

    public static ChargersAnalytics$ChargersQrScanOpenReason[] values() {
        return (ChargersAnalytics$ChargersQrScanOpenReason[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
