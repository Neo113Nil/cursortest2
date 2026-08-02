package xsna;

import android.os.SystemClock;

/* compiled from: IntervalThread.java */
/* loaded from: classes7.dex */
public final class pox extends Thread {
    public final a c;
    public final Object b = new Object();
    public volatile long d = 0;
    public volatile boolean e = false;

    /* compiled from: IntervalThread.java */
    public interface a {
        long a();
    }

    public pox(a aVar) {
        this.c = aVar;
    }

    public final void a() {
        synchronized (this.b) {
        }
    }

    @Override // java.lang.Thread
    public final void interrupt() {
        this.e = true;
        super.interrupt();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        long elapsedRealtime = SystemClock.elapsedRealtime() + this.d;
        while (!this.e) {
            synchronized (this.b) {
            }
            long elapsedRealtime2 = elapsedRealtime - SystemClock.elapsedRealtime();
            if (elapsedRealtime2 > 0) {
                synchronized (this.b) {
                    try {
                        this.b.wait(elapsedRealtime2);
                    } catch (InterruptedException unused) {
                    } finally {
                    }
                }
            }
            elapsedRealtime = this.c.a() + SystemClock.elapsedRealtime();
        }
    }
}
