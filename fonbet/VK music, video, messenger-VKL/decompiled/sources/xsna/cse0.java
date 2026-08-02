package xsna;

import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.collections.EmptyList;

/* compiled from: QueueSyncManagerImpl.kt */
/* loaded from: classes.dex */
public final class cse0 implements vre0 {
    public final gzs<UserId> a;
    public final gzs<l7r0> b;
    public final ExecutorService c;
    public final wuj d;
    public final gzs<dox> e;
    public final gzs<mui0> f;
    public zqe0 h;
    public Future<?> k;
    public boolean p;
    public final Object g = new Object();
    public final qre0 i = new qre0();
    public final bpn0 j = new bpn0(new m(10));
    public final AtomicLong l = new AtomicLong(0);
    public final ArrayList m = new ArrayList();
    public final ArrayList n = new ArrayList();
    public final ArrayList o = new ArrayList();
    public final CountDownLatch q = new CountDownLatch(1);

    /* compiled from: QueueSyncManagerImpl.kt */
    /* loaded from: classes5.dex */
    public static final class a implements sq9 {
        public final cse0 a;
        public final zwm0<?> b;
        public CountDownLatch c;

        public a(cse0 cse0Var, zwm0<?> zwm0Var) {
            this.a = cse0Var;
            this.b = zwm0Var;
        }

        @Override // xsna.sq9
        public final synchronized CountDownLatch cancel() {
            try {
                if (this.c == null) {
                    this.c = this.a.i(Collections.singletonList(this.b));
                }
            } catch (Throwable th) {
                throw th;
            }
            return this.c;
        }

        @Override // xsna.sq9
        public final synchronized boolean isCancelled() {
            return this.c != null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public cse0(gzs<UserId> gzsVar, gzs<? extends l7r0> gzsVar2, ExecutorService executorService, wuj wujVar, gzs<? extends dox> gzsVar3, gzs<? extends mui0> gzsVar4) {
        this.a = gzsVar;
        this.b = gzsVar2;
        this.c = executorService;
        this.d = wujVar;
        this.e = gzsVar3;
        this.f = gzsVar4;
        this.h = new hll(gzsVar, gzsVar2, executorService, gzsVar4);
    }

    @Override // xsna.vre0
    public final CountDownLatch b() {
        CountDownLatch i;
        synchronized (this) {
            i = i(i7o0.a(this.m));
        }
        return i;
    }

    @Override // xsna.vre0
    public final a c(dre0 dre0Var, Object obj, gzs gzsVar, izs izsVar, gzs gzsVar2, izs izsVar2) {
        zwm0 zwm0Var;
        synchronized (this.g) {
            if (this.p) {
                throw new IllegalStateException("Manager shutdown");
            }
            zwm0Var = new zwm0(dre0Var, dre0Var.b(), obj, new ig(27), new kr50(gzsVar, 20), new ggk(izsVar, 1), new zyb0(1, gzsVar2), new ci6(izsVar2, 3));
            g(Collections.singletonList(zwm0Var), EmptyList.b);
        }
        return new a(this, zwm0Var);
    }

    @Override // xsna.vre0
    public final io.reactivex.rxjava3.internal.operators.observable.q d(dre0 dre0Var, gzs gzsVar, z7w z7wVar) {
        return xx1.a(this, dre0Var, gzsVar, z7wVar);
    }

    @Override // xsna.vre0
    public final CountDownLatch f(String str) {
        CountDownLatch i;
        synchronized (this.g) {
            try {
                ArrayList arrayList = this.m;
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (epx.f(((zwm0) next).a(), str)) {
                        arrayList2.add(next);
                    }
                }
                i = i(arrayList2);
            } catch (Throwable th) {
                throw th;
            }
        }
        return i;
    }

    public final CountDownLatch g(Collection<? extends zwm0<?>> collection, Collection<? extends zwm0<?>> collection2) {
        if (collection.isEmpty() && collection2.isEmpty()) {
            return new CountDownLatch(0);
        }
        Future<?> future = this.k;
        if (future != null) {
            future.cancel(true);
        }
        Iterator<T> it = collection2.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            bpn0 bpn0Var = this.j;
            if (!hasNext) {
                CountDownLatch countDownLatch = new CountDownLatch(1);
                ((ExecutorService) bpn0Var.getValue()).submit(new ic3(countDownLatch, 8));
                ArrayList arrayList = this.m;
                arrayList.addAll(collection);
                g5g.D(arrayList, true, new ase0(0, collection2));
                ArrayList arrayList2 = this.n;
                arrayList2.addAll(collection);
                g5g.D(arrayList2, true, new or50(collection2, 15));
                ArrayList arrayList3 = this.o;
                arrayList3.addAll(collection);
                g5g.D(arrayList3, true, new bbw(collection2, 26));
                this.k = ((ExecutorService) bpn0Var.getValue()).submit(new hv2(this, 11));
                return countDownLatch;
            }
            ((ExecutorService) bpn0Var.getValue()).submit(new hod((zwm0) it.next(), 10));
        }
    }

    public final CountDownLatch h() {
        synchronized (this.g) {
            try {
                if (!this.p) {
                    b();
                    this.p = true;
                    ((ExecutorService) this.j.getValue()).submit(new z27(this, 10));
                    ((ExecutorService) this.j.getValue()).shutdown();
                }
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.q;
    }

    public final CountDownLatch i(Collection<? extends zwm0<?>> collection) {
        synchronized (this.g) {
            if (this.p) {
                return this.q;
            }
            return g(EmptyList.b, collection);
        }
    }
}
