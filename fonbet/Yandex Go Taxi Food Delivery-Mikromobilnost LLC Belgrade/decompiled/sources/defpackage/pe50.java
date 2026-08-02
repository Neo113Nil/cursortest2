package defpackage;

import java.util.List;
import kotlin.collections.builders.ListBuilder;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class pe50 {
    public final oe50 a;
    public final List b;

    public pe50(oe50 oe50Var, List list) {
        this.a = oe50Var;
        this.b = list;
    }

    public static pe50 a(pe50 pe50Var, oe50 oe50Var, List list, int i) {
        if ((i & 1) != 0) {
            oe50Var = pe50Var.a;
        }
        if ((i & 2) != 0) {
            list = pe50Var.b;
        }
        pe50Var.getClass();
        return new pe50(oe50Var, list);
    }

    public final pe50 b(ne50 ne50Var, Integer num) {
        ListBuilder a = rcc.a();
        a.addAll(this.b);
        if (num != null) {
            a.add(num.intValue(), ne50Var);
        } else {
            a.add(ne50Var);
        }
        return a(this, null, a.j(), 1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pe50)) {
            return false;
        }
        pe50 pe50Var = (pe50) obj;
        return jl40.l(this.a, pe50Var.a) && jl40.l(this.b, pe50Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "NavigatorRoute(sourceAddress=" + this.a + ", routeStopAddresses=" + this.b + Extension.C_BRAKE;
    }
}
