package xsna;

/* compiled from: AutoValue_ImmutableLongExemplarData.java */
/* loaded from: classes8.dex */
public final class om5 extends yow {
    public final q94 a;
    public final long b;
    public final qhk0 c;
    public final long d;

    public om5(q94 q94Var, long j, qhk0 qhk0Var, long j2) {
        if (q94Var == null) {
            throw new NullPointerException("Null filteredAttributes");
        }
        this.a = q94Var;
        this.b = j;
        if (qhk0Var == null) {
            throw new NullPointerException("Null spanContext");
        }
        this.c = qhk0Var;
        this.d = j2;
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
        if (obj instanceof yow) {
            yow yowVar = (yow) obj;
            if (this.a.equals(((om5) yowVar).a)) {
                om5 om5Var = (om5) yowVar;
                if (this.b == om5Var.b && this.c.equals(om5Var.c) && this.d == om5Var.d) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // xsna.g300
    public final long getValue() {
        return this.d;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        long j = this.b;
        int hashCode2 = (((hashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.c.hashCode()) * 1000003;
        long j2 = this.d;
        return hashCode2 ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    @Override // xsna.c4q
    public final qhk0 i() {
        return this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImmutableLongExemplarData{filteredAttributes=");
        sb.append(this.a);
        sb.append(", epochNanos=");
        sb.append(this.b);
        sb.append(", spanContext=");
        sb.append(this.c);
        sb.append(", value=");
        return efz.b(this.d, "}", sb);
    }
}
