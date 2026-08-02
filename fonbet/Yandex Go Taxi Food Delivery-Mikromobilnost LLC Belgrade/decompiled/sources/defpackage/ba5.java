package defpackage;

/* loaded from: classes13.dex */
public final class ba5 {
    public static final cdc h = new cdc(-1);
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final ca5 e;
    public final bdc f;
    public final kdc g;

    public ba5(int i, String str, String str2, String str3, ca5 ca5Var, bdc bdcVar) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = ca5Var;
        this.f = bdcVar;
        this.g = bdcVar != null ? new bdc(bdcVar.a) : new cdc(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ba5)) {
            return false;
        }
        ba5 ba5Var = (ba5) obj;
        return this.a == ba5Var.a && jl40.l(this.b, ba5Var.b) && jl40.l(this.c, ba5Var.c) && jl40.l(this.d, ba5Var.d) && jl40.l(this.e, ba5Var.e) && jl40.l(this.f, ba5Var.f);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        ca5 ca5Var = this.e;
        int hashCode5 = (hashCode4 + (ca5Var == null ? 0 : ca5Var.hashCode())) * 31;
        bdc bdcVar = this.f;
        return hashCode5 + (bdcVar != null ? Integer.hashCode(bdcVar.a) : 0);
    }

    public /* synthetic */ ba5(int i) {
        this(i, null, null, null, null, null);
    }
}
