package xsna;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.media3.datasource.c;
import androidx.media3.exoplayer.source.i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import xsna.ink;

/* compiled from: PreloadManager.kt */
/* loaded from: classes8.dex */
public final class j1d0 {
    public final Context a;
    public final c.a b;
    public final Comparator<sht0> c;
    public final Handler d;
    public final Thread e;
    public a f;
    public final e1d0 g;
    public final ArrayList h;
    public final PriorityQueue<d1d0> i;
    public q1d0 j;
    public final Object k;
    public final bpn0 l;
    public final p06 m;
    public final z9l n;
    public final k1d0 o;
    public final bpn0 p;

    /* compiled from: PreloadManager.kt */
    public interface a {
        void a(sht0 sht0Var);
    }

    /* compiled from: PreloadManager.kt */
    public static class b {
        public final long a;

        public b(long j) {
            this.a = j;
        }
    }

    public j1d0() {
        throw null;
    }

    public j1d0(Context context, c.a aVar, w8m0 w8m0Var, int i) {
        w8m0Var = (i & 4) != 0 ? new w8m0(0) : w8m0Var;
        Handler handler = new Handler(Looper.getMainLooper());
        Thread currentThread = Thread.currentThread();
        this.a = context;
        this.b = aVar;
        this.c = w8m0Var;
        this.d = handler;
        this.e = currentThread;
        this.g = new e1d0();
        this.h = new ArrayList();
        this.i = new PriorityQueue<>(new e7i(new fne(this, 7), 1));
        this.k = new Object();
        this.l = new bpn0(new ap80(4));
        this.m = (p06) fz5.d.j(context);
        this.n = new z9l(65536);
        this.o = new k1d0(this);
        this.p = new bpn0(new cty(this, 29));
    }

    public static final b a(j1d0 j1d0Var, q1d0 q1d0Var) {
        b bVar;
        e1d0 e1d0Var = j1d0Var.g;
        synchronized (e1d0Var) {
            sht0 sht0Var = e1d0Var.b.get(q1d0Var);
            if (sht0Var != null) {
                synchronized (e1d0Var) {
                    d1d0 d1d0Var = e1d0Var.a.get(sht0Var);
                    bVar = d1d0Var != null ? d1d0Var.b : null;
                }
            }
        }
        return bVar;
    }

    public static final void b(j1d0 j1d0Var, q1d0 q1d0Var) {
        if (q1d0Var.equals(j1d0Var.j)) {
            j1d0Var.j = null;
            j1d0Var.e();
        }
    }

    public final void c() {
        Thread currentThread = Thread.currentThread();
        int i = Build.VERSION.SDK_INT;
        long threadId = i >= 36 ? currentThread.threadId() : currentThread.getId();
        Thread thread = this.e;
        if (threadId == (i >= 36 ? thread.threadId() : thread.getId())) {
            return;
        }
        int i2 = wn80.a;
        throw new RuntimeException(y57.a("PreloadManager is single thread. currentThreadName: ", Thread.currentThread().getName(), ", creationThreadName: ", thread.getName()));
    }

    public final q1d0 d(d1d0 d1d0Var) {
        su5 su5Var;
        fz5 fz5Var = fz5.d;
        Context context = this.a;
        pae0 pae0Var = new pae0(fz5Var.t(context));
        ink.a aVar = new ink.a(new hc6(this.b, f7q.c(context), pae0Var), null, null);
        int i = wn80.a;
        sht0 sht0Var = d1d0Var.a;
        i.a b2 = new sy10(context, sht0Var, aVar).b(sht0Var);
        androidx.media3.exoplayer.k[] kVarArr = (androidx.media3.exoplayer.k[]) this.p.getValue();
        Looper looper = (Looper) xk80.v0.getValue();
        hk0 a2 = hk0.a(hk0.e, null, null, false, 11);
        if (wn80.i) {
            su5Var = new su5(wn80.j, wn80.k, wn80.l);
        } else {
            su5Var = null;
        }
        return new q1d0(this.a, b2.d(kr10.b(sht0Var.b)), this.o, this.m, (androidx.media3.exoplayer.k[]) Arrays.copyOf(kVarArr, kVarArr.length), this.n, looper, a2, su5Var, pae0Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002b, code lost:
    
        r2 = d(r1);
        r7.j = r2;
        r3 = r7.g;
        r1 = r1.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0035, code lost:
    
        monitor-enter(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0036, code lost:
    
        r3.b();
        r4 = r3.a.get(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0041, code lost:
    
        if (r4 == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0043, code lost:
    
        r4.c = r2;
        r3.b.put(r2, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004d, code lost:
    
        r3.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0050, code lost:
    
        monitor-exit(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
    
        r2.s.post(new xsna.dwq(r2, 0, 1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004b, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0060, code lost:
    
        throw r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e() {
        b bVar;
        synchronized (this.k) {
            while (true) {
                if (this.i.isEmpty()) {
                    break;
                }
                d1d0 poll = this.i.poll();
                sht0 sht0Var = poll.a;
                e1d0 e1d0Var = this.g;
                synchronized (e1d0Var) {
                    d1d0 d1d0Var = e1d0Var.a.get(sht0Var);
                    bVar = d1d0Var != null ? d1d0Var.b : null;
                }
                if (bVar != null) {
                    break;
                }
            }
            s3q0 s3q0Var = s3q0.a;
        }
    }
}
