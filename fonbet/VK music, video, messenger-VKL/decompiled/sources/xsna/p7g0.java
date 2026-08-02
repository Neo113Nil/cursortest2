package xsna;

import android.os.Process;
import java.util.concurrent.ThreadFactory;

/* compiled from: RequestExecutor.java */
/* loaded from: classes11.dex */
public final class p7g0 implements ThreadFactory {

    /* compiled from: RequestExecutor.java */
    public static class a extends Thread {
        public final int b;

        public a(Runnable runnable) {
            super(runnable, "fonts-androidx");
            this.b = 10;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            Process.setThreadPriority(this.b);
            super.run();
        }
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new a(runnable);
    }
}
