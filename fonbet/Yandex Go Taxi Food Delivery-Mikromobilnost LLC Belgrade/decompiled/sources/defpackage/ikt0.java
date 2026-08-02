package defpackage;

import ru.yandex.taxi.logistics.sdk.dashboard.ui.state.SpacerState;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class ikt0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SpacerState.Size.values().length];
        try {
            iArr[SpacerState.Size.S.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SpacerState.Size.M.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SpacerState.Size.L.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[SpacerState.Size.XL.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
