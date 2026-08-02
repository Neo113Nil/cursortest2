package defpackage;

import com.yandex.go.navigation.screen.api.Screen;

/* loaded from: classes8.dex */
public abstract /* synthetic */ class gea0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[Screen.values().length];
        try {
            iArr[Screen.MAIN_V4.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Screen.WALLET.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
