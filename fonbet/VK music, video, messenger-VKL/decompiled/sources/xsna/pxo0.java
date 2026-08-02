package xsna;

import android.os.Handler;
import android.os.Looper;

/* compiled from: TimeoutLock.kt */
/* loaded from: classes17.dex */
public final class pxo0 {
    public static volatile boolean c = true;
    public final long a;
    public final Handler b = new Handler(Looper.getMainLooper());

    public pxo0(long j) {
        this.a = j;
    }

    public final synchronized boolean a() {
        if (c()) {
            return true;
        }
        d();
        return false;
    }

    public final synchronized boolean b(long j) {
        if (c()) {
            return true;
        }
        synchronized (this) {
            if (c) {
                this.b.sendEmptyMessageDelayed(0, j);
            }
        }
        return false;
    }

    public final synchronized boolean c() {
        return this.b.hasMessages(0);
    }

    public final synchronized void d() {
        long j = this.a;
        synchronized (this) {
            if (c) {
                this.b.sendEmptyMessageDelayed(0, j);
            }
        }
    }
}
