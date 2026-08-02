package xsna;

import io.opentelemetry.sdk.common.export.MemoryMode;
import io.opentelemetry.sdk.metrics.data.AggregationTemporality;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.logging.Level;
import java.util.logging.Logger;
import xsna.jlb0;

/* compiled from: AsynchronousMetricStorage.java */
/* loaded from: classes8.dex */
public final class m04<T extends jlb0> implements fl20 {
    public static final Logger v = Logger.getLogger(m04.class.getName());
    public final lqf0 c;
    public final mn5 d;
    public final AggregationTemporality e;
    public final pb1<T> f;
    public final s770 g;
    public final MemoryMode h;
    public final int i;
    public final Map<q94, sb1<T>> j;
    public Map<q94, T> k;
    public final ju4 l;
    public final ju4 m;
    public final f04 n;
    public final g04 o;
    public final h04 p;
    public long s;
    public long t;
    public volatile boolean u;
    public final zro0 b = new zro0(v);
    public final ArrayList q = new ArrayList();
    public Map<q94, T> r = new pvb0();

    /* JADX WARN: Type inference failed for: r4v6, types: [xsna.f04] */
    /* JADX WARN: Type inference failed for: r4v7, types: [xsna.g04] */
    /* JADX WARN: Type inference failed for: r4v8, types: [xsna.h04] */
    public m04(lqf0 lqf0Var, mn5 mn5Var, final pb1 pb1Var, s770 s770Var, int i, boolean z) {
        this.c = lqf0Var;
        this.d = mn5Var;
        this.e = lqf0Var.b.getAggregationTemporality(mn5Var.f.f);
        MemoryMode memoryMode = lqf0Var.b.getMemoryMode();
        this.h = memoryMode;
        this.f = pb1Var;
        this.g = s770Var;
        this.i = i - 1;
        this.u = z;
        Objects.requireNonNull(pb1Var);
        this.l = new ju4(new Supplier() { // from class: xsna.d04
            @Override // java.util.function.Supplier
            public final Object get() {
                return pb1.this.a();
            }
        });
        this.m = new ju4(new Supplier() { // from class: xsna.e04
            @Override // java.util.function.Supplier
            public final Object get() {
                return pb1.this.e();
            }
        });
        this.n = new Function() { // from class: xsna.f04
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return (sb1) m04.this.m.a();
            }
        };
        this.o = new BiConsumer() { // from class: xsna.g04
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                m04.this.m.d((sb1) obj2);
            }
        };
        this.p = new BiConsumer() { // from class: xsna.h04
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                m04.this.l.d((jlb0) obj2);
            }
        };
        if (memoryMode == MemoryMode.REUSABLE_DATA) {
            this.k = new pvb0();
            this.j = new pvb0();
        } else {
            this.k = new HashMap();
            this.j = new HashMap();
        }
    }

    public final q94 a(q94 q94Var) {
        int size = this.j.size();
        int i = this.i;
        if (size < i) {
            wmj.current();
            return this.g.r(q94Var);
        }
        this.b.a(Level.WARNING, "Instrument " + this.d.f.c + " has exceeded the maximum allowed cardinality (" + i + ").", null);
        return fl20.a;
    }

    @Override // xsna.fl20
    public final yk20 b(gag0 gag0Var, q8x q8xVar, long j, long j2) {
        final ArrayList arrayList;
        Map<q94, T> hashMap;
        if (this.e == AggregationTemporality.DELTA) {
            arrayList = this.q;
            MemoryMode memoryMode = this.h;
            MemoryMode memoryMode2 = MemoryMode.REUSABLE_DATA;
            if (memoryMode == memoryMode2) {
                final ju4 ju4Var = this.l;
                Objects.requireNonNull(ju4Var);
                arrayList.forEach(new Consumer() { // from class: xsna.i04
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        ju4.this.d((jlb0) obj);
                    }
                });
                arrayList.clear();
                hashMap = this.r;
            } else {
                hashMap = new HashMap<>();
            }
            this.j.forEach(new j04(0, this, hashMap));
            if (memoryMode != memoryMode2) {
                arrayList = new ArrayList();
            }
            hashMap.forEach(new BiConsumer() { // from class: xsna.k04
                @Override // java.util.function.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    jlb0 jlb0Var = (jlb0) obj2;
                    m04 m04Var = m04.this;
                    MemoryMode memoryMode3 = m04Var.h;
                    pb1<T> pb1Var = m04Var.f;
                    jlb0 jlb0Var2 = (jlb0) m04Var.k.remove((q94) obj);
                    if (jlb0Var2 == null) {
                        if (memoryMode3 == MemoryMode.REUSABLE_DATA) {
                            jlb0Var2 = (jlb0) m04Var.l.a();
                            pb1Var.d(jlb0Var, jlb0Var2);
                            jlb0Var = jlb0Var2;
                        }
                    } else if (memoryMode3 == MemoryMode.REUSABLE_DATA) {
                        pb1Var.c(jlb0Var2, jlb0Var);
                        jlb0Var = jlb0Var2;
                    } else {
                        jlb0Var = pb1Var.f(jlb0Var2, jlb0Var);
                    }
                    arrayList.add(jlb0Var);
                }
            });
            if (memoryMode == memoryMode2) {
                this.k.forEach(this.p);
                this.k.clear();
                Map<q94, T> map = this.k;
                this.k = this.r;
                this.r = map;
            } else {
                this.k = hashMap;
            }
        } else {
            arrayList = this.q;
            if (this.h == MemoryMode.REUSABLE_DATA) {
                arrayList.clear();
            } else {
                arrayList = new ArrayList();
            }
            this.j.forEach(new BiConsumer() { // from class: xsna.l04
                @Override // java.util.function.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    q94 q94Var = (q94) obj;
                    m04 m04Var = m04.this;
                    arrayList.add(((sb1) obj2).a(m04Var.s, m04Var.t, q94Var, true));
                }
            });
        }
        ArrayList arrayList2 = arrayList;
        this.j.forEach(this.o);
        this.j.clear();
        return this.u ? this.f.b(gag0Var, q8xVar, this.d, arrayList2, this.e) : mgp.a;
    }

    @Override // xsna.fl20
    public final zk20 d() {
        return this.d;
    }
}
