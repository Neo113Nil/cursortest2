package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class co00 implements fo00 {
    public final ixy0 a;
    public final zwy0 b;
    public final zwy0 c;
    public final CharSequence d;
    public final CharSequence e;
    public final boolean f;

    public co00(ixy0 ixy0Var, zwy0 zwy0Var, zwy0 zwy0Var2, CharSequence charSequence, CharSequence charSequence2, boolean z) {
        this.a = ixy0Var;
        this.b = zwy0Var;
        this.c = zwy0Var2;
        this.d = charSequence;
        this.e = charSequence2;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof co00)) {
            return false;
        }
        co00 co00Var = (co00) obj;
        return jl40.l(this.a, co00Var.a) && jl40.l(this.b, co00Var.b) && jl40.l(this.c, co00Var.c) && jl40.l(this.d, co00Var.d) && jl40.l(this.e, co00Var.e) && this.f == co00Var.f;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        zwy0 zwy0Var = this.b;
        int hashCode2 = (hashCode + (zwy0Var == null ? 0 : zwy0Var.hashCode())) * 31;
        zwy0 zwy0Var2 = this.c;
        int hashCode3 = (hashCode2 + (zwy0Var2 == null ? 0 : zwy0Var2.hashCode())) * 31;
        CharSequence charSequence = this.d;
        int hashCode4 = (hashCode3 + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        CharSequence charSequence2 = this.e;
        return Boolean.hashCode(this.f) + ((hashCode4 + (charSequence2 != null ? charSequence2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "UniversalMPinStyle(image=" + this.a + ", imageAssetThemedBitmap=" + this.b + ", badgeAssetThemedBitmap=" + this.c + ", title=" + ((Object) this.d) + ", subtitle=" + ((Object) this.e) + ", useSmallLogo=" + this.f + Extension.C_BRAKE;
    }
}
