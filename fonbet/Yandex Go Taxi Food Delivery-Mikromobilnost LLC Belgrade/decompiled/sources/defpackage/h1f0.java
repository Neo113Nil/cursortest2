package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class h1f0 {
    public final CharSequence a;
    public final String b;

    public h1f0(CharSequence charSequence, String str) {
        this.a = charSequence;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h1f0)) {
            return false;
        }
        h1f0 h1f0Var = (h1f0) obj;
        return jl40.l(this.a, h1f0Var.a) && jl40.l(this.b, h1f0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PriceWithDescription(price=" + ((Object) this.a) + ", contentDescription=" + this.b + Extension.C_BRAKE;
    }
}
