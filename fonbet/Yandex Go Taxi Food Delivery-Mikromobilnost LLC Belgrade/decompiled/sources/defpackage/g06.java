package defpackage;

import com.yandex.div2.DivImageScale;

/* loaded from: classes11.dex */
public abstract /* synthetic */ class g06 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[DivImageScale.values().length];
        try {
            iArr[DivImageScale.NO_SCALE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DivImageScale.FIT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[DivImageScale.FILL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[DivImageScale.STRETCH.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
