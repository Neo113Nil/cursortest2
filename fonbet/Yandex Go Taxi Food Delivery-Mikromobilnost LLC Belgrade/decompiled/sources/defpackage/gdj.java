package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class gdj {
    public final String a;
    public final String b;
    public final Integer c;
    public final String d;
    public final String e;

    public gdj(String str, Integer num, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = num;
        this.d = str3;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gdj)) {
            return false;
        }
        gdj gdjVar = (gdj) obj;
        return jl40.l(this.a, gdjVar.a) && jl40.l(this.b, gdjVar.b) && jl40.l(this.c, gdjVar.c) && jl40.l(this.d, gdjVar.d) && jl40.l(this.e, gdjVar.e);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        Integer num = this.c;
        return this.e.hashCode() + unr0.b((b + (num == null ? 0 : num.hashCode())) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder v = b64.v("DialogContent(title=", this.a, ", subtitle=", this.b, ", imageTag=");
        tse0.w(this.c, ", additionalButtonTitle=", this.d, ", mainButtonTitle=", v);
        return oyr.t(v, this.e, Extension.C_BRAKE);
    }

    public gdj() {
        this("", null, "", "", "");
    }
}
