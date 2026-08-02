package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class o8o0 {
    public final CharSequence a;
    public final CharSequence b;

    public o8o0(CharSequence charSequence, CharSequence charSequence2) {
        this.a = charSequence;
        this.b = charSequence2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o8o0)) {
            return false;
        }
        o8o0 o8o0Var = (o8o0) obj;
        return jl40.l(this.a, o8o0Var.a) && jl40.l(this.b, o8o0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return ly3.l(this.a, this.b, "PurchaseButton(title=", ", subtitle=", Extension.C_BRAKE);
    }
}
