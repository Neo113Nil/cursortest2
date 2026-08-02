package com.yandex.go.chargers.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"com/yandex/go/chargers/analytics/ChargersAnalytics$ChargersActiveOrderCardCloseReason", "", "Lcom/yandex/go/chargers/analytics/ChargersAnalytics$ChargersActiveOrderCardCloseReason;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "FinishOrder", "Back", "common"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersAnalytics$ChargersActiveOrderCardCloseReason {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ChargersAnalytics$ChargersActiveOrderCardCloseReason[] $VALUES;
    public static final ChargersAnalytics$ChargersActiveOrderCardCloseReason Back;
    public static final ChargersAnalytics$ChargersActiveOrderCardCloseReason FinishOrder;
    private final String eventValue;

    static {
        ChargersAnalytics$ChargersActiveOrderCardCloseReason chargersAnalytics$ChargersActiveOrderCardCloseReason = new ChargersAnalytics$ChargersActiveOrderCardCloseReason("FinishOrder", 0, "finish_order");
        FinishOrder = chargersAnalytics$ChargersActiveOrderCardCloseReason;
        ChargersAnalytics$ChargersActiveOrderCardCloseReason chargersAnalytics$ChargersActiveOrderCardCloseReason2 = new ChargersAnalytics$ChargersActiveOrderCardCloseReason("Back", 1, "back");
        Back = chargersAnalytics$ChargersActiveOrderCardCloseReason2;
        ChargersAnalytics$ChargersActiveOrderCardCloseReason[] chargersAnalytics$ChargersActiveOrderCardCloseReasonArr = {chargersAnalytics$ChargersActiveOrderCardCloseReason, chargersAnalytics$ChargersActiveOrderCardCloseReason2};
        $VALUES = chargersAnalytics$ChargersActiveOrderCardCloseReasonArr;
        $ENTRIES = a.a(chargersAnalytics$ChargersActiveOrderCardCloseReasonArr);
    }

    public ChargersAnalytics$ChargersActiveOrderCardCloseReason(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static ChargersAnalytics$ChargersActiveOrderCardCloseReason valueOf(String str) {
        return (ChargersAnalytics$ChargersActiveOrderCardCloseReason) Enum.valueOf(ChargersAnalytics$ChargersActiveOrderCardCloseReason.class, str);
    }

    public static ChargersAnalytics$ChargersActiveOrderCardCloseReason[] values() {
        return (ChargersAnalytics$ChargersActiveOrderCardCloseReason[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
