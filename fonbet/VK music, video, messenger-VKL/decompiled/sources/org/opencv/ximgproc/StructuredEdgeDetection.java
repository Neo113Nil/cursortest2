package org.opencv.ximgproc;

import org.opencv.core.Algorithm;

/* loaded from: classes8.dex */
public class StructuredEdgeDetection extends Algorithm {
    private static native void computeOrientation_0(long j, long j2, long j3);

    private static native void delete(long j);

    private static native void detectEdges_0(long j, long j2, long j3);

    private static native void edgesNms_0(long j, long j2, long j3, long j4, int i, int i2, float f, boolean z);

    private static native void edgesNms_1(long j, long j2, long j3, long j4, int i, int i2, float f);

    private static native void edgesNms_2(long j, long j2, long j3, long j4, int i, int i2);

    private static native void edgesNms_3(long j, long j2, long j3, long j4, int i);

    private static native void edgesNms_4(long j, long j2, long j3, long j4);

    @Override // org.opencv.core.Algorithm
    public final void finalize() throws Throwable {
        delete(this.a);
    }
}
