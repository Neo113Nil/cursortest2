package defpackage;

import com.yandex.div2.DivFontWeight;
import com.yandex.div2.DivSizeUnit;

/* loaded from: classes11.dex */
public abstract /* synthetic */ class l05 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[DivFontWeight.values().length];
        try {
            iArr[DivFontWeight.MEDIUM.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DivFontWeight.REGULAR.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[DivFontWeight.LIGHT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[DivFontWeight.BOLD.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
        int[] iArr2 = new int[DivSizeUnit.values().length];
        try {
            iArr2[DivSizeUnit.DP.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[DivSizeUnit.SP.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[DivSizeUnit.PX.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        b = iArr2;
    }
}
