package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class c5l0 {
    public final String a;
    public final String b;
    public final String c;
    public final au2 d;

    public c5l0(String str, String str2, String str3, au2 au2Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = au2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c5l0) {
            c5l0 c5l0Var = (c5l0) obj;
            return this.a.equals(c5l0Var.a) && jl40.l(this.b, c5l0Var.b) && jl40.l(this.c, c5l0Var.c) && this.d == c5l0Var.d;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return this.d.hashCode() + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("ItemPointUiState(title=", this.a, ", subtitle=", this.b, ", imageTag=");
        v.append(this.c);
        v.append(", fallbackImage=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
