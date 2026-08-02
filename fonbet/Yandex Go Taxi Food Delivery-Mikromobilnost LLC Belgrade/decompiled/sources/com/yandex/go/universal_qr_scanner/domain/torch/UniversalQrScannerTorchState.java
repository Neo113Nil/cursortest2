package com.yandex.go.universal_qr_scanner.domain.torch;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/universal_qr_scanner/domain/torch/UniversalQrScannerTorchState;", "", "NOT_AVAILABLE", "ENABLED", "DISABLED", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class UniversalQrScannerTorchState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ UniversalQrScannerTorchState[] $VALUES;
    public static final UniversalQrScannerTorchState DISABLED;
    public static final UniversalQrScannerTorchState ENABLED;
    public static final UniversalQrScannerTorchState NOT_AVAILABLE;

    static {
        UniversalQrScannerTorchState universalQrScannerTorchState = new UniversalQrScannerTorchState("NOT_AVAILABLE", 0);
        NOT_AVAILABLE = universalQrScannerTorchState;
        UniversalQrScannerTorchState universalQrScannerTorchState2 = new UniversalQrScannerTorchState("ENABLED", 1);
        ENABLED = universalQrScannerTorchState2;
        UniversalQrScannerTorchState universalQrScannerTorchState3 = new UniversalQrScannerTorchState("DISABLED", 2);
        DISABLED = universalQrScannerTorchState3;
        UniversalQrScannerTorchState[] universalQrScannerTorchStateArr = {universalQrScannerTorchState, universalQrScannerTorchState2, universalQrScannerTorchState3};
        $VALUES = universalQrScannerTorchStateArr;
        $ENTRIES = kotlin.enums.a.a(universalQrScannerTorchStateArr);
    }

    public static UniversalQrScannerTorchState valueOf(String str) {
        return (UniversalQrScannerTorchState) Enum.valueOf(UniversalQrScannerTorchState.class, str);
    }

    public static UniversalQrScannerTorchState[] values() {
        return (UniversalQrScannerTorchState[]) $VALUES.clone();
    }
}
