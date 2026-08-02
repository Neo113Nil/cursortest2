package defpackage;

import com.yandex.div2.DivAlignmentHorizontal;
import com.yandex.div2.DivLineStyle;
import com.yandex.div2.DivText$Truncate;

/* loaded from: classes.dex */
public abstract /* synthetic */ class hfl {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;

    static {
        int[] iArr = new int[DivAlignmentHorizontal.values().length];
        try {
            iArr[DivAlignmentHorizontal.LEFT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DivAlignmentHorizontal.CENTER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[DivAlignmentHorizontal.RIGHT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[DivAlignmentHorizontal.START.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[DivAlignmentHorizontal.END.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
        int[] iArr2 = new int[DivLineStyle.values().length];
        try {
            iArr2[DivLineStyle.SINGLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[DivLineStyle.NONE.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        b = iArr2;
        int[] iArr3 = new int[DivText$Truncate.values().length];
        try {
            iArr3[DivText$Truncate.NONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr3[DivText$Truncate.START.ordinal()] = 2;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr3[DivText$Truncate.MIDDLE.ordinal()] = 3;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr3[DivText$Truncate.END.ordinal()] = 4;
        } catch (NoSuchFieldError unused11) {
        }
        c = iArr3;
    }
}
