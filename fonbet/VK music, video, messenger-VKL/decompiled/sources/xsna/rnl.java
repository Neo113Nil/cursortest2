package xsna;

import io.opentelemetry.sdk.common.export.MemoryMode;
import io.opentelemetry.sdk.metrics.data.AggregationTemporality;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.BiConsumer;
import java.util.logging.Level;
import java.util.logging.Logger;
import xsna.jlb0;
import xsna.rnl;

/* compiled from: DefaultSynchronousMetricStorage.java */
/* loaded from: classes8.dex */
public abstract class rnl<T extends jlb0> implements gpn0 {
    public static final Logger h = Logger.getLogger(rnl.class.getName());
    public final zro0 b;
    public final s770 c;
    public final mn5 d;
    public final pb1<T> e;
    public final int f;
    public volatile boolean g;

    /* compiled from: DefaultSynchronousMetricStorage.java */
    public static class b<T extends jlb0> extends rnl<T> {
        public final MemoryMode i;
        public final ConcurrentHashMap<q94, sb1<T>> j;
        public final ArrayList<T> k;

        public b(mn5 mn5Var, pb1 pb1Var, s770 s770Var, int i, boolean z, MemoryMode memoryMode) {
            super(mn5Var, pb1Var, s770Var, i, z);
            this.j = new ConcurrentHashMap<>();
            this.k = new ArrayList<>();
            this.i = memoryMode;
        }

        @Override // xsna.fl20
        public final yk20 b(gag0 gag0Var, q8x q8xVar, final long j, final long j2) {
            ArrayList<T> arrayList;
            if (this.i == MemoryMode.REUSABLE_DATA) {
                this.k.clear();
                arrayList = this.k;
            } else {
                arrayList = new ArrayList<>(this.j.size());
            }
            final ArrayList<T> arrayList2 = arrayList;
            this.j.forEach(new BiConsumer() { // from class: xsna.snl
                @Override // java.util.function.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    jlb0 a;
                    long j3 = j;
                    long j4 = j2;
                    List list = arrayList2;
                    q94 q94Var = (q94) obj;
                    sb1 sb1Var = (sb1) obj2;
                    if (sb1Var.d && (a = sb1Var.a(j3, j4, q94Var, false)) != null) {
                        list.add(a);
                    }
                }
            });
            return (arrayList2.isEmpty() || !this.g) ? mgp.a : this.e.b(gag0Var, q8xVar, this.d, arrayList2, AggregationTemporality.CUMULATIVE);
        }

        @Override // xsna.rnl
        public final void e(double d, q94 q94Var, wmj wmjVar) {
            g(this.j, q94Var, wmjVar).f(d, q94Var, wmjVar);
        }

        @Override // xsna.rnl
        public final void f(long j, q94 q94Var, wmj wmjVar) {
            g(this.j, q94Var, wmjVar).g(j, q94Var, wmjVar);
        }

