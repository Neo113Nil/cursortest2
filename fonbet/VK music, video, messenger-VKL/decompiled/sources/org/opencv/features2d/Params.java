package org.opencv.features2d;

/* loaded from: classes8.dex */
public class Params {
    public final long a = Params_0();

    private static native long Params_0();

    private static native void delete(long j);

    private static native boolean get_filterByArea_0(long j);

    private static native boolean get_filterByCircularity_0(long j);

    private static native boolean get_filterByColor_0(long j);

    private static native boolean get_filterByConvexity_0(long j);

    private static native boolean get_filterByInertia_0(long j);

    private static native float get_maxArea_0(long j);

    private static native float get_maxCircularity_0(long j);

    private static native float get_maxConvexity_0(long j);

    private static native float get_maxInertiaRatio_0(long j);

    private static native float get_maxThreshold_0(long j);

    private static native float get_minArea_0(long j);

    private static native float get_minCircularity_0(long j);

    private static native float get_minConvexity_0(long j);

    private static native float get_minDistBetweenBlobs_0(long j);

    private static native float get_minInertiaRatio_0(long j);

    private static native long get_minRepeatability_0(long j);

    private static native float get_minThreshold_0(long j);

    private static native float get_thresholdStep_0(long j);

    private static native void set_filterByArea_0(long j, boolean z);

    private static native void set_filterByCircularity_0(long j, boolean z);

    private static native void set_filterByColor_0(long j, boolean z);

    private static native void set_filterByConvexity_0(long j, boolean z);

    private static native void set_filterByInertia_0(long j, boolean z);

    private static native void set_maxArea_0(long j, float f);

    private static native void set_maxCircularity_0(long j, float f);

    private static native void set_maxConvexity_0(long j, float f);

    private static native void set_maxInertiaRatio_0(long j, float f);

    private static native void set_maxThreshold_0(long j, float f);

    private static native void set_minArea_0(long j, float f);

    private static native void set_minCircularity_0(long j, float f);

    private static native void set_minConvexity_0(long j, float f);

    private static native void set_minDistBetweenBlobs_0(long j, float f);

    private static native void set_minInertiaRatio_0(long j, float f);

    private static native void set_minRepeatability_0(long j, long j2);

    private static native void set_minThreshold_0(long j, float f);

    private static native void set_thresholdStep_0(long j, float f);

    public final void finalize() throws Throwable {
        delete(this.a);
    }
}
