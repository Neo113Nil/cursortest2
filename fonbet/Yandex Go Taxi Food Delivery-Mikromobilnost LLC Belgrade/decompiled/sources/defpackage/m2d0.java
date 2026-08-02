package defpackage;

import com.yandex.plus.core.config.Environment;
import com.yandex.plus.core.graphql.internal.b;
import java.util.Map;

/* loaded from: classes8.dex */
public final class m2d0 {
    public final Environment a;
    public final ike b;
    public final jse c;
    public final zhf d;
    public final b e;
    public final kzs f;
    public final sls g;
    public final Map h;
    public final pgz i;
    public final long j;

    public m2d0(Environment environment, ike ikeVar, jse jseVar, zhf zhfVar, b bVar, kzs kzsVar, sls slsVar, Map map, pgz pgzVar, long j) {
        this.a = environment;
        this.b = ikeVar;
        this.c = jseVar;
        this.d = zhfVar;
        this.e = bVar;
        this.f = kzsVar;
        this.g = slsVar;
        this.h = map;
        this.i = pgzVar;
        this.j = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m2d0) {
            m2d0 m2d0Var = (m2d0) obj;
            if (this.a == m2d0Var.a && this.b == m2d0Var.b && jl40.l(this.c, m2d0Var.c) && jl40.l(this.d, m2d0Var.d) && jl40.l(this.e, m2d0Var.e) && jl40.l(this.f, m2d0Var.f) && this.g.equals(m2d0Var.g) && jl40.l(this.h, m2d0Var.h) && jl40.l(this.i, m2d0Var.i) && e3n.d(this.j, m2d0Var.j)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.i.hashCode() + unr0.d(nnm.a((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31, 31, this.g), 31, this.h)) * 31;
        o430 o430Var = e3n.b;
        return qv10.c(hashCode, 961, this.j);
    }

    public final String toString() {
        return "Dependencies(environment=" + this.a + ", coroutineScope=" + this.b + ", ioDispatcher=" + this.c + ", currentTimeProvider=" + this.d + ", apolloClientWrapper=" + this.e + ", geoLocationInputFactory=" + this.f + ", getPuid=" + this.g + ", experimentsRequestParams=" + this.h + ", logger=" + this.i + ", experimentsLifeTime=" + ((Object) e3n.p(this.j)) + ", testIdsOverride=null, flagsOverride=null)";
    }
}
