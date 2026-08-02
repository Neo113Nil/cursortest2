package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class dhe extends mi91 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final n690 f;
    public final float g;

    public dhe(String str, String str2, String str3, String str4, boolean z, n690 n690Var, float f) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
        this.f = n690Var;
        this.g = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dhe)) {
            return false;
        }
        dhe dheVar = (dhe) obj;
        return this.a.equals(dheVar.a) && this.b.equals(dheVar.b) && this.c.equals(dheVar.c) && jl40.l(this.d, dheVar.d) && this.e == dheVar.e && this.f.equals(dheVar.f) && Float.compare(this.g, dheVar.g) == 0;
    }

    public final int hashCode() {
        int b = unr0.b(unr0.b((((this.a.hashCode() + 98538305) * 31) + 1420720166) * 961, 31, this.b), 31, this.c);
        String str = this.d;
        return Float.hashCode(this.g) + ((this.f.hashCode() + unr0.e((b + (str == null ? 0 : str.hashCode())) * 31, 31, this.e)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("ContentMethod(saleTitle=, saleVisibility=gone, subtitle=", this.a, ", subtitleColor=@{isLightTheme ? '#80000000' : '#80FFFFFF'}, subtitleGradient=null, subtitleVisibility=", this.b, ", title=");
        g8e.D(v, this.c, ", titleTrailingIconUrl=", this.d, ", titleTrailingIconVisibility=");
        v.append(this.e);
        v.append(", paddings=");
        v.append(this.f);
        v.append(", alpha=");
        return uw51.i(v, this.g, Extension.C_BRAKE);
    }
}
