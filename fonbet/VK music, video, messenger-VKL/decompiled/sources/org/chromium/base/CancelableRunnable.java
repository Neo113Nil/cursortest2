package org.chromium.base;

/* loaded from: classes8.dex */
public class CancelableRunnable implements Runnable {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private Thread mExpectedThread;
    private Runnable mRunnable;

    public CancelableRunnable(Runnable runnable) {
        this.mRunnable = runnable;
    }

    public void cancel() {
        this.mRunnable = null;
    }

    @Override // java.lang.Runnable
    public void run() {
        Runnable runnable = this.mRunnable;
        if (runnable != null) {
            runnable.run();
        }
    }
}
