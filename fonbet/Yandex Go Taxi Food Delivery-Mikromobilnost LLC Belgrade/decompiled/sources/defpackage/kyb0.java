package defpackage;

import com.yandex.go.navigation.screen.api.Screen;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class kyb0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[Screen.values().length];
        try {
            iArr[Screen.TAXI_MAIN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Screen.SUMMARY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
