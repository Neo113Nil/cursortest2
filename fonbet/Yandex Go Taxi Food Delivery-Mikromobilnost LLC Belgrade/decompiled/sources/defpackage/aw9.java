package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class aw9 implements dw9 {
    public final CharSequence a;
    public final nvi0 b;
    public final CharSequence c;
    public final uo9 d;
    public final boolean e;

    public aw9(CharSequence charSequence, nvi0 nvi0Var, CharSequence charSequence2, uo9 uo9Var, boolean z) {
        this.a = charSequence;
        this.b = nvi0Var;
        this.c = charSequence2;
        this.d = uo9Var;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aw9)) {
            return false;
        }
        aw9 aw9Var = (aw9) obj;
        return jl40.l(this.a, aw9Var.a) && jl40.l(this.b, aw9Var.b) && jl40.l(this.c, aw9Var.c) && jl40.l(this.d, aw9Var.d) && this.e == aw9Var.e;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        nvi0 nvi0Var = this.b;
        int hashCode2 = (hashCode + (nvi0Var == null ? 0 : nvi0Var.hashCode())) * 31;
        CharSequence charSequence = this.c;
        int hashCode3 = (hashCode2 + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        uo9 uo9Var = this.d;
        return Boolean.hashCode(this.e) + ((hashCode3 + (uo9Var != null ? uo9Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Empty(header=");
        sb.append((Object) this.a);
        sb.append(", image=");
        sb.append(this.b);
        sb.append(", message=");
        sb.append((Object) this.c);
        sb.append(", button=");
        sb.append(this.d);
        sb.append(", limitExceeded=");
        return x4e.i(sb, this.e, Extension.C_BRAKE);
    }
}
