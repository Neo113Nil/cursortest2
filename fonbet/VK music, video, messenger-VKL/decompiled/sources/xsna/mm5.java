package xsna;

import java.util.List;

/* compiled from: AutoValue_ImmutableHistogramPointData.java */
/* loaded from: classes8.dex */
public final class mm5 extends pow {
    public final long a;
    public final long b;
    public final q94 c;
    public final double d;
    public final long e;
    public final boolean f;
    public final double g;
    public final boolean h;
    public final double i;
    public final List<Double> j;
    public final List<Long> k;
    public final List<j6o> l;

    public mm5(long j, long j2, q94 q94Var, double d, long j3, boolean z, double d2, boolean z2, double d3, List<Double> list, List<Long> list2, List<j6o> list3) {
        this.a = j;
        this.b = j2;
        if (q94Var == null) {
            throw new NullPointerException("Null getAttributes");
        }
        this.c = q94Var;
        this.d = d;
        this.e = j3;
        this.f = z;
        this.g = d2;
        this.h = z2;
        this.i = d3;
        if (list == null) {
            throw new NullPointerException("Null getBoundaries");
        }
        this.j = list;
        if (list2 == null) {
            throw new NullPointerException("Null getCounts");
        }
        this.k = list2;
        if (list3 == null) {
            throw new NullPointerException("Null getExemplars");
        }
        this.l = list3;
    }

    @Override // xsna.v7v
    public final double a() {
        return this.d;
    }

    @Override // xsna.jlb0
    public final long b() {
        return this.b;
    }

    @Override // xsna.v7v
    public final boolean d() {
        return this.f;
    }

    @Override // xsna.v7v
    public final double e() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof pow) {
            pow powVar = (pow) obj;
            if (this.a == ((mm5) powVar).a) {
                mm5 mm5Var = (mm5) powVar;
                if (this.b == mm5Var.b && this.c.equals(mm5Var.c) && Double.doubleToLongBits(this.d) == Double.doubleToLongBits(mm5Var.d) && this.e == mm5Var.e && this.f == mm5Var.f && Double.doubleToLongBits(this.g) == Double.doubleToLongBits(mm5Var.g) && this.h == mm5Var.h && Double.doubleToLongBits(this.i) == Double.doubleToLongBits(mm5Var.i) && this.j.equals(mm5Var.j) && this.k.equals(mm5Var.k) && this.l.equals(mm5Var.l)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // xsna.v7v
    public final boolean f() {
        return this.h;
    }

    @Override // xsna.jlb0
    public final long g() {
        return this.a;
    }

    @Override // xsna.jlb0
    public final q94 getAttributes() {
        return this.c;
    }

    @Override // xsna.v7v
    public final long getCount() {
        return this.e;
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        int hashCode = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.c.hashCode()) * 1000003;
        double d = this.d;
        int doubleToLongBits = (hashCode ^ ((int) (Double.doubleToLongBits(d) ^ (Double.doubleToLongBits(d) >>> 32)))) * 1000003;
        long j3 = this.e;
        int i = (doubleToLongBits ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        int i2 = this.f ? 1231 : 1237;
        double d2 = this.g;
        int doubleToLongBits2 = (((i ^ i2) * 1000003) ^ ((int) (Double.doubleToLongBits(d2) ^ (Double.doubleToLongBits(d2) >>> 32)))) * 1000003;
        int i3 = this.h ? 1231 : 1237;
        double d3 = this.i;
        return ((((((((doubleToLongBits2 ^ i3) * 1000003) ^ ((int) (Double.doubleToLongBits(d3) ^ (Double.doubleToLongBits(d3) >>> 32)))) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.k.hashCode()) * 1000003) ^ this.l.hashCode();
    }

    @Override // xsna.v7v
    public final double i() {
        return this.i;
    }

    @Override // xsna.v7v
    public final List<Long> j() {
        return this.k;
    }

    @Override // xsna.v7v
    public final List<Double> n() {
        return this.j;
    }

    @Override // xsna.jlb0
    public final List<j6o> o() {
        return this.l;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImmutableHistogramPointData{getStartEpochNanos=");
        sb.append(this.a);
        sb.append(", getEpochNanos=");
        sb.append(this.b);
        sb.append(", getAttributes=");
        sb.append(this.c);
        sb.append(", getSum=");
        sb.append(this.d);
        sb.append(", getCount=");
        sb.append(this.e);
        sb.append(", hasMin=");
        sb.append(this.f);
        sb.append(", getMin=");
        sb.append(this.g);
        sb.append(", hasMax=");
        sb.append(this.h);
        sb.append(", getMax=");
        sb.append(this.i);
        sb.append(", getBoundaries=");
        sb.append(this.j);
        sb.append(", getCounts=");
        sb.append(this.k);
        sb.append(", getExemplars=");
        return vp.b("}", sb, this.l);
    }
}
