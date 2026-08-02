package com.yandex.go.chargers.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"com/yandex/go/chargers/analytics/ChargersAnalytics$ChargersMainScreenCloseReason", "", "Lcom/yandex/go/chargers/analytics/ChargersAnalytics$ChargersMainScreenCloseReason;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Back", "ScanQr", "Unknown", "common"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersAnalytics$ChargersMainScreenCloseReason {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ChargersAnalytics$ChargersMainScreenCloseReason[] $VALUES;
    public static final ChargersAnalytics$ChargersMainScreenCloseReason Back;
    public static final ChargersAnalytics$ChargersMainScreenCloseReason ScanQr;
    public static final ChargersAnalytics$ChargersMainScreenCloseReason Unknown;
    private final String eventValue;

    static {
        ChargersAnalytics$ChargersMainScreenCloseReason chargersAnalytics$ChargersMainScreenCloseReason = new ChargersAnalytics$ChargersMainScreenCloseReason("Back", 0, "back");
        Back = chargersAnalytics$ChargersMainScreenCloseReason;
        ChargersAnalytics$ChargersMainScreenCloseReason chargersAnalytics$ChargersMainScreenCloseReason2 = new ChargersAnalytics$ChargersMainScreenCloseReason("ScanQr", 1, "scan_qr");
        ScanQr = chargersAnalytics$ChargersMainScreenCloseReason2;
        ChargersAnalytics$ChargersMainScreenCloseReason chargersAnalytics$ChargersMainScreenCloseReason3 = new ChargersAnalytics$ChargersMainScreenCloseReason("Unknown", 2, "unknown");
        Unknown = chargersAnalytics$ChargersMainScreenCloseReason3;
        ChargersAnalytics$ChargersMainScreenCloseReason[] chargersAnalytics$ChargersMainScreenCloseReasonArr = {chargersAnalytics$ChargersMainScreenCloseReason, chargersAnalytics$ChargersMainScreenCloseReason2, chargersAnalytics$ChargersMainScreenCloseReason3};
        $VALUES = chargersAnalytics$ChargersMainScreenCloseReasonArr;
        $ENTRIES = a.a(chargersAnalytics$ChargersMainScreenCloseReasonArr);
    }

    public ChargersAnalytics$ChargersMainScreenCloseReason(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static ChargersAnalytics$ChargersMainScreenCloseReason valueOf(String str) {
        return (ChargersAnalytics$ChargersMainScreenCloseReason) Enum.valueOf(ChargersAnalytics$ChargersMainScreenCloseReason.class, str);
    }

    public static ChargersAnalytics$ChargersMainScreenCloseReason[] values() {
        return (ChargersAnalytics$ChargersMainScreenCloseReason[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
