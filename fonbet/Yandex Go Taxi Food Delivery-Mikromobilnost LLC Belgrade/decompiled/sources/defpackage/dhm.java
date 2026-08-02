package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public final class dhm {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;

    public dhm(String str, String str2, String str3, String str4, int i) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dhm)) {
            return false;
        }
        dhm dhmVar = (dhm) obj;
        return jl40.l(this.a, dhmVar.a) && this.b.equals(dhmVar.b) && this.c.equals(dhmVar.c) && jl40.l(this.d, dhmVar.d) && this.e == dhmVar.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + unr0.b(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder v = b64.v("DriveTariffExtra(offerId=", this.a, ", carNumber=", this.b, ", layersObjectId=");
        g8e.D(v, this.c, ", baseServiceLevelClass=", this.d, ", estimatedWaitingMinutes=");
        return oyr.m(this.e, Extension.C_BRAKE, v);
    }
}
