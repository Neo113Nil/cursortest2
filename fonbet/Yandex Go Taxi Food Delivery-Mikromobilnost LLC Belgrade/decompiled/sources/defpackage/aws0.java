package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class aws0 implements fws0, hz {
    public final boolean a;
    public final String b;
    public final Object c;
    public final r9x0 d;
    public final String e;
    public final r9x0 f;
    public final String g;

    public aws0(r9x0 r9x0Var, r9x0 r9x0Var2, Object obj, String str, String str2, String str3, boolean z) {
        this.a = z;
        this.b = str;
        this.c = obj;
        this.d = r9x0Var;
        this.e = str2;
        this.f = r9x0Var2;
        this.g = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aws0)) {
            return false;
        }
        aws0 aws0Var = (aws0) obj;
        return this.a == aws0Var.a && jl40.l(this.b, aws0Var.b) && jl40.l(this.c, aws0Var.c) && jl40.l(this.d, aws0Var.d) && jl40.l(this.e, aws0Var.e) && jl40.l(this.f, aws0Var.f) && jl40.l(this.g, aws0Var.g);
    }

    @Override // defpackage.hz
    public final r9x0 getAction() {
        return this.f;
    }

    public final int hashCode() {
        int c = smw0.c(unr0.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        r9x0 r9x0Var = this.d;
        int hashCode = (c + (r9x0Var == null ? 0 : r9x0Var.hashCode())) * 31;
        String str = this.e;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        r9x0 r9x0Var2 = this.f;
        int hashCode3 = (hashCode2 + (r9x0Var2 == null ? 0 : r9x0Var2.hashCode())) * 31;
        String str2 = this.g;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = ly3.v("TrailSwitch(isEnabled=", ", key=", this.b, ", value=", this.a);
        v.append(this.c);
        v.append(", actionOnUnselect=");
        v.append(this.d);
        v.append(", metricaLabel=");
        v.append(this.e);
        v.append(", action=");
        v.append(this.f);
        v.append(", presentationId=");
        return oyr.t(v, this.g, Extension.C_BRAKE);
    }
}
