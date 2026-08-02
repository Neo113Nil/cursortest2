package com.yandex.go.taxi.order.cancel.reasons.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"com/yandex/go/taxi/order/cancel/reasons/analytics/CancelReasonsAnalytics$CloseReason", "", "Lcom/yandex/go/taxi/order/cancel/reasons/analytics/CancelReasonsAnalytics$CloseReason;", "ROLL_OFF", "DONE", "OTHER", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CancelReasonsAnalytics$CloseReason {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ CancelReasonsAnalytics$CloseReason[] $VALUES;
    public static final CancelReasonsAnalytics$CloseReason DONE;
    public static final CancelReasonsAnalytics$CloseReason OTHER;
    public static final CancelReasonsAnalytics$CloseReason ROLL_OFF;

    static {
        CancelReasonsAnalytics$CloseReason cancelReasonsAnalytics$CloseReason = new CancelReasonsAnalytics$CloseReason("ROLL_OFF", 0);
        ROLL_OFF = cancelReasonsAnalytics$CloseReason;
        CancelReasonsAnalytics$CloseReason cancelReasonsAnalytics$CloseReason2 = new CancelReasonsAnalytics$CloseReason("DONE", 1);
        DONE = cancelReasonsAnalytics$CloseReason2;
        CancelReasonsAnalytics$CloseReason cancelReasonsAnalytics$CloseReason3 = new CancelReasonsAnalytics$CloseReason("OTHER", 2);
        OTHER = cancelReasonsAnalytics$CloseReason3;
        CancelReasonsAnalytics$CloseReason[] cancelReasonsAnalytics$CloseReasonArr = {cancelReasonsAnalytics$CloseReason, cancelReasonsAnalytics$CloseReason2, cancelReasonsAnalytics$CloseReason3};
        $VALUES = cancelReasonsAnalytics$CloseReasonArr;
        $ENTRIES = a.a(cancelReasonsAnalytics$CloseReasonArr);
    }

    public static CancelReasonsAnalytics$CloseReason valueOf(String str) {
        return (CancelReasonsAnalytics$CloseReason) Enum.valueOf(CancelReasonsAnalytics$CloseReason.class, str);
    }

    public static CancelReasonsAnalytics$CloseReason[] values() {
        return (CancelReasonsAnalytics$CloseReason[]) $VALUES.clone();
    }
}
