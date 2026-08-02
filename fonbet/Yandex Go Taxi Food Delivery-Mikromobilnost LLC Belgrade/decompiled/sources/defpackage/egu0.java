package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class egu0 implements lhu0 {
    public final CharSequence a;
    public final boolean b;
    public final CharSequence c;
    public final CharSequence d;
    public final ihu0 e;
    public final p5l0 f;

    public egu0(CharSequence charSequence, boolean z, String str, CharSequence charSequence2, hhu0 hhu0Var, p5l0 p5l0Var) {
        this.a = charSequence;
        this.b = z;
        this.c = str;
        this.d = charSequence2;
        this.e = hhu0Var;
        this.f = p5l0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof egu0)) {
            return false;
        }
        egu0 egu0Var = (egu0) obj;
        return this.a.equals(egu0Var.a) && this.b == egu0Var.b && jl40.l(this.c, egu0Var.c) && jl40.l(this.d, egu0Var.d) && jl40.l(this.e, egu0Var.e) && this.f.equals(egu0Var.f);
    }

    public final int hashCode() {
        int e = unr0.e(this.a.hashCode() * 31, 31, this.b);
        CharSequence charSequence = this.c;
        int hashCode = (e + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        CharSequence charSequence2 = this.d;
        int hashCode2 = (hashCode + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        ihu0 ihu0Var = this.e;
        return this.f.hashCode() + ((hashCode2 + (ihu0Var != null ? ihu0Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StopItemUiState(title=");
        sb.append((Object) this.a);
        sb.append(", enabled=");
        sb.append(this.b);
        sb.append(", hint=");
        vfc.A(sb, this.c, ", subtitle=", this.d, ", action=");
        sb.append(this.e);
        sb.append(", routeLine=");
        sb.append(this.f);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
