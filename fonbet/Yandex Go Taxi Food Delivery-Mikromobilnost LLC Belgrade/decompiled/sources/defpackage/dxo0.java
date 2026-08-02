package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class dxo0 {
    public final CharSequence a;
    public final CharSequence b;

    public dxo0(CharSequence charSequence, CharSequence charSequence2) {
        this.a = charSequence;
        this.b = charSequence2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dxo0)) {
            return false;
        }
        dxo0 dxo0Var = (dxo0) obj;
        return jl40.l(this.a, dxo0Var.a) && jl40.l(this.b, dxo0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return ly3.l(this.a, this.b, "Button(title=", ", subtitle=", Extension.C_BRAKE);
    }
}
