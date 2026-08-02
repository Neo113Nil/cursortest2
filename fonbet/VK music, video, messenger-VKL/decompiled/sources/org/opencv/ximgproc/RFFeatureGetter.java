package org.opencv.ximgproc;

import org.opencv.core.Algorithm;

/* loaded from: classes8.dex */
public class RFFeatureGetter extends Algorithm {
    private static native void delete(long j);

    private static native void getFeatures_0(long j, long j2, long j3, int i, int i2, int i3, int i4, int i5);

    @Override // org.opencv.core.Algorithm
    public final void finalize() throws Throwable {
        delete(this.a);
    }
}
