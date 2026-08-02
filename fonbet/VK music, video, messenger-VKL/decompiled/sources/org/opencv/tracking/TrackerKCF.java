package org.opencv.tracking;

/* loaded from: classes8.dex */
public class TrackerKCF extends Tracker {
    private static native long create_0();

    private static native void delete(long j);

    @Override // org.opencv.tracking.Tracker, org.opencv.core.Algorithm
    public final void finalize() throws Throwable {
        delete(this.a);
    }
}
