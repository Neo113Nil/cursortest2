package org.opencv.xfeatures2d;

import org.opencv.core.Algorithm;

/* loaded from: classes8.dex */
public class PCTSignaturesSQFD extends Algorithm {
    private static native float computeQuadraticFormDistance_0(long j, long j2, long j3);

    private static native void computeQuadraticFormDistances_0(long j, long j2, long j3, long j4);

    private static native long create_0(int i, int i2, float f);

    private static native long create_1(int i, int i2);

    private static native long create_2(int i);

    private static native long create_3();

    private static native void delete(long j);

    @Override // org.opencv.core.Algorithm
    public final void finalize() throws Throwable {
        delete(this.a);
    }
}
