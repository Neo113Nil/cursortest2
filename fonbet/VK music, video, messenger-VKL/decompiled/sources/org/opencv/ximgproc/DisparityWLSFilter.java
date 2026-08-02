package org.opencv.ximgproc;

/* loaded from: classes8.dex */
public class DisparityWLSFilter extends DisparityFilter {
    private static native void delete(long j);

    private static native long getConfidenceMap_0(long j);

    private static native int getDepthDiscontinuityRadius_0(long j);

    private static native int getLRCthresh_0(long j);

    private static native double getLambda_0(long j);

    private static native double[] getROI_0(long j);

    private static native double getSigmaColor_0(long j);

    private static native void setDepthDiscontinuityRadius_0(long j, int i);

    private static native void setLRCthresh_0(long j, int i);

    private static native void setLambda_0(long j, double d);

    private static native void setSigmaColor_0(long j, double d);

    @Override // org.opencv.ximgproc.DisparityFilter, org.opencv.core.Algorithm
    public final void finalize() throws Throwable {
        delete(this.a);
    }
}
