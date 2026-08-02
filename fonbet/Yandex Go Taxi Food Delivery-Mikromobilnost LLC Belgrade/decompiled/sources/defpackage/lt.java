package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class lt {
    public final nvi0 a;
    public final CharSequence b;
    public final wp2 c;
    public final wp2 d;
    public final kt e;
    public final boolean f;

    public lt(nvi0 nvi0Var, CharSequence charSequence, wp2 wp2Var, wp2 wp2Var2, kt ktVar, boolean z) {
        this.a = nvi0Var;
        this.b = charSequence;
        this.c = wp2Var;
        this.d = wp2Var2;
        this.e = ktVar;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lt)) {
            return false;
        }
        lt ltVar = (lt) obj;
        return jl40.l(this.a, ltVar.a) && jl40.l(this.b, ltVar.b) && jl40.l(this.c, ltVar.c) && jl40.l(this.d, ltVar.d) && jl40.l(this.e, ltVar.e) && this.f == ltVar.f;
    }

    public final int hashCode() {
        nvi0 nvi0Var = this.a;
        return Boolean.hashCode(this.f) + ((this.e.hashCode() + n.b(this.d, n.b(this.c, smw0.b((nvi0Var == null ? 0 : nvi0Var.hashCode()) * 31, 31, this.b), 31), 31)) * 31);
    }

    public final String toString() {
        return "ActionButtonUiState(icon=" + this.a + ", text=" + ((Object) this.b) + ", textColor=" + this.c + ", backgroundColor=" + this.d + ", action=" + this.e + ", isSelected=" + this.f + Extension.C_BRAKE;
    }
}
