package defpackage;

/* loaded from: classes11.dex */
public final class e84 extends cwk0 {
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final long f;

    public e84(String str, String str2, String str3, String str4, long j) {
        if (str == null) {
            ny61.t("Null rolloutId");
            throw null;
        }
        this.b = str;
        if (str2 == null) {
            ny61.t("Null parameterKey");
            throw null;
        }
        this.c = str2;
        this.d = str3;
        if (str4 == null) {
            ny61.t("Null variantId");
            throw null;
        }
        this.e = str4;
        this.f = j;
    }

    @Override // defpackage.cwk0
    public final String b() {
        return this.c;
    }

    @Override // defpackage.cwk0
    public final String c() {
        return this.d;
    }

    @Override // defpackage.cwk0
    public final String d() {
        return this.b;
    }

    @Override // defpackage.cwk0
    public final long e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cwk0)) {
            return false;
        }
        cwk0 cwk0Var = (cwk0) obj;
        return this.b.equals(cwk0Var.d()) && this.c.equals(cwk0Var.b()) && this.d.equals(cwk0Var.c()) && this.e.equals(cwk0Var.f()) && this.f == cwk0Var.e();
    }

    @Override // defpackage.cwk0
    public final String f() {
        return this.e;
    }

    public final int hashCode() {
        int hashCode = (((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003;
        long j = this.f;
        return ((int) ((j >>> 32) ^ j)) ^ hashCode;
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
        return oyr.n(this.f, "}", sb);
    }
}
