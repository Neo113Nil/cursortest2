package defpackage;

import com.yandex.div2.DivVideoScale;

/* loaded from: classes11.dex */
public abstract /* synthetic */ class cno {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[DivVideoScale.values().length];
        try {
            iArr[DivVideoScale.NO_SCALE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DivVideoScale.FIT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[DivVideoScale.FILL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
