package com.yandex.go.scooters.qr.api;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/go/scooters/qr/api/ScootersQrNumberInputSource;", "", "QR_AND_MANUAL", "QR_ONLY", "go-client-android.features.scooters.qr:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersQrNumberInputSource {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ScootersQrNumberInputSource[] $VALUES;
    public static final ScootersQrNumberInputSource QR_AND_MANUAL;
    public static final ScootersQrNumberInputSource QR_ONLY;

    static {
        ScootersQrNumberInputSource scootersQrNumberInputSource = new ScootersQrNumberInputSource("QR_AND_MANUAL", 0);
        QR_AND_MANUAL = scootersQrNumberInputSource;
        ScootersQrNumberInputSource scootersQrNumberInputSource2 = new ScootersQrNumberInputSource("QR_ONLY", 1);
        QR_ONLY = scootersQrNumberInputSource2;
        ScootersQrNumberInputSource[] scootersQrNumberInputSourceArr = {scootersQrNumberInputSource, scootersQrNumberInputSource2};
        $VALUES = scootersQrNumberInputSourceArr;
        $ENTRIES = a.a(scootersQrNumberInputSourceArr);
    }

    public static ScootersQrNumberInputSource valueOf(String str) {
        return (ScootersQrNumberInputSource) Enum.valueOf(ScootersQrNumberInputSource.class, str);
    }

    public static ScootersQrNumberInputSource[] values() {
        return (ScootersQrNumberInputSource[]) $VALUES.clone();
    }
}
