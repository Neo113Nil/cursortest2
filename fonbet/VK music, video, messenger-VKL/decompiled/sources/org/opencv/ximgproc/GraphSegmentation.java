package org.opencv.ximgproc;

import org.opencv.core.Algorithm;

/* loaded from: classes8.dex */
public class GraphSegmentation extends Algorithm {
    private static native void delete(long j);

    private static native float getK_0(long j);

    private static native int getMinSize_0(long j);

    private static native double getSigma_0(long j);

    private static native void processImage_0(long j, long j2, long j3);

    private static native void setK_0(long j, float f);

    private static native void setMinSize_0(long j, int i);

    private static native void setSigma_0(long j, double d);

    @Override // org.opencv.core.Algorithm
    public final void finalize() throws Throwable {
        delete(this.a);
    }
}
