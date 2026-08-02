package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class nnn0 {
    public final CharSequence a;
    public final CharSequence b;

    public nnn0(CharSequence charSequence, CharSequence charSequence2) {
        this.a = charSequence;
        this.b = charSequence2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nnn0)) {
            return false;
        }
        nnn0 nnn0Var = (nnn0) obj;
        return jl40.l(this.a, nnn0Var.a) && jl40.l(this.b, nnn0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return ly3.l(this.a, this.b, "StatisticsItem(title=", ", value=", Extension.C_BRAKE);
    }
}
