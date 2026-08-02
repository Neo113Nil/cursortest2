package com.yandex.go.universal_qr_scanner.domain.camera.permission;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/universal_qr_scanner/domain/camera/permission/UniversalQrScannerCameraPermissionState;", "", "UNKNOWN", "GRANTED", "FORBIDDEN", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class UniversalQrScannerCameraPermissionState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ UniversalQrScannerCameraPermissionState[] $VALUES;
    public static final UniversalQrScannerCameraPermissionState FORBIDDEN;
    public static final UniversalQrScannerCameraPermissionState GRANTED;
    public static final UniversalQrScannerCameraPermissionState UNKNOWN;

    static {
        UniversalQrScannerCameraPermissionState universalQrScannerCameraPermissionState = new UniversalQrScannerCameraPermissionState("UNKNOWN", 0);
        UNKNOWN = universalQrScannerCameraPermissionState;
        UniversalQrScannerCameraPermissionState universalQrScannerCameraPermissionState2 = new UniversalQrScannerCameraPermissionState("GRANTED", 1);
        GRANTED = universalQrScannerCameraPermissionState2;
        UniversalQrScannerCameraPermissionState universalQrScannerCameraPermissionState3 = new UniversalQrScannerCameraPermissionState("FORBIDDEN", 2);
        FORBIDDEN = universalQrScannerCameraPermissionState3;
        UniversalQrScannerCameraPermissionState[] universalQrScannerCameraPermissionStateArr = {universalQrScannerCameraPermissionState, universalQrScannerCameraPermissionState2, universalQrScannerCameraPermissionState3};
        $VALUES = universalQrScannerCameraPermissionStateArr;
        $ENTRIES = kotlin.enums.a.a(universalQrScannerCameraPermissionStateArr);
    }

    public static UniversalQrScannerCameraPermissionState valueOf(String str) {
        return (UniversalQrScannerCameraPermissionState) Enum.valueOf(UniversalQrScannerCameraPermissionState.class, str);
    }

    public static UniversalQrScannerCameraPermissionState[] values() {
        return (UniversalQrScannerCameraPermissionState[]) $VALUES.clone();
    }
}
