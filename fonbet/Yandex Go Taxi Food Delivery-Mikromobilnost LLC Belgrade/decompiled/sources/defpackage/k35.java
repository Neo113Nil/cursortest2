package defpackage;

import com.airbnb.lottie.model.content.Mask$MaskMode;
import com.airbnb.lottie.model.layer.Layer$LayerType;

/* loaded from: classes.dex */
public abstract /* synthetic */ class k35 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[Mask$MaskMode.values().length];
        b = iArr;
        try {
            iArr[Mask$MaskMode.MASK_MODE_NONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            b[Mask$MaskMode.MASK_MODE_SUBTRACT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            b[Mask$MaskMode.MASK_MODE_INTERSECT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            b[Mask$MaskMode.MASK_MODE_ADD.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        int[] iArr2 = new int[Layer$LayerType.values().length];
        a = iArr2;
        try {
            iArr2[Layer$LayerType.SHAPE.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            a[Layer$LayerType.PRE_COMP.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            a[Layer$LayerType.SOLID.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            a[Layer$LayerType.IMAGE.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            a[Layer$LayerType.NULL.ordinal()] = 5;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            a[Layer$LayerType.TEXT.ordinal()] = 6;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            a[Layer$LayerType.UNKNOWN.ordinal()] = 7;
        } catch (NoSuchFieldError unused11) {
        }
    }
}
