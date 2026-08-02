package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class exo0 {
    public final CharSequence a;
    public final String b;

    public exo0(CharSequence charSequence, String str) {
        this.a = charSequence;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof exo0)) {
            return false;
        }
        exo0 exo0Var = (exo0) obj;
        return jl40.l(this.a, exo0Var.a) && jl40.l(this.b, exo0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "LegalInfo(text=" + ((Object) this.a) + ", link=" + this.b + Extension.C_BRAKE;
    }
}
