package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.base.zau;
import defpackage.cvw;
import defpackage.fg1;
import defpackage.gz81;
import defpackage.lta0;
import defpackage.oyr;
import defpackage.qx81;
import defpackage.uyj0;
import defpackage.xyj0;
import defpackage.yst;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes11.dex */
public abstract class BasePendingResult<R extends uyj0> extends lta0 {
    public static final fg1 G = new fg1(12);
    public uyj0 A;
    public Status B;
    public volatile boolean C;
    public boolean D;
    public boolean E;
    public final CallbackHandler b;
    public final WeakReference c;
    public xyj0 y;
    public final Object a = new Object();
    public final CountDownLatch w = new CountDownLatch(1);
    public final ArrayList x = new ArrayList();
    public final AtomicReference z = new AtomicReference();
    public boolean F = false;

    public BasePendingResult(yst ystVar) {
        this.b = new CallbackHandler(ystVar != null ? ystVar.i() : Looper.getMainLooper());
        this.c = new WeakReference(ystVar);
    }

    @Override // defpackage.lta0
    public final uyj0 b() {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        cvw.n("Result has already been consumed.", !this.C);
        try {
            if (!this.w.await(0L, timeUnit)) {
                g(Status.RESULT_TIMEOUT);
            }
        } catch (InterruptedException unused) {
            g(Status.RESULT_INTERRUPTED);
        }
        cvw.n("Result is not ready.", h());
        return j();
    }

    @Override // defpackage.lta0
    public final void c(xyj0 xyj0Var) {
        boolean z;
        synchronized (this.a) {
            try {
                if (xyj0Var == null) {
                    this.y = null;
                    return;
                }
                cvw.n("Result has already been consumed.", !this.C);
                synchronized (this.a) {
                    z = this.D;
                }
                if (z) {
                    return;
                }
                if (h()) {
                    this.b.zaa(xyj0Var, j());
                } else {
                    this.y = xyj0Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d(qx81 qx81Var) {
        synchronized (this.a) {
            try {
                if (h()) {
                    qx81Var.a(this.B);
                } else {
                    this.x.add(qx81Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e() {
        synchronized (this.a) {
            try {
                if (!this.D && !this.C) {
                    this.D = true;
                    k(f(Status.RESULT_CANCELED));
                }
            } finally {
            }
        }
    }

    public abstract uyj0 f(Status status);

    public final void g(Status status) {
        synchronized (this.a) {
            try {
                if (!h()) {
                    a(f(status));
                    this.E = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean h() {
        return this.w.getCount() == 0;
    }

    @Override // defpackage.o25
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final void a(uyj0 uyj0Var) {
        synchronized (this.a) {
            try {
                if (this.E || this.D) {
                    return;
                }
                h();
                cvw.n("Results have already been set", !h());
                cvw.n("Result has already been consumed", !this.C);
                k(uyj0Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final uyj0 j() {
        uyj0 uyj0Var;
        synchronized (this.a) {
            cvw.n("Result has already been consumed.", !this.C);
            cvw.n("Result is not ready.", h());
            uyj0Var = this.A;
            this.A = null;
            this.y = null;
            this.C = true;
        }
        gz81 gz81Var = (gz81) this.z.getAndSet(null);
        if (gz81Var != null) {
            gz81Var.a.a.remove(this);
        }
        cvw.l(uyj0Var);
        return uyj0Var;
    }

    public final void k(uyj0 uyj0Var) {
        this.A = uyj0Var;
        this.B = uyj0Var.getStatus();
        this.w.countDown();
        if (this.D) {
            this.y = null;
        } else {
            xyj0 xyj0Var = this.y;
            if (xyj0Var != null) {
                CallbackHandler callbackHandler = this.b;
                callbackHandler.removeMessages(2);
                callbackHandler.zaa(xyj0Var, j());
            }
        }
        ArrayList arrayList = this.x;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((qx81) arrayList.get(i)).a(this.B);
        }
        arrayList.clear();
    }

    public final void l() {
        boolean z = true;
        if (!this.F && !((Boolean) G.get()).booleanValue()) {
            z = false;
        }
        this.F = z;
    }

    public static class CallbackHandler<R extends uyj0> extends zau {
        public CallbackHandler() {
            super(Looper.getMainLooper());
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i = message.what;
            if (i != 1) {
                if (i != 2) {
                    Log.wtf("BasePendingResult", oyr.i(i, "Don't know how to handle message: "), new Exception());
                    return;
                } else {
                    ((BasePendingResult) message.obj).g(Status.RESULT_TIMEOUT);
                    return;
                }
            }
            Pair pair = (Pair) message.obj;
            try {
                ((xyj0) pair.first).a((uyj0) pair.second);
            } catch (RuntimeException e) {
                fg1 fg1Var = BasePendingResult.G;
                throw e;
            }
        }

        public final void zaa(xyj0 xyj0Var, uyj0 uyj0Var) {
            fg1 fg1Var = BasePendingResult.G;
            cvw.l(xyj0Var);
            sendMessage(obtainMessage(1, new Pair(xyj0Var, uyj0Var)));
        }

        public CallbackHandler(Looper looper) {
            super(looper);
        }
    }
}
