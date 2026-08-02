package defpackage;

/* loaded from: classes12.dex */
public final class iu40 implements ju40 {
    public final String a;
    public final o2y0 b;

    public iu40(o2y0 o2y0Var, String str) {
        this.a = str;
        this.b = o2y0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof iu40) {
            iu40 iu40Var = (iu40) obj;
            return jl40.l(this.a, iu40Var.a) && this.b == iu40Var.b;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "TransportTrackingCard(routeType=" + this.a + ", taxiOrderHolder=" + this.b + ", isOpenedFromTaxiOrderScreen=true)";
    }
}
