package org.opencv.video;

/* loaded from: classes8.dex */
public class FarnebackOpticalFlow extends DenseOpticalFlow {
    private static native long create_0(int i, double d, boolean z, int i2, int i3, int i4, double d2, int i5);

    private static native long create_1(int i, double d, boolean z, int i2, int i3, int i4, double d2);

    private static native long create_2(int i, double d, boolean z, int i2, int i3, int i4);

    private static native long create_3(int i, double d, boolean z, int i2, int i3);

    private static native long create_4(int i, double d, boolean z, int i2);

    private static native long create_5(int i, double d, boolean z);

    private static native long create_6(int i, double d);

    private static native long create_7(int i);

    private static native long create_8();

    private static native void delete(long j);

    private static native boolean getFastPyramids_0(long j);

    private static native int getFlags_0(long j);

    private static native int getNumIters_0(long j);

    private static native int getNumLevels_0(long j);

    private static native int getPolyN_0(long j);

    private static native double getPolySigma_0(long j);

    private static native double getPyrScale_0(long j);

    private static native int getWinSize_0(long j);

    private static native void setFastPyramids_0(long j, boolean z);

    private static native void setFlags_0(long j, int i);

    private static native void setNumIters_0(long j, int i);

    private static native void setNumLevels_0(long j, int i);

    private static native void setPolyN_0(long j, int i);

    private static native void setPolySigma_0(long j, double d);

    private static native void setPyrScale_0(long j, double d);

    private static native void setWinSize_0(long j, int i);

    @Override // org.opencv.video.DenseOpticalFlow, org.opencv.core.Algorithm
    public final void finalize() throws Throwable {
        delete(this.a);
    }
}
