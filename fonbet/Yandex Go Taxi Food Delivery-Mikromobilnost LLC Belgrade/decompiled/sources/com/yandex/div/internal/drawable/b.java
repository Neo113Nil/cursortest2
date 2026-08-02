package com.yandex.div.internal.drawable;

import com.yandex.div.internal.drawable.ScalingDrawable;

/* loaded from: classes11.dex */
public abstract /* synthetic */ class b {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;

    static {
        int[] iArr = new int[ScalingDrawable.ScaleType.values().length];
        try {
            iArr[ScalingDrawable.ScaleType.FILL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ScalingDrawable.ScaleType.FIT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ScalingDrawable.ScaleType.NO_SCALE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
        int[] iArr2 = new int[ScalingDrawable.AlignmentHorizontal.values().length];
        try {
            iArr2[ScalingDrawable.AlignmentHorizontal.CENTER.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[ScalingDrawable.AlignmentHorizontal.RIGHT.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        b = iArr2;
        int[] iArr3 = new int[ScalingDrawable.AlignmentVertical.values().length];
        try {
            iArr3[ScalingDrawable.AlignmentVertical.CENTER.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr3[ScalingDrawable.AlignmentVertical.BOTTOM.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        c = iArr3;
    }
}
