package xsna;

import androidx.core.app.NotificationCompat;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import okhttp3.internal.http.RealInterceptorChain;

/* compiled from: RealCall.kt */
/* loaded from: classes11.dex */
public final class f8f0 implements okhttp3.d {
    public final okhttp3.o b;
    public final okhttp3.p c;
    public final boolean d;
    public final l8f0 e;
    public final okhttp3.g f;
    public final c g;
    public final AtomicBoolean h;
    public Object i;
    public x1q j;
    public g8f0 k;
    public boolean l;
    public u1q m;
    public boolean n;
    public boolean o;
    public boolean p;
    public volatile boolean q;
    public volatile u1q r;
    public volatile g8f0 s;

    /* compiled from: RealCall.kt */
    /* loaded from: classes8.dex */
    public final class a implements Runnable {
        public final lb9 b;
        public volatile AtomicInteger c = new AtomicInteger(0);

        public a(lb9 lb9Var) {
            this.b = lb9Var;
        }

        public final void a(ExecutorService executorService) {
            f8f0 f8f0Var = f8f0.this;
            okhttp3.o oVar = f8f0Var.b;
            byte[] bArr = x2r0.a;
            try {
                try {
                    executorService.execute(this);
                } catch (RejectedExecutionException e) {
                    InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                    interruptedIOException.initCause(e);
                    f8f0Var.g(interruptedIOException);
                    this.b.onFailure(f8f0Var, interruptedIOException);
                    oVar.b.c(this);
                }
            } catch (Throwable th) {
                oVar.b.c(this);
                throw th;
            }
        }

        public final f8f0 b() {
            return f8f0.this;
        }

        public final AtomicInteger c() {
            return this.c;
        }

        public final String d() {
            return f8f0.this.c.a.d;
        }

        public final void e(a aVar) {
            this.c = aVar.c;
        }

        @Override // java.lang.Runnable
        public final void run() {
            qcn qcnVar;
            String concat = "OkHttp ".concat(f8f0.this.c.a.h());
            f8f0 f8f0Var = f8f0.this;
            Thread currentThread = Thread.currentThread();
            String name = currentThread.getName();
            currentThread.setName(concat);
            try {
                f8f0Var.g.i();
                boolean z = false;
                try {
                    try {
                    } catch (Throwable th) {
                        f8f0Var.b.b.c(this);
                        throw th;
                    }
                } catch (IOException e) {
                    e = e;
                } catch (Throwable th2) {
                    th = th2;
                }
                try {
                    this.b.onResponse(f8f0Var, f8f0Var.e());
                    qcnVar = f8f0Var.b.b;
                } catch (IOException e2) {
                    e = e2;
                    z = true;
                    if (z) {
                        fta0 fta0Var = fta0.a;
                        fta0 fta0Var2 = fta0.a;
                        String str = "Callback failure for " + f8f0.a(f8f0Var);
                        fta0Var2.getClass();
                        fta0.i(4, str, e);
                    } else {
                        this.b.onFailure(f8f0Var, e);
                    }
                    qcnVar = f8f0Var.b.b;
                    qcnVar.c(this);
                } catch (Throwable th3) {
                    th = th3;
                    z = true;
                    f8f0Var.cancel();
                    if (!z) {
                        IOException iOException = new IOException("canceled due to " + th);
                        mnh0.d(iOException, th);
                        this.b.onFailure(f8f0Var, iOException);
                    }
                    throw th;
                }
                qcnVar.c(this);
            } finally {
                currentThread.setName(name);
            }
        }
    }

    /* compiled from: RealCall.kt */
    /* loaded from: classes8.dex */
    public static final class b extends WeakReference<f8f0> {
        public final Object a;

        public b(f8f0 f8f0Var, Object obj) {
            super(f8f0Var);
            this.a = obj;
        }

        public final Object a() {
            return this.a;
        }
    }

    /* compiled from: RealCall.kt */
    public static final class c extends oz3 {
        public c() {
        }

        @Override // xsna.oz3
        public final void k() {
            f8f0.this.cancel();
        }
    }

    public f8f0(okhttp3.o oVar, okhttp3.p pVar, boolean z) {
        this.b = oVar;
        this.c = pVar;
        this.d = z;
        this.e = oVar.c.a;
        this.f = oVar.f.a(this);
        c cVar = new c();
        cVar.g(0, TimeUnit.MILLISECONDS);
        this.g = cVar;
        this.h = new AtomicBoolean();
        this.p = true;
    }

