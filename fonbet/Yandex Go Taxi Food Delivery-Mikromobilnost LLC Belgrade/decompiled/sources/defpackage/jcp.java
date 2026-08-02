package defpackage;

import android.content.SharedPreferences;
import com.google.android.gms.internal.measurement.e0;
import com.google.android.gms.measurement.internal.g;
import com.google.android.gms.measurement.internal.n;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.connection.RealConnection;

/* loaded from: classes9.dex */
public final class jcp implements qjo {
    public long a;
    public Object b;
    public Object c;
    public Serializable w;
    public final Object x;

    public /* synthetic */ jcp(o5a1 o5a1Var, long j) {
        this.x = o5a1Var;
        cvw.i("health_monitor");
        cvw.e(j > 0);
        this.b = "health_monitor:start";
        this.c = "health_monitor:count";
        this.w = "health_monitor:value";
        this.a = j;
    }

    public void a() {
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.w;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            f7l0 f7l0Var = (f7l0) it.next();
            f7l0Var.cancel();
            f7l0 f = f7l0Var.f();
            if (f != null) {
                ((gdi0) this.b).p.addLast(f);
            }
        }
        copyOnWriteArrayList.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0055 A[Catch: all -> 0x001b, TryCatch #0 {all -> 0x001b, blocks: (B:3:0x0002, B:5:0x000c, B:11:0x001e, B:13:0x0028, B:20:0x0055, B:64:0x0063, B:67:0x0070, B:25:0x0079, B:27:0x007f, B:31:0x0088, B:33:0x0093, B:34:0x0099, B:36:0x009d, B:41:0x00a4, B:44:0x00ae, B:46:0x00b2, B:49:0x00b8, B:50:0x00bc, B:52:0x00c0, B:53:0x00c1, B:56:0x00c5, B:69:0x0049, B:71:0x00d0, B:72:0x00d7), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0079 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0088 A[Catch: all -> 0x001b, TryCatch #0 {all -> 0x001b, blocks: (B:3:0x0002, B:5:0x000c, B:11:0x001e, B:13:0x0028, B:20:0x0055, B:64:0x0063, B:67:0x0070, B:25:0x0079, B:27:0x007f, B:31:0x0088, B:33:0x0093, B:34:0x0099, B:36:0x009d, B:41:0x00a4, B:44:0x00ae, B:46:0x00b2, B:49:0x00b8, B:50:0x00bc, B:52:0x00c0, B:53:0x00c1, B:56:0x00c5, B:69:0x0049, B:71:0x00d0, B:72:0x00d7), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b2 A[Catch: all -> 0x001b, TryCatch #0 {all -> 0x001b, blocks: (B:3:0x0002, B:5:0x000c, B:11:0x001e, B:13:0x0028, B:20:0x0055, B:64:0x0063, B:67:0x0070, B:25:0x0079, B:27:0x007f, B:31:0x0088, B:33:0x0093, B:34:0x0099, B:36:0x009d, B:41:0x00a4, B:44:0x00ae, B:46:0x00b2, B:49:0x00b8, B:50:0x00bc, B:52:0x00c0, B:53:0x00c1, B:56:0x00c5, B:69:0x0049, B:71:0x00d0, B:72:0x00d7), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0002 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0078 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0079 A[SYNTHETIC] */
    @Override // defpackage.qjo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public RealConnection b() {
        e7l0 c;
        long j;
        Throwable th;
        f7l0 f7l0Var;
        e7l0 e7l0Var;
        IOException iOException = null;
        while (true) {
            try {
                if (((CopyOnWriteArrayList) this.w).isEmpty() && !((gdi0) this.b).a(null)) {
                    throw iOException;
                }
                if (((gdi0) this.b).k.K) {
                    throw new IOException("Canceled");
                }
                va90 va90Var = ((mtx0) this.c).a;
                long nanoTime = System.nanoTime();
                long j2 = this.a - nanoTime;
                if (!((CopyOnWriteArrayList) this.w).isEmpty() && j2 > 0) {
                    j = j2;
                    c = null;
                    if (c != null) {
                        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.w;
                        if (!copyOnWriteArrayList.isEmpty() && (e7l0Var = (e7l0) ((LinkedBlockingDeque) this.x).poll(j, timeUnit)) != null) {
                            copyOnWriteArrayList.remove(e7l0Var.a);
                            c = e7l0Var;
                            if (c != null) {
                            }
                        }
                        c = null;
                        if (c != null) {
                        }
                    }
                    boolean z = false;
                    if (c.b != null && c.c == null) {
                        a();
                        if (!c.a.isReady()) {
                            c = c.a.c();
                        }
                        if (c.b == null && c.c == null) {
                            z = true;
                        }
                        if (z) {
                            return c.a.a();
                        }
                    }
                    th = c.c;
                    if (th != null) {
                        if (!(th instanceof IOException)) {
                            throw th;
                        }
                        if (iOException == null) {
                            iOException = (IOException) th;
                        } else {
                            ljo.a(iOException, th);
                        }
                    }
                    f7l0Var = c.b;
                    if (f7l0Var == null) {
                        ((gdi0) this.b).p.addFirst(f7l0Var);
                    }
                }
                c = c();
                j = 250000000;
                this.a = nanoTime + 250000000;
                if (c != null) {
                }
                boolean z2 = false;
                if (c.b != null && c.c == null) {
                }
                th = c.c;
                if (th != null) {
                }
                f7l0Var = c.b;
                if (f7l0Var == null) {
                }
            } finally {
                a();
            }
        }
    }

