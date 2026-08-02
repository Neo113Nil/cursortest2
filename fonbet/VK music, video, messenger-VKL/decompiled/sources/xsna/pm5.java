package xsna;

import java.util.List;

/* compiled from: AutoValue_ImmutableLongPointData.java */
/* loaded from: classes8.dex */
public final class pm5 extends zow {
    public final long a;
    public final long b;
    public final q94 c;
    public final long d;
    public final List<g300> e;

    public pm5(long j, long j2, q94 q94Var, long j3, List<g300> list) {
        this.a = j;
        this.b = j2;
        if (q94Var == null) {
            throw new NullPointerException("Null attributes");
        }
        this.c = q94Var;
        this.d = j3;
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
        if (obj instanceof zow) {
            zow zowVar = (zow) obj;
            if (this.a == ((pm5) zowVar).a) {
                pm5 pm5Var = (pm5) zowVar;
                if (this.b == pm5Var.b && this.c.equals(pm5Var.c) && this.d == pm5Var.d && this.e.equals(pm5Var.e)) {
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

    @Override // xsna.v300
    public final long getValue() {
        return this.d;
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        int hashCode = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.c.hashCode()) * 1000003;
        long j3 = this.d;
        return ((hashCode ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003) ^ this.e.hashCode();
    }

    @Override // xsna.jlb0
    public final List<g300> o() {
        return this.e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImmutableLongPointData{startEpochNanos=");
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
