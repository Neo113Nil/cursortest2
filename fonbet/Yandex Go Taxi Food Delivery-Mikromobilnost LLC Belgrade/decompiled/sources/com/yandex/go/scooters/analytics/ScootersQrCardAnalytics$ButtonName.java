package com.yandex.go.scooters.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"com/yandex/go/scooters/analytics/ScootersQrCardAnalytics$ButtonName", "", "Lcom/yandex/go/scooters/analytics/ScootersQrCardAnalytics$ButtonName;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "ManualEnterDone", "GoToSettings", "BackToCamera", "ManualEnter", "Close", "Back", "Torch", "Exit", "go-client-android.features.scooters:analytics"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersQrCardAnalytics$ButtonName {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ScootersQrCardAnalytics$ButtonName[] $VALUES;
    public static final ScootersQrCardAnalytics$ButtonName Back;
    public static final ScootersQrCardAnalytics$ButtonName BackToCamera;
    public static final ScootersQrCardAnalytics$ButtonName Close;
    public static final ScootersQrCardAnalytics$ButtonName Exit;
    public static final ScootersQrCardAnalytics$ButtonName GoToSettings;
    public static final ScootersQrCardAnalytics$ButtonName ManualEnter;
    public static final ScootersQrCardAnalytics$ButtonName ManualEnterDone;
    public static final ScootersQrCardAnalytics$ButtonName Torch;
    private final String eventValue;

    static {
        ScootersQrCardAnalytics$ButtonName scootersQrCardAnalytics$ButtonName = new ScootersQrCardAnalytics$ButtonName("ManualEnterDone", 0, "manual_enter_done");
        ManualEnterDone = scootersQrCardAnalytics$ButtonName;
        ScootersQrCardAnalytics$ButtonName scootersQrCardAnalytics$ButtonName2 = new ScootersQrCardAnalytics$ButtonName("GoToSettings", 1, "go_to_settings");
        GoToSettings = scootersQrCardAnalytics$ButtonName2;
        ScootersQrCardAnalytics$ButtonName scootersQrCardAnalytics$ButtonName3 = new ScootersQrCardAnalytics$ButtonName("BackToCamera", 2, "back_to_camera");
        BackToCamera = scootersQrCardAnalytics$ButtonName3;
        ScootersQrCardAnalytics$ButtonName scootersQrCardAnalytics$ButtonName4 = new ScootersQrCardAnalytics$ButtonName("ManualEnter", 3, "manual_enter");
        ManualEnter = scootersQrCardAnalytics$ButtonName4;
        ScootersQrCardAnalytics$ButtonName scootersQrCardAnalytics$ButtonName5 = new ScootersQrCardAnalytics$ButtonName("Close", 4, "close");
        Close = scootersQrCardAnalytics$ButtonName5;
        ScootersQrCardAnalytics$ButtonName scootersQrCardAnalytics$ButtonName6 = new ScootersQrCardAnalytics$ButtonName("Back", 5, "back");
        Back = scootersQrCardAnalytics$ButtonName6;
        ScootersQrCardAnalytics$ButtonName scootersQrCardAnalytics$ButtonName7 = new ScootersQrCardAnalytics$ButtonName("Torch", 6, "torch");
        Torch = scootersQrCardAnalytics$ButtonName7;
        ScootersQrCardAnalytics$ButtonName scootersQrCardAnalytics$ButtonName8 = new ScootersQrCardAnalytics$ButtonName("Exit", 7, "exit");
        Exit = scootersQrCardAnalytics$ButtonName8;
        ScootersQrCardAnalytics$ButtonName[] scootersQrCardAnalytics$ButtonNameArr = {scootersQrCardAnalytics$ButtonName, scootersQrCardAnalytics$ButtonName2, scootersQrCardAnalytics$ButtonName3, scootersQrCardAnalytics$ButtonName4, scootersQrCardAnalytics$ButtonName5, scootersQrCardAnalytics$ButtonName6, scootersQrCardAnalytics$ButtonName7, scootersQrCardAnalytics$ButtonName8};
        $VALUES = scootersQrCardAnalytics$ButtonNameArr;
        $ENTRIES = a.a(scootersQrCardAnalytics$ButtonNameArr);
    }

    public ScootersQrCardAnalytics$ButtonName(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static ScootersQrCardAnalytics$ButtonName valueOf(String str) {
        return (ScootersQrCardAnalytics$ButtonName) Enum.valueOf(ScootersQrCardAnalytics$ButtonName.class, str);
    }

    public static ScootersQrCardAnalytics$ButtonName[] values() {
        return (ScootersQrCardAnalytics$ButtonName[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
