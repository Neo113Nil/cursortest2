package xsna;

import java.util.Collections;
import java.util.List;

/* compiled from: MutableHistogramPointData.java */
/* loaded from: classes8.dex */
public final class lg50 implements v7v {
    public long a;
    public long b;
    public q94 c = jk3.e;
    public double d;
    public long e;
    public boolean f;
    public double g;
    public boolean h;
    public double i;
    public List<Double> j;
    public final oqo k;
    public List<j6o> l;

    public lg50(int i) {
        List list = Collections.EMPTY_LIST;
        this.j = list;
        this.l = list;
        oqo oqoVar = new oqo(i);
        this.k = oqoVar;
        oqoVar.d(i);
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
        if (!(obj instanceof v7v)) {
            return false;
        }
        v7v v7vVar = (v7v) obj;
        return this.a == v7vVar.g() && this.b == v7vVar.b() && this.c.equals(v7vVar.getAttributes()) && Double.doubleToLongBits(this.d) == Double.doubleToLongBits(v7vVar.a()) && this.e == v7vVar.getCount() && this.f == v7vVar.d() && Double.doubleToLongBits(this.g) == Double.doubleToLongBits(v7vVar.e()) && this.h == v7vVar.f() && Double.doubleToLongBits(this.i) == Double.doubleToLongBits(v7vVar.i()) && this.j.equals(v7vVar.n()) && this.k.equals(v7vVar.j()) && this.l.equals(v7vVar.o());
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
        int hashCode = (((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.c.hashCode()) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.d) >>> 32) ^ Double.doubleToLongBits(this.d)))) * 1000003;
        long j3 = this.e;
        return ((((((((((((((hashCode ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ (this.f ? 1231 : 1237)) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.g) >>> 32) ^ Double.doubleToLongBits(this.g)))) * 1000003) ^ (this.h ? 1231 : 1237)) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.i) >>> 32) ^ Double.doubleToLongBits(this.i)))) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.k.hashCode()) * 1000003) ^ this.l.hashCode();
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

    public final void p(long j, long j2, q94 q94Var, double d, boolean z, double d2, boolean z2, double d3, List list, long[] jArr, List list2) {
        oqo oqoVar = this.k;
        if (oqoVar.d != list.size() + 1) {
            StringBuilder sb = new StringBuilder("invalid boundaries: size should be ");
            sb.append(oqoVar.d - 1);
            sb.append(" but was ");
            sb.append(list.size());
            throw new IllegalArgumentException(sb.toString());
        }
        if (oqoVar.d != jArr.length) {
            throw new IllegalArgumentException("invalid counts: size should be " + oqoVar.d + " but was " + jArr.length);
        }
        sdi.z(list);
        sdi.y(list);
        long j3 = 0;
        for (long j4 : jArr) {
            j3 += j4;
        }
        this.a = j;
        this.b = j2;
        this.c = q94Var;
        this.d = d;
        this.e = j3;
        this.f = z;
        this.g = d2;
        this.h = z2;
        this.i = d3;
        this.j = list;
        for (int i = 0; i < jArr.length; i++) {
            oqoVar.setLong(i, jArr[i]);
        }
        this.l = list2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MutableHistogramPointData{startEpochNanos=");
        sb.append(this.a);
        sb.append(", epochNanos=");
        sb.append(this.b);
        sb.append(", attributes=");
        sb.append(this.c);
        sb.append(", sum=");
        sb.append(this.d);
        sb.append(", count=");
        sb.append(this.e);
        sb.append(", hasMin=");
        sb.append(this.f);
        sb.append(", min=");
        sb.append(this.g);
        sb.append(", hasMax=");
        sb.append(this.h);
        sb.append(", max=");
        sb.append(this.i);
        sb.append(", boundaries=");
        sb.append(this.j);
        sb.append(", counts=");
        sb.append(this.k);
        sb.append(", exemplars=");
        return vp.b("}", sb, this.l);
    }
}
