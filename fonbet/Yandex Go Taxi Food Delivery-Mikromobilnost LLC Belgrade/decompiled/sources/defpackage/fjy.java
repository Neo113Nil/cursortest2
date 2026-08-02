package defpackage;

import com.yandex.go.blur.core.BlurEffect$Progressive$TileMode;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class fjy {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[BlurEffect$Progressive$TileMode.values().length];
        try {
            iArr[BlurEffect$Progressive$TileMode.Clamp.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[BlurEffect$Progressive$TileMode.Decal.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
