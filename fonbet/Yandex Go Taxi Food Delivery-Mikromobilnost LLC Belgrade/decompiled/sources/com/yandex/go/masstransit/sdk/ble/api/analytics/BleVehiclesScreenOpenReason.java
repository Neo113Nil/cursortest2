package com.yandex.go.masstransit.sdk.ble.api.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/masstransit/sdk/ble/api/analytics/BleVehiclesScreenOpenReason;", "", "Deeplink", "MasstransitMain", "Other", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BleVehiclesScreenOpenReason {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ BleVehiclesScreenOpenReason[] $VALUES;
    public static final BleVehiclesScreenOpenReason Deeplink;
    public static final BleVehiclesScreenOpenReason MasstransitMain;
    public static final BleVehiclesScreenOpenReason Other;

    static {
        BleVehiclesScreenOpenReason bleVehiclesScreenOpenReason = new BleVehiclesScreenOpenReason("Deeplink", 0);
        Deeplink = bleVehiclesScreenOpenReason;
        BleVehiclesScreenOpenReason bleVehiclesScreenOpenReason2 = new BleVehiclesScreenOpenReason("MasstransitMain", 1);
        MasstransitMain = bleVehiclesScreenOpenReason2;
        BleVehiclesScreenOpenReason bleVehiclesScreenOpenReason3 = new BleVehiclesScreenOpenReason("Other", 2);
        Other = bleVehiclesScreenOpenReason3;
        BleVehiclesScreenOpenReason[] bleVehiclesScreenOpenReasonArr = {bleVehiclesScreenOpenReason, bleVehiclesScreenOpenReason2, bleVehiclesScreenOpenReason3};
        $VALUES = bleVehiclesScreenOpenReasonArr;
        $ENTRIES = a.a(bleVehiclesScreenOpenReasonArr);
    }

    public static BleVehiclesScreenOpenReason valueOf(String str) {
        return (BleVehiclesScreenOpenReason) Enum.valueOf(BleVehiclesScreenOpenReason.class, str);
    }

    public static BleVehiclesScreenOpenReason[] values() {
        return (BleVehiclesScreenOpenReason[]) $VALUES.clone();
    }
}
