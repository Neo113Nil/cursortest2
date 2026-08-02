package defpackage;

import com.yandex.div2.DivRadialGradientRelativeRadius$Value;

/* loaded from: classes11.dex */
public abstract /* synthetic */ class fsk {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[DivRadialGradientRelativeRadius$Value.values().length];
        try {
            iArr[DivRadialGradientRelativeRadius$Value.FARTHEST_CORNER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DivRadialGradientRelativeRadius$Value.NEAREST_CORNER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[DivRadialGradientRelativeRadius$Value.FARTHEST_SIDE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[DivRadialGradientRelativeRadius$Value.NEAREST_SIDE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
