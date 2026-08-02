package com.yandex.go.masstransit.sdk.ble.api.qrscan.config;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"com/yandex/go/masstransit/sdk/ble/api/qrscan/config/QrScannerConfig$QrTarget", "", "Lcom/yandex/go/masstransit/sdk/ble/api/qrscan/config/QrScannerConfig$QrTarget;", "TRANSPORT_PAYMENT", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class QrScannerConfig$QrTarget {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ QrScannerConfig$QrTarget[] $VALUES;
    public static final QrScannerConfig$QrTarget TRANSPORT_PAYMENT;

    static {
        QrScannerConfig$QrTarget qrScannerConfig$QrTarget = new QrScannerConfig$QrTarget("TRANSPORT_PAYMENT", 0);
        TRANSPORT_PAYMENT = qrScannerConfig$QrTarget;
        QrScannerConfig$QrTarget[] qrScannerConfig$QrTargetArr = {qrScannerConfig$QrTarget};
        $VALUES = qrScannerConfig$QrTargetArr;
        $ENTRIES = a.a(qrScannerConfig$QrTargetArr);
    }

    public static QrScannerConfig$QrTarget valueOf(String str) {
        return (QrScannerConfig$QrTarget) Enum.valueOf(QrScannerConfig$QrTarget.class, str);
    }

    public static QrScannerConfig$QrTarget[] values() {
        return (QrScannerConfig$QrTarget[]) $VALUES.clone();
    }
}
