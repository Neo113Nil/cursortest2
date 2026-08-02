package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class be21 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final List g;
    public final String h;
    public final CharSequence i;

    public be21(String str, String str2, String str3, String str4, String str5, String str6, List list, String str7, CharSequence charSequence) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = list;
        this.h = str7;
        this.i = charSequence;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof be21)) {
            return false;
        }
        be21 be21Var = (be21) obj;
        return jl40.l(this.a, be21Var.a) && jl40.l(this.b, be21Var.b) && jl40.l(this.c, be21Var.c) && jl40.l(this.d, be21Var.d) && jl40.l(this.e, be21Var.e) && jl40.l(this.f, be21Var.f) && jl40.l(this.g, be21Var.g) && jl40.l(this.h, be21Var.h) && jl40.l(this.i, be21Var.i);
    }

    public final int hashCode() {
        int b = unr0.b(unr0.c(unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
        CharSequence charSequence = this.i;
        return b + (charSequence == null ? 0 : charSequence.hashCode());
    }

    public final String toString() {
        return "UpsaleContent(title=" + this.a + ", subtitle=" + this.b + ", offerText=" + this.c + ", additionalOfferText=" + this.d + ", rejectButtonText=" + this.e + ", acceptButtonText=" + this.f + ", benefits=" + this.g + ", headingImageUrl=" + this.h + ", legalText=" + ((Object) this.i) + ')';
    }
}
