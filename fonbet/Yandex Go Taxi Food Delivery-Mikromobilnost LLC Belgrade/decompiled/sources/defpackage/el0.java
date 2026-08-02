package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class el0 {
    public final String a;
    public final String b;
    public final rbv c;
    public final String d;

    public el0(String str, String str2, rbv rbvVar, String str3) {
        this.a = str;
        this.b = str2;
        this.c = rbvVar;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof el0)) {
            return false;
        }
        el0 el0Var = (el0) obj;
        return jl40.l(this.a, el0Var.a) && jl40.l(this.b, el0Var.b) && jl40.l(this.c, el0Var.c) && jl40.l(this.d, el0Var.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        rbv rbvVar = this.c;
        return this.d.hashCode() + ((hashCode2 + (rbvVar != null ? rbvVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("AdditionalButtonEntity(title=", this.a, ", description=", this.b, ", logo=");
        v.append(this.c);
        v.append(", action=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
