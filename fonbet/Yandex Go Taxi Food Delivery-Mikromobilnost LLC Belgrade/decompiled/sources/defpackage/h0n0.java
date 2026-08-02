package defpackage;

import com.yandex.go.scooters.bdui.api.ScootersBduiScreenType;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class h0n0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ScootersBduiScreenType.values().length];
        try {
            iArr[ScootersBduiScreenType.FULLSCREEN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ScootersBduiScreenType.MODAL_BOTTOM.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
