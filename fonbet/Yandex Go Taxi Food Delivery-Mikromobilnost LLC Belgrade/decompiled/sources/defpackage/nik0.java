package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class nik0 {
    public final CharSequence a;
    public final long b;
    public final boolean c;

    public nik0(CharSequence charSequence, long j, boolean z) {
        this.a = charSequence;
        this.b = j;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nik0)) {
            return false;
        }
        nik0 nik0Var = (nik0) obj;
        return jl40.l(this.a, nik0Var.a) && this.b == nik0Var.b && this.c == nik0Var.c;
    }

    public final int hashCode() {
        CharSequence charSequence = this.a;
        return Boolean.hashCode(this.c) + qv10.c((charSequence == null ? 0 : charSequence.hashCode()) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TitleUiState(text=");
        sb.append((Object) this.a);
        sb.append(", animationDuration=");
        sb.append(this.b);
        return xra1.a(sb, ", hasOtherElements=", this.c, Extension.C_BRAKE);
    }
}
