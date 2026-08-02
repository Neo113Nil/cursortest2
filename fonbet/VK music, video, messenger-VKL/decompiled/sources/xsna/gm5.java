package xsna;

/* compiled from: AutoValue_ImmutableEventData.java */
/* loaded from: classes8.dex */
public final class gm5 extends how {
    public final String a;
    public final q94 b;
    public final long c;
    public final int d;

    public gm5(String str, q94 q94Var, long j, int i) {
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        this.a = str;
        if (q94Var == null) {
            throw new NullPointerException("Null attributes");
        }
        this.b = q94Var;
        this.c = j;
        this.d = i;
    }

    @Override // xsna.pyp
    public final int a() {
        return this.d;
    }

    @Override // xsna.pyp
    public final long b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof how) {
            how howVar = (how) obj;
            if (this.a.equals(((gm5) howVar).a)) {
                gm5 gm5Var = (gm5) howVar;
                if (this.b.equals(gm5Var.b) && this.c == gm5Var.c && this.d == gm5Var.d) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // xsna.pyp
    public final q94 getAttributes() {
        return this.b;
    }

    @Override // xsna.pyp
    public final String getName() {
        return this.a;
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        long j = this.c;
        return ((hashCode ^ ((int) ((j >>> 32) ^ j))) * 1000003) ^ this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImmutableEventData{name=");
        sb.append(this.a);
        sb.append(", attributes=");
        sb.append(this.b);
        sb.append(", epochNanos=");
        sb.append(this.c);
        sb.append(", totalAttributeCount=");
        return h5s.c(this.d, "}", sb);
    }
}
