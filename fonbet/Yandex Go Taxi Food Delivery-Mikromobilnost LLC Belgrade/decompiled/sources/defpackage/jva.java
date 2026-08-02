package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class jva {
    public final CharSequence a;
    public final ovi0 b;

    public jva(CharSequence charSequence, ovi0 ovi0Var) {
        this.a = charSequence;
        this.b = ovi0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jva)) {
            return false;
        }
        jva jvaVar = (jva) obj;
        return jl40.l(this.a, jvaVar.a) && jl40.l(this.b, jvaVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ovi0 ovi0Var = this.b;
        return hashCode + (ovi0Var == null ? 0 : ovi0Var.hashCode());
    }

    public final String toString() {
        return "ChargersSubscriptionTermItem(title=" + ((Object) this.a) + ", leadIconTag=" + this.b + Extension.C_BRAKE;
    }
}
