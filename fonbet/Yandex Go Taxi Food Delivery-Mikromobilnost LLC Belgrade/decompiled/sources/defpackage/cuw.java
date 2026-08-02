package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class cuw {
    public final String a;
    public final q4s b;
    public final String c;

    public cuw(String str, q4s q4sVar, String str2) {
        this.a = str;
        this.b = q4sVar;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cuw)) {
            return false;
        }
        cuw cuwVar = (cuw) obj;
        return jl40.l(this.a, cuwVar.a) && jl40.l(this.b, cuwVar.b) && jl40.l(this.c, cuwVar.c);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        q4s q4sVar = this.b;
        int hashCode2 = (hashCode + (q4sVar == null ? 0 : q4sVar.hashCode())) * 31;
        String str2 = this.c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InternetProviderInputFieldEntity(label=");
        sb.append(this.a);
        sb.append(", fieldValidation=");
        sb.append(this.b);
        sb.append(", comment=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }
}
