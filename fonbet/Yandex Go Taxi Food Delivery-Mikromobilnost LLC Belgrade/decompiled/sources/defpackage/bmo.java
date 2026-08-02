package defpackage;

import coil.graphics.ExifOrientationPolicy;

/* loaded from: classes10.dex */
public abstract /* synthetic */ class bmo {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ExifOrientationPolicy.values().length];
        try {
            iArr[ExifOrientationPolicy.RESPECT_PERFORMANCE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ExifOrientationPolicy.IGNORE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ExifOrientationPolicy.RESPECT_ALL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
