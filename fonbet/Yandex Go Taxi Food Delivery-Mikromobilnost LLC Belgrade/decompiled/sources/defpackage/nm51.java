package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class nm51 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public nm51(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nm51)) {
            return false;
        }
        nm51 nm51Var = (nm51) obj;
        return jl40.l(this.a, nm51Var.a) && jl40.l(this.b, nm51Var.b) && jl40.l(this.c, nm51Var.c) && jl40.l(this.d, nm51Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return g8e.r(b64.v("YandexProtectionPageTexts(title=", this.a, ", details=", this.b, ", acceptButtonTitle="), this.c, ", cancelButtonTitle=", this.d, Extension.C_BRAKE);
    }
}
