package xsna;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.util.ArrayList;
import kotlin.jvm.internal.Lambda;

/* compiled from: AndroidUiDispatcher.android.kt */
/* loaded from: classes11.dex */
public final class od2 extends ovj {
    public static final bpn0 m = new bpn0(a.i);
    public static final b n = new b();
    public final Choreographer c;
    public final Handler d;
    public boolean i;
    public boolean j;
    public final pd2 l;
    public final Object e = new Object();
    public final sk3<Runnable> f = new sk3<>();
    public ArrayList g = new ArrayList();
    public ArrayList h = new ArrayList();
    public final c k = new c();

    /* compiled from: AndroidUiDispatcher.android.kt */
    public static final class a extends Lambda implements gzs<kotlin.coroutines.d> {
        public static final a i = new a(0);

        @Override // xsna.gzs
        public final kotlin.coroutines.d invoke() {
            Choreographer choreographer;
            if (Looper.myLooper() == Looper.getMainLooper()) {
                choreographer = Choreographer.getInstance();
            } else {
                bdn bdnVar = bdn.a;
                choreographer = (Choreographer) myc0.i(ie00.a, new nd2(2, null));
            }
            od2 od2Var = new od2(choreographer, Handler.createAsync(Looper.getMainLooper()));
            return od2Var.plus(od2Var.l);
        }
    }

    /* compiled from: AndroidUiDispatcher.android.kt */
    public static final class b extends ThreadLocal<kotlin.coroutines.d> {
        @Override // java.lang.ThreadLocal
        public final kotlin.coroutines.d initialValue() {
            Choreographer choreographer = Choreographer.getInstance();
            Looper myLooper = Looper.myLooper();
            if (myLooper == null) {
                throw new IllegalStateException("no Looper on this thread");
            }
            od2 od2Var = new od2(choreographer, Handler.createAsync(myLooper));
            return od2Var.plus(od2Var.l);
        }
    }

    /* compiled from: AndroidUiDispatcher.android.kt */
    public static final class c implements Choreographer.FrameCallback, Runnable {
        public c() {
        }

        @Override // android.view.Choreographer.FrameCallback
        public final void doFrame(long j) {
            od2.this.d.removeCallbacks(this);
            od2.U(od2.this);
            od2 od2Var = od2.this;
            synchronized (od2Var.e) {
                if (od2Var.j) {
                    od2Var.j = false;
                    ArrayList arrayList = od2Var.g;
                    od2Var.g = od2Var.h;
                    od2Var.h = arrayList;
                    int size = arrayList.size();
                    for (int i = 0; i < size; i++) {
                        ((Choreographer.FrameCallback) arrayList.get(i)).doFrame(j);
                    }
                    arrayList.clear();
                }
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            od2.U(od2.this);
            od2 od2Var = od2.this;
            synchronized (od2Var.e) {
                try {
                    if (od2Var.g.isEmpty()) {
                        od2Var.c.removeFrameCallback(this);
                        od2Var.j = false;
                    }
                    s3q0 s3q0Var = s3q0.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public od2(Choreographer choreographer, Handler handler) {
        this.c = choreographer;
        this.d = handler;
        this.l = new pd2(choreographer, this);
    }

    public static final void U(od2 od2Var) {
        Runnable l;
        boolean z;
        do {
            synchronized (od2Var.e) {
                l = od2Var.f.l();
            }
            while (l != null) {
                l.run();
                synchronized (od2Var.e) {
                    l = od2Var.f.l();
                }
            }
            synchronized (od2Var.e) {
                if (od2Var.f.isEmpty()) {
                    z = false;
                    od2Var.i = false;
                } else {
                    z = true;
                }
            }
        } while (z);
    }

    @Override // xsna.ovj
    public final void P(kotlin.coroutines.d dVar, Runnable runnable) {
        synchronized (this.e) {
            try {
                this.f.addLast(runnable);
                if (!this.i) {
                    this.i = true;
                    this.d.post(this.k);
                    if (!this.j) {
                        this.j = true;
                        this.c.postFrameCallback(this.k);
                    }
                }
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
