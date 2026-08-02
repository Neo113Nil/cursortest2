package org.opencv.video;

import org.opencv.core.Algorithm;

/* loaded from: classes8.dex */
public class DenseOpticalFlow extends Algorithm {
    private static native void calc_0(long j, long j2, long j3, long j4);

    private static native void collectGarbage_0(long j);

    private static native void delete(long j);

    @Override // org.opencv.core.Algorithm
    public void finalize() throws Throwable {
        delete(this.a);
    }
}
