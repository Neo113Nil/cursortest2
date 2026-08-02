package org.opencv.features2d;

/* loaded from: classes8.dex */
public class AKAZE extends Feature2D {
    private static native long create_0(int i, int i2, int i3, float f, int i4, int i5, int i6);

    private static native long create_1(int i, int i2, int i3, float f, int i4, int i5);

    private static native long create_2(int i, int i2, int i3, float f, int i4);

    private static native long create_3(int i, int i2, int i3, float f);

    private static native long create_4(int i, int i2, int i3);

    private static native long create_5(int i, int i2);

    private static native long create_6(int i);

    private static native long create_7();

    private static native void delete(long j);

    private static native String getDefaultName_0(long j);

    private static native int getDescriptorChannels_0(long j);

    private static native int getDescriptorSize_0(long j);

    private static native int getDescriptorType_0(long j);

    private static native int getDiffusivity_0(long j);

    private static native int getNOctaveLayers_0(long j);

    private static native int getNOctaves_0(long j);

    private static native double getThreshold_0(long j);

    private static native void setDescriptorChannels_0(long j, int i);

    private static native void setDescriptorSize_0(long j, int i);

    private static native void setDescriptorType_0(long j, int i);

    private static native void setDiffusivity_0(long j, int i);

    private static native void setNOctaveLayers_0(long j, int i);

    private static native void setNOctaves_0(long j, int i);

    private static native void setThreshold_0(long j, double d);

    @Override // org.opencv.features2d.Feature2D, org.opencv.core.Algorithm
    public final void finalize() throws Throwable {
        delete(this.a);
    }
}
