package org.opencv.calib3d;

/* loaded from: classes8.dex */
public class StereoBM extends StereoMatcher {
    private static native long create_0(int i, int i2);

    private static native long create_1(int i);

    private static native long create_2();

    private static native void delete(long j);

    private static native int getPreFilterCap_0(long j);

    private static native int getPreFilterSize_0(long j);

    private static native int getPreFilterType_0(long j);

    private static native double[] getROI1_0(long j);

    private static native double[] getROI2_0(long j);

    private static native int getSmallerBlockSize_0(long j);

    private static native int getTextureThreshold_0(long j);

    private static native int getUniquenessRatio_0(long j);

    private static native void setPreFilterCap_0(long j, int i);

    private static native void setPreFilterSize_0(long j, int i);

    private static native void setPreFilterType_0(long j, int i);

    private static native void setROI1_0(long j, int i, int i2, int i3, int i4);

    private static native void setROI2_0(long j, int i, int i2, int i3, int i4);

    private static native void setSmallerBlockSize_0(long j, int i);

    private static native void setTextureThreshold_0(long j, int i);

    private static native void setUniquenessRatio_0(long j, int i);

    @Override // org.opencv.calib3d.StereoMatcher, org.opencv.core.Algorithm
    public final void finalize() throws Throwable {
        delete(this.a);
    }
}
