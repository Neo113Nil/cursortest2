package org.webrtc;

/* loaded from: classes9.dex */
public class NativeRunnable {
    private final Runnable runnable;

    public NativeRunnable(Runnable runnable) {
        this.runnable = runnable;
    }

    @CalledByNative
    public void run() {
        this.runnable.run();
    }
}
