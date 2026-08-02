package defpackage;

import com.yandex.div.core.font.DivTypefaceType;

/* loaded from: classes11.dex */
public abstract /* synthetic */ class pml {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[DivTypefaceType.values().length];
        a = iArr;
        try {
            iArr[DivTypefaceType.BOLD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[DivTypefaceType.MEDIUM.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[DivTypefaceType.LIGHT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
