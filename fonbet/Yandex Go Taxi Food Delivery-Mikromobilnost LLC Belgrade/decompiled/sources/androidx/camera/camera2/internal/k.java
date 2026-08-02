package androidx.camera.camera2.internal;

import java.util.concurrent.Executor;

/* loaded from: classes10.dex */
public final class k implements Runnable {
    public final Executor a;
    public boolean b = false;
    public final /* synthetic */ Camera2CameraImpl$StateCallback c;

    public k(Camera2CameraImpl$StateCallback camera2CameraImpl$StateCallback, Executor executor) {
        this.c = camera2CameraImpl$StateCallback;
        this.a = executor;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.execute(new i(1, this));
    }
}
