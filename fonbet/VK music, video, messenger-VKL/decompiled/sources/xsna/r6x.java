package xsna;

import android.content.Context;
import android.os.Handler;
import com.vk.instantjobs.InstantJob;
import com.vk.instantjobs.exceptions.JobException;
import com.vk.instantjobs.exceptions.NonRestorableJobException;
import com.vk.instantjobs.services.JobsForegroundService;
import com.vk.log.L;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import kotlin.NoWhenBranchMatchedException;
import xsna.ny90;
import xsna.r7x;

/* compiled from: InstantJobController.kt */
/* loaded from: classes.dex */
public final class r6x {
    public final String a;
    public final jml b;
    public final ygl0 c;
    public final ExecutorService d;
    public final pla e;
    public final Object f;
    public final u6x g;
    public final r7x h;
    public boolean i;
    public boolean j;

    /* compiled from: InstantJobController.kt */
    public final class a {
        public a() {
        }

        public final void a(final w6x w6xVar, InstantJob.a aVar) {
            if (aVar instanceof InstantJob.a.g) {
                return;
            }
            if (aVar instanceof InstantJob.a.f) {
                r7x r7xVar = r6x.this.h;
                synchronized (r7xVar) {
                    r7xVar.d();
                    r7xVar.k(new ag1(6, w6xVar, r7xVar));
                }
                return;
            }
            if (aVar instanceof InstantJob.a.e) {
                InstantJob.a.e eVar = (InstantJob.a.e) aVar;
                r7x r7xVar2 = r6x.this.h;
                synchronized (r7xVar2) {
                    r7xVar2.d();
                    r7xVar2.k(new k7x(r7xVar2, w6xVar, eVar, 0));
                }
                return;
            }
            final boolean z = false;
            if (aVar instanceof InstantJob.a.b) {
                r6x r6xVar = r6x.this;
                final r7x r7xVar3 = r6xVar.h;
                synchronized (r7xVar3) {
                    r7xVar3.d();
                    r7xVar3.k(new gzs() { // from class: xsna.i7x
                        @Override // xsna.gzs
                        public final Object invoke() {
                            final r7x r7xVar4 = r7x.this;
                            final w6x w6xVar2 = w6xVar;
                            if (!r7xVar4.e(w6xVar2)) {
                                return s3q0.a;
                            }
                            CopyOnWriteArrayList<r7x.a> copyOnWriteArrayList = r7xVar4.j;
                            Iterator<r7x.a> it = copyOnWriteArrayList.iterator();
                            int i = 0;
                            while (true) {
                                if (!it.hasNext()) {
                                    i = -1;
                                    break;
                                }
                                r7x.a next = it.next();
                                int i2 = i + 1;
                                if (i < 0) {
                                    e43.t();
                                    throw null;
                                }
                                if (next.a.equals(w6xVar2)) {
                                    break;
                                }
                                i = i2;
                            }
                            if (i >= 0) {
                                copyOnWriteArrayList.remove(i);
                            }
                            final int l = w6xVar2.e.l(r7xVar4.e);
                            if (r7xVar4.f(l)) {
                                r7xVar4.h(l);
                            } else {
                                Handler handler = com.vk.instantjobs.services.a.a;
                                com.vk.instantjobs.services.a.a.post(new pn3(1, new xyx(r7xVar4.a, l)));
                                Handler handler2 = (Handler) r7xVar4.g.getValue();
                                final boolean z2 = z;
                                final boolean z3 = z;
                                handler2.postDelayed(new Runnable() { // from class: xsna.n7x
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        r7x r7xVar5 = r7x.this;
                                        CopyOnWriteArrayList<r7x.a> copyOnWriteArrayList2 = r7xVar5.j;
                                        int i3 = 0;
                                        if (copyOnWriteArrayList2 == null || !copyOnWriteArrayList2.isEmpty()) {
                                            Iterator<r7x.a> it2 = copyOnWriteArrayList2.iterator();
                                            while (it2.hasNext()) {
                                                if (it2.next().b && (i3 = i3 + 1) < 0) {
                                                    e43.s();
                                                    throw null;
                                                }
                                            }
                                        }
                                        boolean z4 = z2;
                                        w6x w6xVar3 = w6xVar2;
                                        int i4 = l;
                                        boolean z5 = z3;
                                        if (i3 == 0) {
                                            Handler handler3 = com.vk.instantjobs.services.a.a;
                                            boolean z6 = JobsForegroundService.h;
                                            if (z6) {
                                                o7x o7xVar = new o7x(r7xVar5, z4, w6xVar3, i4, z5);
                                                if (z6) {
                                                    com.vk.instantjobs.services.a.b.add(new com.vk.instantjobs.services.b(o7xVar));
                                                    return;
                                                } else {
                                                    o7xVar.invoke();
                                                    return;
                                                }
                                            }
                                        }
                                        r7xVar5.l(z4, w6xVar3, i4, z5);
                                    }
                                }, 300L);
                            }
                            return s3q0.a;
                        }
                    });
                }
                r6xVar.c.c(w6xVar.b());
                return;
            }
            final boolean z2 = true;
            if (aVar instanceof InstantJob.a.c) {
                r6x r6xVar2 = r6x.this;
                final r7x r7xVar4 = r6xVar2.h;
                synchronized (r7xVar4) {
                    r7xVar4.d();
                    r7xVar4.k(new gzs() { // from class: xsna.i7x
                        @Override // xsna.gzs
                        public final Object invoke() {
                            final r7x r7xVar42 = r7x.this;
                            final w6x w6xVar2 = w6xVar;
                            if (!r7xVar42.e(w6xVar2)) {
                                return s3q0.a;
                            }
                            CopyOnWriteArrayList<r7x.a> copyOnWriteArrayList = r7xVar42.j;
                            Iterator<r7x.a> it = copyOnWriteArrayList.iterator();
                            int i = 0;
                            while (true) {
                                if (!it.hasNext()) {
                                    i = -1;
                                    break;
                                }
                                r7x.a next = it.next();
                                int i2 = i + 1;
                                if (i < 0) {
                                    e43.t();
                                    throw null;
                                }
                                if (next.a.equals(w6xVar2)) {
                                    break;
                                }
                                i = i2;
                            }
                            if (i >= 0) {
                                copyOnWriteArrayList.remove(i);
                            }
                            final int l = w6xVar2.e.l(r7xVar42.e);
                            if (r7xVar42.f(l)) {
                                r7xVar42.h(l);
                            } else {
                                Handler handler = com.vk.instantjobs.services.a.a;
                                com.vk.instantjobs.services.a.a.post(new pn3(1, new xyx(r7xVar42.a, l)));
                                Handler handler2 = (Handler) r7xVar42.g.getValue();
                                final boolean z22 = z2;
                                final boolean z3 = z;
                                handler2.postDelayed(new Runnable() { // from class: xsna.n7x
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        r7x r7xVar5 = r7x.this;
                                        CopyOnWriteArrayList<r7x.a> copyOnWriteArrayList2 = r7xVar5.j;
                                        int i3 = 0;
                                        if (copyOnWriteArrayList2 == null || !copyOnWriteArrayList2.isEmpty()) {
                                            Iterator<r7x.a> it2 = copyOnWriteArrayList2.iterator();
                                            while (it2.hasNext()) {
                                                if (it2.next().b && (i3 = i3 + 1) < 0) {
                                                    e43.s();
                                                    throw null;
                                                }
                                            }
                                        }
                                        boolean z4 = z22;
                                        w6x w6xVar3 = w6xVar2;
                                        int i4 = l;
                                        boolean z5 = z3;
                                        if (i3 == 0) {
                                            Handler handler3 = com.vk.instantjobs.services.a.a;
                                            boolean z6 = JobsForegroundService.h;
                                            if (z6) {
                                                o7x o7xVar = new o7x(r7xVar5, z4, w6xVar3, i4, z5);
                                                if (z6) {
                                                    com.vk.instantjobs.services.a.b.add(new com.vk.instantjobs.services.b(o7xVar));
                                                    return;
                                                } else {
                                                    o7xVar.invoke();
                                                    return;
                                                }
                                            }
                                        }
                                        r7xVar5.l(z4, w6xVar3, i4, z5);
                                    }
                                }, 300L);
                            }
                            return s3q0.a;
                        }
                    });
                }
                r6xVar2.c.c(w6xVar.b());
                return;
            }
            if (!(aVar instanceof InstantJob.a.C1188a)) {
                if (!(aVar instanceof InstantJob.a.d)) {
                    throw new NoWhenBranchMatchedException();
                }
                final r7x r7xVar5 = r6x.this.h;
                synchronized (r7xVar5) {
                    r7xVar5.d();
                    r7xVar5.k(new gzs() { // from class: xsna.i7x
                        @Override // xsna.gzs
                        public final Object invoke() {
                            final r7x r7xVar42 = r7x.this;
                            final w6x w6xVar2 = w6xVar;
                            if (!r7xVar42.e(w6xVar2)) {
                                return s3q0.a;
                            }
                            CopyOnWriteArrayList<r7x.a> copyOnWriteArrayList = r7xVar42.j;
                            Iterator<r7x.a> it = copyOnWriteArrayList.iterator();
                            int i = 0;
                            while (true) {
                                if (!it.hasNext()) {
                                    i = -1;
                                    break;
                                }
                                r7x.a next = it.next();
                                int i2 = i + 1;
                                if (i < 0) {
                                    e43.t();
                                    throw null;
                                }
                                if (next.a.equals(w6xVar2)) {
                                    break;
                                }
                                i = i2;
                            }
                            if (i >= 0) {
                                copyOnWriteArrayList.remove(i);
                            }
                            final int l = w6xVar2.e.l(r7xVar42.e);
                            if (r7xVar42.f(l)) {
                                r7xVar42.h(l);
                            } else {
                                Handler handler = com.vk.instantjobs.services.a.a;
                                com.vk.instantjobs.services.a.a.post(new pn3(1, new xyx(r7xVar42.a, l)));
                                Handler handler2 = (Handler) r7xVar42.g.getValue();
                                final boolean z22 = z;
                                final boolean z3 = z2;
                                handler2.postDelayed(new Runnable() { // from class: xsna.n7x
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        r7x r7xVar52 = r7x.this;
                                        CopyOnWriteArrayList<r7x.a> copyOnWriteArrayList2 = r7xVar52.j;
                                        int i3 = 0;
                                        if (copyOnWriteArrayList2 == null || !copyOnWriteArrayList2.isEmpty()) {
                                            Iterator<r7x.a> it2 = copyOnWriteArrayList2.iterator();
                                            while (it2.hasNext()) {
                                                if (it2.next().b && (i3 = i3 + 1) < 0) {
                                                    e43.s();
                                                    throw null;
                                                }
                                            }
                                        }
                                        boolean z4 = z22;
                                        w6x w6xVar3 = w6xVar2;
                                        int i4 = l;
                                        boolean z5 = z3;
                                        if (i3 == 0) {
                                            Handler handler3 = com.vk.instantjobs.services.a.a;
                                            boolean z6 = JobsForegroundService.h;
                                            if (z6) {
                                                o7x o7xVar = new o7x(r7xVar52, z4, w6xVar3, i4, z5);
                                                if (z6) {
                                                    com.vk.instantjobs.services.a.b.add(new com.vk.instantjobs.services.b(o7xVar));
                                                    return;
                                                } else {
                                                    o7xVar.invoke();
                                                    return;
                                                }
                                            }
                                        }
                                        r7xVar52.l(z4, w6xVar3, i4, z5);
                                    }
                                }, 300L);
                            }
                            return s3q0.a;
                        }
                    });
                }
                return;
            }
            r6x r6xVar3 = r6x.this;
            final r7x r7xVar6 = r6xVar3.h;
            synchronized (r7xVar6) {
                r7xVar6.d();
                r7xVar6.k(new gzs() { // from class: xsna.i7x
                    @Override // xsna.gzs
                    public final Object invoke() {
                        final r7x r7xVar42 = r7x.this;
                        final w6x w6xVar2 = w6xVar;
                        if (!r7xVar42.e(w6xVar2)) {
                            return s3q0.a;
                        }
                        CopyOnWriteArrayList<r7x.a> copyOnWriteArrayList = r7xVar42.j;
                        Iterator<r7x.a> it = copyOnWriteArrayList.iterator();
                        int i = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                i = -1;
                                break;
                            }
                            r7x.a next = it.next();
                            int i2 = i + 1;
                            if (i < 0) {
                                e43.t();
                                throw null;
                            }
                            if (next.a.equals(w6xVar2)) {
                                break;
                            }
                            i = i2;
                        }
                        if (i >= 0) {
                            copyOnWriteArrayList.remove(i);
                        }
                        final int l = w6xVar2.e.l(r7xVar42.e);
                        if (r7xVar42.f(l)) {
                            r7xVar42.h(l);
                        } else {
                            Handler handler = com.vk.instantjobs.services.a.a;
                            com.vk.instantjobs.services.a.a.post(new pn3(1, new xyx(r7xVar42.a, l)));
                            Handler handler2 = (Handler) r7xVar42.g.getValue();
                            final boolean z22 = z;
                            final boolean z3 = z2;
                            handler2.postDelayed(new Runnable() { // from class: xsna.n7x
                                @Override // java.lang.Runnable
                                public final void run() {
                                    r7x r7xVar52 = r7x.this;
                                    CopyOnWriteArrayList<r7x.a> copyOnWriteArrayList2 = r7xVar52.j;
                                    int i3 = 0;
                                    if (copyOnWriteArrayList2 == null || !copyOnWriteArrayList2.isEmpty()) {
                                        Iterator<r7x.a> it2 = copyOnWriteArrayList2.iterator();
                                        while (it2.hasNext()) {
                                            if (it2.next().b && (i3 = i3 + 1) < 0) {
                                                e43.s();
                                                throw null;
                                            }
                                        }
                                    }
                                    boolean z4 = z22;
                                    w6x w6xVar3 = w6xVar2;
                                    int i4 = l;
                                    boolean z5 = z3;
                                    if (i3 == 0) {
                                        Handler handler3 = com.vk.instantjobs.services.a.a;
                                        boolean z6 = JobsForegroundService.h;
                                        if (z6) {
                                            o7x o7xVar = new o7x(r7xVar52, z4, w6xVar3, i4, z5);
                                            if (z6) {
                                                com.vk.instantjobs.services.a.b.add(new com.vk.instantjobs.services.b(o7xVar));
                                                return;
                                            } else {
                                                o7xVar.invoke();
                                                return;
                                            }
                                        }
                                    }
                                    r7xVar52.l(z4, w6xVar3, i4, z5);
                                }
                            }, 300L);
                        }
                        return s3q0.a;
                    }
                });
            }
            r6xVar3.c.c(w6xVar.b());
        }
    }

    /* compiled from: Comparisons.kt */
    public static final class b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return jw5.b(Long.valueOf(((t7x) t).c()), Long.valueOf(((t7x) t2).c()));
        }
    }

    public r6x(Context context, String str, jml jmlVar, r93 r93Var, ygl0 ygl0Var, sal salVar, ExecutorService executorService, p7i p7iVar, pla plaVar, Object obj) {
        this.a = str;
        this.b = jmlVar;
        this.c = ygl0Var;
        this.d = executorService;
        this.e = plaVar;
        this.f = obj;
        this.g = new u6x(salVar, p7iVar, plaVar, obj, new a());
        this.h = new r7x(context, r93Var, executorService, plaVar, obj);
    }

    public final synchronized HashSet a(String str, izs izsVar) {
        HashSet b2;
        b();
        u6x u6xVar = this.g;
        synchronized (u6xVar) {
            u6xVar.e();
            u6xVar.h("external cancel requested by '" + str + '\'');
            b2 = u6xVar.b(str, false, izsVar);
        }
        return b2;
    }

    public final synchronized void b() {
        try {
            if (this.j) {
                throw new IllegalStateException("Instance is shutdown");
            }
            if (!this.i) {
                throw new IllegalStateException("Instance is not started");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void c(String str) {
        this.e.a(str);
    }

    /* JADX WARN: Type inference failed for: r13v0, types: [com.vk.instantjobs.InstantJob] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x0092 -> B:33:0x008c). Please report as a decompilation issue!!! */
    public final synchronized void d(Throwable th) {
        Throwable th2;
        s7x<?> s7xVar;
        List<t7x> D0 = j5g.D0(new b(), this.c.getAll());
        c("found " + D0.size() + " jobs to restore");
        for (t7x t7xVar : D0) {
            try {
                jml jmlVar = this.b;
                String d = t7xVar.d();
                ny90 a2 = ny90.a.a(t7xVar.a());
                synchronized (jmlVar) {
                    try {
                        s7xVar = jmlVar.b.get(d);
                        if (s7xVar == null) {
                            th2 = th;
                            throw new JobException("No serializer for type: ".concat(d));
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        th2 = th;
                        try {
                        } catch (Throwable th4) {
                            th = th4;
                            throw th;
                        }
                        throw th;
                    }
                }
                ?? a3 = s7xVar.a(a2);
                a3.b = Integer.valueOf(t7xVar.b());
                th2 = th;
                try {
                    e(new w6x(t7xVar.b(), this.a, t7xVar.c(), th2, a3));
                } catch (Throwable th5) {
                    th = th5;
                    Throwable th6 = th;
                    m63.k(th6, th2);
                    NonRestorableJobException nonRestorableJobException = new NonRestorableJobException("Can't restore job [" + t7xVar + "] from storage", th6);
                    this.e.getClass();
                    if (pla.f(nonRestorableJobException)) {
                        com.vk.metrics.eventtracking.b.a.q(new JobException("Can't restore job", nonRestorableJobException));
                    } else {
                        L.E(new JobException("Can't restore job", nonRestorableJobException), new Object[0]);
                    }
                    this.c.c(t7xVar.b());
                    th = th2;
                }
            } catch (Throwable th7) {
                th = th7;
                th2 = th;
            }
            th = th2;
        }
    }

    public final synchronized CountDownLatch e(w6x w6xVar) {
        if (!this.h.j() && this.h.i(w6xVar.d())) {
            return new CountDownLatch(0);
        }
        c("submit job '" + w6xVar.d() + '\'');
        r7x r7xVar = this.h;
        synchronized (r7xVar) {
            r7xVar.d();
            r7xVar.k(new ks2(16, w6xVar, r7xVar));
        }
        return this.g.o(w6xVar);
    }
}
