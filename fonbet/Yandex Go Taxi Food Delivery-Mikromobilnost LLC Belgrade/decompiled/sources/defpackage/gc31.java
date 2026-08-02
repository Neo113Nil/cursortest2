package defpackage;

import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.ui.ActionButtonsState;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class gc31 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ActionButtonsState.values().length];
        try {
            iArr[ActionButtonsState.ONLY_BACK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ActionButtonsState.BACK_AND_FOCUS_ROUTE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ActionButtonsState.HIDDEN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
