package org.opencv.ximgproc;

import org.opencv.core.Algorithm;

/* loaded from: classes8.dex */
public class SelectiveSearchSegmentation extends Algorithm {
    private static native void addGraphSegmentation_0(long j, long j2);

    private static native void addImage_0(long j, long j2);

    private static native void addStrategy_0(long j, long j2);

    private static native void clearGraphSegmentations_0(long j);

    private static native void clearImages_0(long j);

    private static native void clearStrategies_0(long j);

    private static native void delete(long j);

    private static native void process_0(long j, long j2);

    private static native void setBaseImage_0(long j, long j2);

    private static native void switchToSelectiveSearchFast_0(long j, int i, int i2, float f);

    private static native void switchToSelectiveSearchFast_1(long j, int i, int i2);

    private static native void switchToSelectiveSearchFast_2(long j, int i);

    private static native void switchToSelectiveSearchFast_3(long j);

    private static native void switchToSelectiveSearchQuality_0(long j, int i, int i2, float f);

    private static native void switchToSelectiveSearchQuality_1(long j, int i, int i2);

    private static native void switchToSelectiveSearchQuality_2(long j, int i);

    private static native void switchToSelectiveSearchQuality_3(long j);

    private static native void switchToSingleStrategy_0(long j, int i, float f);

    private static native void switchToSingleStrategy_1(long j, int i);

    private static native void switchToSingleStrategy_2(long j);

    @Override // org.opencv.core.Algorithm
    public final void finalize() throws Throwable {
        delete(this.a);
    }
}
