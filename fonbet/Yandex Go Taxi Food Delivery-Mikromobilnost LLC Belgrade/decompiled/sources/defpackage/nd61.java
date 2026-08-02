package defpackage;

import com.yandex.go.navigation.screen.api.Screen;

/* loaded from: classes9.dex */
public abstract /* synthetic */ class nd61 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[Screen.values().length];
        try {
            iArr[Screen.ORDER_DETAILS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Screen.MAIN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[Screen.SUMMARY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[Screen.SUMMARY_DRIVE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[Screen.ROUTE_SELECTOR.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[Screen.CHOOSE_B.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[Screen.DRIVE_DISCOVERY.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[Screen.ORDER.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[Screen.ORDERS_LIST.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[Screen.BUNDLED_ORDER_LIST.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[Screen.ORDER_TRACKING.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        a = iArr;
    }
}
