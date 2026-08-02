package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class iap0 implements jap0 {
    public final CharSequence a;
    public final hap0 b;

    public iap0(CharSequence charSequence, hap0 hap0Var) {
        this.a = charSequence;
        this.b = hap0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iap0)) {
            return false;
        }
        iap0 iap0Var = (iap0) obj;
        return jl40.l(this.a, iap0Var.a) && this.b.equals(iap0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Zone(title=" + ((Object) this.a) + ", style=" + this.b + Extension.C_BRAKE;
    }
}
