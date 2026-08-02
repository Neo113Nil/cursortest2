package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class mfq0 implements lfq0 {
    public final String a;
    public final v24 b;
    public final String c;
    public final String d;
    public final boolean e;
    public final rbv f;

    public mfq0(String str, v24 v24Var, String str2, String str3, boolean z, rbv rbvVar) {
        this.a = str;
        this.b = v24Var;
        this.c = str2;
        this.d = str3;
        this.e = z;
        this.f = rbvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mfq0)) {
            return false;
        }
        mfq0 mfq0Var = (mfq0) obj;
        return jl40.l(this.a, mfq0Var.a) && jl40.l(this.b, mfq0Var.b) && jl40.l(this.c, mfq0Var.c) && jl40.l(this.d, mfq0Var.d) && this.e == mfq0Var.e && jl40.l(this.f, mfq0Var.f);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        v24 v24Var = this.b;
        int b = unr0.b((hashCode + (v24Var == null ? 0 : Boolean.hashCode(v24Var.a))) * 31, 31, this.c);
        String str = this.d;
        int e = unr0.e((b + (str == null ? 0 : str.hashCode())) * 31, 31, this.e);
        rbv rbvVar = this.f;
        return e + (rbvVar != null ? rbvVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectedAccountEntity(agreementId=");
        sb.append(this.a);
        sb.append(", autoTopupWidget=");
        sb.append(this.b);
        sb.append(", title=");
        g8e.D(sb, this.c, ", description=", this.d, ", spoilerEnabled=");
        sb.append(this.e);
        sb.append(", logo=");
        sb.append(this.f);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
