package yads;

import com.yandex.mobile.ads.common.AdTheme;

/* loaded from: classes10.dex */
public abstract /* synthetic */ class iq2 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[AdTheme.values().length];
        try {
            iArr[AdTheme.DARK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AdTheme.LIGHT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
