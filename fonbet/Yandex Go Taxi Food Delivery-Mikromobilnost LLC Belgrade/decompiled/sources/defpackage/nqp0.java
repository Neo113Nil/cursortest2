package defpackage;

/* loaded from: classes2.dex */
public final class nqp0 extends crp0 {
    public final int c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    public nqp0(int i, String str, String str2, String str3, String str4) {
        super("Network", oyr.i(i, "code="));
        this.c = i;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = str4;
    }

    @Override // defpackage.crp0
    public final Object c() {
        return null;
    }

    @Override // defpackage.crp0
    public final String d() {
        return this.g;
    }

    public final int e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nqp0)) {
            return false;
        }
        nqp0 nqp0Var = (nqp0) obj;
        return this.c == nqp0Var.c && jl40.l(this.d, nqp0Var.d) && jl40.l(this.e, nqp0Var.e) && jl40.l(this.f, nqp0Var.f) && jl40.l(this.g, nqp0Var.g);
    }

    public final String f() {
        return this.d;
    }

    public final String g() {
        return this.f;
    }

    public final String h() {
        return this.e;
    }

    public final int hashCode() {
        int b = unr0.b(Integer.hashCode(this.c) * 31, 31, this.d);
        String str = this.e;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        return unr0.b((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.g);
    }

    public final String toString() {
        StringBuilder v = unr0.v(this.c, "Network(code=", ", message=", this.d, ", traceId=");
        g8e.D(v, this.e, ", retryPolicyId=", this.f, ", url=");
        return oyr.t(v, this.g, ", payload=null)");
    }
}
