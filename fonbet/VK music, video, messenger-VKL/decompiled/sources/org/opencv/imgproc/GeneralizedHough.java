package org.opencv.imgproc;

import org.opencv.core.Algorithm;

/* loaded from: classes8.dex */
public class GeneralizedHough extends Algorithm {
    private static native void delete(long j);

    private static native void detect_0(long j, long j2, long j3, long j4, long j5, long j6);

    private static native void detect_1(long j, long j2, long j3, long j4, long j5);

    private static native void detect_2(long j, long j2, long j3, long j4);

    private static native void detect_3(long j, long j2, long j3);

    private static native int getCannyHighThresh_0(long j);

    private static native int getCannyLowThresh_0(long j);

    private static native double getDp_0(long j);

    private static native int getMaxBufferSize_0(long j);

    private static native double getMinDist_0(long j);

    private static native void setCannyHighThresh_0(long j, int i);

    private static native void setCannyLowThresh_0(long j, int i);

    private static native void setDp_0(long j, double d);

    private static native void setMaxBufferSize_0(long j, int i);

    private static native void setMinDist_0(long j, double d);

    private static native void setTemplate_0(long j, long j2, long j3, long j4, double d, double d2);

    private static native void setTemplate_1(long j, long j2, long j3, long j4);

    private static native void setTemplate_2(long j, long j2, double d, double d2);

    private static native void setTemplate_3(long j, long j2);

    @Override // org.opencv.core.Algorithm
    public void finalize() throws Throwable {
        delete(this.a);
    }
}
