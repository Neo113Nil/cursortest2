package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class jkj0 {
    public final CharSequence a;
    public final wp2 b;
    public final wp2 c;
    public final flj0 d;

    public jkj0(CharSequence charSequence, wp2 wp2Var, wp2 wp2Var2, flj0 flj0Var) {
        this.a = charSequence;
        this.b = wp2Var;
        this.c = wp2Var2;
        this.d = flj0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jkj0)) {
            return false;
        }
        jkj0 jkj0Var = (jkj0) obj;
        return jl40.l(this.a, jkj0Var.a) && jl40.l(this.b, jkj0Var.b) && jl40.l(this.c, jkj0Var.c) && this.d.equals(jkj0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + n.b(this.c, n.b(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "RequirementTrailButtonUiState(text=" + ((Object) this.a) + ", textAppColor=" + this.b + ", bgAppColor=" + this.c + ", action=" + this.d + Extension.C_BRAKE;
    }
}
