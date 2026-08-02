package defpackage;

import com.yandex.go.masstransit.sdk.ble.api.analytics.BlePermissionRequestReason;
import com.yandex.go.masstransit.sdk.ble.api.analytics.BleVehiclesButtonAction;
import com.yandex.go.masstransit.sdk.ble.api.analytics.BleVehiclesScreenOpenReason;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class o310 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;

    static {
        int[] iArr = new int[BleVehiclesScreenOpenReason.values().length];
        try {
            iArr[BleVehiclesScreenOpenReason.Deeplink.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[BleVehiclesScreenOpenReason.MasstransitMain.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[BleVehiclesScreenOpenReason.Other.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
        int[] iArr2 = new int[BlePermissionRequestReason.values().length];
        try {
            iArr2[BlePermissionRequestReason.LocationPermission.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[BlePermissionRequestReason.BluetoothPermission.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[BlePermissionRequestReason.BluetoothDisabled.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[BlePermissionRequestReason.Other.ordinal()] = 4;
        } catch (NoSuchFieldError unused7) {
        }
        b = iArr2;
        int[] iArr3 = new int[BleVehiclesButtonAction.values().length];
        try {
            iArr3[BleVehiclesButtonAction.Back.ordinal()] = 1;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr3[BleVehiclesButtonAction.Qr.ordinal()] = 2;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr3[BleVehiclesButtonAction.Refresh.ordinal()] = 3;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr3[BleVehiclesButtonAction.OpenSettings.ordinal()] = 4;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr3[BleVehiclesButtonAction.VehicleItem.ordinal()] = 5;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr3[BleVehiclesButtonAction.Other.ordinal()] = 6;
        } catch (NoSuchFieldError unused13) {
        }
        c = iArr3;
    }
}
