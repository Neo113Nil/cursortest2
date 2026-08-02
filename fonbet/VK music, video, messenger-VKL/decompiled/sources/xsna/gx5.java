package xsna;

import android.os.Process;

/* compiled from: BackgroundPriorityRunnable.java */
/* loaded from: classes13.dex */
public abstract class gx5 implements Runnable {
    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        a();
    }
}
