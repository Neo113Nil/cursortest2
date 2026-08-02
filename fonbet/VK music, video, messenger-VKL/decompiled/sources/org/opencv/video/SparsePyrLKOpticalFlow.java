package org.opencv.video;

/* loaded from: classes8.dex */
public class SparsePyrLKOpticalFlow extends SparseOpticalFlow {
    private static native long create_0(double d, double d2, int i, int i2, int i3, double d3, int i4, double d4);

    private static native long create_1(double d, double d2, int i, int i2, int i3, double d3, int i4);

    private static native long create_2(double d, double d2, int i, int i2, int i3, double d3);

    private static native long create_3(double d, double d2, int i);

    private static native long create_4(double d, double d2);

    private static native long create_5();

    private static native void delete(long j);

    private static native int getFlags_0(long j);

    private static native int getMaxLevel_0(long j);

    private static native double getMinEigThreshold_0(long j);

    private static native double[] getTermCriteria_0(long j);

    private static native double[] getWinSize_0(long j);

    private static native void setFlags_0(long j, int i);

    private static native void setMaxLevel_0(long j, int i);

    private static native void setMinEigThreshold_0(long j, double d);

    private static native void setTermCriteria_0(long j, int i, int i2, double d);

    private static native void setWinSize_0(long j, double d, double d2);

    @Override // org.opencv.video.SparseOpticalFlow, org.opencv.core.Algorithm
    public final void finalize() throws Throwable {
        delete(this.a);
    }
}
