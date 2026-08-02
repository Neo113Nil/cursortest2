package defpackage;

/* loaded from: classes12.dex */
public final class lla {
    public final String a;
    public final CharSequence b;
    public final CharSequence c;

    public lla(CharSequence charSequence, CharSequence charSequence2, String str) {
        this.a = str;
        this.b = charSequence;
        this.c = charSequence2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lla)) {
            return false;
        }
        lla llaVar = (lla) obj;
        return jl40.l(this.a, llaVar.a) && jl40.l(this.b, llaVar.b) && jl40.l(this.c, llaVar.c);
    }

    public final int hashCode() {
        String str = this.a;
        return smw0.b(smw0.b((str == null ? 0 : str.hashCode()) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return xvz.n(ly3.t(this.b, "Benefit(imageTag=", this.a, ", title=", ", subtitle="), this.c, ", previewRes=null)");
    }
}
