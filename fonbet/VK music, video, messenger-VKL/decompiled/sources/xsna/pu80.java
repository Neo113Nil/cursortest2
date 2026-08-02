package xsna;

/* compiled from: OrderDependencies.kt */
/* loaded from: classes18.dex */
public final class pu80 {
    public final sdz a;
    public final f0p0 b;

    public pu80(sdz sdzVar, f0p0 f0p0Var) {
        this.a = sdzVar;
        this.b = f0p0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pu80)) {
            return false;
        }
        pu80 pu80Var = (pu80) obj;
        return epx.f(this.a, pu80Var.a) && epx.f(this.b, pu80Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OrderDependencies(linksParser=" + this.a + ", toDeliveryPointMapper=" + this.b + ')';
    }
}
