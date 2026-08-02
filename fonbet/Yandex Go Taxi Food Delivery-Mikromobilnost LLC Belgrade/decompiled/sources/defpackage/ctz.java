package defpackage;

import com.airbnb.lottie.RenderMode;

/* loaded from: classes.dex */
public abstract /* synthetic */ class ctz {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[RenderMode.values().length];
        try {
            iArr[RenderMode.HARDWARE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[RenderMode.SOFTWARE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[RenderMode.AUTOMATIC.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
