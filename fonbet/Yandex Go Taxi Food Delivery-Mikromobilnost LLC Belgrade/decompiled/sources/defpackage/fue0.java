package defpackage;

@gsq0
/* loaded from: classes2.dex */
public final class fue0 {
    public static final eue0 Companion = new eue0();
    public final q3k0 a;
    public final q3k0 b;
    public final q3k0 c;
    public final q3k0 d;
    public final q3k0 e;
    public final long f;
    public final q3k0 g;
    public final q3k0 h;
    public final q3k0 i;
    public final String j;
    public final String k;
    public final String l;
    public final spd m;

    public /* synthetic */ fue0(int i, q3k0 q3k0Var, q3k0 q3k0Var2, q3k0 q3k0Var3, q3k0 q3k0Var4, q3k0 q3k0Var5, long j, q3k0 q3k0Var6, q3k0 q3k0Var7, q3k0 q3k0Var8, String str, String str2, String str3, spd spdVar) {
        if (8191 != (i & 8191)) {
            qje.Z(i, 8191, due0.a.getDescriptor());
            throw null;
        }
        this.a = q3k0Var;
        this.b = q3k0Var2;
        this.c = q3k0Var3;
        this.d = q3k0Var4;
        this.e = q3k0Var5;
        this.f = j;
        this.g = q3k0Var6;
        this.h = q3k0Var7;
        this.i = q3k0Var8;
        this.j = str;
        this.k = str2;
        this.l = str3;
        this.m = spdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fue0)) {
            return false;
        }
        fue0 fue0Var = (fue0) obj;
        return jl40.l(this.a, fue0Var.a) && jl40.l(this.b, fue0Var.b) && jl40.l(this.c, fue0Var.c) && jl40.l(this.d, fue0Var.d) && jl40.l(this.e, fue0Var.e) && this.f == fue0Var.f && jl40.l(this.g, fue0Var.g) && jl40.l(this.h, fue0Var.h) && jl40.l(this.i, fue0Var.i) && jl40.l(this.j, fue0Var.j) && jl40.l(this.k, fue0Var.k) && jl40.l(this.l, fue0Var.l) && jl40.l(this.m, fue0Var.m);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        q3k0 q3k0Var = this.b;
        return this.m.hashCode() + unr0.b(unr0.b(unr0.b((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + qv10.c((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((hashCode + (q3k0Var == null ? 0 : q3k0Var.hashCode())) * 31)) * 31)) * 31)) * 31, 31, this.f)) * 31)) * 31)) * 31, 31, this.j), 31, this.k), 31, this.l);
    }

    public final String toString() {
        return "PresaleDto(loadingTitle=" + this.a + ", benefitTitle=" + this.b + ", periodTitle=" + this.c + ", price=" + this.d + ", presaleAdditionalTitle=" + this.e + ", loadingDelayMillis=" + this.f + ", acceptAdditionalButtonText=" + this.g + ", acceptButtonText=" + this.h + ", rejectButtonText=" + this.i + ", batchId=" + this.j + ", eventSessionId=" + this.k + ", presaleTarget=" + this.l + ", offer=" + this.m + ')';
    }
}
