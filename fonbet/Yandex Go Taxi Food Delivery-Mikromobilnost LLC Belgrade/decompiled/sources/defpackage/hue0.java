package defpackage;

/* loaded from: classes2.dex */
public final class hue0 {
    public final CharSequence a;
    public final CharSequence b;
    public final CharSequence c;
    public final CharSequence d;
    public final CharSequence e;
    public final CharSequence f;

    public hue0(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, CharSequence charSequence5, CharSequence charSequence6) {
        this.a = charSequence;
        this.b = charSequence2;
        this.c = charSequence3;
        this.d = charSequence4;
        this.e = charSequence5;
        this.f = charSequence6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hue0)) {
            return false;
        }
        hue0 hue0Var = (hue0) obj;
        return jl40.l(this.a, hue0Var.a) && jl40.l(this.b, hue0Var.b) && jl40.l(this.c, hue0Var.c) && jl40.l(this.d, hue0Var.d) && jl40.l(this.e, hue0Var.e) && jl40.l(this.f, hue0Var.f);
    }

    public final int hashCode() {
        CharSequence charSequence = this.a;
        int b = smw0.b(smw0.b(smw0.b(smw0.b((charSequence == null ? 0 : charSequence.hashCode()) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        CharSequence charSequence2 = this.f;
        return b + (charSequence2 != null ? charSequence2.hashCode() : 0);
    }

    public final String toString() {
        return "PresaleOfferContent(benefitText=" + ((Object) this.a) + ", periodText=" + ((Object) this.b) + ", priceText=" + ((Object) this.c) + ", priceDescriptionText=" + ((Object) this.d) + ", buttonText=" + ((Object) this.e) + ", buttonAdditionalText=" + ((Object) this.f) + ')';
    }
}
