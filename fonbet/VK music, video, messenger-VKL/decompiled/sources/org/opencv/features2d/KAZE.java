package org.opencv.features2d;

/* loaded from: classes8.dex */
public class KAZE extends Feature2D {
    private static native long create_0(boolean z, boolean z2, float f, int i, int i2, int i3);

    private static native long create_1(boolean z, boolean z2, float f, int i, int i2);

    private static native long create_2(boolean z, boolean z2, float f, int i);

    private static native long create_3(boolean z, boolean z2, float f);

    private static native long create_4(boolean z, boolean z2);

    private static native long create_5(boolean z);

    private static native long create_6();

    private static native void delete(long j);

    private static native String getDefaultName_0(long j);

    private static native int getDiffusivity_0(long j);

    private static native boolean getExtended_0(long j);

    private static native int getNOctaveLayers_0(long j);

    private static native int getNOctaves_0(long j);

    private static native double getThreshold_0(long j);

    private static native boolean getUpright_0(long j);

    private static native void setDiffusivity_0(long j, int i);

    private static native void setExtended_0(long j, boolean z);

    private static native void setNOctaveLayers_0(long j, int i);

    private static native void setNOctaves_0(long j, int i);

    private static native void setThreshold_0(long j, double d);

    private static native void setUpright_0(long j, boolean z);

    @Override // org.opencv.features2d.Feature2D, org.opencv.core.Algorithm
    public final void finalize() throws Throwable {
        delete(this.a);
    }
}