    public static final String a(f8f0 f8f0Var) {
        StringBuilder sb = new StringBuilder();
        sb.append(f8f0Var.q ? "canceled " : "");
        sb.append(f8f0Var.d ? "web socket" : NotificationCompat.CATEGORY_CALL);
        sb.append(" to ");
        sb.append(f8f0Var.c.a.h());
        return sb.toString();
    }

    public final void b(g8f0 g8f0Var) {
        byte[] bArr = x2r0.a;
        if (this.k != null) {
            throw new IllegalStateException("Check failed.");
        }
        this.k = g8f0Var;
        g8f0Var.p.add(new b(this, this.i));
    }

    public final <E extends IOException> E c(E e) {
        E e2;
        Socket i;
        byte[] bArr = x2r0.a;
        g8f0 g8f0Var = this.k;
        if (g8f0Var != null) {
            synchronized (g8f0Var) {
                i = i();
            }
            if (this.k == null) {
                if (i != null) {
                    x2r0.d(i);
                }
                this.f.i(this, g8f0Var);
            } else if (i != null) {
                throw new IllegalStateException("Check failed.");
            }
        }
        if (!this.l && this.g.j()) {
            e2 = new InterruptedIOException("timeout");
            if (e != null) {
                e2.initCause(e);
            }
        } else {
            e2 = e;
        }
        if (e != null) {
            this.f.b(this, e2);
            return e2;
        }
        this.f.a(this);
        return e2;
    }

    @Override // okhttp3.d
    public final void cancel() {
        Socket socket;
        if (this.q) {
            return;
        }
        this.q = true;
        u1q u1qVar = this.r;
        if (u1qVar != null) {
            u1qVar.b();
        }
        g8f0 g8f0Var = this.s;
        if (g8f0Var != null && (socket = g8f0Var.c) != null) {
            x2r0.d(socket);
        }
        this.f.getClass();
    }

    public final Object clone() {
        return new f8f0(this.b, this.c, this.d);
    }

    public final void d(boolean z) {
        u1q u1qVar;
        synchronized (this) {
            if (!this.p) {
                throw new IllegalStateException("released");
            }
            s3q0 s3q0Var = s3q0.a;
        }
        if (z && (u1qVar = this.r) != null) {
            u1qVar.d();
        }
        this.m = null;
    }

    public final okhttp3.u e() throws IOException {
        ArrayList arrayList = new ArrayList();
        g5g.y(this.b.d, arrayList);
        arrayList.add(new cfg0(this.b));
        arrayList.add(new ic8(this.b.k));
        arrayList.add(new uw8(this.b.l));
        arrayList.add(f3j.a);
        if (!this.d) {
            g5g.y(this.b.e, arrayList);
        }
        arrayList.add(new a99(this.d));
        okhttp3.p pVar = this.c;
        okhttp3.o oVar = this.b;
        boolean z = false;
        try {
            try {
                okhttp3.u a2 = new RealInterceptorChain(this, arrayList, 0, null, pVar, oVar.x, oVar.y, oVar.z).a(pVar);
                if (this.q) {
                    x2r0.c(a2);
                    throw new IOException("Canceled");
                }
                g(null);
                return a2;
            } catch (IOException e) {
                z = true;
                throw g(e);
            }
        } catch (Throwable th) {
            if (!z) {
                g(null);
            }
            throw th;
        }
    }

