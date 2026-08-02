package com.yandex.go.chargers.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"com/yandex/go/chargers/analytics/ChargersAnalytics$ChargersOfferCardCloseReason", "", "Lcom/yandex/go/chargers/analytics/ChargersAnalytics$ChargersOfferCardCloseReason;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "CreateOrder", "Back", "Error", "common"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersAnalytics$ChargersOfferCardCloseReason {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ChargersAnalytics$ChargersOfferCardCloseReason[] $VALUES;
    public static final ChargersAnalytics$ChargersOfferCardCloseReason Back;
    public static final ChargersAnalytics$ChargersOfferCardCloseReason CreateOrder;
    public static final ChargersAnalytics$ChargersOfferCardCloseReason Error;
    private final String eventValue;

    static {
        ChargersAnalytics$ChargersOfferCardCloseReason chargersAnalytics$ChargersOfferCardCloseReason = new ChargersAnalytics$ChargersOfferCardCloseReason("CreateOrder", 0, "create_order");
        CreateOrder = chargersAnalytics$ChargersOfferCardCloseReason;
        ChargersAnalytics$ChargersOfferCardCloseReason chargersAnalytics$ChargersOfferCardCloseReason2 = new ChargersAnalytics$ChargersOfferCardCloseReason("Back", 1, "back");
        Back = chargersAnalytics$ChargersOfferCardCloseReason2;
        ChargersAnalytics$ChargersOfferCardCloseReason chargersAnalytics$ChargersOfferCardCloseReason3 = new ChargersAnalytics$ChargersOfferCardCloseReason("Error", 2, "error");
        Error = chargersAnalytics$ChargersOfferCardCloseReason3;
        ChargersAnalytics$ChargersOfferCardCloseReason[] chargersAnalytics$ChargersOfferCardCloseReasonArr = {chargersAnalytics$ChargersOfferCardCloseReason, chargersAnalytics$ChargersOfferCardCloseReason2, chargersAnalytics$ChargersOfferCardCloseReason3};
        $VALUES = chargersAnalytics$ChargersOfferCardCloseReasonArr;
        $ENTRIES = a.a(chargersAnalytics$ChargersOfferCardCloseReasonArr);
    }

    public ChargersAnalytics$ChargersOfferCardCloseReason(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static ChargersAnalytics$ChargersOfferCardCloseReason valueOf(String str) {
        return (ChargersAnalytics$ChargersOfferCardCloseReason) Enum.valueOf(ChargersAnalytics$ChargersOfferCardCloseReason.class, str);
    }

    public static ChargersAnalytics$ChargersOfferCardCloseReason[] values() {
        return (ChargersAnalytics$ChargersOfferCardCloseReason[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
