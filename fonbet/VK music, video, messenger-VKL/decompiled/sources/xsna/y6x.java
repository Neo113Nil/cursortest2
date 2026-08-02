package xsna;

import com.vk.instantjobs.InstantJob;
import com.vk.instantjobs.exceptions.JobCauseException;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* compiled from: InstantJobManagerCausableProxy.kt */
/* loaded from: classes.dex */
public final class y6x implements x6x {
    public final c7x a;
    public final dlc b;

    public y6x(c7x c7xVar, dlc dlcVar) {
        this.a = c7xVar;
        this.b = dlcVar;
    }

    @Override // xsna.x6x
    public final void a(InstantJob instantJob) {
        this.a.i(instantJob, h("InstantJobManager#submit", null));
    }

    @Override // xsna.x6x
    public final void b(String str, izs<? super InstantJob, Boolean> izsVar) {
        this.a.a(str, h("InstantJobManager#cancelAndAwait", null), izsVar);
    }

    @Override // xsna.x6x
    public final void c(izs<? super InstantJob, Boolean> izsVar) {
        this.a.a("unknown", h("InstantJobManager#cancelAndAwait", null), izsVar);
    }

    @Override // xsna.x6x
    public final void d(u4w u4wVar) {
        this.a.i(u4wVar, h("InstantJobManager#submit", null)).get().await();
    }

    @Override // xsna.x6x
    public final void e(String str, Throwable th, izs<? super InstantJob, Boolean> izsVar) {
        if (th == null) {
            th = h("InstantJobManager#cancelAndAwait", null);
        }
        this.a.a(str, th, izsVar);
    }

    @Override // xsna.x6x
    public final void f(Object obj) {
        c7x c7xVar = this.a;
        JobCauseException h = h("InstantJobManager#start", null);
        synchronized (c7xVar) {
            if (c7xVar.p) {
                throw new IllegalStateException("Instance is released");
            }
            if (c7xVar.o) {
                throw new IllegalStateException("Instance is already started");
            }
            c7xVar.e.a("start JobsManager with payload=" + obj.getClass().getSimpleName());
            c7xVar.o = true;
            c7xVar.n = obj;
            c7xVar.b.b(c7xVar.i);
            c7xVar.j(new a7x(0, c7xVar, h));
        }
    }

    @Override // xsna.x6x
    public final <T extends InstantJob> void g(Class<T> cls, s7x<T> s7xVar) {
        jml jmlVar = this.a.f;
        synchronized (jmlVar) {
            jmlVar.a.put(cls, s7xVar);
            jmlVar.b.put(s7xVar.getType(), s7xVar);
        }
    }

    @Override // xsna.x6x
    public final JobCauseException h(String str, Throwable th) {
        if (prw.c) {
            return null;
        }
        return th != null ? new JobCauseException(str, th) : new JobCauseException(str);
    }

    @Override // xsna.x6x
    public final void i(String str, izs<? super InstantJob, Boolean> izsVar) {
        Future j;
        c7x c7xVar = this.a;
        JobCauseException h = h("InstantJobManager#cancelAndAwait", null);
        synchronized (c7xVar) {
            c7xVar.c();
            j = c7xVar.j(new a2d(c7xVar, h, str, izsVar, 1));
        }
        Iterator it = ((Iterable) j.get()).iterator();
        while (it.hasNext()) {
            ((CountDownLatch) it.next()).await();
        }
    }

    @Override // xsna.x6x
    public final void j(u4w u4wVar, Throwable th) {
        if (th == null) {
            th = h("InstantJobManager#submit", null);
        }
        this.a.i(u4wVar, th);
    }

    @Override // xsna.x6x
    public final void k(String str, izs<? super InstantJob, Boolean> izsVar) {
        c7x c7xVar = this.a;
        JobCauseException h = h("InstantJobManager#cancel", null);
        synchronized (c7xVar) {
            c7xVar.c();
            c7xVar.j(new bx5(c7xVar, h, str, izsVar, 1));
        }
    }

    @Override // xsna.x6x
    public final void l(izs<? super InstantJob, Boolean> izsVar) {
        c7x c7xVar = this.a;
        String str = "unknown";
        JobCauseException h = h("InstantJobManager#cancel", null);
        synchronized (c7xVar) {
            c7xVar.c();
            c7xVar.j(new bx5(c7xVar, h, str, izsVar, 1));
        }
    }

    @Override // xsna.x6x
    public final void m(String str) {
        this.b.invoke(this.a);
        c7x c7xVar = this.a;
        synchronized (c7xVar) {
            if (!c7xVar.p) {
                c7xVar.e.a("release JobsManager");
                c7xVar.b.a(c7xVar.i);
                c7xVar.o = false;
                c7xVar.p = true;
                c7xVar.q = str;
                c7xVar.j(new fgm(c7xVar, 17));
                ((ExecutorService) c7xVar.j.getValue()).shutdown();
            }
        }
        c7xVar.r.await();
    }

    public final void n() {
        c7x c7xVar = this.a;
        synchronized (c7xVar) {
            if (c7xVar.o) {
                throw new IllegalStateException("Cannot launch 'clear' when instance is started");
            }
            c7xVar.e.a("clear JobsManager");
            c7xVar.a.deleteDatabase(c7xVar.c);
        }
    }
}
