package org.opencv.video;

/* loaded from: classes8.dex */
public class Video {
    private static native double[] CamShift_0(long j, int i, int i2, int i3, int i4, double[] dArr, int i5, int i6, double d);

    private static native int buildOpticalFlowPyramid_0(long j, long j2, double d, double d2, int i, boolean z, int i2, int i3, boolean z2);

    private static native int buildOpticalFlowPyramid_1(long j, long j2, double d, double d2, int i, boolean z, int i2, int i3);

    private static native int buildOpticalFlowPyramid_2(long j, long j2, double d, double d2, int i, boolean z, int i2);

    private static native int buildOpticalFlowPyramid_3(long j, long j2, double d, double d2, int i, boolean z);

    private static native int buildOpticalFlowPyramid_4(long j, long j2, double d, double d2, int i);

    private static native void calcOpticalFlowFarneback_0(long j, long j2, long j3, double d, int i, int i2, int i3, int i4, double d2, int i5);

    private static native void calcOpticalFlowPyrLK_0(long j, long j2, long j3, long j4, long j5, long j6, double d, double d2, int i, int i2, int i3, double d3, int i4, double d4);

    private static native void calcOpticalFlowPyrLK_1(long j, long j2, long j3, long j4, long j5, long j6, double d, double d2, int i, int i2, int i3, double d3, int i4);

    private static native void calcOpticalFlowPyrLK_2(long j, long j2, long j3, long j4, long j5, long j6, double d, double d2, int i, int i2, int i3, double d3);

    private static native void calcOpticalFlowPyrLK_3(long j, long j2, long j3, long j4, long j5, long j6, double d, double d2, int i);

    private static native void calcOpticalFlowPyrLK_4(long j, long j2, long j3, long j4, long j5, long j6, double d, double d2);

    private static native void calcOpticalFlowPyrLK_5(long j, long j2, long j3, long j4, long j5, long j6);

    private static native double computeECC_0(long j, long j2, long j3);

    private static native double computeECC_1(long j, long j2);

    private static native long createBackgroundSubtractorKNN_0(int i, double d, boolean z);

    private static native long createBackgroundSubtractorKNN_1(int i, double d);

    private static native long createBackgroundSubtractorKNN_2(int i);

    private static native long createBackgroundSubtractorKNN_3();

    private static native long createBackgroundSubtractorMOG2_0(int i, double d, boolean z);

    private static native long createBackgroundSubtractorMOG2_1(int i, double d);

    private static native long createBackgroundSubtractorMOG2_2(int i);

    private static native long createBackgroundSubtractorMOG2_3();

    private static native double findTransformECC_0(long j, long j2, long j3, int i, int i2, int i3, double d, long j4, int i4);

    private static native int meanShift_0(long j, int i, int i2, int i3, int i4, double[] dArr, int i5, int i6, double d);

    private static native long readOpticalFlow_0(String str);

    private static native boolean writeOpticalFlow_0(String str, long j);
}
