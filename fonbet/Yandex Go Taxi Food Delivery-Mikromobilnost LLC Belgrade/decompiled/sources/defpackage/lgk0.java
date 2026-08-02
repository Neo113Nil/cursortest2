package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class lgk0 {
    public final CharSequence a;
    public final kgk0 b;
    public final CharSequence c;

    public lgk0(CharSequence charSequence, kgk0 kgk0Var, CharSequence charSequence2) {
        this.a = charSequence;
        this.b = kgk0Var;
        this.c = charSequence2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lgk0)) {
            return false;
        }
        lgk0 lgk0Var = (lgk0) obj;
        return jl40.l(this.a, lgk0Var.a) && jl40.l(this.b, lgk0Var.b) && jl40.l(this.c, lgk0Var.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        CharSequence charSequence = this.c;
        return hashCode + (charSequence == null ? 0 : charSequence.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RideCardDriverBadgesUiState(firstBadgeText=");
        sb.append((Object) this.a);
        sb.append(", firstBadgeBackground=");
        sb.append(this.b);
        sb.append(", hiddenBadgesText=");
        return xvz.n(sb, this.c, Extension.C_BRAKE);
    }
}
