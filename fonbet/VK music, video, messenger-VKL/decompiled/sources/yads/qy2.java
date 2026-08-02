package yads;

import android.net.Uri;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import xsna.pft0;

/* loaded from: classes10.dex */
public abstract class qy2 implements sj0 {
    private final u30 a;
    private final qc2 b;
    private final ArrayList c;
    private final qr d;
    private final nr e;
    private final yr f;
    private final Executor g;
    private final ArrayList h;
    private volatile boolean i;

    public qy2(gn1 gn1Var, e30 e30Var, qr qrVar, Executor executor) {
        ni.a(gn1Var.c);
        this.a = a(gn1Var.c.a);
        this.b = e30Var;
        this.c = new ArrayList(gn1Var.c.d);
        this.d = qrVar;
        this.g = executor;
        this.e = (nr) ni.a(qrVar.b());
        this.f = qrVar.c();
        this.h = new ArrayList();
    }

    private void b(bt2 bt2Var) {
        synchronized (this.h) {
            this.h.remove(bt2Var);
        }
    }

    public abstract ArrayList a(rr rrVar, ev0 ev0Var, boolean z);

    @Override // yads.sj0
    public final void cancel() {
        synchronized (this.h) {
            try {
                this.i = true;
                for (int i = 0; i < this.h.size(); i++) {
                    ((bt2) this.h.get(i)).cancel(true);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // yads.sj0
    public final void remove() {
        rr a = this.d.a(null, 1, -1000);
        try {
            try {
                ArrayList a2 = a(a, (ev0) a((bt2) new my2(this, a, this.a), true), true);
                for (int i = 0; i < a2.size(); i++) {
                    nr nrVar = this.e;
                    yr yrVar = this.f;
                    u30 u30Var = ((oy2) a2.get(i)).c;
                    ((pft0) yrVar).getClass();
                    ((zz2) nrVar).c(yr.b(u30Var));
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                nr nrVar2 = this.e;
                yr yrVar2 = this.f;
                u30 u30Var2 = this.a;
                ((pft0) yrVar2).getClass();
                ((zz2) nrVar2).c(yr.b(u30Var2));
                return;
            } catch (Exception unused2) {
            }
            nr nrVar3 = this.e;
            yr yrVar3 = this.f;
            u30 u30Var3 = this.a;
            ((pft0) yrVar3).getClass();
            ((zz2) nrVar3).c(yr.b(u30Var3));
        } catch (Throwable th) {
            nr nrVar4 = this.e;
            yr yrVar4 = this.f;
            u30 u30Var4 = this.a;
            ((pft0) yrVar4).getClass();
            ((zz2) nrVar4).c(yr.b(u30Var4));
            throw th;
        }
    }

    private void a(bt2 bt2Var) {
        synchronized (this.h) {
            try {
                if (this.i) {
                    throw new InterruptedException();
                }
                this.h.add(bt2Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Object a(bt2 bt2Var, boolean z) {
        if (z) {
            bt2Var.run();
            try {
                bt2Var.c.a();
                return bt2Var.c();
            } catch (ExecutionException e) {
                Throwable cause = e.getCause();
                cause.getClass();
                if (cause instanceof IOException) {
                    throw ((IOException) cause);
                }
                int i = mc3.a;
                throw e;
            }
        }
        if (!this.i) {
            a(bt2Var);
            this.g.execute(bt2Var);
            try {
                try {
                    bt2Var.c.a();
                    Object c = bt2Var.c();
                    bt2Var.c.b();
                    synchronized (this.h) {
                        this.h.remove(bt2Var);
                    }
                    return c;
                } catch (ExecutionException e2) {
                    Throwable cause2 = e2.getCause();
                    cause2.getClass();
                    if (cause2 instanceof IOException) {
                        throw ((IOException) cause2);
                    }
                    int i2 = mc3.a;
                    throw e2;
                }
            } catch (Throwable th) {
                bt2Var.c.b();
                b(bt2Var);
                throw th;
            }
        }
        throw new InterruptedException();
    }

    public static u30 a(Uri uri) {
        Map map = Collections.EMPTY_MAP;
        ni.a(uri, "The uri must be set.");
        return new u30(uri, 0L, 1, null, map, 0L, -1L, null, 1, null);
    }

    private void a(int i) {
        synchronized (this.h) {
            this.h.remove(i);
        }
    }

    @Override // yads.sj0
    public final void a(rj0 rj0Var) {
        rr a;
        byte[] bArr;
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayDeque arrayDeque2 = new ArrayDeque();
        boolean z = true;
        try {
            rr a2 = this.d.a();
            ev0 ev0Var = (ev0) a((bt2) new my2(this, a2, this.a), false);
            if (!this.c.isEmpty()) {
                ev0Var = ((c30) ev0Var).a(this.c);
            }
            ArrayList a3 = a(a2, ev0Var, false);
            Collections.sort(a3);
            a(a3, this.f);
            int size = a3.size();
            int size2 = a3.size() - 1;
            int i = 0;
            long j = 0;
            long j2 = 0;
            while (size2 >= 0) {
                try {
                    u30 u30Var = ((oy2) a3.get(size2)).c;
                    ((pft0) this.f).getClass();
                    String b = yr.b(u30Var);
                    boolean z2 = z;
                    long j3 = u30Var.g;
                    if (j3 == -1) {
                        long a4 = qz.a(((zz2) this.e).b(b));
                        if (a4 != -1) {
                            j3 = a4 - u30Var.f;
                        }
                    }
                    long j4 = j3;
                    long a5 = ((zz2) this.e).a(b, u30Var.f, j4);
                    j2 += a5;
                    if (j4 != -1) {
                        if (j4 == a5) {
                            i++;
                            a3.remove(size2);
                        }
                        if (j != -1) {
                            j += j4;
                        }
                    } else {
                        j = -1;
                    }
                    size2--;
                    z = z2;
                } catch (Throwable th) {
                    th = th;
                    for (int i2 = 0; i2 < this.h.size(); i2++) {
                        ((bt2) this.h.get(i2)).cancel(true);
                    }
                    for (int size3 = this.h.size() - 1; size3 >= 0; size3--) {
                        ((bt2) this.h.get(size3)).c.b();
                        a(size3);
                    }
                    throw th;
                }
            }
            boolean z3 = z;
            ny2 ny2Var = rj0Var != null ? new ny2(rj0Var, j, size, j2, i) : null;
            arrayDeque.addAll(a3);
            while (!this.i && !arrayDeque.isEmpty()) {
                if (!arrayDeque2.isEmpty()) {
                    py2 py2Var = (py2) arrayDeque2.removeFirst();
                    a = py2Var.i;
                    bArr = py2Var.k;
                } else {
                    a = this.d.a();
                    bArr = new byte[131072];
                }
                py2 py2Var2 = new py2((oy2) arrayDeque.removeFirst(), a, ny2Var, bArr);
                a(py2Var2);
                this.g.execute(py2Var2);
                for (int size4 = this.h.size() - 1; size4 >= 0; size4--) {
                    py2 py2Var3 = (py2) this.h.get(size4);
                    if (arrayDeque.isEmpty() || py2Var3.isDone()) {
                        try {
                            py2Var3.c.a();
                            py2Var3.c();
                            a(size4);
                            arrayDeque2.addLast(py2Var3);
                        } catch (ExecutionException e) {
                            Throwable cause = e.getCause();
                            cause.getClass();
                            if (cause instanceof IOException) {
                                throw ((IOException) cause);
                            }
                            throw cause;
                        }
                    }
                }
                py2Var2.b.b();
            }
            for (int i3 = 0; i3 < this.h.size(); i3++) {
                ((bt2) this.h.get(i3)).cancel(z3);
            }
            for (int size5 = this.h.size() - (z3 ? 1 : 0); size5 >= 0; size5--) {
                ((bt2) this.h.get(size5)).c.b();
                a(size5);
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private static void a(ArrayList arrayList, yr yrVar) {
        HashMap hashMap = new HashMap();
        int i = 0;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            oy2 oy2Var = (oy2) arrayList.get(i2);
            u30 u30Var = oy2Var.c;
            ((pft0) yrVar).getClass();
            String b = yr.b(u30Var);
            Integer num = (Integer) hashMap.get(b);
            oy2 oy2Var2 = num == null ? null : (oy2) arrayList.get(num.intValue());
            if (oy2Var2 != null && oy2Var.b <= oy2Var2.b + 20000000) {
                u30 u30Var2 = oy2Var2.c;
                u30 u30Var3 = oy2Var.c;
                if (u30Var2.a.equals(u30Var3.a)) {
                    long j = u30Var2.g;
                    if (j != -1 && u30Var2.f + j == u30Var3.f && mc3.a(u30Var2.h, u30Var3.h) && u30Var2.i == u30Var3.i && u30Var2.c == u30Var3.c && u30Var2.e.equals(u30Var3.e)) {
                        long j2 = oy2Var.c.g;
                        u30 a = oy2Var2.c.a(0L, j2 != -1 ? oy2Var2.c.g + j2 : -1L);
                        num.getClass();
                        arrayList.set(num.intValue(), new oy2(oy2Var2.b, a));
                    }
                }
            }
            hashMap.put(b, Integer.valueOf(i));
            arrayList.set(i, oy2Var);
            i++;
        }
        int size = arrayList.size();
        int i3 = mc3.a;
        if (i < 0 || size > arrayList.size() || i > size) {
            throw new IllegalArgumentException();
        }
        if (i != size) {
            arrayList.subList(i, size).clear();
        }
    }
}
