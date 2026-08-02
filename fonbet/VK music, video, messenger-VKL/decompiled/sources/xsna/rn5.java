package xsna;

/* compiled from: AutoValue_RolloutAssignment.java */
/* loaded from: classes13.dex */
public final class rn5 extends rlg0 {
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final long f;

    public rn5(String str, String str2, String str3, String str4, long j) {
        if (str == null) {
            throw new NullPointerException("Null rolloutId");
        }
        this.b = str;
        if (str2 == null) {
            throw new NullPointerException("Null parameterKey");
        }
        this.c = str2;
        if (str3 == null) {
            throw new NullPointerException("Null parameterValue");
        }
        this.d = str3;
        if (str4 == null) {
            throw new NullPointerException("Null variantId");
        }
        this.e = str4;
        this.f = j;
    }

    @Override // xsna.rlg0
    public final String b() {
        return this.c;
    }

    @Override // xsna.rlg0
    public final String c() {
        return this.d;
    }

    @Override // xsna.rlg0
    public final String d() {
        return this.b;
    }

    @Override // xsna.rlg0
    public final long e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof rlg0)) {
            return false;
        }
        rlg0 rlg0Var = (rlg0) obj;
        return this.b.equals(rlg0Var.d()) && this.c.equals(rlg0Var.b()) && this.d.equals(rlg0Var.c()) && this.e.equals(rlg0Var.f()) && this.f == rlg0Var.e();
    }

    @Override // xsna.rlg0
    public final String f() {
        return this.e;
    }

    public final int hashCode() {
        int hashCode = (((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003;
        long j = this.f;
        return hashCode ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RolloutAssignment{rolloutId=");
        sb.append(this.b);
        sb.append(", parameterKey=");
        sb.append(this.c);
        sb.append(", parameterValue=");
        sb.append(this.d);
        sb.append(", variantId=");
        sb.append(this.e);
        sb.append(", templateVersion=");
        return efz.b(this.f, "}", sb);
    }
}
