package ru.ok.android.webrtc.utils;

/* loaded from: classes9.dex */
public final class i implements Runnable {
    public final Runnable a;
    public volatile boolean b = false;
    public int c = 0;
    public final /* synthetic */ PCExecutor d;

    public i(PCExecutor pCExecutor, Runnable runnable) {
        this.d = pCExecutor;
        this.a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.d.getClass();
        this.a.run();
        this.b = true;
    }
}
