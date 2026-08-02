package org.opencv.ximgproc;

import org.opencv.core.Algorithm;

/* loaded from: classes8.dex */
public class EdgeBoxes extends Algorithm {
    private static native void delete(long j);

    private static native float getAlpha_0(long j);

    private static native float getBeta_0(long j);

    private static native void getBoundingBoxes_0(long j, long j2, long j3, long j4);

    private static native float getClusterMinMag_0(long j);

    private static native float getEdgeMergeThr_0(long j);

    private static native float getEdgeMinMag_0(long j);

    private static native float getEta_0(long j);

    private static native float getGamma_0(long j);

    private static native float getKappa_0(long j);

    private static native float getMaxAspectRatio_0(long j);

    private static native int getMaxBoxes_0(long j);

    private static native float getMinBoxArea_0(long j);

    private static native float getMinScore_0(long j);

    private static native void setAlpha_0(long j, float f);

    private static native void setBeta_0(long j, float f);

    private static native void setClusterMinMag_0(long j, float f);

    private static native void setEdgeMergeThr_0(long j, float f);

    private static native void setEdgeMinMag_0(long j, float f);

    private static native void setEta_0(long j, float f);

    private static native void setGamma_0(long j, float f);

    private static native void setKappa_0(long j, float f);

    private static native void setMaxAspectRatio_0(long j, float f);

    private static native void setMaxBoxes_0(long j, int i);

    private static native void setMinBoxArea_0(long j, float f);

    private static native void setMinScore_0(long j, float f);

    @Override // org.opencv.core.Algorithm
    public final void finalize() throws Throwable {
        delete(this.a);
    }
}
