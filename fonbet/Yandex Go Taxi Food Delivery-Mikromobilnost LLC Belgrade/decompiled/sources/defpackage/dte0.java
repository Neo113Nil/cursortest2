package defpackage;

import com.yandex.go.sdc.api.SdcRouteSelectionAction$Origin;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class dte0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SdcRouteSelectionAction$Origin.values().length];
        try {
            iArr[SdcRouteSelectionAction$Origin.SuperappMain.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SdcRouteSelectionAction$Origin.Undefined.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
