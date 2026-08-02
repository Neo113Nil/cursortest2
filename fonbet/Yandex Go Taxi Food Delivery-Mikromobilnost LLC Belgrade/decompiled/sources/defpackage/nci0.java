package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import okhttp3.OkHttpClient;
import okhttp3.internal.connection.RealConnection;

/* loaded from: classes9.dex */
public final class nci0 implements yf7, Cloneable {
    public Object A;
    public qjo B;
    public RealConnection C;
    public boolean D;
    public q66 E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public volatile boolean K;
    public volatile q66 L;
    public final CopyOnWriteArrayList M;
    public final OkHttpClient a;
    public final d5j0 b;
    public final boolean c;
    public final oci0 w;
    public final bgo x;
    public final mci0 y;
    public final AtomicBoolean z;

    public nci0(OkHttpClient okHttpClient, d5j0 d5j0Var, boolean z) {
        this.a = okHttpClient;
        this.b = d5j0Var;
        this.c = z;
        this.w = okHttpClient.Z.a;
        this.x = okHttpClient.w.create(this);
        mci0 mci0Var = new mci0(this);
        mci0Var.g(okHttpClient.P, TimeUnit.MILLISECONDS);
        this.y = mci0Var;
        this.z = new AtomicBoolean();
        this.J = true;
        this.M = new CopyOnWriteArrayList();
        new AtomicReference(d5j0Var.e);
    }

    public static final String a(nci0 nci0Var) {
        StringBuilder sb = new StringBuilder();
        sb.append(nci0Var.K ? "canceled " : "");
        sb.append(nci0Var.c ? "web socket" : "call");
        sb.append(" to ");
        sb.append(nci0Var.b.a.k());
        return sb.toString();
    }

    @Override // defpackage.yf7
    public final void I(al7 al7Var) {
        if (!this.z.compareAndSet(false, true)) {
            ny61.r("Already Executed");
            return;
        }
        d72 d72Var = dvc0.a;
        this.A = dvc0.a.c();
        this.x.callStart(this);
        ryj ryjVar = this.a.a;
        kci0 kci0Var = new kci0(this, al7Var);
        ryjVar.getClass();
        ryj.c(ryjVar, kci0Var, null, null, 6);
    }

    public final void b(RealConnection realConnection) {
        TimeZone timeZone = bg61.a;
        if (this.C != null) {
            ny61.r("Check failed.");
        } else {
            this.C = realConnection;
            realConnection.q.add(new lci0(this, this.A));
        }
    }

    public final IOException c(IOException iOException) {
        IOException iOException2;
        Socket h;
        TimeZone timeZone = bg61.a;
        RealConnection realConnection = this.C;
        if (realConnection != null) {
            synchronized (realConnection) {
                h = h();
            }
            if (this.C == null) {
                if (h != null) {
                    bg61.d(h);
                }
                this.x.connectionReleased(this, realConnection);
                realConnection.i.getClass();
                if (h != null) {
                    realConnection.i.getClass();
                }
            } else if (h != null) {
                ny61.r("Check failed.");
                return null;
            }
        }
        if (!this.D && this.y.j()) {
            iOException2 = new InterruptedIOException("timeout");
            if (iOException != null) {
                iOException2.initCause(iOException);
            }
        } else {
            iOException2 = iOException;
        }
        bgo bgoVar = this.x;
        if (iOException != null) {
            bgoVar.callFailed(this, iOException2);
            return iOException2;
        }
        bgoVar.callEnd(this);
        return iOException2;
    }

    @Override // defpackage.yf7
    public final void cancel() {
        if (this.K) {
            return;
        }
        this.K = true;
        q66 q66Var = this.L;
        if (q66Var != null) {
            ((pjo) q66Var.x).cancel();
        }
        Iterator it = this.M.iterator();
        while (it.hasNext()) {
            ((f7l0) it.next()).cancel();
        }
        this.x.canceled(this);
    }

    @Override // defpackage.yf7
    public final yf7 clone() {
        return new nci0(this.a, this.b, this.c);
    }

    public final void d(boolean z) {
        q66 q66Var;
        synchronized (this) {
            if (!this.J) {
                throw new IllegalStateException("released");
            }
        }
        if (z && (q66Var = this.L) != null) {
            ((pjo) q66Var.x).cancel();
            ((nci0) q66Var.b).f(q66Var, true, true, true, true, null);
        }
        this.E = null;
    }

