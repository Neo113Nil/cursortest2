package org.opencv.xfeatures2d;

import org.opencv.features2d.Feature2D;

/* loaded from: classes8.dex */
public class BoostDesc extends Feature2D {
    private static native long create_0(int i, boolean z, float f);

    private static native long create_1(int i, boolean z);

    private static native long create_2(int i);

    private static native long create_3();

    private static native void delete(long j);

    private static native float getScaleFactor_0(long j);

    private static native boolean getUseScaleOrientation_0(long j);

    private static native void setScaleFactor_0(long j, float f);

    private static native void setUseScaleOrientation_0(long j, boolean z);

    @Override // org.opencv.features2d.Feature2D, org.opencv.core.Algorithm
    public final void finalize() throws Throwable {
        delete(this.a);
    }
}
