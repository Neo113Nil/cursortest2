package defpackage;

import com.yandex.go.taxi.summary.api.ui.MapPositionAction;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class bgt0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[MapPositionAction.values().length];
        try {
            iArr[MapPositionAction.NONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[MapPositionAction.SHOW_PICKUP_POINTS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
