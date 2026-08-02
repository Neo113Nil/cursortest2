package com.yandex.smartcamera.arscene.ar_core.helpers;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class a {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ObjectRotationHelper$AxisType.values().length];
        try {
            iArr[ObjectRotationHelper$AxisType.TYPE_1.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ObjectRotationHelper$AxisType.TYPE_2.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ObjectRotationHelper$AxisType.TYPE_3.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
