package com.yandex.go.chargers.qr.data.model;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/go/chargers/qr/data/model/ChargersQrMode;", "", "QR_SCAN", "MANUAL", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersQrMode {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ChargersQrMode[] $VALUES;
    public static final ChargersQrMode MANUAL;
    public static final ChargersQrMode QR_SCAN;

    static {
        ChargersQrMode chargersQrMode = new ChargersQrMode("QR_SCAN", 0);
        QR_SCAN = chargersQrMode;
        ChargersQrMode chargersQrMode2 = new ChargersQrMode("MANUAL", 1);
        MANUAL = chargersQrMode2;
        ChargersQrMode[] chargersQrModeArr = {chargersQrMode, chargersQrMode2};
        $VALUES = chargersQrModeArr;
        $ENTRIES = kotlin.enums.a.a(chargersQrModeArr);
    }

    public static ChargersQrMode valueOf(String str) {
        return (ChargersQrMode) Enum.valueOf(ChargersQrMode.class, str);
    }

    public static ChargersQrMode[] values() {
        return (ChargersQrMode[]) $VALUES.clone();
    }
}
