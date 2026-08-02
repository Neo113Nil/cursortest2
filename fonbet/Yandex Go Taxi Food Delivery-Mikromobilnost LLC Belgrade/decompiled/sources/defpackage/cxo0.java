package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class cxo0 {
    public final CharSequence a;
    public final int b;

    public cxo0(int i, CharSequence charSequence) {
        this.a = charSequence;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cxo0)) {
            return false;
        }
        cxo0 cxo0Var = (cxo0) obj;
        return jl40.l(this.a, cxo0Var.a) && this.b == cxo0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Badge(text=" + ((Object) this.a) + ", backgroundColor=" + this.b + Extension.C_BRAKE;
    }
}
