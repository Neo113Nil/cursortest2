package defpackage;

import com.airbnb.lottie.model.layer.Layer$MatteType;

/* loaded from: classes.dex */
public abstract /* synthetic */ class oxx {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[Layer$MatteType.values().length];
        a = iArr;
        try {
            iArr[Layer$MatteType.LUMA.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[Layer$MatteType.LUMA_INVERTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
