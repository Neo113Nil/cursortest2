package xsna;

import androidx.health.connect.client.aggregate.AggregateMetric;
import java.util.Set;

/* compiled from: AggregateRequest.kt */
/* loaded from: classes12.dex */
public final class t71 {
    public final Set<AggregateMetric<?>> a;
    public final dvo0 b;
    public final Set<luk> c;

    /* JADX WARN: Multi-variable type inference failed */
    public t71(Set<? extends AggregateMetric<?>> set, dvo0 dvo0Var, Set<luk> set2) {
        this.a = set;
        this.b = dvo0Var;
        this.c = set2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!t71.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        t71 t71Var = (t71) obj;
        return epx.f(this.a, t71Var.a) && epx.f(this.b, t71Var.b) && epx.f(this.c, t71Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
