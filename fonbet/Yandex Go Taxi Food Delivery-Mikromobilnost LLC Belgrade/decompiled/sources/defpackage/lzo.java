package defpackage;

import com.yandex.go.blur.core.BlurEffect$CoordinatesType;

/* loaded from: classes.dex */
public abstract /* synthetic */ class lzo {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[BlurEffect$CoordinatesType.values().length];
        try {
            iArr[BlurEffect$CoordinatesType.Relative.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[BlurEffect$CoordinatesType.Absolute.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
