package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class phq0 implements lfq0 {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final rbv e;
    public final v24 f;
    public final String g;

    public phq0(String str, String str2, String str3, boolean z, rbv rbvVar, v24 v24Var, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = rbvVar;
        this.f = v24Var;
        this.g = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof phq0)) {
            return false;
        }
        phq0 phq0Var = (phq0) obj;
        return jl40.l(this.a, phq0Var.a) && jl40.l(this.b, phq0Var.b) && jl40.l(this.c, phq0Var.c) && this.d == phq0Var.d && jl40.l(this.e, phq0Var.e) && jl40.l(this.f, phq0Var.f) && jl40.l(this.g, phq0Var.g);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int e = unr0.e((b + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
        rbv rbvVar = this.e;
        int hashCode = (e + (rbvVar == null ? 0 : rbvVar.hashCode())) * 31;
        v24 v24Var = this.f;
        int hashCode2 = (hashCode + (v24Var == null ? 0 : Boolean.hashCode(v24Var.a))) * 31;
        String str2 = this.g;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("SelectedPartnerEntity(partnerId=", this.a, ", title=", this.b, ", description=");
        tse0.y(this.c, ", spoilerEnabled=", ", logo=", v, this.d);
        v.append(this.e);
        v.append(", autoTopupWidget=");
        v.append(this.f);
        v.append(", onM2mSelectedAction=");
        return oyr.t(v, this.g, Extension.C_BRAKE);
    }
}
