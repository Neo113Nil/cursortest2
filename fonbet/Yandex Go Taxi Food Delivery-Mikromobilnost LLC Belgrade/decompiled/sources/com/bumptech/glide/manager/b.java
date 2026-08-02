package com.bumptech.glide.manager;

/* loaded from: classes10.dex */
public final class b implements Runnable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ SingletonConnectivityReceiver$FrameworkConnectivityMonitorPostApi24$1 b;

    public b(SingletonConnectivityReceiver$FrameworkConnectivityMonitorPostApi24$1 singletonConnectivityReceiver$FrameworkConnectivityMonitorPostApi24$1, boolean z) {
        this.b = singletonConnectivityReceiver$FrameworkConnectivityMonitorPostApi24$1;
        this.a = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.onConnectivityChange(this.a);
    }
}
