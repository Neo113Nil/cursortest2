package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class da30 {
    public final String a;
    public final String b;
    public final String c;

    public da30(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof da30)) {
            return false;
        }
        da30 da30Var = (da30) obj;
        return jl40.l(this.a, da30Var.a) && jl40.l(this.b, da30Var.b) && jl40.l(this.c, da30Var.c);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return oyr.t(b64.v("TimerValue(text=", this.a, ", value=", this.b, ", contentDescription="), this.c, Extension.C_BRAKE);
    }

    public da30() {
        this(null, null, null);
    }
}
