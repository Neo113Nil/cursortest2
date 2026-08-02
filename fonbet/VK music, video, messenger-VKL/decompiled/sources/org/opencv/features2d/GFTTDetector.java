package org.opencv.features2d;

/* loaded from: classes8.dex */
public class GFTTDetector extends Feature2D {
    private static native long create_0(int i, double d, double d2, int i2, int i3, boolean z, double d3);

    private static native long create_1(int i, double d, double d2, int i2, int i3, boolean z);

    private static native long create_2(int i, double d, double d2, int i2, int i3);

    private static native long create_3(int i, double d, double d2, int i2, boolean z, double d3);

    private static native long create_4(int i, double d, double d2, int i2, boolean z);

    private static native long create_5(int i, double d, double d2, int i2);

    private static native long create_6(int i, double d, double d2);

    private static native long create_7(int i, double d);

    private static native long create_8(int i);

    private static native long create_9();

    private static native void delete(long j);

    private static native int getBlockSize_0(long j);

    private static native String getDefaultName_0(long j);

    private static native boolean getHarrisDetector_0(long j);

    private static native double getK_0(long j);

    private static native int getMaxFeatures_0(long j);

    private static native double getMinDistance_0(long j);

    private static native double getQualityLevel_0(long j);

    private static native void setBlockSize_0(long j, int i);

    private static native void setHarrisDetector_0(long j, boolean z);

    private static native void setK_0(long j, double d);

    private static native void setMaxFeatures_0(long j, int i);

    private static native void setMinDistance_0(long j, double d);

    private static native void setQualityLevel_0(long j, double d);

    @Override // org.opencv.features2d.Feature2D, org.opencv.core.Algorithm
    public final void finalize() throws Throwable {
        delete(this.a);
    }
}
