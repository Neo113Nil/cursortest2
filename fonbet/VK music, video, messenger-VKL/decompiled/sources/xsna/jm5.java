package xsna;

import java.util.List;

/* compiled from: AutoValue_ImmutableExponentialHistogramPointData.java */
/* loaded from: classes8.dex */
public final class jm5 extends kow {
    public final long a;
    public final long b;
    public final q94 c;
    public final int d;
    public final double e;
    public final long f;
    public final long g;
    public final boolean h;
    public final double i;
    public final boolean j;
    public final double k;
    public final naq l;
    public final naq m;
    public final List<j6o> n;

    public jm5(long j, long j2, q94 q94Var, int i, double d, long j3, long j4, boolean z, double d2, boolean z2, double d3, naq naqVar, naq naqVar2, List<j6o> list) {
        this.a = j;
        this.b = j2;
        if (q94Var == null) {
            throw new NullPointerException("Null getAttributes");
        }
        this.c = q94Var;
        this.d = i;
        this.e = d;
        this.f = j3;
        this.g = j4;
        this.h = z;
        this.i = d2;
        this.j = z2;
        this.k = d3;
        this.l = naqVar;
        this.m = naqVar2;
        if (list == null) {
            throw new NullPointerException("Null getExemplars");
        }
        this.n = list;
    }

    @Override // xsna.paq
    public final double a() {
        return this.e;
    }

    @Override // xsna.jlb0
    public final long b() {
        return this.b;
    }

    @Override // xsna.paq
    public final int c() {
        return this.d;
    }

    @Override // xsna.paq
    public final boolean d() {
        return this.h;
    }

    @Override // xsna.paq
    public final double e() {
        return this.i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kow) {
            kow kowVar = (kow) obj;
            if (this.a == ((jm5) kowVar).a) {
                jm5 jm5Var = (jm5) kowVar;
                if (this.b == jm5Var.b && this.c.equals(jm5Var.c) && this.d == jm5Var.d && Double.doubleToLongBits(this.e) == Double.doubleToLongBits(jm5Var.e) && this.f == jm5Var.f && this.g == jm5Var.g && this.h == jm5Var.h && Double.doubleToLongBits(this.i) == Double.doubleToLongBits(jm5Var.i) && this.j == jm5Var.j && Double.doubleToLongBits(this.k) == Double.doubleToLongBits(jm5Var.k) && this.l.equals(jm5Var.l) && this.m.equals(jm5Var.m) && this.n.equals(jm5Var.n)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // xsna.paq
    public final boolean f() {
        return this.j;
    }

    @Override // xsna.jlb0
    public final long g() {
        return this.a;
    }

    @Override // xsna.jlb0
    public final q94 getAttributes() {
        return this.c;
    }

    @Override // xsna.paq
    public final long getCount() {
        return this.f;
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        int hashCode = (((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d) * 1000003;
        double d = this.e;
        int doubleToLongBits = (hashCode ^ ((int) (Double.doubleToLongBits(d) ^ (Double.doubleToLongBits(d) >>> 32)))) * 1000003;
        long j3 = this.f;
        int i = (doubleToLongBits ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        long j4 = this.g;
        int i2 = (i ^ ((int) (j4 ^ (j4 >>> 32)))) * 1000003;
        int i3 = this.h ? 1231 : 1237;
        double d2 = this.i;
        int doubleToLongBits2 = (((i2 ^ i3) * 1000003) ^ ((int) (Double.doubleToLongBits(d2) ^ (Double.doubleToLongBits(d2) >>> 32)))) * 1000003;
        int i4 = this.j ? 1231 : 1237;
        double d3 = this.k;
        return ((((((((doubleToLongBits2 ^ i4) * 1000003) ^ ((int) (Double.doubleToLongBits(d3) ^ (Double.doubleToLongBits(d3) >>> 32)))) * 1000003) ^ this.l.hashCode()) * 1000003) ^ this.m.hashCode()) * 1000003) ^ this.n.hashCode();
    }

    @Override // xsna.paq
    public final double i() {
        return this.k;
    }

    @Override // xsna.paq
    public final naq k() {
        return this.m;
    }

    @Override // xsna.paq
    public final long l() {
        return this.g;
    }

    @Override // xsna.paq
    public final naq m() {
        return this.l;
    }

    @Override // xsna.jlb0
    public final List<j6o> o() {
        return this.n;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImmutableExponentialHistogramPointData{getStartEpochNanos=");
        sb.append(this.a);
        sb.append(", getEpochNanos=");
        sb.append(this.b);
        sb.append(", getAttributes=");
        sb.append(this.c);
        sb.append(", getScale=");
        sb.append(this.d);
        sb.append(", getSum=");
        sb.append(this.e);
        sb.append(", getCount=");
        sb.append(this.f);
        sb.append(", getZeroCount=");
        sb.append(this.g);
        sb.append(", hasMin=");
        sb.append(this.h);
        sb.append(", getMin=");
        sb.append(this.i);
        sb.append(", hasMax=");
        sb.append(this.j);
        sb.append(", getMax=");
        sb.append(this.k);
        sb.append(", getPositiveBuckets=");
        sb.append(this.l);
        sb.append(", getNegativeBuckets=");
        sb.append(this.m);
        sb.append(", getExemplars=");
        return vp.b("}", sb, this.n);
    }
}