        @Override // xsna.rnl
        public final sb1<T> h() {
            return null;
        }
    }

    /* compiled from: DefaultSynchronousMetricStorage.java */
    public static class c<T extends jlb0> extends rnl<T> {
        public final lqf0 i;
        public final MemoryMode j;
        public volatile a<T> k;
        public volatile ConcurrentHashMap<q94, sb1<T>> l;
        public final ArrayList<T> m;
        public final ConcurrentLinkedQueue<sb1<T>> n;

        public c(lqf0 lqf0Var, mn5 mn5Var, pb1 pb1Var, s770 s770Var, int i, boolean z) {
            super(mn5Var, pb1Var, s770Var, i, z);
            this.k = new a<>(0);
            this.l = new ConcurrentHashMap<>();
            this.m = new ArrayList<>();
            this.n = new ConcurrentLinkedQueue<>();
            this.i = lqf0Var;
            this.j = lqf0Var.b.getMemoryMode();
        }

        @Override // xsna.fl20
        public final yk20 b(gag0 gag0Var, q8x q8xVar, long j, final long j2) {
            ArrayList<T> arrayList;
            a<T> aVar = this.k;
            this.k = this.j == MemoryMode.REUSABLE_DATA ? new a<>(this.l) : new a<>(0);
            for (int addAndGet = aVar.b.addAndGet(1); addAndGet > 1; addAndGet = aVar.b.get()) {
            }
            final ConcurrentHashMap<q94, sb1<T>> concurrentHashMap = aVar.a;
            MemoryMode memoryMode = this.j;
            MemoryMode memoryMode2 = MemoryMode.REUSABLE_DATA;
            if (memoryMode == memoryMode2) {
                this.m.clear();
                arrayList = this.m;
            } else {
                arrayList = new ArrayList<>(concurrentHashMap.size());
            }
            final ArrayList<T> arrayList2 = arrayList;
            if (this.j == memoryMode2 && concurrentHashMap.size() >= this.f) {
                concurrentHashMap.forEach(new BiConsumer() { // from class: xsna.tnl
                    @Override // java.util.function.BiConsumer
                    public final void accept(Object obj, Object obj2) {
                        ConcurrentHashMap concurrentHashMap2 = concurrentHashMap;
                        q94 q94Var = (q94) obj;
                        if (((sb1) obj2).d) {
                            return;
                        }
                        concurrentHashMap2.remove(q94Var);
                    }
                });
            }
            concurrentHashMap.forEach(new BiConsumer() { // from class: xsna.unl
                @Override // java.util.function.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    rnl.c cVar = rnl.c.this;
                    long j3 = j2;
                    List list = arrayList2;
                    q94 q94Var = (q94) obj;
                    sb1 sb1Var = (sb1) obj2;
                    if (sb1Var.d) {
                        jlb0 a = sb1Var.a(cVar.i.d, j3, q94Var, true);
                        if (cVar.j == MemoryMode.IMMUTABLE_DATA) {
                            cVar.n.offer(sb1Var);
                        }
                        if (a != null) {
                            list.add(a);
                        }
                    }
                }
            });
            int size = this.n.size() - (this.f + 1);
            for (int i = 0; i < size; i++) {
                this.n.poll();
            }
            if (this.j == MemoryMode.REUSABLE_DATA) {
                this.l = concurrentHashMap;
            }
            return (arrayList2.isEmpty() || !this.g) ? mgp.a : this.e.b(gag0Var, q8xVar, this.d, arrayList2, AggregationTemporality.DELTA);
        }

        @Override // xsna.rnl
        public final void e(double d, q94 q94Var, wmj wmjVar) {
            while (true) {
                a<T> aVar = this.k;
                if (aVar.b.addAndGet(2) % 2 == 0) {
                    AtomicInteger atomicInteger = aVar.b;
                    try {
                        g(aVar.a, q94Var, wmjVar).f(d, q94Var, wmjVar);
                        return;
                    } finally {
                        atomicInteger.addAndGet(-2);
                    }
                }
                aVar.b.addAndGet(-2);
            }
        }

        @Override // xsna.rnl
        public final void f(long j, q94 q94Var, wmj wmjVar) {
            while (true) {
                a<T> aVar = this.k;
                if (aVar.b.addAndGet(2) % 2 == 0) {
                    AtomicInteger atomicInteger = aVar.b;
                    try {
                        g(aVar.a, q94Var, wmjVar).g(j, q94Var, wmjVar);
                        return;
                    } finally {
                        atomicInteger.addAndGet(-2);
                    }
                }
                aVar.b.addAndGet(-2);
            }
        }

        @Override // xsna.rnl
        public final sb1<T> h() {
            return this.n.poll();
        }
    }

    public rnl() {
        throw null;
    }

    public rnl(mn5 mn5Var, pb1 pb1Var, s770 s770Var, int i, boolean z) {
        this.b = new zro0(h);
        this.d = mn5Var;
        this.e = pb1Var;
        this.c = s770Var;
        this.f = i - 1;
        this.g = z;
    }

    @Override // xsna.n3y0
    public final void a(long j, q94 q94Var, wmj wmjVar) {
        if (this.g) {
            f(j, q94Var, wmjVar);
        }
    }

    @Override // xsna.n3y0
    public final void c(double d, q94 q94Var, wmj wmjVar) {
        if (this.g) {
            if (!Double.isNaN(d)) {
                e(d, q94Var, wmjVar);
                return;
            }
            this.b.a(Level.FINE, "Instrument " + this.d.f.c + " has recorded measurement Not-a-Number (NaN) value with attributes " + q94Var + ". Dropping measurement.", null);
        }
    }

    @Override // xsna.fl20
    public final zk20 d() {
        return this.d;
    }

    public abstract void e(double d, q94 q94Var, wmj wmjVar);

    public abstract void f(long j, q94 q94Var, wmj wmjVar);

    public final sb1<T> g(ConcurrentHashMap<q94, sb1<T>> concurrentHashMap, q94 q94Var, wmj wmjVar) {
        Objects.requireNonNull(q94Var, "attributes");
        q94 r = this.c.r(q94Var);
        sb1<T> sb1Var = concurrentHashMap.get(r);
        if (sb1Var != null) {
            return sb1Var;
        }
        int size = concurrentHashMap.size();
        int i = this.f;
        if (size >= i) {
            this.b.a(Level.WARNING, "Instrument " + this.d.f.c + " has exceeded the maximum allowed cardinality (" + i + ").", null);
            r = fl20.a;
            sb1<T> sb1Var2 = concurrentHashMap.get(r);
            if (sb1Var2 != null) {
                return sb1Var2;
            }
        }
        sb1<T> h2 = h();
        if (h2 == null) {
            h2 = this.e.e();
        }
        sb1<T> putIfAbsent = concurrentHashMap.putIfAbsent(r, h2);
        return putIfAbsent != null ? putIfAbsent : h2;
    }

    public abstract sb1<T> h();

    /* compiled from: DefaultSynchronousMetricStorage.java */
    public static class a<T extends jlb0> {
        public final ConcurrentHashMap<q94, sb1<T>> a;
        public final AtomicInteger b;

        public a(int i) {
            this.b = new AtomicInteger(0);
            this.a = new ConcurrentHashMap<>();
        }

        public a(ConcurrentHashMap concurrentHashMap) {
            this.b = new AtomicInteger(0);
            this.a = concurrentHashMap;
        }
    }
}
