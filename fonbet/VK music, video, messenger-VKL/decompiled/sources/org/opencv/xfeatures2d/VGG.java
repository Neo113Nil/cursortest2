package org.opencv.xfeatures2d;

import org.opencv.features2d.Feature2D;

/* loaded from: classes8.dex */
public class VGG extends Feature2D {
    private static native long create_0(int i, float f, boolean z, boolean z2, float f2, boolean z3);

    private static native long create_1(int i, float f, boolean z, boolean z2, float f2);

    private static native long create_2(int i, float f, boolean z, boolean z2);

    private static native long create_3(int i, float f, boolean z);

    private static native long create_4(int i, float f);

    private static native long create_5(int i);

    private static native long create_6();

    private static native void delete(long j);

    private static native float getScaleFactor_0(long j);

    private static native float getSigma_0(long j);

    private static native boolean getUseNormalizeDescriptor_0(long j);

    private static native boolean getUseNormalizeImage_0(long j);

    private static native boolean getUseScaleOrientation_0(long j);

    private static native void setScaleFactor_0(long j, float f);

    private static native void setSigma_0(long j, float f);

    private static native void setUseNormalizeDescriptor_0(long j, boolean z);

    private static native void setUseNormalizeImage_0(long j, boolean z);

    private static native void setUseScaleOrientation_0(long j, boolean z);

    @Override // org.opencv.features2d.Feature2D, org.opencv.core.Algorithm
    public final void finalize() throws Throwable {
        delete(this.a);
    }
}
