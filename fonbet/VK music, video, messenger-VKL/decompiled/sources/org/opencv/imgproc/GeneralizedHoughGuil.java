package org.opencv.imgproc;

/* loaded from: classes8.dex */
public class GeneralizedHoughGuil extends GeneralizedHough {
    private static native void delete(long j);

    @Override // org.opencv.imgproc.GeneralizedHough, org.opencv.core.Algorithm
    public final void finalize() throws Throwable {
        delete(this.a);
    }
}
