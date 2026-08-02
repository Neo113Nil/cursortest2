package xsna;

import androidx.health.connect.client.aggregate.AggregateMetric;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: BloodPressureAggregationExtensions.kt */
/* loaded from: classes12.dex */
public final class ig7 implements jb1<jg7> {
    public final Set<AggregateMetric<?>> a;
    public final LinkedHashMap b = new LinkedHashMap();
    public final LinkedHashMap c = new LinkedHashMap();
    public final LinkedHashSet d = new LinkedHashSet();

    /* JADX WARN: Multi-variable type inference failed */
    public ig7(Set<? extends AggregateMetric<?>> set) {
        this.a = set;
        if (!hg7.a.containsAll(set)) {
            StringBuilder sb = new StringBuilder("Invalid set of blood pressure fallback aggregation metrics ");
            Set<? extends AggregateMetric<?>> set2 = set;
            ArrayList arrayList = new ArrayList(c5g.u(set2, 10));
            Iterator it = set2.iterator();
            while (it.hasNext()) {
                arrayList.add(((AggregateMetric) it.next()).a());
            }
            sb.append(arrayList);
            throw new IllegalStateException(sb.toString().toString());
        }
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            AggregateMetric aggregateMetric = (AggregateMetric) it2.next();
            if (epx.f(aggregateMetric, jg7.q) || epx.f(aggregateMetric, jg7.n)) {
                this.b.put(aggregateMetric, new ht5(0));
            } else {
                if (!epx.f(aggregateMetric, jg7.s) && !epx.f(aggregateMetric, jg7.r) && !epx.f(aggregateMetric, jg7.p) && !epx.f(aggregateMetric, jg7.o)) {
                    throw new IllegalStateException(("Invalid blood pressure fallback aggregation metric " + aggregateMetric.a()).toString());
                }
                this.c.put(aggregateMetric, null);
            }
        }
    }

    @Override // xsna.jb1
    public final androidx.health.connect.client.aggregate.c a() {
        Map linkedHashMap;
        double d;
        LinkedHashSet linkedHashSet = this.d;
        boolean isEmpty = linkedHashSet.isEmpty();
        jgp jgpVar = jgp.b;
        if (isEmpty) {
            linkedHashMap = jgpVar;
        } else {
            Set<AggregateMetric<?>> set = this.a;
            int e = on00.e(c5g.u(set, 10));
            if (e < 16) {
                e = 16;
            }
            linkedHashMap = new LinkedHashMap(e);
            Iterator<T> it = set.iterator();
            while (it.hasNext()) {
                AggregateMetric aggregateMetric = (AggregateMetric) it.next();
                String a = aggregateMetric.a();
                if (aggregateMetric.equals(jg7.q) || aggregateMetric.equals(jg7.n)) {
                    d = ((ht5) this.b.get(aggregateMetric)).b / r3.a;
                } else {
                    if (!aggregateMetric.equals(jg7.s) && !aggregateMetric.equals(jg7.r) && !aggregateMetric.equals(jg7.p) && !aggregateMetric.equals(jg7.o)) {
                        throw new IllegalStateException(("Invalid blood pressure fallback aggregation type " + aggregateMetric.a()).toString());
                    }
                    d = ((Number) this.c.get(aggregateMetric)).doubleValue();
                }
                linkedHashMap.put(a, Double.valueOf(d));
            }
        }
        return new androidx.health.connect.client.aggregate.c(jgpVar, linkedHashMap, linkedHashSet);
    }

    @Override // xsna.jb1
    public final void b(jg7 jg7Var) {
        jg7 jg7Var2 = jg7Var;
        double d = jg7Var2.e.b;
        double d2 = jg7Var2.d.b;
        for (AggregateMetric<?> aggregateMetric : this.a) {
            boolean f = epx.f(aggregateMetric, jg7.q);
            LinkedHashMap linkedHashMap = this.b;
            if (f) {
                ht5 ht5Var = (ht5) linkedHashMap.get(aggregateMetric);
                ht5Var.a++;
                ht5Var.b += d;
            } else {
                boolean f2 = epx.f(aggregateMetric, jg7.s);
                LinkedHashMap linkedHashMap2 = this.c;
                if (f2) {
                    Double d3 = (Double) linkedHashMap2.get(aggregateMetric);
                    linkedHashMap2.put(aggregateMetric, Double.valueOf(Math.max(d3 != null ? d3.doubleValue() : d, d)));
                } else if (epx.f(aggregateMetric, jg7.r)) {
                    Double d4 = (Double) linkedHashMap2.get(aggregateMetric);
                    linkedHashMap2.put(aggregateMetric, Double.valueOf(Math.min(d4 != null ? d4.doubleValue() : d, d)));
                } else if (epx.f(aggregateMetric, jg7.n)) {
                    ht5 ht5Var2 = (ht5) linkedHashMap.get(aggregateMetric);
                    ht5Var2.a++;
                    ht5Var2.b += d2;
                } else if (epx.f(aggregateMetric, jg7.p)) {
                    Double d5 = (Double) linkedHashMap2.get(aggregateMetric);
                    linkedHashMap2.put(aggregateMetric, Double.valueOf(Math.max(d5 != null ? d5.doubleValue() : d2, d2)));
                } else if (epx.f(aggregateMetric, jg7.o)) {
                    Double d6 = (Double) linkedHashMap2.get(aggregateMetric);
                    linkedHashMap2.put(aggregateMetric, Double.valueOf(Math.min(d6 != null ? d6.doubleValue() : d2, d2)));
                }
            }
            this.d.add(jg7Var2.c.c);
        }
    }
}
