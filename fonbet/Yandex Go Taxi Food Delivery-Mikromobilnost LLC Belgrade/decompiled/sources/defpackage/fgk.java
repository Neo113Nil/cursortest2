package defpackage;

import com.yandex.div2.DivVisibility;

/* loaded from: classes.dex */
public abstract /* synthetic */ class fgk {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[DivVisibility.values().length];
        try {
            iArr[DivVisibility.VISIBLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DivVisibility.INVISIBLE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[DivVisibility.GONE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
