package org.opencv.xfeatures2d;

import org.opencv.features2d.Feature2D;

/* loaded from: classes8.dex */
public class SURF extends Feature2D {
    private static native long create_0(double d, int i, int i2, boolean z, boolean z2);

    private static native long create_1(double d, int i, int i2, boolean z);

    private static native long create_2(double d, int i, int i2);

    private static native long create_3(double d, int i);

    private static native long create_4(double d);

    private static native long create_5();

    private static native void delete(long j);

    private static native boolean getExtended_0(long j);

    private static native double getHessianThreshold_0(long j);

    private static native int getNOctaveLayers_0(long j);

    private static native int getNOctaves_0(long j);

    private static native boolean getUpright_0(long j);

    private static native void setExtended_0(long j, boolean z);

    private static native void setHessianThreshold_0(long j, double d);

    private static native void setNOctaveLayers_0(long j, int i);

    private static native void setNOctaves_0(long j, int i);

    private static native void setUpright_0(long j, boolean z);

    @Override // org.opencv.features2d.Feature2D, org.opencv.core.Algorithm
    public final void finalize() throws Throwable {
        delete(this.a);
    }
}
