package xsna;

import java.util.List;

/* compiled from: MutableExponentialHistogramPointData.java */
/* loaded from: classes8.dex */
public final class jg50 implements paq {
    public long a;
    public long b;
    public q94 c;
    public int d;
    public double e;
    public long f;
    public long g;
    public boolean h;
    public double i;
    public boolean j;
    public double k;
    public naq l;
    public naq m;
    public List<j6o> n;

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
        if (!(obj instanceof paq)) {
            return false;
        }
        paq paqVar = (paq) obj;
        return this.a == paqVar.g() && this.b == paqVar.b() && this.c.equals(paqVar.getAttributes()) && this.d == paqVar.c() && Double.doubleToLongBits(this.e) == Double.doubleToLongBits(paqVar.a()) && this.f == paqVar.getCount() && this.g == paqVar.l() && this.h == paqVar.d() && Double.doubleToLongBits(this.i) == Double.doubleToLongBits(paqVar.e()) && this.j == paqVar.f() && Double.doubleToLongBits(this.k) == Double.doubleToLongBits(paqVar.i()) && this.l.equals(paqVar.m()) && this.m.equals(paqVar.k()) && this.n.equals(paqVar.o());
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
        int hashCode = (((((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.e) >>> 32) ^ Double.doubleToLongBits(this.e)))) * 1000003;
        long j3 = this.f;
        int i = (hashCode ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        long j4 = this.g;
        return ((((((((((((((i ^ ((int) (j4 ^ (j4 >>> 32)))) * 1000003) ^ (this.h ? 1231 : 1237)) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.i) >>> 32) ^ Double.doubleToLongBits(this.i)))) * 1000003) ^ (this.j ? 1231 : 1237)) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.k) >>> 32) ^ Double.doubleToLongBits(this.k)))) * 1000003) ^ this.l.hashCode()) * 1000003) ^ this.m.hashCode()) * 1000003) ^ this.n.hashCode();
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

    public final void p(int i, double d, long j, boolean z, double d2, boolean z2, double d3, naq naqVar, naq naqVar2, long j2, long j3, q94 q94Var, List list) {
        this.f = naqVar2.getTotalCount() + naqVar.getTotalCount() + j;
        this.d = i;
        this.e = d;
        this.g = j;
        this.h = z;
        this.i = d2;
        this.j = z2;
        this.k = d3;
        this.l = naqVar;
        this.m = naqVar2;
        this.a = j2;
        this.b = j3;
        this.c = q94Var;
        this.n = list;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MutableExponentialHistogramPointData{startEpochNanos=");
        sb.append(this.a);
        sb.append(", epochNanos=");
        sb.append(this.b);
        sb.append(", attributes=");
        sb.append(this.c);
        sb.append(", scale=");
        sb.append(this.d);
        sb.append(", sum=");
        sb.append(this.e);
        sb.append(", count=");
        sb.append(this.f);
        sb.append(", zeroCount=");
        sb.append(this.g);
        sb.append(", hasMin=");
        sb.append(this.h);
        sb.append(", min=");
        sb.append(this.i);
        sb.append(", hasMax=");
        sb.append(this.j);
        sb.append(", max=");
        sb.append(this.k);
        sb.append(", positiveBuckets=");
        sb.append(this.l);
        sb.append(", negativeBuckets=");
        sb.append(this.m);
        sb.append(", exemplars=");
        return vp.b("}", sb, this.n);
    }
}
