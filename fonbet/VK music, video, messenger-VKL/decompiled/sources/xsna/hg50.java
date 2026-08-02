package xsna;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* compiled from: MutableDoublePointData.java */
/* loaded from: classes8.dex */
public final class hg50 implements u6o {
    public long a;
    public long b;
    public double d;
    public q94 c = jk3.e;
    public List<j6o> e = Collections.EMPTY_LIST;

    @Override // xsna.jlb0
    public final long b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u6o)) {
            return false;
        }
        u6o u6oVar = (u6o) obj;
        return this.a == u6oVar.g() && this.b == u6oVar.b() && Double.doubleToLongBits(this.d) == Double.doubleToLongBits(u6oVar.getValue()) && Objects.equals(this.c, u6oVar.getAttributes()) && Objects.equals(this.e, u6oVar.o());
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
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        long j2 = this.b;
        return ((((((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.c.hashCode()) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.d) >>> 32) ^ Double.doubleToLongBits(this.d)))) * 1000003) ^ this.e.hashCode();
    }

    @Override // xsna.jlb0
    public final List<j6o> o() {
        return this.e;
    }

    public final void p(u6o u6oVar) {
        long g = u6oVar.g();
        long b = u6oVar.b();
        q94 attributes = u6oVar.getAttributes();
        double value = u6oVar.getValue();
        List o = u6oVar.o();
        this.a = g;
        this.b = b;
        this.c = attributes;
        this.d = value;
        this.e = o;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MutableDoublePointData{startEpochNanos=");
        sb.append(this.a);
        sb.append(", epochNanos=");
        sb.append(this.b);
        sb.append(", attributes=");
        sb.append(this.c);
        sb.append(", value=");
        sb.append(this.d);
        sb.append(", exemplars=");
        return ms9.a('}', sb, this.e);
    }
}
