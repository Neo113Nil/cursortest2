package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class hc8 extends kfb1 {
    public final String b;
    public final String c;
    public final String d;

    public hc8(String str, String str2, String str3) {
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hc8)) {
            return false;
        }
        hc8 hc8Var = (hc8) obj;
        return jl40.l(this.b, hc8Var.b) && jl40.l(this.c, hc8Var.c) && jl40.l(this.d, hc8Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + unr0.b(this.b.hashCode() * 31, 31, this.c);
    }

    public final String toString() {
        return oyr.t(b64.v("ThreeButtons(instructionTitle=", this.b, ", checkInTitle=", this.c, ", detailTitle="), this.d, Extension.C_BRAKE);
    }
}
