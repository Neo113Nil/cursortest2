package com.yandex.go.chargers.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"com/yandex/go/chargers/analytics/ChargersAnalytics$ChargersQrScanState", "", "Lcom/yandex/go/chargers/analytics/ChargersAnalytics$ChargersQrScanState;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Camera", "ManualEnter", "PermissionRequest", "common"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersAnalytics$ChargersQrScanState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ChargersAnalytics$ChargersQrScanState[] $VALUES;
    public static final ChargersAnalytics$ChargersQrScanState Camera;
    public static final ChargersAnalytics$ChargersQrScanState ManualEnter;
    public static final ChargersAnalytics$ChargersQrScanState PermissionRequest;
    private final String eventValue;

    static {
        ChargersAnalytics$ChargersQrScanState chargersAnalytics$ChargersQrScanState = new ChargersAnalytics$ChargersQrScanState("Camera", 0, "camera");
        Camera = chargersAnalytics$ChargersQrScanState;
        ChargersAnalytics$ChargersQrScanState chargersAnalytics$ChargersQrScanState2 = new ChargersAnalytics$ChargersQrScanState("ManualEnter", 1, "manual_enter");
        ManualEnter = chargersAnalytics$ChargersQrScanState2;
        ChargersAnalytics$ChargersQrScanState chargersAnalytics$ChargersQrScanState3 = new ChargersAnalytics$ChargersQrScanState("PermissionRequest", 2, "permission_request");
        PermissionRequest = chargersAnalytics$ChargersQrScanState3;
        ChargersAnalytics$ChargersQrScanState[] chargersAnalytics$ChargersQrScanStateArr = {chargersAnalytics$ChargersQrScanState, chargersAnalytics$ChargersQrScanState2, chargersAnalytics$ChargersQrScanState3};
        $VALUES = chargersAnalytics$ChargersQrScanStateArr;
        $ENTRIES = a.a(chargersAnalytics$ChargersQrScanStateArr);
    }

    public ChargersAnalytics$ChargersQrScanState(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static ChargersAnalytics$ChargersQrScanState valueOf(String str) {
        return (ChargersAnalytics$ChargersQrScanState) Enum.valueOf(ChargersAnalytics$ChargersQrScanState.class, str);
    }

    public static ChargersAnalytics$ChargersQrScanState[] values() {
        return (ChargersAnalytics$ChargersQrScanState[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
