package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class g510 {
    public final CharSequence a;
    public final wp2 b;
    public final Integer c;
    public final CharSequence d;
    public final wp2 e;
    public final Integer f;
    public final f510 g;

    public g510(CharSequence charSequence, wp2 wp2Var, Integer num, CharSequence charSequence2, wp2 wp2Var2, Integer num2, f510 f510Var) {
        this.a = charSequence;
        this.b = wp2Var;
        this.c = num;
        this.d = charSequence2;
        this.e = wp2Var2;
        this.f = num2;
        this.g = f510Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g510)) {
            return false;
        }
        g510 g510Var = (g510) obj;
        return jl40.l(this.a, g510Var.a) && jl40.l(this.b, g510Var.b) && jl40.l(this.c, g510Var.c) && jl40.l(this.d, g510Var.d) && jl40.l(this.e, g510Var.e) && jl40.l(this.f, g510Var.f) && this.g.equals(g510Var.g);
    }

    public final int hashCode() {
        CharSequence charSequence = this.a;
        int hashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        wp2 wp2Var = this.b;
        int hashCode2 = (hashCode + (wp2Var == null ? 0 : wp2Var.hashCode())) * 31;
        Integer num = this.c;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        CharSequence charSequence2 = this.d;
        int hashCode4 = (hashCode3 + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        wp2 wp2Var2 = this.e;
        int hashCode5 = (hashCode4 + (wp2Var2 == null ? 0 : wp2Var2.hashCode())) * 31;
        Integer num2 = this.f;
        return this.g.hashCode() + ((hashCode5 + (num2 != null ? num2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "TextColumn(text=" + ((Object) this.a) + ", textColor=" + this.b + ", textSize=" + this.c + ", subtext=" + ((Object) this.d) + ", subtextColor=" + this.e + ", subtextSize=" + this.f + ", parameters=" + this.g + Extension.C_BRAKE;
    }
}
