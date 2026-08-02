package org.opencv.ximgproc;

import org.opencv.core.Algorithm;

/* loaded from: classes8.dex */
public class DisparityFilter extends Algorithm {
    private static native void delete(long j);

    private static native void filter_0(long j, long j2, long j3, long j4, long j5, int i, int i2, int i3, int i4, long j6);

    private static native void filter_1(long j, long j2, long j3, long j4, long j5, int i, int i2, int i3, int i4);

    private static native void filter_2(long j, long j2, long j3, long j4, long j5);

    private static native void filter_3(long j, long j2, long j3, long j4);

    @Override // org.opencv.core.Algorithm
    public void finalize() throws Throwable {
        delete(this.a);
    }
}
