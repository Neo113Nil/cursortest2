package org.opencv.ximgproc;

import org.opencv.core.Algorithm;

/* loaded from: classes8.dex */
public class RidgeDetectionFilter extends Algorithm {
    private static native long create_0(int i, int i2, int i3, int i4, int i5, double d, double d2, int i6);

    private static native long create_1(int i, int i2, int i3, int i4, int i5, double d, double d2);

    private static native long create_2(int i, int i2, int i3, int i4, int i5, double d);

    private static native long create_3(int i, int i2, int i3, int i4, int i5);

    private static native long create_4(int i, int i2, int i3, int i4);

    private static native long create_5(int i, int i2, int i3);

    private static native long create_6(int i, int i2);

    private static native long create_7(int i);

    private static native long create_8();

    private static native void delete(long j);

    private static native void getRidgeFilteredImage_0(long j, long j2, long j3);

    @Override // org.opencv.core.Algorithm
    public final void finalize() throws Throwable {
        delete(this.a);
    }
}
