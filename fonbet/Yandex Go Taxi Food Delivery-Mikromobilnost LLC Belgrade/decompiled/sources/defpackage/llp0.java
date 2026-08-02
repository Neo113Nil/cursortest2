package defpackage;

import com.yandex.go.dto.response.Action$SdcRouteSelection;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class llp0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[Action$SdcRouteSelection.ScreenType.values().length];
        try {
            iArr[Action$SdcRouteSelection.ScreenType.SOURCE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Action$SdcRouteSelection.ScreenType.DESTINATION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
