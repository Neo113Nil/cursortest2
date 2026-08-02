package org.opencv.core;

/* loaded from: classes8.dex */
public class Algorithm {
    public final long a;

    public Algorithm(long j) {
        this.a = j;
    }

    private static native void clear_0(long j);

    private static native void delete(long j);

    private static native boolean empty_0(long j);

    private static native String getDefaultName_0(long j);

    private static native void save_0(long j, String str);

    public void finalize() throws Throwable {
        delete(this.a);
    }
}
