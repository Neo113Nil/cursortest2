package org.opencv.ximgproc;

/* loaded from: classes8.dex */
public class EdgeAwareInterpolator extends SparseMatchInterpolator {
    private static native void delete(long j);

    private static native float getFGSLambda_0(long j);

    private static native float getFGSSigma_0(long j);

    private static native int getK_0(long j);

    private static native float getLambda_0(long j);

    private static native float getSigma_0(long j);

    private static native boolean getUsePostProcessing_0(long j);

    private static native void setFGSLambda_0(long j, float f);

    private static native void setFGSSigma_0(long j, float f);

    private static native void setK_0(long j, int i);

    private static native void setLambda_0(long j, float f);

    private static native void setSigma_0(long j, float f);

    private static native void setUsePostProcessing_0(long j, boolean z);

    @Override // org.opencv.ximgproc.SparseMatchInterpolator, org.opencv.core.Algorithm
    public final void finalize() throws Throwable {
        delete(this.a);
    }
}
