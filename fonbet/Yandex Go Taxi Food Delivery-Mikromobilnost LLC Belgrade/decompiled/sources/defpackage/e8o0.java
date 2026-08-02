package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class e8o0 {
    public final CharSequence a;
    public final CharSequence b;

    public e8o0(CharSequence charSequence, CharSequence charSequence2) {
        this.a = charSequence;
        this.b = charSequence2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e8o0)) {
            return false;
        }
        e8o0 e8o0Var = (e8o0) obj;
        return jl40.l(this.a, e8o0Var.a) && jl40.l(this.b, e8o0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return ly3.l(this.a, this.b, "Context(title=", ", value=", Extension.C_BRAKE);
    }
}
