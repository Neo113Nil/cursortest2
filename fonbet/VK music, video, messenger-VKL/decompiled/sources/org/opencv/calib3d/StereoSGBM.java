package org.opencv.calib3d;

/* loaded from: classes8.dex */
public class StereoSGBM extends StereoMatcher {
    private static native long create_0(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11);

    private static native long create_1(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10);

    private static native long create_10(int i);

    private static native long create_11();

    private static native long create_2(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9);

    private static native long create_3(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8);

    private static native long create_4(int i, int i2, int i3, int i4, int i5, int i6, int i7);

    private static native long create_5(int i, int i2, int i3, int i4, int i5, int i6);

    private static native long create_6(int i, int i2, int i3, int i4, int i5);

    private static native long create_7(int i, int i2, int i3, int i4);

    private static native long create_8(int i, int i2, int i3);

    private static native long create_9(int i, int i2);

    private static native void delete(long j);

    private static native int getMode_0(long j);

    private static native int getP1_0(long j);

    private static native int getP2_0(long j);

    private static native int getPreFilterCap_0(long j);

    private static native int getUniquenessRatio_0(long j);

    private static native void setMode_0(long j, int i);

    private static native void setP1_0(long j, int i);

    private static native void setP2_0(long j, int i);

    private static native void setPreFilterCap_0(long j, int i);

    private static native void setUniquenessRatio_0(long j, int i);

    @Override // org.opencv.calib3d.StereoMatcher, org.opencv.core.Algorithm
    public final void finalize() throws Throwable {
        delete(this.a);
    }
}
