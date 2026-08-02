package defpackage;

import com.yandex.div2.DivSizeUnit;

/* loaded from: classes11.dex */
public abstract /* synthetic */ class m05 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[DivSizeUnit.values().length];
        try {
            iArr[DivSizeUnit.DP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DivSizeUnit.PX.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[DivSizeUnit.SP.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
