package defpackage;

import com.yandex.div2.DivPager$ItemAlignment;

/* loaded from: classes.dex */
public abstract /* synthetic */ class o2l {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[DivPager$ItemAlignment.values().length];
        try {
            iArr[DivPager$ItemAlignment.START.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DivPager$ItemAlignment.CENTER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[DivPager$ItemAlignment.END.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
