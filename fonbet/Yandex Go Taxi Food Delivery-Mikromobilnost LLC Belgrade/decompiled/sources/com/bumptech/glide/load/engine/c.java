package com.bumptech.glide.load.engine;

import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.GlideContext;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import defpackage.b2o;
import defpackage.bsr;
import defpackage.bxj;
import defpackage.exj;
import defpackage.g1o;
import defpackage.i4u;
import defpackage.j30;
import defpackage.j4n;
import defpackage.jdj;
import defpackage.k30;
import defpackage.khx;
import defpackage.li10;
import defpackage.lzz;
import defpackage.mg70;
import defpackage.mum;
import defpackage.ny61;
import defpackage.o3;
import defpackage.o501;
import defpackage.otj0;
import defpackage.pd7;
import defpackage.ph91;
import defpackage.pzz;
import defpackage.qh91;
import defpackage.uxg;
import defpackage.vfz;
import defpackage.x1o;
import defpackage.y1o;
import defpackage.yht;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* loaded from: classes10.dex */
public final class c {
    public static final boolean i = Log.isLoggable("Engine", 2);
    public final bsr a;
    public final o501 b;
    public final li10 c;
    public final j4n d;
    public final e e;
    public final g1o f;
    public final o3 g;
    public final k30 h;

    public c(pzz pzzVar, i4u i4uVar, yht yhtVar, yht yhtVar2, yht yhtVar3, yht yhtVar4) {
        this.c = pzzVar;
        g1o g1oVar = new g1o(i4uVar);
        this.f = g1oVar;
        k30 k30Var = new k30();
        this.h = k30Var;
        synchronized (this) {
            synchronized (k30Var) {
                k30Var.d = this;
            }
        }
        this.b = new o501(22);
        this.a = new bsr(1);
        j4n j4nVar = new j4n();
        j4nVar.w = qh91.d(150, new mum(j4nVar));
        j4nVar.a = yhtVar;
        j4nVar.b = yhtVar2;
        j4nVar.c = yhtVar3;
        j4nVar.x = yhtVar4;
        j4nVar.y = this;
        j4nVar.z = this;
        this.d = j4nVar;
        this.g = new o3(g1oVar);
        this.e = new e();
        pzzVar.f = this;
    }

    public static void e(otj0 otj0Var) {
        if (otj0Var instanceof b2o) {
            ((b2o) otj0Var).d();
        } else {
            ny61.g("Cannot release anything but an EngineResource");
        }
    }

