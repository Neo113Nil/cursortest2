package com.yandex.go.masstransit.sdk.ble.api.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/masstransit/sdk/ble/api/analytics/BlePermissionRequestReason;", "", "LocationPermission", "BluetoothPermission", "BluetoothDisabled", "Other", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BlePermissionRequestReason {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ BlePermissionRequestReason[] $VALUES;
    public static final BlePermissionRequestReason BluetoothDisabled;
    public static final BlePermissionRequestReason BluetoothPermission;
    public static final BlePermissionRequestReason LocationPermission;
    public static final BlePermissionRequestReason Other;

    static {
        BlePermissionRequestReason blePermissionRequestReason = new BlePermissionRequestReason("LocationPermission", 0);
        LocationPermission = blePermissionRequestReason;
        BlePermissionRequestReason blePermissionRequestReason2 = new BlePermissionRequestReason("BluetoothPermission", 1);
        BluetoothPermission = blePermissionRequestReason2;
        BlePermissionRequestReason blePermissionRequestReason3 = new BlePermissionRequestReason("BluetoothDisabled", 2);
        BluetoothDisabled = blePermissionRequestReason3;
        BlePermissionRequestReason blePermissionRequestReason4 = new BlePermissionRequestReason("Other", 3);
        Other = blePermissionRequestReason4;
        BlePermissionRequestReason[] blePermissionRequestReasonArr = {blePermissionRequestReason, blePermissionRequestReason2, blePermissionRequestReason3, blePermissionRequestReason4};
        $VALUES = blePermissionRequestReasonArr;
        $ENTRIES = a.a(blePermissionRequestReasonArr);
    }

    public static BlePermissionRequestReason valueOf(String str) {
        return (BlePermissionRequestReason) Enum.valueOf(BlePermissionRequestReason.class, str);
    }

    public static BlePermissionRequestReason[] values() {
        return (BlePermissionRequestReason[]) $VALUES.clone();
    }
}
