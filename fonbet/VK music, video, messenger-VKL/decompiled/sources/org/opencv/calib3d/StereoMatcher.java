package org.opencv.calib3d;

import org.opencv.core.Algorithm;

/* loaded from: classes8.dex */
public class StereoMatcher extends Algorithm {
    private static native void compute_0(long j, long j2, long j3, long j4);

    private static native void delete(long j);

    private static native int getBlockSize_0(long j);

    private static native int getDisp12MaxDiff_0(long j);

    private static native int getMinDisparity_0(long j);

    private static native int getNumDisparities_0(long j);

    private static native int getSpeckleRange_0(long j);

    private static native int getSpeckleWindowSize_0(long j);

    private static native void setBlockSize_0(long j, int i);

    private static native void setDisp12MaxDiff_0(long j, int i);

    private static native void setMinDisparity_0(long j, int i);

    private static native void setNumDisparities_0(long j, int i);

    private static native void setSpeckleRange_0(long j, int i);

    private static native void setSpeckleWindowSize_0(long j, int i);

    @Override // org.opencv.core.Algorithm
    public void finalize() throws Throwable {
        delete(this.a);
    }
}
