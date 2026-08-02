package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class nga {
    public final String a;
    public final CharSequence b;
    public final CharSequence c;
    public final CharSequence d;
    public final boolean e;

    public nga(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, boolean z) {
        this.a = str;
        this.b = charSequence;
        this.c = charSequence2;
        this.d = charSequence3;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nga)) {
            return false;
        }
        nga ngaVar = (nga) obj;
        return jl40.l(this.a, ngaVar.a) && jl40.l(this.b, ngaVar.b) && jl40.l(this.c, ngaVar.c) && jl40.l(this.d, ngaVar.d) && this.e == ngaVar.e;
    }

    public final int hashCode() {
        int b = smw0.b(this.a.hashCode() * 31, 31, this.b);
        CharSequence charSequence = this.c;
        return Boolean.hashCode(this.e) + smw0.b((b + (charSequence == null ? 0 : charSequence.hashCode())) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder t = ly3.t(this.b, "ChargersPassesOfferPackageItem(offerId=", this.a, ", title=", ", subtitle=");
        vfc.A(t, this.c, ", price=", this.d, ", isSelected=");
        return x4e.i(t, this.e, Extension.C_BRAKE);
    }
}
