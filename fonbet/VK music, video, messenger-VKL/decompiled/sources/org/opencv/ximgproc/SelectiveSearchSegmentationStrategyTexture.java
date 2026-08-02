package org.opencv.ximgproc;

/* loaded from: classes8.dex */
public class SelectiveSearchSegmentationStrategyTexture extends SelectiveSearchSegmentationStrategy {
    private static native void delete(long j);

    @Override // org.opencv.ximgproc.SelectiveSearchSegmentationStrategy, org.opencv.core.Algorithm
    public final void finalize() throws Throwable {
        delete(this.a);
    }
}
