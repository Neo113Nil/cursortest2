package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class l280 {
    public final String a;
    public final String b;
    public final String c;

    public l280(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final String a() {
        return this.c;
    }

    public final String b() {
        return this.a;
    }

    public final String c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l280)) {
            return false;
        }
        l280 l280Var = (l280) obj;
        return this.a.equals(l280Var.a) && jl40.l(this.b, l280Var.b) && jl40.l(this.c, l280Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return oyr.t(b64.v("CarNumber(number=", this.a, ", region=", this.b, ", fullNumber="), this.c, Extension.C_BRAKE);
    }
}
