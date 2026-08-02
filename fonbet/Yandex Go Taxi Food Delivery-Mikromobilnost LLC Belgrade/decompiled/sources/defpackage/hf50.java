package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class hf50 implements jf50 {
    public final String a;
    public final String b;
    public final String c;

    public hf50(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hf50)) {
            return false;
        }
        hf50 hf50Var = (hf50) obj;
        return jl40.l(this.a, hf50Var.a) && jl40.l(this.b, hf50Var.b) && jl40.l(this.c, hf50Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return oyr.t(b64.v("InDriving(id=", this.a, ", timeToFinish=", this.b, ", streetName="), this.c, Extension.C_BRAKE);
    }
}
