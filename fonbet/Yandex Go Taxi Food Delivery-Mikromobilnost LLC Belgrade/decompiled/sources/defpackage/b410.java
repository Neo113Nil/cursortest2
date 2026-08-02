package defpackage;

import com.yandex.go.masstransit.sdk.ble.api.qrscan.analytics.QrScanButtonAction;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class b410 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[QrScanButtonAction.values().length];
        try {
            iArr[QrScanButtonAction.Close.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[QrScanButtonAction.OpenSettings.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[QrScanButtonAction.Other.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
