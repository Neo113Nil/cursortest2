package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes7.dex */
public final class eu81 {
    public final String a;
    public final String b;
    public final String c;

    public eu81(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eu81)) {
            return false;
        }
        eu81 eu81Var = (eu81) obj;
        return jl40.l(this.a, eu81Var.a) && jl40.l(this.b, eu81Var.b) && jl40.l(this.c, eu81Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + z2a1.a(this.a.hashCode() * 31, this.b);
    }

    public final String toString() {
        return oyr.t(b64.v("DebugPanelAdUnitData(name=", this.a, ", format=", this.b, ", adUnitId="), this.c, Extension.C_BRAKE);
    }
}
