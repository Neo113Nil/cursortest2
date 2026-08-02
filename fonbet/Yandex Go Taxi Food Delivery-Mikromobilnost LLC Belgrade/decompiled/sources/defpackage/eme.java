package defpackage;

import com.yandex.go.navigator.models.PredefinedButtonsIds;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class eme {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PredefinedButtonsIds.values().length];
        try {
            iArr[PredefinedButtonsIds.ALT_ROUTE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PredefinedButtonsIds.OVERVIEW_BUTTON.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PredefinedButtonsIds.SETTINGS_BUTTON.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[PredefinedButtonsIds.PLACE_REPORT_BUTTON.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[PredefinedButtonsIds.PETROL_STATION_BUTTON.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[PredefinedButtonsIds.SHARE_BUTTON.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        a = iArr;
    }
}
