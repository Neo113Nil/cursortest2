package xsna;

/* compiled from: AutoValue_InstrumentationScopeInfo.java */
/* loaded from: classes8.dex */
public final class bn5 extends q8x {
    public final String b;
    public final String c;
    public final String d;
    public final q94 e;

    public bn5(String str, String str2, String str3, q94 q94Var) {
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        this.b = str;
        this.c = str2;
        this.d = str3;
        if (q94Var == null) {
            throw new NullPointerException("Null attributes");
        }
        this.e = q94Var;
    }

    @Override // xsna.q8x
    public final q94 b() {
        return this.e;
    }

    @Override // xsna.q8x
    public final String c() {
        return this.b;
    }

    @Override // xsna.q8x
    public final String d() {
        return this.d;
    }

    @Override // xsna.q8x
    public final String e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q8x)) {
            return false;
        }
        q8x q8xVar = (q8x) obj;
        if (!this.b.equals(q8xVar.c())) {
            return false;
        }
        String str = this.c;
        if (str == null) {
            if (q8xVar.e() != null) {
                return false;
            }
        } else if (!str.equals(q8xVar.e())) {
            return false;
        }
        String str2 = this.d;
        if (str2 == null) {
            if (q8xVar.d() != null) {
                return false;
            }
        } else if (!str2.equals(q8xVar.d())) {
            return false;
        }
        return this.e.equals(q8xVar.b());
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() ^ 1000003) * 1000003;
        String str = this.c;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.d;
        return ((hashCode2 ^ (str2 != null ? str2.hashCode() : 0)) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        return "InstrumentationScopeInfo{name=" + this.b + ", version=" + this.c + ", schemaUrl=" + this.d + ", attributes=" + this.e + "}";
    }
}
