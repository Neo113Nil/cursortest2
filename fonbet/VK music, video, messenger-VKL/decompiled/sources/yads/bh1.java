package yads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* loaded from: classes10.dex */
public final class bh1 extends Handler implements Runnable {
    public final int b;
    public final ch1 c;
    public final long d;
    public zg1 e;
    public IOException f;
    public int g;
    public Thread h;
    public boolean i;
    public volatile boolean j;
    public final /* synthetic */ gh1 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bh1(gh1 gh1Var, Looper looper, ch1 ch1Var, zg1 zg1Var, int i, long j) {
        super(looper);
        this.k = gh1Var;
        this.c = ch1Var;
        this.e = zg1Var;
        this.b = i;
        this.d = j;
    }

    public final void a(boolean z) {
        this.j = z;
        this.f = null;
        if (hasMessages(0)) {
            this.i = true;
            removeMessages(0);
            if (!z) {
                sendEmptyMessage(1);
            }
        } else {
            synchronized (this) {
                try {
                    this.i = true;
                    this.c.b();
                    Thread thread = this.h;
                    if (thread != null) {
                        thread.interrupt();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (z) {
            this.k.b = null;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            zg1 zg1Var = this.e;
            zg1Var.getClass();
            zg1Var.a(this.c, elapsedRealtime, elapsedRealtime - this.d, true);
            this.e = null;
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.j) {
            return;
        }
        int i = message.what;
        if (i == 0) {
            this.f = null;
            gh1 gh1Var = this.k;
            ExecutorService executorService = gh1Var.a;
            bh1 bh1Var = gh1Var.b;
            bh1Var.getClass();
            executorService.execute(bh1Var);
            return;
        }
        if (i == 3) {
            throw ((Error) message.obj);
        }
        this.k.b = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = elapsedRealtime - this.d;
        zg1 zg1Var = this.e;
        zg1Var.getClass();
        if (this.i) {
            zg1Var.a(this.c, elapsedRealtime, j, false);
            return;
        }
        int i2 = message.what;
        if (i2 == 1) {
            try {
                zg1Var.a(this.c, elapsedRealtime, j);
                return;
            } catch (RuntimeException e) {
                ji1.b("LoadTask", ji1.a("Unexpected exception handling load completed", e));
                this.k.c = new fh1(e);
                return;
            }
        }
        if (i2 != 2) {
            return;
        }
        IOException iOException = (IOException) message.obj;
        this.f = iOException;
        int i3 = this.g + 1;
        this.g = i3;
        ah1 a = zg1Var.a(this.c, elapsedRealtime, j, iOException, i3);
        int i4 = a.a;
        if (i4 == 3) {
            this.k.c = this.f;
            return;
        }
        if (i4 != 2) {
            if (i4 == 1) {
                this.g = 1;
            }
            long j2 = a.b;
            if (j2 == C.TIME_UNSET) {
                j2 = Math.min((this.g - 1) * 1000, 5000);
            }
            gh1 gh1Var2 = this.k;
            if (gh1Var2.b != null) {
                throw new IllegalStateException();
            }
            gh1Var2.b = this;
            if (j2 > 0) {
                sendEmptyMessageDelayed(0, j2);
            } else {
                this.f = null;
                gh1Var2.a.execute(this);
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        try {
            synchronized (this) {
                z = this.i;
                this.h = Thread.currentThread();
            }
            if (!z) {
                h83.a("load:".concat(this.c.getClass().getSimpleName()));
                try {
                    this.c.a();
                    h83.a();
                } catch (Throwable th) {
                    h83.a();
                    throw th;
                }
            }
            synchronized (this) {
                this.h = null;
                Thread.interrupted();
            }
            if (this.j) {
                return;
            }
            sendEmptyMessage(1);
        } catch (IOException e) {
            if (this.j) {
                return;
            }
            obtainMessage(2, e).sendToTarget();
        } catch (Exception e2) {
            if (this.j) {
                return;
            }
            ji1.b("LoadTask", ji1.a("Unexpected exception loading stream", e2));
            obtainMessage(2, new fh1(e2)).sendToTarget();
        } catch (OutOfMemoryError e3) {
            if (this.j) {
                return;
            }
            ji1.b("LoadTask", ji1.a("OutOfMemory error loading stream", e3));
            obtainMessage(2, new fh1(e3)).sendToTarget();
        } catch (Error e4) {
            if (!this.j) {
                ji1.b("LoadTask", ji1.a("Unexpected error loading stream", e4));
                obtainMessage(3, e4).sendToTarget();
            }
            throw e4;
        }
    }
}
