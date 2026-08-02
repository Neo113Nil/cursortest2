package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class cbu extends n351 {
    public final String c;
    public final String d;
    public final ja01 e;
    public final boolean f;
    public final String g;
    public final String h;

    public cbu(String str, String str2, ja01 ja01Var, boolean z, String str3, String str4) {
        super("tracking-header-key", false, 14);
        this.c = str;
        this.d = str2;
        this.e = ja01Var;
        this.f = z;
        this.g = str3;
        this.h = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cbu)) {
            return false;
        }
        cbu cbuVar = (cbu) obj;
        return jl40.l(this.c, cbuVar.c) && jl40.l(this.d, cbuVar.d) && jl40.l(this.e, cbuVar.e) && this.f == cbuVar.f && jl40.l(this.g, cbuVar.g) && jl40.l(this.h, cbuVar.h);
    }

    public final int hashCode() {
        String str = this.c;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.d;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        ja01 ja01Var = this.e;
        int e = unr0.e((hashCode2 + (ja01Var == null ? 0 : ja01Var.hashCode())) * 31, 31, this.f);
        String str3 = this.g;
        int hashCode3 = (e + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.h;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("HeaderModel(title=", this.c, ", subtitle=", this.d, ", trailElement=");
        v.append(this.e);
        v.append(", isShimmering=");
        v.append(this.f);
        v.append(", contentDescription=");
        return g8e.r(v, this.g, ", accessibilityAnnounce=", this.h, Extension.C_BRAKE);
    }

    public cbu() {
        this(null, null, null, false, null, null);
    }
}
