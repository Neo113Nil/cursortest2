package xsna;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import xsna.r7l;
import xsna.vlp;
import xsna.vuk0;
import xsna.yhq;

/* compiled from: EngineJob.java */
/* loaded from: classes12.dex */
public final class qlp<R> implements yhq.d {
    public static final c x = new c();
    public final e b;
    public final vuk0.a c;
    public final vlp.a d;
    public final svb0<qlp<?>> e;
    public final c f;
    public final rlp g;
    public final z0u h;
    public final z0u i;
    public final z0u j;
    public final AtomicInteger k;
    public slp l;
    public boolean m;
    public boolean n;
    public hag0<?> o;
    public DataSource p;
    public boolean q;
    public GlideException r;
    public boolean s;
    public vlp<?> t;
    public r7l<R> u;
    public volatile boolean v;
    public boolean w;

    /* compiled from: EngineJob.java */
    public class a implements Runnable {
        public final svj0 b;

        public a(svj0 svj0Var) {
            this.b = svj0Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            svj0 svj0Var = this.b;
            svj0Var.a.a();
            synchronized (svj0Var.b) {
                synchronized (qlp.this) {
                    try {
                        if (qlp.this.b.b.contains(new d(this.b, u3q.b))) {
                            qlp qlpVar = qlp.this;
                            svj0 svj0Var2 = this.b;
                            qlpVar.getClass();
                            try {
                                svj0Var2.g(qlpVar.r, 5);
                            } catch (Throwable th) {
                                throw new mb9(th);
                            }
                        }
                        qlp.this.c();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
    }

    /* compiled from: EngineJob.java */
    public class b implements Runnable {
        public final svj0 b;

        public b(svj0 svj0Var) {
            this.b = svj0Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            svj0 svj0Var = this.b;
            svj0Var.a.a();
            synchronized (svj0Var.b) {
                synchronized (qlp.this) {
                    try {
                        if (qlp.this.b.b.contains(new d(this.b, u3q.b))) {
                            qlp.this.t.c();
                            qlp qlpVar = qlp.this;
                            svj0 svj0Var2 = this.b;
                            qlpVar.getClass();
                            try {
                                svj0Var2.h(qlpVar.t, qlpVar.p, qlpVar.w);
                                qlp.this.g(this.b);
                            } catch (Throwable th) {
                                throw new mb9(th);
                            }
                        }
                        qlp.this.c();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
    }

    /* compiled from: EngineJob.java */
    public static class c {
    }

    /* compiled from: EngineJob.java */
    public static final class d {
        public final svj0 a;
        public final Executor b;

        public d(svj0 svj0Var, Executor executor) {
            this.a = svj0Var;
            this.b = executor;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof d) {
                return this.a.equals(((d) obj).a);
            }
            return false;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }
    }

    /* compiled from: EngineJob.java */
    public static final class e implements Iterable<d> {
        public final ArrayList b;

        public e(ArrayList arrayList) {
            this.b = arrayList;
        }

        @Override // java.lang.Iterable
        @NonNull
        public final Iterator<d> iterator() {
            return this.b.iterator();
        }
    }

    public qlp() {
        throw null;
    }

    public qlp(z0u z0uVar, z0u z0uVar2, z0u z0uVar3, z0u z0uVar4, klp klpVar, klp klpVar2, yhq.c cVar) {
        this.b = new e(new ArrayList(2));
        this.c = new vuk0.a();
        this.k = new AtomicInteger();
        this.h = z0uVar;
        this.i = z0uVar2;
        this.j = z0uVar4;
        this.g = klpVar;
        this.d = klpVar2;
        this.e = cVar;
        this.f = x;
    }

    public final synchronized void a(svj0 svj0Var, Executor executor) {
        try {
            this.c.a();
            this.b.b.add(new d(svj0Var, executor));
            if (this.q) {
                d(1);
                executor.execute(new b(svj0Var));
            } else if (this.s) {
                d(1);
                executor.execute(new a(svj0Var));
            } else {
                nr2.p("Cannot add callbacks to a cancelled EngineJob", !this.v);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void b() {
        if (e()) {
            return;
        }
        this.v = true;
        r7l<R> r7lVar = this.u;
        r7lVar.D = true;
        cuk cukVar = r7lVar.B;
        if (cukVar != null) {
            cukVar.cancel();
        }
        rlp rlpVar = this.g;
        slp slpVar = this.l;
        klp klpVar = (klp) rlpVar;
        synchronized (klpVar) {
            mo8 mo8Var = klpVar.a;
            mo8Var.getClass();
            HashMap hashMap = (HashMap) mo8Var.b;
            if (equals(hashMap.get(slpVar))) {
                hashMap.remove(slpVar);
            }
        }
    }

    public final void c() {
        vlp<?> vlpVar;
        synchronized (this) {
            try {
                this.c.a();
                nr2.p("Not yet complete!", e());
                int decrementAndGet = this.k.decrementAndGet();
                nr2.p("Can't decrement below 0", decrementAndGet >= 0);
                if (decrementAndGet == 0) {
                    vlpVar = this.t;
                    f();
                } else {
                    vlpVar = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (vlpVar != null) {
            vlpVar.d();
        }
    }

    public final synchronized void d(int i) {
        vlp<?> vlpVar;
        nr2.p("Not yet complete!", e());
        if (this.k.getAndAdd(i) == 0 && (vlpVar = this.t) != null) {
            vlpVar.c();
        }
    }

    public final boolean e() {
        return this.s || this.q || this.v;
    }

    public final synchronized void f() {
        boolean a2;
        if (this.l == null) {
            throw new IllegalArgumentException();
        }
        this.b.b.clear();
        this.l = null;
        this.t = null;
        this.o = null;
        this.s = false;
        this.v = false;
        this.q = false;
        this.w = false;
        r7l<R> r7lVar = this.u;
        r7l.e eVar = r7lVar.h;
        synchronized (eVar) {
            eVar.a = true;
            a2 = eVar.a();
        }
        if (a2) {
            r7lVar.m();
        }
        this.u = null;
        this.r = null;
        this.p = null;
        this.e.a(this);
    }

    public final synchronized void g(svj0 svj0Var) {
        try {
            this.c.a();
            this.b.b.remove(new d(svj0Var, u3q.b));
            if (this.b.b.isEmpty()) {
                b();
                if (!this.q) {
                    if (this.s) {
                    }
                }
                if (this.k.get() == 0) {
                    f();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // xsna.yhq.d
    @NonNull
    public final vuk0.a h() {
        return this.c;
    }
}
