package com.yandex.go.chargers.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"com/yandex/go/chargers/analytics/ChargersAnalytics$ChargersTariffCardCloseReason", "", "Lcom/yandex/go/chargers/analytics/ChargersAnalytics$ChargersTariffCardCloseReason;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Back", "TakeCharger", "Unknown", "common"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersAnalytics$ChargersTariffCardCloseReason {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ChargersAnalytics$ChargersTariffCardCloseReason[] $VALUES;
    public static final ChargersAnalytics$ChargersTariffCardCloseReason Back;
    public static final ChargersAnalytics$ChargersTariffCardCloseReason TakeCharger;
    public static final ChargersAnalytics$ChargersTariffCardCloseReason Unknown;
    private final String eventValue;

    static {
        ChargersAnalytics$ChargersTariffCardCloseReason chargersAnalytics$ChargersTariffCardCloseReason = new ChargersAnalytics$ChargersTariffCardCloseReason("Back", 0, "back");
        Back = chargersAnalytics$ChargersTariffCardCloseReason;
        ChargersAnalytics$ChargersTariffCardCloseReason chargersAnalytics$ChargersTariffCardCloseReason2 = new ChargersAnalytics$ChargersTariffCardCloseReason("TakeCharger", 1, "take_charger");
        TakeCharger = chargersAnalytics$ChargersTariffCardCloseReason2;
        ChargersAnalytics$ChargersTariffCardCloseReason chargersAnalytics$ChargersTariffCardCloseReason3 = new ChargersAnalytics$ChargersTariffCardCloseReason("Unknown", 2, "unknown");
        Unknown = chargersAnalytics$ChargersTariffCardCloseReason3;
        ChargersAnalytics$ChargersTariffCardCloseReason[] chargersAnalytics$ChargersTariffCardCloseReasonArr = {chargersAnalytics$ChargersTariffCardCloseReason, chargersAnalytics$ChargersTariffCardCloseReason2, chargersAnalytics$ChargersTariffCardCloseReason3};
        $VALUES = chargersAnalytics$ChargersTariffCardCloseReasonArr;
        $ENTRIES = a.a(chargersAnalytics$ChargersTariffCardCloseReasonArr);
    }

    public ChargersAnalytics$ChargersTariffCardCloseReason(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static ChargersAnalytics$ChargersTariffCardCloseReason valueOf(String str) {
        return (ChargersAnalytics$ChargersTariffCardCloseReason) Enum.valueOf(ChargersAnalytics$ChargersTariffCardCloseReason.class, str);
    }

    public static ChargersAnalytics$ChargersTariffCardCloseReason[] values() {
        return (ChargersAnalytics$ChargersTariffCardCloseReason[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