    public final jdj a(GlideContext glideContext, Object obj, khx khxVar, int i2, int i3, Class cls, Class cls2, Priority priority, exj exjVar, pd7 pd7Var, boolean z, boolean z2, mg70 mg70Var, boolean z3, boolean z4, com.bumptech.glide.request.a aVar, Executor executor) {
        long j;
        if (i) {
            int i4 = vfz.a;
            j = SystemClock.elapsedRealtimeNanos();
        } else {
            j = 0;
        }
        this.b.getClass();
        y1o y1oVar = new y1o(obj, khxVar, i2, i3, pd7Var, cls, cls2, mg70Var);
        synchronized (this) {
            try {
                b2o b = b(y1oVar, z3, j);
                if (b == null) {
                    return g(glideContext, obj, khxVar, i2, i3, cls, cls2, priority, exjVar, pd7Var, z, z2, mg70Var, z3, z4, aVar, executor, y1oVar, j);
                }
                aVar.h(b, DataSource.MEMORY_CACHE, false);
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final b2o b(y1o y1oVar, boolean z, long j) {
        b2o b2oVar;
        Object obj;
        c cVar;
        y1o y1oVar2;
        b2o b2oVar2;
        if (z) {
            k30 k30Var = this.h;
            synchronized (k30Var) {
                j30 j30Var = (j30) k30Var.b.get(y1oVar);
                if (j30Var == null) {
                    b2oVar = null;
                } else {
                    b2oVar = (b2o) j30Var.get();
                    if (b2oVar == null) {
                        k30Var.b(j30Var);
                    }
                }
            }
            if (b2oVar != null) {
                b2oVar.c();
            }
            if (b2oVar != null) {
                if (i) {
                    int i2 = vfz.a;
                    SystemClock.elapsedRealtimeNanos();
                    Objects.toString(y1oVar);
                }
                return b2oVar;
            }
            pzz pzzVar = (pzz) this.c;
            synchronized (pzzVar) {
                lzz lzzVar = (lzz) ((LinkedHashMap) pzzVar.e).remove(y1oVar);
                if (lzzVar == null) {
                    obj = null;
                } else {
                    pzzVar.d -= lzzVar.b;
                    obj = lzzVar.a;
                }
            }
            otj0 otj0Var = (otj0) obj;
            if (otj0Var == null) {
                cVar = this;
                y1oVar2 = y1oVar;
                b2oVar2 = null;
            } else if (otj0Var instanceof b2o) {
                b2oVar2 = (b2o) otj0Var;
                cVar = this;
                y1oVar2 = y1oVar;
            } else {
                cVar = this;
                y1oVar2 = y1oVar;
                b2oVar2 = new b2o(otj0Var, true, true, y1oVar2, cVar);
            }
            if (b2oVar2 != null) {
                b2oVar2.c();
                cVar.h.a(y1oVar2, b2oVar2);
            }
            if (b2oVar2 != null) {
                if (i) {
                    int i3 = vfz.a;
                    SystemClock.elapsedRealtimeNanos();
                    Objects.toString(y1oVar2);
                }
                return b2oVar2;
            }
        }
        return null;
    }

    public final synchronized void c(x1o x1oVar, y1o y1oVar, b2o b2oVar) {
        if (b2oVar != null) {
            try {
                if (b2oVar.a) {
                    this.h.a(y1oVar, b2oVar);
                }
            } finally {
            }
        }
        bsr bsrVar = this.a;
        bsrVar.getClass();
        x1oVar.getClass();
        HashMap hashMap = bsrVar.a;
        if (x1oVar == hashMap.get(y1oVar)) {
            hashMap.remove(y1oVar);
        }
    }

    public final void d(khx khxVar, b2o b2oVar) {
        k30 k30Var = this.h;
        synchronized (k30Var) {
            j30 j30Var = (j30) k30Var.b.remove(khxVar);
            if (j30Var != null) {
                j30Var.c = null;
                j30Var.clear();
            }
        }
        if (b2oVar.a) {
        } else {
            this.e.a(b2oVar, false);
        }
    }

    public final void f() {
        j4n j4nVar = this.d;
        ph91.b((yht) j4nVar.a);
        ph91.b((yht) j4nVar.b);
        ph91.b((yht) j4nVar.c);
        ph91.b((yht) j4nVar.x);
        g1o g1oVar = this.f;
        synchronized (g1oVar) {
            if (((bxj) g1oVar.a) != null) {
                ((bxj) g1oVar.a).clear();
            }
        }
        k30 k30Var = this.h;
        k30Var.e = true;
        ExecutorService executorService = k30Var.a;
        if (executorService != null) {
            ph91.b(executorService);
        }
    }

    public final jdj g(GlideContext glideContext, Object obj, khx khxVar, int i2, int i3, Class cls, Class cls2, Priority priority, exj exjVar, Map map, boolean z, boolean z2, mg70 mg70Var, boolean z3, boolean z4, com.bumptech.glide.request.a aVar, Executor executor, y1o y1oVar, long j) {
        yht yhtVar;
        x1o x1oVar = (x1o) this.a.a.get(y1oVar);
        if (x1oVar != null) {
            x1oVar.a(aVar, executor);
            if (i) {
                int i4 = vfz.a;
                SystemClock.elapsedRealtimeNanos();
                Objects.toString(y1oVar);
            }
            return new jdj(this, aVar, x1oVar);
        }
        x1o x1oVar2 = (x1o) ((jdj) this.d.w).a();
        synchronized (x1oVar2) {
            x1oVar2.D = y1oVar;
            x1oVar2.E = z3;
            x1oVar2.F = z4;
        }
        o3 o3Var = this.g;
        b bVar = (b) ((jdj) o3Var.c).a();
        int i5 = o3Var.b;
        o3Var.b = i5 + 1;
        uxg uxgVar = bVar.a;
        g1o g1oVar = bVar.w;
        uxgVar.c = glideContext;
        uxgVar.d = obj;
        uxgVar.n = khxVar;
        uxgVar.e = i2;
        uxgVar.f = i3;
        uxgVar.p = exjVar;
        uxgVar.g = cls;
        uxgVar.h = g1oVar;
        uxgVar.k = cls2;
        uxgVar.o = priority;
        uxgVar.i = mg70Var;
        uxgVar.j = map;
        uxgVar.q = z;
        uxgVar.r = z2;
        bVar.A = glideContext;
        bVar.B = khxVar;
        bVar.C = priority;
        bVar.D = y1oVar;
        bVar.E = i2;
        bVar.F = i3;
        bVar.G = exjVar;
        bVar.H = mg70Var;
        bVar.I = x1oVar2;
        bVar.J = i5;
        bVar.L = DecodeJob$RunReason.INITIALIZE;
        bVar.M = obj;
        bsr bsrVar = this.a;
        bsrVar.getClass();
        bsrVar.a.put(y1oVar, x1oVar2);
        x1oVar2.a(aVar, executor);
        synchronized (x1oVar2) {
            x1oVar2.M = bVar;
            DecodeJob$Stage h = bVar.h(DecodeJob$Stage.INITIALIZE);
            if (h != DecodeJob$Stage.RESOURCE_CACHE && h != DecodeJob$Stage.DATA_CACHE) {
                yhtVar = x1oVar2.F ? x1oVar2.B : x1oVar2.A;
                yhtVar.execute(bVar);
            }
            yhtVar = x1oVar2.z;
            yhtVar.execute(bVar);
        }
        if (i) {
            int i6 = vfz.a;
            SystemClock.elapsedRealtimeNanos();
            Objects.toString(y1oVar);
        }
        return new jdj(this, aVar, x1oVar2);
    }
}
