package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class d8o0 {
    public final CharSequence a;
    public final wp2 b;

    public d8o0(CharSequence charSequence, wp2 wp2Var) {
        this.a = charSequence;
        this.b = wp2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d8o0)) {
            return false;
        }
        d8o0 d8o0Var = (d8o0) obj;
        return jl40.l(this.a, d8o0Var.a) && jl40.l(this.b, d8o0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Badge(title=" + ((Object) this.a) + ", backgroundColor=" + this.b + Extension.C_BRAKE;
    }
}
