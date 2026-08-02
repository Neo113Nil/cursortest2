package defpackage;

import com.yandex.mobile.drive.uikit.window.DecorationColor;

/* loaded from: classes15.dex */
public abstract /* synthetic */ class g651 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[DecorationColor.values().length];
        try {
            iArr[DecorationColor.Transparent.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DecorationColor.SemiTransparent.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
