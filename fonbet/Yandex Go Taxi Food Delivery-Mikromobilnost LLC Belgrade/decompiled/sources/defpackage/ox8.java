package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class ox8 implements ux8 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public ox8(String str, String str2, String str3, String str4, String str5, String str6) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ox8)) {
            return false;
        }
        ox8 ox8Var = (ox8) obj;
        return jl40.l(this.a, ox8Var.a) && jl40.l(this.b, ox8Var.b) && jl40.l(this.c, ox8Var.c) && jl40.l(this.d, ox8Var.d) && jl40.l(this.e, ox8Var.e) && jl40.l(this.f, ox8Var.f);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return this.f.hashCode() + unr0.b((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.e);
    }

    @Override // defpackage.ux8
    public final String k() {
        return this.a;
    }

    public final String toString() {
        StringBuilder v = b64.v("Redirect(requirementName=", this.a, ", title=", this.b, ", redirectDescription=");
        g8e.D(v, this.c, ", bigImageUrl=", this.d, ", redirectRequirement=");
        return g8e.r(v, this.e, ", redirectTariffClass=", this.f, Extension.C_BRAKE);
    }
}
