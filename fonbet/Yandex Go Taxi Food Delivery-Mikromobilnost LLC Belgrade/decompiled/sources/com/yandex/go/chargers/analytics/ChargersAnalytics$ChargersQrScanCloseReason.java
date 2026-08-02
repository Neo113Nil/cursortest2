package com.yandex.go.chargers.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"com/yandex/go/chargers/analytics/ChargersAnalytics$ChargersQrScanCloseReason", "", "Lcom/yandex/go/chargers/analytics/ChargersAnalytics$ChargersQrScanCloseReason;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Back", "QrScanned", "EnteredNumber", "common"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersAnalytics$ChargersQrScanCloseReason {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ChargersAnalytics$ChargersQrScanCloseReason[] $VALUES;
    public static final ChargersAnalytics$ChargersQrScanCloseReason Back;
    public static final ChargersAnalytics$ChargersQrScanCloseReason EnteredNumber;
    public static final ChargersAnalytics$ChargersQrScanCloseReason QrScanned;
    private final String eventValue;

    static {
        ChargersAnalytics$ChargersQrScanCloseReason chargersAnalytics$ChargersQrScanCloseReason = new ChargersAnalytics$ChargersQrScanCloseReason("Back", 0, "back");
        Back = chargersAnalytics$ChargersQrScanCloseReason;
        ChargersAnalytics$ChargersQrScanCloseReason chargersAnalytics$ChargersQrScanCloseReason2 = new ChargersAnalytics$ChargersQrScanCloseReason("QrScanned", 1, "qr_scanned");
        QrScanned = chargersAnalytics$ChargersQrScanCloseReason2;
        ChargersAnalytics$ChargersQrScanCloseReason chargersAnalytics$ChargersQrScanCloseReason3 = new ChargersAnalytics$ChargersQrScanCloseReason("EnteredNumber", 2, "entered_number");
        EnteredNumber = chargersAnalytics$ChargersQrScanCloseReason3;
        ChargersAnalytics$ChargersQrScanCloseReason[] chargersAnalytics$ChargersQrScanCloseReasonArr = {chargersAnalytics$ChargersQrScanCloseReason, chargersAnalytics$ChargersQrScanCloseReason2, chargersAnalytics$ChargersQrScanCloseReason3};
        $VALUES = chargersAnalytics$ChargersQrScanCloseReasonArr;
        $ENTRIES = a.a(chargersAnalytics$ChargersQrScanCloseReasonArr);
    }

    public ChargersAnalytics$ChargersQrScanCloseReason(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static ChargersAnalytics$ChargersQrScanCloseReason valueOf(String str) {
        return (ChargersAnalytics$ChargersQrScanCloseReason) Enum.valueOf(ChargersAnalytics$ChargersQrScanCloseReason.class, str);
    }

    public static ChargersAnalytics$ChargersQrScanCloseReason[] values() {
        return (ChargersAnalytics$ChargersQrScanCloseReason[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
