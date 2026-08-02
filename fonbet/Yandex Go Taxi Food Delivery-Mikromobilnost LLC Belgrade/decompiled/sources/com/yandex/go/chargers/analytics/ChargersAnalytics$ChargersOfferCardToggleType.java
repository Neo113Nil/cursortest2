package com.yandex.go.chargers.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"com/yandex/go/chargers/analytics/ChargersAnalytics$ChargersOfferCardToggleType", "", "Lcom/yandex/go/chargers/analytics/ChargersAnalytics$ChargersOfferCardToggleType;", "", "eventValue", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "SharingBuy", "PlusDvizhBuy", "common"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersAnalytics$ChargersOfferCardToggleType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ChargersAnalytics$ChargersOfferCardToggleType[] $VALUES;
    public static final ChargersAnalytics$ChargersOfferCardToggleType PlusDvizhBuy;
    public static final ChargersAnalytics$ChargersOfferCardToggleType SharingBuy;
    private final String eventValue;

    static {
        ChargersAnalytics$ChargersOfferCardToggleType chargersAnalytics$ChargersOfferCardToggleType = new ChargersAnalytics$ChargersOfferCardToggleType("SharingBuy", 0, "sharing_buy");
        SharingBuy = chargersAnalytics$ChargersOfferCardToggleType;
        ChargersAnalytics$ChargersOfferCardToggleType chargersAnalytics$ChargersOfferCardToggleType2 = new ChargersAnalytics$ChargersOfferCardToggleType("PlusDvizhBuy", 1, "plus_dvizh_buy");
        PlusDvizhBuy = chargersAnalytics$ChargersOfferCardToggleType2;
        ChargersAnalytics$ChargersOfferCardToggleType[] chargersAnalytics$ChargersOfferCardToggleTypeArr = {chargersAnalytics$ChargersOfferCardToggleType, chargersAnalytics$ChargersOfferCardToggleType2};
        $VALUES = chargersAnalytics$ChargersOfferCardToggleTypeArr;
        $ENTRIES = a.a(chargersAnalytics$ChargersOfferCardToggleTypeArr);
    }

    public ChargersAnalytics$ChargersOfferCardToggleType(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static k4o a() {
        return $ENTRIES;
    }

    public static ChargersAnalytics$ChargersOfferCardToggleType valueOf(String str) {
        return (ChargersAnalytics$ChargersOfferCardToggleType) Enum.valueOf(ChargersAnalytics$ChargersOfferCardToggleType.class, str);
    }

    public static ChargersAnalytics$ChargersOfferCardToggleType[] values() {
        return (ChargersAnalytics$ChargersOfferCardToggleType[]) $VALUES.clone();
    }

    /* renamed from: b, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
