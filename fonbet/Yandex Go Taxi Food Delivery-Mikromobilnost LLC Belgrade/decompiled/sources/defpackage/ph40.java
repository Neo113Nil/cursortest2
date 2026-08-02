package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class ph40 {
    public final CharSequence a;
    public final CharSequence b;
    public final CharSequence c;
    public final CharSequence d;
    public final boolean e;
    public final String f;

    public /* synthetic */ ph40(int i) {
        this(null, null, null, null, false, (i & 32) != 0 ? "" : "standart");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ph40)) {
            return false;
        }
        ph40 ph40Var = (ph40) obj;
        return jl40.l(this.a, ph40Var.a) && jl40.l(this.b, ph40Var.b) && jl40.l(this.c, ph40Var.c) && jl40.l(this.d, ph40Var.d) && this.e == ph40Var.e && jl40.l(this.f, ph40Var.f);
    }

    public final int hashCode() {
        CharSequence charSequence = this.a;
        int hashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        CharSequence charSequence2 = this.b;
        int hashCode2 = (hashCode + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        CharSequence charSequence3 = this.c;
        int hashCode3 = (hashCode2 + (charSequence3 == null ? 0 : charSequence3.hashCode())) * 31;
        CharSequence charSequence4 = this.d;
        return this.f.hashCode() + unr0.e((hashCode3 + (charSequence4 != null ? charSequence4.hashCode() : 0)) * 31, 31, this.e);
    }

    public final String toString() {
        StringBuilder r = vfc.r(this.a, this.b, "MtTrainTariffItemUiState(title=", ", description=", ", subtitle=");
        vfc.A(r, this.c, ", priceTitle=", this.d, ", isEnabled=");
        return n.m(", tariffId=", this.f, Extension.C_BRAKE, r, this.e);
    }

    public ph40(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, boolean z, String str) {
        this.a = charSequence;
        this.b = charSequence2;
        this.c = charSequence3;
        this.d = charSequence4;
        this.e = z;
        this.f = str;
    }

    public ph40() {
        this(63);
    }
}
