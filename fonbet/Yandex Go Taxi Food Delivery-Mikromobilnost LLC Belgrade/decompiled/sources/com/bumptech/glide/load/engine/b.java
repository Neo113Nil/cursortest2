package com.bumptech.glide.load.engine;

import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.GlideContext;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.resource.bitmap.g;
import defpackage.adt0;
import defpackage.b2o;
import defpackage.c6u0;
import defpackage.ce70;
import defpackage.cpg;
import defpackage.exj;
import defpackage.fxy;
import defpackage.g1o;
import defpackage.gog;
import defpackage.hog;
import defpackage.iog;
import defpackage.jdj;
import defpackage.kbs;
import defpackage.khx;
import defpackage.l6e0;
import defpackage.m501;
import defpackage.mg70;
import defpackage.ny61;
import defpackage.otj0;
import defpackage.pd7;
import defpackage.ptj0;
import defpackage.rng;
import defpackage.rwv;
import defpackage.unr0;
import defpackage.uxg;
import defpackage.v1o;
import defpackage.vfz;
import defpackage.vtj0;
import defpackage.w1o;
import defpackage.wwf;
import defpackage.x1o;
import defpackage.x7p;
import defpackage.xdz;
import defpackage.xi6;
import defpackage.xjg;
import defpackage.y1o;
import defpackage.yci0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes10.dex */
public final class b implements hog, Runnable, Comparable, x7p {
    public GlideContext A;
    public khx B;
    public Priority C;
    public y1o D;
    public int E;
    public int F;
    public exj G;
    public mg70 H;
    public x1o I;
    public int J;
    public DecodeJob$Stage K;
    public DecodeJob$RunReason L;
    public Object M;
    public Thread N;
    public khx O;
    public khx P;
    public Object Q;
    public DataSource R;
    public gog S;
    public volatile iog T;
    public volatile boolean U;
    public volatile boolean V;
    public boolean W;
    public final g1o w;
    public final l6e0 x;
    public final uxg a = new uxg();
    public final ArrayList b = new ArrayList();
    public final c6u0 c = new c6u0();
    public final wwf y = new wwf();
    public final xi6 z = new xi6();

    public b(g1o g1oVar, jdj jdjVar) {
        this.w = g1oVar;
        this.x = jdjVar;
    }

    public final otj0 a(gog gogVar, Object obj, DataSource dataSource) {
        if (obj == null) {
            gogVar.cleanup();
            return null;
        }
        try {
            int i = vfz.a;
            SystemClock.elapsedRealtimeNanos();
            otj0 e = e(obj, dataSource);
            if (Log.isLoggable("DecodeJob", 2)) {
                e.toString();
                SystemClock.elapsedRealtimeNanos();
                Objects.toString(this.D);
                Thread.currentThread().getName();
            }
            return e;
        } finally {
            gogVar.cleanup();
        }
    }

    @Override // defpackage.hog
    public final void b(khx khxVar, Object obj, gog gogVar, DataSource dataSource, khx khxVar2) {
        this.O = khxVar;
        this.Q = obj;
        this.S = gogVar;
        this.R = dataSource;
        this.P = khxVar2;
        this.W = khxVar != this.a.a().get(0);
        if (Thread.currentThread() == this.N) {
            f();
            return;
        }
        this.L = DecodeJob$RunReason.DECODE_DATA;
        x1o x1oVar = this.I;
        (x1oVar.F ? x1oVar.B : x1oVar.A).execute(this);
    }

    @Override // defpackage.hog
    public final void c(khx khxVar, Exception exc, gog gogVar, DataSource dataSource) {
        gogVar.cleanup();
        GlideException glideException = new GlideException("Fetching data failed", Collections.singletonList(exc));
        glideException.h(khxVar, dataSource, gogVar.a());
        this.b.add(glideException);
        if (Thread.currentThread() == this.N) {
            k();
            return;
        }
        this.L = DecodeJob$RunReason.SWITCH_TO_SOURCE_SERVICE;
        x1o x1oVar = this.I;
        (x1oVar.F ? x1oVar.B : x1oVar.A).execute(this);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        b bVar = (b) obj;
        int ordinal = this.C.ordinal() - bVar.C.ordinal();
        return ordinal == 0 ? this.J - bVar.J : ordinal;
    }

    @Override // defpackage.x7p
    public final c6u0 d() {
        return this.c;
    }

    public final otj0 e(Object obj, DataSource dataSource) {
        Class<?> cls = obj.getClass();
        uxg uxgVar = this.a;
        fxy c = uxgVar.c(cls);
        mg70 mg70Var = this.H;
        int i = 1;
        boolean z = dataSource == DataSource.RESOURCE_DISK_CACHE || uxgVar.r;
        ce70 ce70Var = g.i;
        Boolean bool = (Boolean) mg70Var.c(ce70Var);
        if (bool == null || (bool.booleanValue() && !z)) {
            mg70Var = new mg70();
            pd7 pd7Var = this.H.b;
            pd7 pd7Var2 = mg70Var.b;
            pd7Var2.g(pd7Var);
            pd7Var2.put(ce70Var, Boolean.valueOf(z));
        }
        mg70 mg70Var2 = mg70Var;
        cpg g = this.A.getRegistry().g(obj);
        try {
            return c.a(this.E, this.F, new xjg(i, this, dataSource), g, mg70Var2);
        } finally {
            g.cleanup();
        }
    }

