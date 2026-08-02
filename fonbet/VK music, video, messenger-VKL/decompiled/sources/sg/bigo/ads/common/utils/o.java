package sg.bigo.ads.common.utils;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;

/* loaded from: classes9.dex */
public abstract class o {
    private long a;
    final long e;
    long f;
    long g;
    long h;
    boolean i = false;
    public boolean j = false;

    @SuppressLint({"HandlerLeak"})
    private final Handler b = new Handler() { // from class: sg.bigo.ads.common.utils.o.1
        /* JADX WARN: Removed duplicated region for block: B:20:0x0041 A[Catch: all -> 0x0024, LOOP:0: B:18:0x003d->B:20:0x0041, LOOP_END, TryCatch #0 {all -> 0x0024, blocks: (B:4:0x0003, B:6:0x0009, B:9:0x000e, B:11:0x001c, B:12:0x0026, B:14:0x002e, B:16:0x0034, B:20:0x0041, B:22:0x0047, B:23:0x003b, B:24:0x005b), top: B:3:0x0003 }] */
        @Override // android.os.Handler
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void handleMessage(Message message) {
            long j;
            synchronized (o.this) {
                try {
                    o oVar = o.this;
                    if (!oVar.i && !oVar.j) {
                        long elapsedRealtime = oVar.f - SystemClock.elapsedRealtime();
                        if (elapsedRealtime <= 0) {
                            o oVar2 = o.this;
                            oVar2.j = true;
                            oVar2.a();
                        } else {
                            o oVar3 = o.this;
                            long j2 = oVar3.g;
                            if (j2 > 0) {
                                long j3 = oVar3.h;
                                if (j3 > 0) {
                                    j = oVar3.e - (j3 - j2);
                                    oVar3.h = 0L;
                                    while (j < 0) {
                                        j += o.this.e;
                                    }
                                    o.this.a(elapsedRealtime);
                                    o.this.g = SystemClock.elapsedRealtime();
                                    sendMessageDelayed(obtainMessage(1), j);
                                }
                            }
                            j = oVar3.e;
                            while (j < 0) {
                            }
                            o.this.a(elapsedRealtime);
                            o.this.g = SystemClock.elapsedRealtime();
                            sendMessageDelayed(obtainMessage(1), j);
                        }
                    }
                } finally {
                }
            }
        }
    };

    public o(long j, long j2) {
        this.e = j2;
        this.a = j;
    }

    public abstract void a();

    public abstract void a(long j);

    public final synchronized void b() {
        this.i = true;
        this.b.removeMessages(1);
    }

    public final synchronized o c() {
        this.i = false;
        if (this.a <= 0) {
            if (!this.j) {
                this.j = true;
                a();
            }
            return this;
        }
        this.f = SystemClock.elapsedRealtime() + this.a;
        Handler handler = this.b;
        handler.sendMessage(handler.obtainMessage(1));
        return this;
    }

    public final void d() {
        if (this.j || this.i) {
            return;
        }
        b();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.h = elapsedRealtime;
        this.a = this.f - elapsedRealtime;
    }

    public final boolean e() {
        return !this.j && this.i;
    }
}
