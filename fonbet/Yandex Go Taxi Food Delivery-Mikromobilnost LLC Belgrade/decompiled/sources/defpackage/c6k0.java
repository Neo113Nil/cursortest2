package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class c6k0 {
    public final CharSequence a;
    public final boolean b;
    public final int c;

    public c6k0(CharSequence charSequence, boolean z, int i) {
        this.a = charSequence;
        this.b = z;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c6k0)) {
            return false;
        }
        c6k0 c6k0Var = (c6k0) obj;
        return jl40.l(this.a, c6k0Var.a) && this.b == c6k0Var.b && this.c == c6k0Var.c;
    }

    public final int hashCode() {
        CharSequence charSequence = this.a;
        return Integer.hashCode(this.c) + unr0.e((charSequence == null ? 0 : charSequence.hashCode()) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Title(title=");
        sb.append((Object) this.a);
        sb.append(", isClickable=");
        sb.append(this.b);
        sb.append(", minLines=");
        return oyr.m(this.c, Extension.C_BRAKE, sb);
    }
}
