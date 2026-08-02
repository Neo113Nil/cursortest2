package defpackage;

@gsq0
/* loaded from: classes2.dex */
public final class a8d0 {
    public static final z7d0 Companion = new z7d0();
    public final double a;
    public final double b;
    public final Double c;

    public /* synthetic */ a8d0(int i, double d, double d2, Double d3) {
        if (7 != (i & 7)) {
            qje.Z(i, 7, y7d0.a.getDescriptor());
            throw null;
        }
        this.a = d;
        this.b = d2;
        this.c = d3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a8d0)) {
            return false;
        }
        a8d0 a8d0Var = (a8d0) obj;
        return Double.compare(this.a, a8d0Var.a) == 0 && Double.compare(this.b, a8d0Var.b) == 0 && jl40.l(this.c, a8d0Var.c);
    }

    public final int hashCode() {
        int a = unr0.a(Double.hashCode(this.a) * 31, 31, this.b);
        Double d = this.c;
        return a + (d == null ? 0 : d.hashCode());
    }

    public final String toString() {
        return "PlusPayAcquisitionGeoLocationDto(lat=" + this.a + ", lon=" + this.b + ", acc=" + this.c + ')';
    }

    public a8d0(double d, double d2, Double d3) {
        this.a = d;
        this.b = d2;
        this.c = d3;
    }
}
