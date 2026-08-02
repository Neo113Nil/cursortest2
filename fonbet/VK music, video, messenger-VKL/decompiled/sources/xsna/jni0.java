package xsna;

import androidx.health.connect.client.aggregate.AggregateMetric;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import xsna.dqk;
import xsna.gkk0;
import xsna.lni0;
import xsna.r0l0;

/* compiled from: SeriesRecordAggregationExtensions.kt */
/* loaded from: classes12.dex */
public final class jni0<T extends lni0<?>> implements jb1<T> {
    public final Set<AggregateMetric<?>> a;
    public final cvo0<?> b;
    public Double d;
    public Double e;
    public final s71<? extends Comparable<?>> g;
    public final ht5 c = new ht5(0);
    public final LinkedHashSet f = new LinkedHashSet();

    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.util.Map] */
    public jni0(rfc rfcVar, Set set, cvo0 cvo0Var) {
        this.a = set;
        this.b = cvo0Var;
        s71<? extends Comparable<?>> s71Var = (s71) mni0.a.get(rfcVar);
        if (s71Var == null) {
            throw new IllegalArgumentException("Non supported fallback series record " + rfcVar);
        }
        this.g = s71Var;
        if (rl3.y0(new AggregateMetric[]{s71Var.a, s71Var.b, s71Var.c}).containsAll(set)) {
            return;
        }
        StringBuilder sb = new StringBuilder("Invalid set of metrics ");
        Set set2 = set;
        ArrayList arrayList = new ArrayList(c5g.u(set2, 10));
        Iterator it = set2.iterator();
        while (it.hasNext()) {
            arrayList.add(((AggregateMetric) it.next()).a());
        }
        sb.append(arrayList);
        throw new IllegalStateException(sb.toString().toString());
    }

    @Override // xsna.jb1
    public final androidx.health.connect.client.aggregate.c a() {
        Map linkedHashMap;
        double doubleValue;
        LinkedHashSet linkedHashSet = this.f;
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
                s71<? extends Comparable<?>> s71Var = this.g;
                if (aggregateMetric.equals(s71Var.a)) {
                    doubleValue = this.c.b / r3.a;
                } else if (aggregateMetric.equals(s71Var.c)) {
                    doubleValue = this.e.doubleValue();
                } else {
                    if (!aggregateMetric.equals(s71Var.b)) {
                        throw new IllegalStateException(("Invalid fallback aggregation metric " + aggregateMetric.a()).toString());
                    }
                    doubleValue = this.d.doubleValue();
                }
                linkedHashMap.put(a, Double.valueOf(doubleValue));
            }
        }
        return new androidx.health.connect.client.aggregate.c(jgpVar, linkedHashMap, linkedHashSet);
    }

    @Override // xsna.jb1
    public final void b(zef0 zef0Var) {
        Instant instant;
        lni0 lni0Var = (lni0) zef0Var;
        List K = lni0Var.K();
        ArrayList arrayList = new ArrayList();
        for (Object obj : K) {
            if (obj instanceof dqk.a) {
                instant = ((dqk.a) obj).a;
            } else if (obj instanceof gkk0.d) {
                instant = ((gkk0.d) obj).a;
            } else {
                if (!(obj instanceof r0l0.a)) {
                    throw new IllegalStateException(rqi.c(obj, "Unsupported type for time: "));
                }
                instant = ((r0l0.a) obj).a;
            }
            if (fz5.u(instant, this.b, lni0Var.d())) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            double b = tb1.b(next);
            ht5 ht5Var = this.c;
            ht5Var.a++;
            ht5Var.b += b;
            Double d = this.d;
            this.d = Double.valueOf(Math.min(d != null ? d.doubleValue() : tb1.b(next), tb1.b(next)));
            Double d2 = this.e;
            this.e = Double.valueOf(Math.max(d2 != null ? d2.doubleValue() : tb1.b(next), tb1.b(next)));
        }
        this.f.add(lni0Var.getMetadata().c);
    }
}
