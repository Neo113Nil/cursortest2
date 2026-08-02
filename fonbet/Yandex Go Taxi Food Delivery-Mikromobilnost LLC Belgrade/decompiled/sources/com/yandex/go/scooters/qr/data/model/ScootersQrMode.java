package com.yandex.go.scooters.qr.data.model;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/go/scooters/qr/data/model/ScootersQrMode;", "", "QR_SCAN", "MANUAL", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersQrMode {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ScootersQrMode[] $VALUES;
    public static final ScootersQrMode MANUAL;
    public static final ScootersQrMode QR_SCAN;

    static {
        ScootersQrMode scootersQrMode = new ScootersQrMode("QR_SCAN", 0);
        QR_SCAN = scootersQrMode;
        ScootersQrMode scootersQrMode2 = new ScootersQrMode("MANUAL", 1);
        MANUAL = scootersQrMode2;
        ScootersQrMode[] scootersQrModeArr = {scootersQrMode, scootersQrMode2};
        $VALUES = scootersQrModeArr;
        $ENTRIES = kotlin.enums.a.a(scootersQrModeArr);
    }

    public static ScootersQrMode valueOf(String str) {
        return (ScootersQrMode) Enum.valueOf(ScootersQrMode.class, str);
    }

    public static ScootersQrMode[] values() {
        return (ScootersQrMode[]) $VALUES.clone();
    }
}
