package defpackage;

/* loaded from: classes2.dex */
public final class nue0 implements pue0 {
    public final CharSequence a;
    public final hue0 b;
    public final CharSequence c;
    public final CharSequence d;

    public nue0(CharSequence charSequence, hue0 hue0Var, CharSequence charSequence2, CharSequence charSequence3) {
        this.a = charSequence;
        this.b = hue0Var;
        this.c = charSequence2;
        this.d = charSequence3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nue0)) {
            return false;
        }
        nue0 nue0Var = (nue0) obj;
        return jl40.l(this.a, nue0Var.a) && jl40.l(this.b, nue0Var.b) && jl40.l(this.c, nue0Var.c) && jl40.l(this.d, nue0Var.d);
    }

    public final int hashCode() {
        int b = smw0.b((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
        CharSequence charSequence = this.d;
        return b + (charSequence == null ? 0 : charSequence.hashCode());
    }

    public final String toString() {
        return "OfferSuggestion(loadingText=" + ((Object) this.a) + ", suggestionContent=" + this.b + ", originalOfferButtonText=" + ((Object) this.c) + ", legalText=" + ((Object) this.d) + ')';
    }
}
