package org.opencv.video;

/* loaded from: classes8.dex */
public class VariationalRefinement extends DenseOpticalFlow {
    private static native void calcUV_0(long j, long j2, long j3, long j4, long j5);

    private static native long create_0();

    private static native void delete(long j);

    private static native float getAlpha_0(long j);

    private static native float getDelta_0(long j);

    private static native int getFixedPointIterations_0(long j);

    private static native float getGamma_0(long j);

    private static native float getOmega_0(long j);

    private static native int getSorIterations_0(long j);

    private static native void setAlpha_0(long j, float f);

    private static native void setDelta_0(long j, float f);

    private static native void setFixedPointIterations_0(long j, int i);

    private static native void setGamma_0(long j, float f);

    private static native void setOmega_0(long j, float f);

    private static native void setSorIterations_0(long j, int i);

    @Override // org.opencv.video.DenseOpticalFlow, org.opencv.core.Algorithm
    public final void finalize() throws Throwable {
        delete(this.a);
    }
}
