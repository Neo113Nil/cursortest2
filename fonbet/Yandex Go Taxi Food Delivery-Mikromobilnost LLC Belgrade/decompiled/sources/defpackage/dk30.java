package defpackage;

import com.yandex.go.masstransit.sdk.ble.api.analytics.BleVehicleType;
import com.yandex.go.masstransit.sdk.ble.api.analytics.RouteOptionsButtonAction;
import com.yandex.go.masstransit.sdk.ble.api.model.BleTransportType;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class dk30 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[BleVehicleType.values().length];
        try {
            iArr[BleVehicleType.Bus.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[BleVehicleType.Trolley.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[BleVehicleType.Tram.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[BleVehicleType.Water.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[BleVehicleType.Electrobus.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        int[] iArr2 = new int[RouteOptionsButtonAction.values().length];
        try {
            iArr2[RouteOptionsButtonAction.Back.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[RouteOptionsButtonAction.GoToSettings.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[RouteOptionsButtonAction.QrPay.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[RouteOptionsButtonAction.Transport.ordinal()] = 4;
        } catch (NoSuchFieldError unused9) {
        }
        a = iArr2;
        int[] iArr3 = new int[BleTransportType.values().length];
        try {
            iArr3[BleTransportType.Bus.ordinal()] = 1;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr3[BleTransportType.Trolley.ordinal()] = 2;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr3[BleTransportType.Tram.ordinal()] = 3;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr3[BleTransportType.Water.ordinal()] = 4;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr3[BleTransportType.Electrobus.ordinal()] = 5;
        } catch (NoSuchFieldError unused14) {
        }
        b = iArr3;
    }
}