    public e7l0 c() {
        f7l0 q8pVar;
        gdi0 gdi0Var = (gdi0) this.b;
        if (gdi0Var.a(null)) {
            try {
                q8pVar = gdi0Var.b();
            } catch (Throwable th) {
                q8pVar = new q8p(th);
            }
            if (q8pVar.isReady()) {
                return new e7l0(q8pVar, null, null, 6);
            }
            if (q8pVar instanceof q8p) {
                return ((q8p) q8pVar).a;
            }
            ((CopyOnWriteArrayList) this.w).add(q8pVar);
            ((mtx0) this.c).d().d(new icp(bg61.b + " connect " + gdi0Var.i.h.k(), q8pVar, this), 0L);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x007e, code lost:
    
        if (r2 < java.lang.Math.max(0, ((java.lang.Integer) defpackage.nw91.j.a(null)).intValue())) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0097, code lost:
    
        if (r2 >= java.lang.Math.max(0, ((java.lang.Integer) defpackage.nw91.j.a(null)).intValue())) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean d(long j, e0 e0Var) {
        if (((ArrayList) this.w) == null) {
            this.w = new ArrayList();
        }
        if (((ArrayList) this.c) == null) {
            this.c = new ArrayList();
        }
        if (((ArrayList) this.w).isEmpty() || ((((e0) ((ArrayList) this.w).get(0)).w() / 1000) / 60) / 60 == ((e0Var.w() / 1000) / 60) / 60) {
            long m = this.a + e0Var.m();
            n nVar = (n) this.x;
            if (nVar.Y().Qg(null, nw91.d1)) {
                if (!((ArrayList) this.w).isEmpty()) {
                    nVar.Y();
                }
                this.a = m;
                ((ArrayList) this.w).add(e0Var);
                ((ArrayList) this.c).add(Long.valueOf(j));
                int size = ((ArrayList) this.w).size();
                nVar.Y();
                if (size < Math.max(1, ((Integer) nw91.k.a(null)).intValue())) {
                    return true;
                }
            } else {
                nVar.Y();
            }
        }
        return false;
    }

    public void e() {
        o5a1 o5a1Var = (o5a1) this.x;
        o5a1Var.Gg();
        ((g) o5a1Var.b).D.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        SharedPreferences.Editor edit = o5a1Var.Kg().edit();
        edit.remove((String) this.c);
        edit.remove((String) this.w);
        edit.putLong((String) this.b, currentTimeMillis);
        edit.apply();
    }

    @Override // defpackage.qjo
    public gdi0 l() {
        return (gdi0) this.b;
    }

    public /* synthetic */ jcp(n nVar) {
        this.x = nVar;
    }

    public jcp(gdi0 gdi0Var, mtx0 mtx0Var) {
        this.b = gdi0Var;
        this.c = mtx0Var;
        this.a = Long.MIN_VALUE;
        this.w = new CopyOnWriteArrayList();
        this.x = new LinkedBlockingDeque();
    }
}
