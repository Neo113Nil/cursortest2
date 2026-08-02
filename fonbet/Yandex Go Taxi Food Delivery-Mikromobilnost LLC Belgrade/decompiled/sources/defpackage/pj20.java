package defpackage;

import ru.yandex.taxi.logistics.sdk.mission_details.ui.ProgressBarSize;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class pj20 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ProgressBarSize.values().length];
        try {
            iArr[ProgressBarSize.S.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ProgressBarSize.M.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
