package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class e3k0 {
    public final CharSequence a;
    public final fa6 b;

    public e3k0(CharSequence charSequence, fa6 fa6Var) {
        this.a = charSequence;
        this.b = fa6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e3k0)) {
            return false;
        }
        e3k0 e3k0Var = (e3k0) obj;
        return jl40.l(this.a, e3k0Var.a) && this.b.equals(e3k0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "RichCheckControlState(unselectedText=" + ((Object) this.a) + ", booleanState=" + this.b + Extension.C_BRAKE;
    }
}
