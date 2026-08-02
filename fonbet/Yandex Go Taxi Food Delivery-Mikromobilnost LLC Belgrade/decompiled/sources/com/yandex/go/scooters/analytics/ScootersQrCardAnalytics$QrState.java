package com.yandex.go.scooters.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"com/yandex/go/scooters/analytics/ScootersQrCardAnalytics$QrState", "", "Lcom/yandex/go/scooters/analytics/ScootersQrCardAnalytics$QrState;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Camera", "ManualEnter", "PermissionRequest", "go-client-android.features.scooters:analytics"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersQrCardAnalytics$QrState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ScootersQrCardAnalytics$QrState[] $VALUES;
    public static final ScootersQrCardAnalytics$QrState Camera;
    public static final ScootersQrCardAnalytics$QrState ManualEnter;
    public static final ScootersQrCardAnalytics$QrState PermissionRequest;
    private final String eventValue;

    static {
        ScootersQrCardAnalytics$QrState scootersQrCardAnalytics$QrState = new ScootersQrCardAnalytics$QrState("Camera", 0, "camera");
        Camera = scootersQrCardAnalytics$QrState;
        ScootersQrCardAnalytics$QrState scootersQrCardAnalytics$QrState2 = new ScootersQrCardAnalytics$QrState("ManualEnter", 1, "manual_enter");
        ManualEnter = scootersQrCardAnalytics$QrState2;
        ScootersQrCardAnalytics$QrState scootersQrCardAnalytics$QrState3 = new ScootersQrCardAnalytics$QrState("PermissionRequest", 2, "permission_request");
        PermissionRequest = scootersQrCardAnalytics$QrState3;
        ScootersQrCardAnalytics$QrState[] scootersQrCardAnalytics$QrStateArr = {scootersQrCardAnalytics$QrState, scootersQrCardAnalytics$QrState2, scootersQrCardAnalytics$QrState3};
        $VALUES = scootersQrCardAnalytics$QrStateArr;
        $ENTRIES = a.a(scootersQrCardAnalytics$QrStateArr);
    }

    public ScootersQrCardAnalytics$QrState(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static ScootersQrCardAnalytics$QrState valueOf(String str) {
        return (ScootersQrCardAnalytics$QrState) Enum.valueOf(ScootersQrCardAnalytics$QrState.class, str);
    }

    public static ScootersQrCardAnalytics$QrState[] values() {
        return (ScootersQrCardAnalytics$QrState[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
