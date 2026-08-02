package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class exl0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final dxl0 f;
    public final CharSequence g;
    public final String h;

    public exl0(String str, String str2, String str3, String str4, String str5, dxl0 dxl0Var, CharSequence charSequence, String str6) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = dxl0Var;
        this.g = charSequence;
        this.h = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof exl0)) {
            return false;
        }
        exl0 exl0Var = (exl0) obj;
        return jl40.l(this.a, exl0Var.a) && jl40.l(this.b, exl0Var.b) && jl40.l(this.c, exl0Var.c) && jl40.l(this.d, exl0Var.d) && jl40.l(this.e, exl0Var.e) && jl40.l(this.f, exl0Var.f) && jl40.l(this.g, exl0Var.g) && jl40.l(this.h, exl0Var.h);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int hashCode = (this.f.hashCode() + unr0.b(unr0.b((b + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), 31, this.e)) * 31;
        CharSequence charSequence = this.g;
        int hashCode2 = (hashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        String str2 = this.h;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("SafetyPhotoMainUiState(title=", this.a, ", text=", this.b, ", skipButtonText=");
        g8e.D(v, this.c, ", galleryButtonText=", this.d, ", selfieButtonText=");
        v.append(this.e);
        v.append(", logo=");
        v.append(this.f);
        v.append(", eulaText=");
        v.append((Object) this.g);
        v.append(", eulaId=");
        v.append(this.h);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
