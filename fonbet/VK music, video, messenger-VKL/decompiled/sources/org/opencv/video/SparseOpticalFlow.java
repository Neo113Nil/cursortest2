package org.opencv.video;

import org.opencv.core.Algorithm;

/* loaded from: classes8.dex */
public class SparseOpticalFlow extends Algorithm {
    private static native void calc_0(long j, long j2, long j3, long j4, long j5, long j6, long j7);

    private static native void calc_1(long j, long j2, long j3, long j4, long j5, long j6);

    private static native void delete(long j);

    @Override // org.opencv.core.Algorithm
    public void finalize() throws Throwable {
        delete(this.a);
    }
}
