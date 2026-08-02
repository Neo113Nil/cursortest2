package com.yandex.go.scooters.qr.api;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/scooters/qr/api/ScootersQrNumberResultSource;", "", "QR", "MANUAL_ENTER", "UNAVAILABLE_SCOOTER", "go-client-android.features.scooters.qr:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersQrNumberResultSource {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ScootersQrNumberResultSource[] $VALUES;
    public static final ScootersQrNumberResultSource MANUAL_ENTER;
    public static final ScootersQrNumberResultSource QR;
    public static final ScootersQrNumberResultSource UNAVAILABLE_SCOOTER;

    static {
        ScootersQrNumberResultSource scootersQrNumberResultSource = new ScootersQrNumberResultSource("QR", 0);
        QR = scootersQrNumberResultSource;
        ScootersQrNumberResultSource scootersQrNumberResultSource2 = new ScootersQrNumberResultSource("MANUAL_ENTER", 1);
        MANUAL_ENTER = scootersQrNumberResultSource2;
        ScootersQrNumberResultSource scootersQrNumberResultSource3 = new ScootersQrNumberResultSource("UNAVAILABLE_SCOOTER", 2);
        UNAVAILABLE_SCOOTER = scootersQrNumberResultSource3;
        ScootersQrNumberResultSource[] scootersQrNumberResultSourceArr = {scootersQrNumberResultSource, scootersQrNumberResultSource2, scootersQrNumberResultSource3};
        $VALUES = scootersQrNumberResultSourceArr;
        $ENTRIES = a.a(scootersQrNumberResultSourceArr);
    }

    public static ScootersQrNumberResultSource valueOf(String str) {
        return (ScootersQrNumberResultSource) Enum.valueOf(ScootersQrNumberResultSource.class, str);
    }

    public static ScootersQrNumberResultSource[] values() {
        return (ScootersQrNumberResultSource[]) $VALUES.clone();
    }
}
