package org.opencv.ximgproc;

import org.opencv.core.Algorithm;

/* loaded from: classes8.dex */
public class SelectiveSearchSegmentationStrategy extends Algorithm {
    private static native void delete(long j);

    private static native float get_0(long j, int i, int i2);

    private static native void merge_0(long j, int i, int i2);

    private static native void setImage_0(long j, long j2, long j3, long j4, int i);

    private static native void setImage_1(long j, long j2, long j3, long j4);

    @Override // org.opencv.core.Algorithm
    public void finalize() throws Throwable {
        delete(this.a);
    }
}