    public final kvj0 e() {
        ArrayList arrayList = new ArrayList();
        ycc.r(this.a.b, arrayList);
        arrayList.add(new uc(16, this.a));
        arrayList.add(new uc(6, this.a.C));
        arrayList.add(new uc(7, this.a.D));
        arrayList.add(dk7.c);
        if (!this.c) {
            ycc.r(this.a.c, arrayList);
        }
        arrayList.add(dk7.b);
        d5j0 d5j0Var = this.b;
        OkHttpClient okHttpClient = this.a;
        zci0 zci0Var = new zci0(this, arrayList, 0, null, d5j0Var, okHttpClient.Q, okHttpClient.R, okHttpClient.S);
        boolean z = false;
        try {
            try {
                kvj0 b = zci0Var.b(d5j0Var);
                if (this.K) {
                    yf61.b(b);
                    throw new IOException("Canceled");
                }
                g(null);
                return b;
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

    @Override // defpackage.yf7
    public final kvj0 execute() {
        if (!this.z.compareAndSet(false, true)) {
            ny61.r("Already Executed");
            return null;
        }
        this.y.i();
        d72 d72Var = dvc0.a;
        this.A = dvc0.a.c();
        this.x.callStart(this);
        try {
            ryj ryjVar = this.a.a;
            synchronized (ryjVar) {
                ryjVar.f.add(this);
            }
            return e();
        } finally {
            ryj ryjVar2 = this.a.a;
            ryjVar2.getClass();
            ryj.c(ryjVar2, null, this, null, 5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a A[Catch: all -> 0x0014, TryCatch #0 {all -> 0x0014, blocks: (B:59:0x000f, B:10:0x002a, B:12:0x002e, B:14:0x0032, B:16:0x0036, B:17:0x0038, B:19:0x003c, B:21:0x0040, B:23:0x0044, B:27:0x004d, B:7:0x0018, B:52:0x001e, B:55:0x0024), top: B:58:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002e A[Catch: all -> 0x0014, TryCatch #0 {all -> 0x0014, blocks: (B:59:0x000f, B:10:0x002a, B:12:0x002e, B:14:0x0032, B:16:0x0036, B:17:0x0038, B:19:0x003c, B:21:0x0040, B:23:0x0044, B:27:0x004d, B:7:0x0018, B:52:0x001e, B:55:0x0024), top: B:58:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032 A[Catch: all -> 0x0014, TryCatch #0 {all -> 0x0014, blocks: (B:59:0x000f, B:10:0x002a, B:12:0x002e, B:14:0x0032, B:16:0x0036, B:17:0x0038, B:19:0x003c, B:21:0x0040, B:23:0x0044, B:27:0x004d, B:7:0x0018, B:52:0x001e, B:55:0x0024), top: B:58:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0036 A[Catch: all -> 0x0014, TryCatch #0 {all -> 0x0014, blocks: (B:59:0x000f, B:10:0x002a, B:12:0x002e, B:14:0x0032, B:16:0x0036, B:17:0x0038, B:19:0x003c, B:21:0x0040, B:23:0x0044, B:27:0x004d, B:7:0x0018, B:52:0x001e, B:55:0x0024), top: B:58:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004d A[Catch: all -> 0x0014, TRY_LEAVE, TryCatch #0 {all -> 0x0014, blocks: (B:59:0x000f, B:10:0x002a, B:12:0x002e, B:14:0x0032, B:16:0x0036, B:17:0x0038, B:19:0x003c, B:21:0x0040, B:23:0x0044, B:27:0x004d, B:7:0x0018, B:52:0x001e, B:55:0x0024), top: B:58:0x000f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final IOException f(q66 q66Var, boolean z, boolean z2, boolean z3, boolean z4, IOException iOException) {
        boolean z5;
        boolean z6;
        boolean z7;
        if (q66Var.equals(this.L)) {
            synchronized (this) {
                z5 = false;
                if (z) {
                    try {
                        if (!this.F) {
                        }
                        if (z) {
                            this.F = false;
                        }
                        if (z2) {
                            this.G = false;
                        }
                        if (z4) {
                            this.H = false;
                        }
                        if (z3) {
                            this.I = false;
                        }
                        z7 = (!this.F || this.G || this.H || this.I) ? false : true;
                        if (z7) {
                            if (!this.J) {
                                z5 = true;
                            }
                        }
                        boolean z8 = z5;
                        z5 = z7;
                        z6 = z8;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if ((!z2 || !this.G) && ((!z4 || !this.H) && (!z3 || !this.I))) {
                    z6 = false;
                }
                if (z) {
                }
                if (z2) {
                }
                if (z4) {
                }
                if (z3) {
                }
                if (!this.F) {
                }
                if (z7) {
                }
                boolean z82 = z5;
                z5 = z7;
                z6 = z82;
            }
            if (z5) {
                this.L = null;
                RealConnection realConnection = this.C;
                if (realConnection != null) {
                    synchronized (realConnection) {
                        realConnection.n++;
                    }
                }
            }
            if (z6) {
                return c(iOException);
            }
        }
        return iOException;
    }

    public final IOException g(IOException iOException) {
        boolean z;
        synchronized (this) {
            z = false;
            if (this.J) {
                this.J = false;
                if (!this.F && !this.G && !this.H) {
                    if (!this.I) {
                        z = true;
                    }
                }
            }
        }
        return z ? c(iOException) : iOException;
    }

    public final Socket h() {
        RealConnection realConnection = this.C;
        TimeZone timeZone = bg61.a;
        ArrayList arrayList = realConnection.q;
        Iterator it = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (jl40.l(((Reference) it.next()).get(), this)) {
                break;
            }
            i++;
        }
        if (i == -1) {
            ny61.r("Check failed.");
            return null;
        }
        arrayList.remove(i);
        this.C = null;
        if (!arrayList.isEmpty()) {
            return null;
        }
        realConnection.r = System.nanoTime();
        oci0 oci0Var = this.w;
        ConcurrentLinkedQueue concurrentLinkedQueue = oci0Var.f;
        htx0 htx0Var = oci0Var.d;
        TimeZone timeZone2 = bg61.a;
        if (!realConnection.k) {
            htx0Var.d(oci0Var.e, 0L);
            return null;
        }
        realConnection.k = true;
        concurrentLinkedQueue.remove(realConnection);
        if (concurrentLinkedQueue.isEmpty()) {
            htx0Var.a();
        }
        return realConnection.e;
    }

    @Override // defpackage.yf7
    public final d5j0 k() {
        return this.b;
    }

    @Override // defpackage.yf7
    public final boolean n() {
        return this.K;
    }

    @Override // defpackage.yf7
    public final ydz0 timeout() {
        return this.y;
    }
}
