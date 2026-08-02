package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class hu5 {
    public final String a;
    public final String b;
    public final du5 c;
    public final String d;

    public hu5(String str, String str2, du5 du5Var, String str3) {
        this.a = str;
        this.b = str2;
        this.c = du5Var;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hu5)) {
            return false;
        }
        hu5 hu5Var = (hu5) obj;
        return jl40.l(this.a, hu5Var.a) && jl40.l(this.b, hu5Var.b) && jl40.l(this.c, hu5Var.c) && jl40.l(this.d, hu5Var.d);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        du5 du5Var = this.c;
        int hashCode3 = (hashCode2 + (du5Var == null ? 0 : du5Var.a.hashCode())) * 31;
        String str3 = this.d;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("BindAccountSheetOverridesEntity(title=", this.a, ", subtitle=", this.b, ", primaryButton=");
        v.append(this.c);
        v.append(", legalText=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
