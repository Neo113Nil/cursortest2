package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class eu5 {
    public final String a;
    public final String b;
    public final du5 c;
    public final String d;

    public eu5(String str, String str2, du5 du5Var, String str3) {
        this.a = str;
        this.b = str2;
        this.c = du5Var;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eu5)) {
            return false;
        }
        eu5 eu5Var = (eu5) obj;
        return jl40.l(this.a, eu5Var.a) && jl40.l(this.b, eu5Var.b) && this.c.equals(eu5Var.c) && jl40.l(this.d, eu5Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c.a);
    }

    public final String toString() {
        StringBuilder v = b64.v("BindAccountSheetEntity(title=", this.a, ", subtitle=", this.b, ", primaryButton=");
        v.append(this.c);
        v.append(", legalText=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
