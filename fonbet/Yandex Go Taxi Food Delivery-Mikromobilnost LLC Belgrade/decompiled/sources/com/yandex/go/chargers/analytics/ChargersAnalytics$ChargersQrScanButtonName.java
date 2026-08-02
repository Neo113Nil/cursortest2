package com.yandex.go.chargers.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"com/yandex/go/chargers/analytics/ChargersAnalytics$ChargersQrScanButtonName", "", "Lcom/yandex/go/chargers/analytics/ChargersAnalytics$ChargersQrScanButtonName;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "ManualEnterDone", "GoToSettings", "BackToCamera", "ManualEnter", "Back", "Torch", "Exit", "common"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersAnalytics$ChargersQrScanButtonName {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ChargersAnalytics$ChargersQrScanButtonName[] $VALUES;
    public static final ChargersAnalytics$ChargersQrScanButtonName Back;
    public static final ChargersAnalytics$ChargersQrScanButtonName BackToCamera;
    public static final ChargersAnalytics$ChargersQrScanButtonName Exit;
    public static final ChargersAnalytics$ChargersQrScanButtonName GoToSettings;
    public static final ChargersAnalytics$ChargersQrScanButtonName ManualEnter;
    public static final ChargersAnalytics$ChargersQrScanButtonName ManualEnterDone;
    public static final ChargersAnalytics$ChargersQrScanButtonName Torch;
    private final String eventValue;

    static {
        ChargersAnalytics$ChargersQrScanButtonName chargersAnalytics$ChargersQrScanButtonName = new ChargersAnalytics$ChargersQrScanButtonName("ManualEnterDone", 0, "manual_enter_done");
        ManualEnterDone = chargersAnalytics$ChargersQrScanButtonName;
        ChargersAnalytics$ChargersQrScanButtonName chargersAnalytics$ChargersQrScanButtonName2 = new ChargersAnalytics$ChargersQrScanButtonName("GoToSettings", 1, "go_to_settings");
        GoToSettings = chargersAnalytics$ChargersQrScanButtonName2;
        ChargersAnalytics$ChargersQrScanButtonName chargersAnalytics$ChargersQrScanButtonName3 = new ChargersAnalytics$ChargersQrScanButtonName("BackToCamera", 2, "back_to_camera");
        BackToCamera = chargersAnalytics$ChargersQrScanButtonName3;
        ChargersAnalytics$ChargersQrScanButtonName chargersAnalytics$ChargersQrScanButtonName4 = new ChargersAnalytics$ChargersQrScanButtonName("ManualEnter", 3, "manual_enter");
        ManualEnter = chargersAnalytics$ChargersQrScanButtonName4;
        ChargersAnalytics$ChargersQrScanButtonName chargersAnalytics$ChargersQrScanButtonName5 = new ChargersAnalytics$ChargersQrScanButtonName("Back", 4, "back");
        Back = chargersAnalytics$ChargersQrScanButtonName5;
        ChargersAnalytics$ChargersQrScanButtonName chargersAnalytics$ChargersQrScanButtonName6 = new ChargersAnalytics$ChargersQrScanButtonName("Torch", 5, "torch");
        Torch = chargersAnalytics$ChargersQrScanButtonName6;
        ChargersAnalytics$ChargersQrScanButtonName chargersAnalytics$ChargersQrScanButtonName7 = new ChargersAnalytics$ChargersQrScanButtonName("Exit", 6, "exit");
        Exit = chargersAnalytics$ChargersQrScanButtonName7;
        ChargersAnalytics$ChargersQrScanButtonName[] chargersAnalytics$ChargersQrScanButtonNameArr = {chargersAnalytics$ChargersQrScanButtonName, chargersAnalytics$ChargersQrScanButtonName2, chargersAnalytics$ChargersQrScanButtonName3, chargersAnalytics$ChargersQrScanButtonName4, chargersAnalytics$ChargersQrScanButtonName5, chargersAnalytics$ChargersQrScanButtonName6, chargersAnalytics$ChargersQrScanButtonName7};
        $VALUES = chargersAnalytics$ChargersQrScanButtonNameArr;
        $ENTRIES = a.a(chargersAnalytics$ChargersQrScanButtonNameArr);
    }

    public ChargersAnalytics$ChargersQrScanButtonName(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static ChargersAnalytics$ChargersQrScanButtonName valueOf(String str) {
        return (ChargersAnalytics$ChargersQrScanButtonName) Enum.valueOf(ChargersAnalytics$ChargersQrScanButtonName.class, str);
    }

    public static ChargersAnalytics$ChargersQrScanButtonName[] values() {
        return (ChargersAnalytics$ChargersQrScanButtonName[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
