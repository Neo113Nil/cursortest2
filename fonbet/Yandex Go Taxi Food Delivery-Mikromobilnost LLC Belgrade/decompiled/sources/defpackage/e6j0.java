package defpackage;

import android.os.Process;

/* loaded from: classes10.dex */
public final class e6j0 extends Thread {
    public final int a;

    public e6j0(Runnable runnable) {
        super(runnable, "fonts-androidx");
        this.a = 10;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.a);
        super.run();
    }
}
