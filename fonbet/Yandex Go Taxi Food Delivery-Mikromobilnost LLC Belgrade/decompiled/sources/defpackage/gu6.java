package defpackage;

import ru.yandex.taxi.orderpopup.analytics.OrderPopupAnalytics$Screen;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class gu6 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[OrderPopupAnalytics$Screen.values().length];
        try {
            iArr[OrderPopupAnalytics$Screen.SUMMARY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[OrderPopupAnalytics$Screen.ACTIVE_COMBO_ORDER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[OrderPopupAnalytics$Screen.INTERCITY_DASHBOARD.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
