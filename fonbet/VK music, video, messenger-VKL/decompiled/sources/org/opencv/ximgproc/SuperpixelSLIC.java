package org.opencv.ximgproc;

import org.opencv.core.Algorithm;

/* loaded from: classes8.dex */
public class SuperpixelSLIC extends Algorithm {
    private static native void delete(long j);

    private static native void enforceLabelConnectivity_0(long j, int i);

    private static native void enforceLabelConnectivity_1(long j);

    private static native void getLabelContourMask_0(long j, long j2, boolean z);

    private static native void getLabelContourMask_1(long j, long j2);

    private static native void getLabels_0(long j, long j2);

    private static native int getNumberOfSuperpixels_0(long j);

    private static native void iterate_0(long j, int i);

    private static native void iterate_1(long j);

    @Override // org.opencv.core.Algorithm
    public final void finalize() throws Throwable {
        delete(this.a);
    }
}