    @Override // okhttp3.d
    public final okhttp3.u execute() {
        if (!this.h.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        this.g.i();
        fta0 fta0Var = fta0.a;
        this.i = fta0.a.g();
        this.f.c(this);
        try {
            qcn qcnVar = this.b.b;
            synchronized (qcnVar) {
                qcnVar.g.add(this);
            }
            return e();
        } finally {
            qcn qcnVar2 = this.b.b;
            qcnVar2.b(qcnVar2.g, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001d A[Catch: all -> 0x0013, TryCatch #1 {all -> 0x0013, blocks: (B:49:0x000e, B:10:0x001d, B:12:0x0021, B:13:0x0023, B:15:0x0027, B:19:0x0030, B:21:0x0034, B:25:0x003d, B:7:0x0017), top: B:48:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0021 A[Catch: all -> 0x0013, TryCatch #1 {all -> 0x0013, blocks: (B:49:0x000e, B:10:0x001d, B:12:0x0021, B:13:0x0023, B:15:0x0027, B:19:0x0030, B:21:0x0034, B:25:0x003d, B:7:0x0017), top: B:48:0x000e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <E extends IOException> E f(u1q u1qVar, boolean z, boolean z2, E e) {
        boolean z3;
        boolean z4;
        boolean z5;
        if (u1qVar.equals(this.r)) {
            synchronized (this) {
                z3 = false;
                if (z) {
                    try {
                        if (!this.n) {
                        }
                        if (z) {
                            this.n = false;
                        }
                        if (z2) {
                            this.o = false;
                        }
                        z5 = this.n;
                        boolean z6 = z5 && !this.o;
                        if (!z5 && !this.o && !this.p) {
                            z3 = true;
                        }
                        z4 = z3;
                        z3 = z6;
                        s3q0 s3q0Var = s3q0.a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (!z2 || !this.o) {
                    z4 = false;
                    s3q0 s3q0Var2 = s3q0.a;
                }
                if (z) {
                }
                if (z2) {
                }
                z5 = this.n;
                if (z5) {
                }
                if (!z5) {
                    z3 = true;
                }
                z4 = z3;
                z3 = z6;
                s3q0 s3q0Var22 = s3q0.a;
            }
            if (z3) {
                this.r = null;
                g8f0 g8f0Var = this.k;
                if (g8f0Var != null) {
                    synchronized (g8f0Var) {
                        g8f0Var.m++;
                    }
                }
            }
            if (z4) {
                return (E) c(e);
            }
        }
        return e;
    }

    @Override // okhttp3.d
    public final void f9(lb9 lb9Var) {
        a aVar;
        if (!this.h.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        fta0 fta0Var = fta0.a;
        this.i = fta0.a.g();
        this.f.c(this);
        qcn qcnVar = this.b.b;
        a aVar2 = new a(lb9Var);
        synchronized (qcnVar) {
            try {
                qcnVar.e.add(aVar2);
                if (!aVar2.b().d) {
                    String d = aVar2.d();
                    Iterator<a> it = qcnVar.f.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            Iterator<a> it2 = qcnVar.e.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    aVar = null;
                                    break;
                                } else {
                                    aVar = it2.next();
                                    if (epx.f(aVar.d(), d)) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            aVar = it.next();
                            if (epx.f(aVar.d(), d)) {
                                break;
                            }
                        }
                    }
                    if (aVar != null) {
                        aVar2.e(aVar);
                    }
                }
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        qcnVar.d();
    }

    public final IOException g(IOException iOException) {
        boolean z;
        synchronized (this) {
            try {
                z = false;
                if (this.p) {
                    this.p = false;
                    if (!this.n && !this.o) {
                        z = true;
                    }
                }
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z ? c(iOException) : iOException;
    }

    @Override // okhttp3.d
    public final boolean g3() {
        return this.q;
    }

    public final Socket i() {
        g8f0 g8f0Var = this.k;
        byte[] bArr = x2r0.a;
        ArrayList arrayList = g8f0Var.p;
        Iterator it = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (epx.f(((Reference) it.next()).get(), this)) {
                break;
            }
            i++;
        }
        if (i == -1) {
            throw new IllegalStateException("Check failed.");
        }
        arrayList.remove(i);
        this.k = null;
        if (!arrayList.isEmpty()) {
            return null;
        }
        g8f0Var.q = System.nanoTime();
        l8f0 l8f0Var = this.e;
        ConcurrentLinkedQueue<g8f0> concurrentLinkedQueue = l8f0Var.d;
        x6o0 x6o0Var = l8f0Var.b;
        byte[] bArr2 = x2r0.a;
        if (!g8f0Var.j) {
            x6o0Var.c(l8f0Var.c, 0L);
            return null;
        }
        g8f0Var.j = true;
        concurrentLinkedQueue.remove(g8f0Var);
        if (concurrentLinkedQueue.isEmpty()) {
            x6o0Var.a();
        }
        return g8f0Var.d;
    }

    public final void j() {
        if (this.l) {
            throw new IllegalStateException("Check failed.");
        }
        this.l = true;
        this.g.j();
    }

    @Override // okhttp3.d
    public final okhttp3.p request() {
        return this.c;
    }
}
