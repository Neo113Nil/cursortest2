package xsna;

import java.util.List;

/* compiled from: AutoValue_ImmutableDoublePointData.java */
/* loaded from: classes8.dex */
public final class fm5 extends eow {
    public final long a;
    public final long b;
    public final q94 c;
    public final double d;
    public final List<j6o> e;

    public fm5(long j, long j2, q94 q94Var, double d, List<j6o> list) {
        this.a = j;
        this.b = j2;
        if (q94Var == null) {
            throw new NullPointerException("Null attributes");
        }
        this.c = q94Var;
        this.d = d;
        if (list == null) {
            throw new NullPointerException("Null exemplars");
        }
        this.e = list;
    }

    @Override // xsna.jlb0
    public final long b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eow) {
            eow eowVar = (eow) obj;
            if (this.a == ((fm5) eowVar).a) {
                fm5 fm5Var = (fm5) eowVar;
                if (this.b == fm5Var.b && this.c.equals(fm5Var.c) && Double.doubleToLongBits(this.d) == Double.doubleToLongBits(fm5Var.d) && this.e.equals(fm5Var.e)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // xsna.jlb0
    public final long g() {
        return this.a;
    }

    @Override // xsna.jlb0
    public final q94 getAttributes() {
        return this.c;
    }

    @Override // xsna.u6o
    public final double getValue() {
        return this.d;
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        int hashCode = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.c.hashCode()) * 1000003;
        double d = this.d;
        return ((hashCode ^ ((int) (Double.doubleToLongBits(d) ^ (Double.doubleToLongBits(d) >>> 32)))) * 1000003) ^ this.e.hashCode();
    }

    @Override // xsna.jlb0
    public final List<j6o> o() {
        return this.e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImmutableDoublePointData{startEpochNanos=");
        sb.append(this.a);
        sb.append(", epochNanos=");
        sb.append(this.b);
        sb.append(", attributes=");
        sb.append(this.c);
        sb.append(", value=");
        sb.append(this.d);
        sb.append(", exemplars=");
        return vp.b("}", sb, this.e);
    }
}
