package org.opencv.ximgproc;

import org.opencv.core.Algorithm;

/* loaded from: classes8.dex */
public class ContourFitting extends Algorithm {
    private static native void delete(long j);

    private static native void estimateTransformation_0(long j, long j2, long j3, long j4, double[] dArr, boolean z);

    private static native void estimateTransformation_1(long j, long j2, long j3, long j4, double[] dArr);

    private static native int getCtrSize_0(long j);

    private static native int getFDSize_0(long j);

    private static native void setCtrSize_0(long j, int i);

    private static native void setFDSize_0(long j, int i);

    @Override // org.opencv.core.Algorithm
    public final void finalize() throws Throwable {
        delete(this.a);
    }
}
