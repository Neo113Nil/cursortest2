package defpackage;

import com.yandex.go.ugc.UgcWebViewTheme;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class ls11 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[UgcWebViewTheme.values().length];
        try {
            iArr[UgcWebViewTheme.LIGHT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[UgcWebViewTheme.DARK.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[UgcWebViewTheme.DEFAULT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
