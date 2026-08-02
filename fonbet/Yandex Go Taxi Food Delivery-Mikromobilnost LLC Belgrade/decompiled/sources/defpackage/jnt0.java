package defpackage;

import com.yandex.div2.DivLineStyle;
import com.yandex.div2.DivText$Image$Accessibility;
import com.yandex.div2.DivText$Image$IndexingDirection;
import com.yandex.div2.DivTextAlignmentVertical;

/* loaded from: classes.dex */
public abstract /* synthetic */ class jnt0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;
    public static final /* synthetic */ int[] d;

    static {
        int[] iArr = new int[DivText$Image$IndexingDirection.values().length];
        try {
            iArr[DivText$Image$IndexingDirection.NORMAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DivText$Image$IndexingDirection.REVERSED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[DivLineStyle.values().length];
        try {
            iArr2[DivLineStyle.SINGLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[DivLineStyle.NONE.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        b = iArr2;
        int[] iArr3 = new int[DivText$Image$Accessibility.Type.values().length];
        try {
            iArr3[DivText$Image$Accessibility.Type.NONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr3[DivText$Image$Accessibility.Type.BUTTON.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr3[DivText$Image$Accessibility.Type.IMAGE.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr3[DivText$Image$Accessibility.Type.TEXT.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr3[DivText$Image$Accessibility.Type.AUTO.ordinal()] = 5;
        } catch (NoSuchFieldError unused9) {
        }
        c = iArr3;
        int[] iArr4 = new int[DivTextAlignmentVertical.values().length];
        try {
            iArr4[DivTextAlignmentVertical.TOP.ordinal()] = 1;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr4[DivTextAlignmentVertical.CENTER.ordinal()] = 2;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr4[DivTextAlignmentVertical.BASELINE.ordinal()] = 3;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr4[DivTextAlignmentVertical.BOTTOM.ordinal()] = 4;
        } catch (NoSuchFieldError unused13) {
        }
        d = iArr4;
    }
}
