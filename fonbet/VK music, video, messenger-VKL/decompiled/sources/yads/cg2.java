package yads;

import android.os.Looper;
import android.os.SystemClock;
import java.util.concurrent.TimeoutException;

/* loaded from: classes10.dex */
public final class cg2 {
    public final bg2 a;
    public final ag2 b;
    public final xv c;
    public int d;
    public Object e;
    public final Looper f;
    public boolean g;
    public boolean h;
    public boolean i;

    public cg2(ho0 ho0Var, bg2 bg2Var, w73 w73Var, int i, xv xvVar, Looper looper) {
        this.b = ho0Var;
        this.a = bg2Var;
        this.f = looper;
        this.c = xvVar;
    }

    public final synchronized void a(long j) {
        boolean z;
        if (!this.g) {
            throw new IllegalStateException();
        }
        if (this.f.getThread() == Thread.currentThread()) {
            throw new IllegalStateException();
        }
        ((j63) this.c).getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime() + j;
        while (true) {
            z = this.i;
            if (z || j <= 0) {
                break;
            }
            this.c.getClass();
            wait(j);
            ((j63) this.c).getClass();
            j = elapsedRealtime - SystemClock.elapsedRealtime();
        }
        if (!z) {
            throw new TimeoutException("Message delivery timed out.");
        }
    }

    public final synchronized void a(boolean z) {
        this.h = z | this.h;
        this.i = true;
        notifyAll();
    }

    public final cg2 a() {
        if (!this.g) {
            this.g = true;
            ho0 ho0Var = (ho0) this.b;
            synchronized (ho0Var) {
                if (!ho0Var.A && ho0Var.j.isAlive()) {
                    ho0Var.i.a(14, this).b();
                    return this;
                }
                ji1.d("ExoPlayerImplInternal", "Ignoring messages sent after release.");
                a(false);
                return this;
            }
        }
        throw new IllegalStateException();
    }
}
