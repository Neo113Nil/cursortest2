package org.opencv.xfeatures2d;

import org.opencv.features2d.Feature2D;

/* loaded from: classes8.dex */
public class MSDDetector extends Feature2D {
    private static native void delete(long j);

    @Override // org.opencv.features2d.Feature2D, org.opencv.core.Algorithm
    public final void finalize() throws Throwable {
        delete(this.a);
    }
}
