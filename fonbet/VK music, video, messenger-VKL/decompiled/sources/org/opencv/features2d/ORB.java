package org.opencv.features2d;

/* loaded from: classes8.dex */
public class ORB extends Feature2D {
    private static native long create_0(int i, float f, int i2, int i3, int i4, int i5, int i6, int i7, int i8);

    private static native long create_1(int i, float f, int i2, int i3, int i4, int i5, int i6, int i7);

    private static native long create_2(int i, float f, int i2, int i3, int i4, int i5, int i6);

    private static native long create_3(int i, float f, int i2, int i3, int i4, int i5);

    private static native long create_4(int i, float f, int i2, int i3, int i4);

    private static native long create_5(int i, float f, int i2, int i3);

    private static native long create_6(int i, float f, int i2);

    private static native long create_7(int i, float f);

    private static native long create_8(int i);

    private static native long create_9();

    private static native void delete(long j);

    private static native String getDefaultName_0(long j);

    private static native int getEdgeThreshold_0(long j);

    private static native int getFastThreshold_0(long j);

    private static native int getFirstLevel_0(long j);

    private static native int getMaxFeatures_0(long j);

    private static native int getNLevels_0(long j);

    private static native int getPatchSize_0(long j);

    private static native double getScaleFactor_0(long j);

    private static native int getScoreType_0(long j);

    private static native int getWTA_K_0(long j);

    private static native void setEdgeThreshold_0(long j, int i);

    private static native void setFastThreshold_0(long j, int i);

    private static native void setFirstLevel_0(long j, int i);

    private static native void setMaxFeatures_0(long j, int i);

    private static native void setNLevels_0(long j, int i);

    private static native void setPatchSize_0(long j, int i);

    private static native void setScaleFactor_0(long j, double d);

    private static native void setScoreType_0(long j, int i);

    private static native void setWTA_K_0(long j, int i);

    @Override // org.opencv.features2d.Feature2D, org.opencv.core.Algorithm
    public final void finalize() throws Throwable {
        delete(this.a);
    }
}
