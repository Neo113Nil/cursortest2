package xsna;

import java.util.LinkedHashSet;
import kotlin.Pair;

/* compiled from: NutritionAggregationExtensions.kt */
/* loaded from: classes12.dex */
public final class tip0 implements jb1<yn70> {
    public final cvo0<?> a;
    public double b;
    public final LinkedHashSet c = new LinkedHashSet();

    public tip0(cvo0<?> cvo0Var) {
        this.a = cvo0Var;
    }

    @Override // xsna.jb1
    public final androidx.health.connect.client.aggregate.c a() {
        LinkedHashSet linkedHashSet = this.c;
        boolean isEmpty = linkedHashSet.isEmpty();
        jgp jgpVar = jgp.b;
        return new androidx.health.connect.client.aggregate.c(jgpVar, isEmpty ? jgpVar : on00.f(new Pair(yn70.I0.a(), Double.valueOf(this.b))), linkedHashSet);
    }

    @Override // xsna.jb1
    public final void b(yn70 yn70Var) {
        yn70 yn70Var2 = yn70Var;
        this.b = (tb1.c(yn70Var2, this.a) * yn70Var2.L.a()) + this.b;
        this.c.add(yn70Var2.e.c);
    }
}
