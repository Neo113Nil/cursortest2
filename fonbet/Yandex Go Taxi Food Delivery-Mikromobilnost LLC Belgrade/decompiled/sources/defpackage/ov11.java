package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class ov11 implements qv11 {
    public final int a;
    public final CharSequence b;
    public final CharSequence c;
    public final CharSequence d;
    public final String e;
    public final String f;
    public final String g;

    public ov11(int i, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, String str, String str2, String str3) {
        this.a = i;
        this.b = charSequence;
        this.c = charSequence2;
        this.d = charSequence3;
        this.e = str;
        this.f = str2;
        this.g = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ov11)) {
            return false;
        }
        ov11 ov11Var = (ov11) obj;
        return this.a == ov11Var.a && jl40.l(this.b, ov11Var.b) && jl40.l(this.c, ov11Var.c) && jl40.l(this.d, ov11Var.d) && jl40.l(this.e, ov11Var.e) && jl40.l(this.f, ov11Var.f) && jl40.l(this.g, ov11Var.g);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        CharSequence charSequence = this.b;
        int hashCode2 = (hashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        CharSequence charSequence2 = this.c;
        int hashCode3 = (hashCode2 + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        CharSequence charSequence3 = this.d;
        int hashCode4 = (hashCode3 + (charSequence3 == null ? 0 : charSequence3.hashCode())) * 31;
        String str = this.e;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.g;
        return hashCode6 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Content(percent=");
        sb.append(this.a);
        sb.append(", text=");
        sb.append((Object) this.b);
        sb.append(", trail=");
        vfc.A(sb, this.c, ", bottomText=", this.d, ", progressAccessibilityText=");
        g8e.D(sb, this.e, ", textAccessibility=", this.f, ", bottomTextAccessibility=");
        return oyr.t(sb, this.g, Extension.C_BRAKE);
    }
}
