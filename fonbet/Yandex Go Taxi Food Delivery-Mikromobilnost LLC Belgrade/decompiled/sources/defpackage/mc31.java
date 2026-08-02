package defpackage;

import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.ui.ErrorButtonAction;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class mc31 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ErrorButtonAction.values().length];
        try {
            iArr[ErrorButtonAction.OPEN_ADDRESS_SELECTOR.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ErrorButtonAction.REFRESH.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ErrorButtonAction.REFRESH_TRANSPORT_ROUTES.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ErrorButtonAction.REFRESH_ROUTESTATS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[ErrorButtonAction.EXPAND.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
    }
}
