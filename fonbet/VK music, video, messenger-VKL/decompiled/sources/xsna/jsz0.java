package xsna;

import android.os.Process;

/* compiled from: com.google.android.gms:play-services-basement@@18.10.0 */
/* loaded from: classes.dex */
public final class jsz0 implements Runnable {
    public final Runnable b;

    public jsz0(Runnable runnable) {
        this.b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(0);
        this.b.run();
    }
}