    public final void f() {
        otj0 otj0Var;
        boolean a;
        if (Log.isLoggable("DecodeJob", 2)) {
            Objects.toString(this.Q);
            Objects.toString(this.O);
            Objects.toString(this.S);
            int i = vfz.a;
            SystemClock.elapsedRealtimeNanos();
            Objects.toString(this.D);
            Thread.currentThread().getName();
        }
        xdz xdzVar = null;
        try {
            otj0Var = a(this.S, this.Q, this.R);
        } catch (GlideException e) {
            e.h(this.P, this.R, null);
            this.b.add(e);
            otj0Var = null;
        }
        if (otj0Var == null) {
            k();
            return;
        }
        DataSource dataSource = this.R;
        boolean z = this.W;
        if (otj0Var instanceof rwv) {
            ((rwv) otj0Var).initialize();
        }
        int i2 = 1;
        if (((xdz) this.y.c) != null) {
            xdzVar = (xdz) xdz.x.a();
            xdzVar.w = false;
            xdzVar.c = true;
            xdzVar.b = otj0Var;
            otj0Var = xdzVar;
        }
        m();
        x1o x1oVar = this.I;
        synchronized (x1oVar) {
            x1oVar.G = otj0Var;
            x1oVar.H = dataSource;
            x1oVar.O = z;
        }
        synchronized (x1oVar) {
            try {
                x1oVar.b.a();
                if (x1oVar.N) {
                    x1oVar.G.a();
                    x1oVar.f();
                } else {
                    if (x1oVar.a.a.isEmpty()) {
                        throw new IllegalStateException("Received a resource without any callbacks to notify");
                    }
                    if (x1oVar.I) {
                        throw new IllegalStateException("Already have resource");
                    }
                    m501 m501Var = x1oVar.x;
                    otj0 otj0Var2 = x1oVar.G;
                    boolean z2 = x1oVar.E;
                    y1o y1oVar = x1oVar.D;
                    c cVar = x1oVar.c;
                    m501Var.getClass();
                    x1oVar.L = new b2o(otj0Var2, z2, true, y1oVar, cVar);
                    x1oVar.I = true;
                    w1o w1oVar = x1oVar.a;
                    w1oVar.getClass();
                    ArrayList arrayList = new ArrayList(w1oVar.a);
                    x1oVar.c(arrayList.size() + 1);
                    x1oVar.y.c(x1oVar, x1oVar.D, x1oVar.L);
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        v1o v1oVar = (v1o) it.next();
                        v1oVar.b.execute(new d(x1oVar, v1oVar.a, i2));
                    }
                    x1oVar.b();
                }
            } finally {
            }
        }
        this.K = DecodeJob$Stage.ENCODE;
        try {
            wwf wwfVar = this.y;
            if (((xdz) wwfVar.c) != null) {
                g1o g1oVar = this.w;
                mg70 mg70Var = this.H;
                wwfVar.getClass();
                try {
                    g1oVar.a().b((khx) wwfVar.a, new wwf((vtj0) wwfVar.b, (xdz) wwfVar.c, mg70Var));
                    ((xdz) wwfVar.c).c();
                } catch (Throwable th) {
                    ((xdz) wwfVar.c).c();
                    throw th;
                }
            }
            if (xdzVar != null) {
                xdzVar.c();
            }
            xi6 xi6Var = this.z;
            synchronized (xi6Var) {
                xi6Var.b = true;
                a = xi6Var.a();
            }
            if (a) {
                j();
            }
        } finally {
        }
    }

    public final iog g() {
        int i = a.b[this.K.ordinal()];
        uxg uxgVar = this.a;
        if (i == 1) {
            return new ptj0(uxgVar, this);
        }
        if (i == 2) {
            return new rng(uxgVar.a(), uxgVar, this);
        }
        if (i == 3) {
            return new adt0(uxgVar, this);
        }
        if (i == 4) {
            return null;
        }
        yci0.t(this.K, "Unrecognized stage: ");
        return null;
    }

    public final DecodeJob$Stage h(DecodeJob$Stage decodeJob$Stage) {
        int i = a.b[decodeJob$Stage.ordinal()];
        if (i == 1) {
            return this.G.a() ? DecodeJob$Stage.DATA_CACHE : h(DecodeJob$Stage.DATA_CACHE);
        }
        if (i == 2) {
            return DecodeJob$Stage.SOURCE;
        }
        if (i == 3 || i == 4) {
            return DecodeJob$Stage.FINISHED;
        }
        if (i == 5) {
            return this.G.b() ? DecodeJob$Stage.RESOURCE_CACHE : h(DecodeJob$Stage.RESOURCE_CACHE);
        }
        kbs.f(decodeJob$Stage, "Unrecognized stage: ");
        return null;
    }

    public final void i() {
        boolean a;
        m();
        GlideException glideException = new GlideException("Failed to load resource", new ArrayList(this.b));
        x1o x1oVar = this.I;
        synchronized (x1oVar) {
            x1oVar.J = glideException;
        }
        synchronized (x1oVar) {
            try {
                x1oVar.b.a();
                if (x1oVar.N) {
                    x1oVar.f();
                } else {
                    if (x1oVar.a.a.isEmpty()) {
                        throw new IllegalStateException("Received an exception without any callbacks to notify");
                    }
                    if (x1oVar.K) {
                        throw new IllegalStateException("Already failed once");
                    }
                    x1oVar.K = true;
                    y1o y1oVar = x1oVar.D;
                    w1o w1oVar = x1oVar.a;
                    w1oVar.getClass();
                    ArrayList arrayList = new ArrayList(w1oVar.a);
                    x1oVar.c(arrayList.size() + 1);
                    x1oVar.y.c(x1oVar, y1oVar, null);
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        v1o v1oVar = (v1o) it.next();
                        v1oVar.b.execute(new d(x1oVar, v1oVar.a, 0));
                    }
                    x1oVar.b();
                }
            } finally {
            }
        }
        xi6 xi6Var = this.z;
        synchronized (xi6Var) {
            xi6Var.c = true;
            a = xi6Var.a();
        }
        if (a) {
            j();
        }
    }

    public final void j() {
        xi6 xi6Var = this.z;
        synchronized (xi6Var) {
            xi6Var.b = false;
            xi6Var.a = false;
            xi6Var.c = false;
        }
        wwf wwfVar = this.y;
        wwfVar.a = null;
        wwfVar.b = null;
        wwfVar.c = null;
        uxg uxgVar = this.a;
        uxgVar.c = null;
        uxgVar.d = null;
        uxgVar.n = null;
        uxgVar.g = null;
        uxgVar.k = null;
        uxgVar.i = null;
        uxgVar.o = null;
        uxgVar.j = null;
        uxgVar.p = null;
        uxgVar.a.clear();
        uxgVar.l = false;
        uxgVar.b.clear();
        uxgVar.m = false;
        this.U = false;
        this.A = null;
        this.B = null;
        this.H = null;
        this.C = null;
        this.D = null;
        this.I = null;
        this.K = null;
        this.T = null;
        this.N = null;
        this.O = null;
        this.Q = null;
        this.R = null;
        this.S = null;
        this.V = false;
        this.M = null;
        this.b.clear();
        this.x.a0(this);
    }

    public final void k() {
        this.N = Thread.currentThread();
        int i = vfz.a;
        SystemClock.elapsedRealtimeNanos();
        boolean z = false;
        while (!this.V && this.T != null && !(z = this.T.a())) {
            this.K = h(this.K);
            this.T = g();
            if (this.K == DecodeJob$Stage.SOURCE) {
                this.L = DecodeJob$RunReason.SWITCH_TO_SOURCE_SERVICE;
                x1o x1oVar = this.I;
                (x1oVar.F ? x1oVar.B : x1oVar.A).execute(this);
                return;
            }
        }
        if ((this.K == DecodeJob$Stage.FINISHED || this.V) && !z) {
            i();
        }
    }

    public final void l() {
        int i = a.a[this.L.ordinal()];
        if (i == 1) {
            this.K = h(DecodeJob$Stage.INITIALIZE);
            this.T = g();
            k();
        } else if (i == 2) {
            k();
        } else if (i == 3) {
            f();
        } else {
            yci0.t(this.L, "Unrecognized run reason: ");
        }
    }

    public final void m() {
        this.c.a();
        if (this.U) {
            ny61.h("Already notified", this.b.isEmpty() ? null : (Throwable) unr0.k(1, this.b));
        } else {
            this.U = true;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        gog gogVar = this.S;
        try {
            try {
                if (this.V) {
                    i();
                    if (gogVar != null) {
                        gogVar.cleanup();
                        return;
                    }
                    return;
                }
                l();
                if (gogVar != null) {
                    gogVar.cleanup();
                }
            } catch (Throwable th) {
                if (gogVar != null) {
                    gogVar.cleanup();
                }
                throw th;
            }
        } catch (CallbackException e) {
            throw e;
        } catch (Throwable th2) {
            if (Log.isLoggable("DecodeJob", 3)) {
                Objects.toString(this.K);
            }
            if (this.K != DecodeJob$Stage.ENCODE) {
                this.b.add(th2);
                i();
            }
            if (!this.V) {
                throw th2;
            }
            throw th2;
        }
    }
}
