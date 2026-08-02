package defpackage;

import com.yandex.div2.DivFontWeight;

/* loaded from: classes.dex */
public abstract /* synthetic */ class oml {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[DivFontWeight.values().length];
        try {
            iArr[DivFontWeight.LIGHT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DivFontWeight.REGULAR.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[DivFontWeight.MEDIUM.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[DivFontWeight.BOLD.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
