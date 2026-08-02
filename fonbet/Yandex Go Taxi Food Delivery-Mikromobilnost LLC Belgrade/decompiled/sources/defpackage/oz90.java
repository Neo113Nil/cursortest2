package defpackage;

/* loaded from: classes2.dex */
public final class oz90 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final sz90 e;
    public final mz90 f;
    public final mz90 g;

    public oz90(String str, String str2, String str3, String str4, sz90 sz90Var, mz90 mz90Var, mz90 mz90Var2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = sz90Var;
        this.f = mz90Var;
        this.g = mz90Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oz90)) {
            return false;
        }
        oz90 oz90Var = (oz90) obj;
        return jl40.l(this.a, oz90Var.a) && jl40.l(this.b, oz90Var.b) && jl40.l(this.c, oz90Var.c) && jl40.l(this.d, oz90Var.d) && jl40.l(this.e, oz90Var.e) && this.f.equals(oz90Var.f) && jl40.l(this.g, oz90Var.g);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        sz90 sz90Var = this.e;
        int hashCode5 = (this.f.hashCode() + ((hashCode4 + (sz90Var == null ? 0 : sz90Var.hashCode())) * 31)) * 31;
        mz90 mz90Var = this.g;
        return hashCode5 + (mz90Var != null ? mz90Var.hashCode() : 0);
    }

    public final String toString() {
        return "PaymentErrorContent(title=" + this.a + ", subtitle=" + this.b + ", errorCode=" + this.c + ", errorCodeContentDescription=" + this.d + ", hint=" + this.e + ", primaryButton=" + this.f + ", secondaryButton=" + this.g + ')';
    }
}
