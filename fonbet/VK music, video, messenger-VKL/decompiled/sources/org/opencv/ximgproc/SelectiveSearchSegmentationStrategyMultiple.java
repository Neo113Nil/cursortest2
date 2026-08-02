package org.opencv.ximgproc;

/* loaded from: classes8.dex */
public class SelectiveSearchSegmentationStrategyMultiple extends SelectiveSearchSegmentationStrategy {
    private static native void addStrategy_0(long j, long j2, float f);

    private static native void clearStrategies_0(long j);

    private static native void delete(long j);

    @Override // org.opencv.ximgproc.SelectiveSearchSegmentationStrategy, org.opencv.core.Algorithm
    public final void finalize() throws Throwable {
        delete(this.a);
    }
}
