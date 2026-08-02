package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.a;
import kotlin.time.DurationUnit;
import ru.yandex.taxi.masstransit.datasource.routing.MtTransportType;

/* loaded from: classes6.dex */
public final class kj40 {
    public final zuj0 a;
    public final jtq0 b;

    public kj40(zuj0 zuj0Var, jtq0 jtq0Var) {
        this.a = zuj0Var;
        this.b = jtq0Var;
    }

    public static String e(int i, List list) {
        return a.X(a.A0(list, i), null, null, null, new ej40(2), 31);
    }

    public final String a(int i, List list) {
        List<n940> A0 = a.A0(list, i);
        ArrayList arrayList = new ArrayList(tcc.n(A0, 10));
        for (n940 n940Var : A0) {
            o430 o430Var = e3n.b;
            long o = e3n.o(kp50.V(e3n.e(kp50.V(n940Var.a, DurationUnit.SECONDS)) - this.b.d(), DurationUnit.MILLISECONDS), DurationUnit.MINUTES);
            if (o < 1) {
                o = 1;
            }
            arrayList.add(Long.valueOf(o));
        }
        return g8e.p(a.X(arrayList, null, null, null, null, 63), " ", ((avj0) this.a).h(kyh0.date_format_min));
    }

    public final String b(List list) {
        if (list.isEmpty()) {
            return "";
        }
        n940 n940Var = (n940) a.P(list);
        o430 o430Var = e3n.b;
        long o = e3n.o(kp50.V(e3n.e(kp50.V(n940Var.a, DurationUnit.SECONDS)) - this.b.d(), DurationUnit.MILLISECONDS), DurationUnit.MINUTES);
        zuj0 zuj0Var = this.a;
        if (o < 1) {
            return ((avj0) zuj0Var).h(kyh0.mt_route_details_v2_transport_arriving);
        }
        if (o >= 60) {
            return ((avj0) zuj0Var).i(kyh0.mt_route_details_v2_estimated_hours_minutes, Long.valueOf(o / 60), Long.valueOf(o % 60));
        }
        return o + " " + ((avj0) zuj0Var).h(kyh0.date_format_min);
    }

    public final String c(String str, MtTransportType mtTransportType) {
        Integer valueOf = Integer.valueOf(aqb1.b(mtTransportType));
        if (valueOf.intValue() == 0) {
            valueOf = null;
        }
        String h = valueOf != null ? ((avj0) this.a).h(valueOf.intValue()) : null;
        return h != null ? g8e.p(h, " ", str) : str;
    }

    public final String d(uy30 uy30Var) {
        String str = uy30Var.c;
        if (str == null || str.length() == 0) {
            str = null;
        }
        zuj0 zuj0Var = this.a;
        if (str != null) {
            return ((avj0) zuj0Var).i(kyh0.mt_interval, str);
        }
        double d = uy30Var.d;
        if (d <= 0.0d) {
            return null;
        }
        int i = (int) d;
        if (i < 1) {
            i = 1;
        }
        String h = ((avj0) zuj0Var).h(kyh0.date_format_min);
        return ((avj0) zuj0Var).i(kyh0.mt_interval, i + " " + h);
    }
}
