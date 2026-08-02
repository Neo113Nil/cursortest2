package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class b47 {
    public final boolean a;
    public final CharSequence b;
    public final boolean c;

    public b47(CharSequence charSequence, boolean z, boolean z2) {
        this.a = z;
        this.b = charSequence;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b47)) {
            return false;
        }
        b47 b47Var = (b47) obj;
        return this.a == b47Var.a && jl40.l(this.b, b47Var.b) && this.c == b47Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + smw0.b(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ButtonUiState(isEnabled=");
        sb.append(this.a);
        sb.append(", text=");
        sb.append((Object) this.b);
        sb.append(", isLoading=");
        return x4e.i(sb, this.c, Extension.C_BRAKE);
    }
}
