package xsna;

/* compiled from: AutoValue_ImmutableDoubleExemplarData.java */
/* loaded from: classes8.dex */
public final class em5 extends dow {
    public final q94 a;
    public final long b;
    public final qhk0 c;
    public final double d;

    public em5(q94 q94Var, long j, qhk0 qhk0Var, double d) {
        if (q94Var == null) {
            throw new NullPointerException("Null filteredAttributes");
        }
        this.a = q94Var;
        this.b = j;
        if (qhk0Var == null) {
            throw new NullPointerException("Null spanContext");
        }
        this.c = qhk0Var;
        this.d = d;
    }

    @Override // xsna.c4q
    public final q94 a() {
        return this.a;
    }

    @Override // xsna.c4q
    public final long b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dow) {
            dow dowVar = (dow) obj;
            if (this.a.equals(((em5) dowVar).a)) {
                em5 em5Var = (em5) dowVar;
                if (this.b == em5Var.b && this.c.equals(em5Var.c) && Double.doubleToLongBits(this.d) == Double.doubleToLongBits(em5Var.d)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // xsna.j6o
    public final double getValue() {
        return this.d;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        long j = this.b;
        int hashCode2 = (((hashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.c.hashCode()) * 1000003;
        double d = this.d;
        return hashCode2 ^ ((int) (Double.doubleToLongBits(d) ^ (Double.doubleToLongBits(d) >>> 32)));
    }

    @Override // xsna.c4q
    public final qhk0 i() {
        return this.c;
    }

    public final String toString() {
        return "ImmutableDoubleExemplarData{filteredAttributes=" + this.a + ", epochNanos=" + this.b + ", spanContext=" + this.c + ", value=" + this.d + "}";
    }
}
