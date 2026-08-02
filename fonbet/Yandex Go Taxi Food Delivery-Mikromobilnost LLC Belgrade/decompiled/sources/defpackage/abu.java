package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class abu {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public abu(String str, String str2, String str3, String str4, String str5, String str6) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof abu)) {
            return false;
        }
        abu abuVar = (abu) obj;
        return jl40.l(this.a, abuVar.a) && jl40.l(this.b, abuVar.b) && jl40.l(this.c, abuVar.c) && jl40.l(this.d, abuVar.d) && jl40.l(this.e, abuVar.e) && jl40.l(this.f, abuVar.f);
    }

    public final int hashCode() {
        int b = unr0.b(unr0.b(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        String str = this.f;
        return b + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder v = b64.v("HeaderModel(title=", this.a, ", subtitle=", this.b, ", pickupTitle=");
        g8e.D(v, this.c, ", deliveryTitle=", this.d, ", costTitle=");
        return g8e.r(v, this.e, ", imageUrl=", this.f, Extension.C_BRAKE);
    }
}
