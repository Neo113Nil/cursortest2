package xsna;

import androidx.health.connect.client.aggregate.AggregateMetric;
import androidx.health.platform.client.proto.l;
import androidx.health.platform.client.proto.p0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* compiled from: AggregateRequestToProto.kt */
/* loaded from: classes12.dex */
public final class u71 {
    public static final androidx.health.platform.client.proto.p0 a(o71 o71Var) {
        p0.a x = androidx.health.platform.client.proto.p0.x();
        androidx.health.platform.client.proto.b1 a = evo0.a(o71Var.b);
        x.j();
        androidx.health.platform.client.proto.p0.t((androidx.health.platform.client.proto.p0) x.c, a);
        ArrayList c = c(o71Var.d);
        x.j();
        androidx.health.platform.client.proto.p0.v((androidx.health.platform.client.proto.p0) x.c, c);
        Set<AggregateMetric<?>> set = o71Var.a;
        ArrayList arrayList = new ArrayList(c5g.u(set, 10));
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(r71.a((AggregateMetric) it.next()));
        }
        x.j();
        androidx.health.platform.client.proto.p0.u((androidx.health.platform.client.proto.p0) x.c, arrayList);
        long millis = o71Var.c.toMillis();
        x.j();
        androidx.health.platform.client.proto.p0.w((androidx.health.platform.client.proto.p0) x.c, millis);
        return x.e();
    }

    public static final androidx.health.platform.client.proto.p0 b(t71 t71Var) {
        p0.a x = androidx.health.platform.client.proto.p0.x();
        androidx.health.platform.client.proto.b1 a = evo0.a(t71Var.b);
        x.j();
        androidx.health.platform.client.proto.p0.t((androidx.health.platform.client.proto.p0) x.c, a);
        ArrayList c = c(t71Var.c);
        x.j();
        androidx.health.platform.client.proto.p0.v((androidx.health.platform.client.proto.p0) x.c, c);
        Set<AggregateMetric<?>> set = t71Var.a;
        ArrayList arrayList = new ArrayList(c5g.u(set, 10));
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(r71.a((AggregateMetric) it.next()));
        }
        x.j();
        androidx.health.platform.client.proto.p0.u((androidx.health.platform.client.proto.p0) x.c, arrayList);
        return x.e();
    }

    public static final ArrayList c(Set set) {
        Set<luk> set2 = set;
        ArrayList arrayList = new ArrayList(c5g.u(set2, 10));
        for (luk lukVar : set2) {
            l.a w = androidx.health.platform.client.proto.l.w();
            String str = lukVar.a;
            w.j();
            androidx.health.platform.client.proto.l.t((androidx.health.platform.client.proto.l) w.c, str);
            arrayList.add(w.e());
        }
        return arrayList;
    }
}
