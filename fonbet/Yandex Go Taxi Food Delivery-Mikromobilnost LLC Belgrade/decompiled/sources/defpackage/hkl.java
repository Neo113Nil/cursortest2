package defpackage;

import com.yandex.div2.DivSlideTransition;

/* loaded from: classes11.dex */
public abstract /* synthetic */ class hkl {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[DivSlideTransition.Edge.values().length];
        try {
            iArr[DivSlideTransition.Edge.LEFT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DivSlideTransition.Edge.TOP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[DivSlideTransition.Edge.RIGHT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[DivSlideTransition.Edge.BOTTOM.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
