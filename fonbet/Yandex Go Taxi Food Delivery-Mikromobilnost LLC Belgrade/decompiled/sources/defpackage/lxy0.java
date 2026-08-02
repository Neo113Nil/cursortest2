package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class lxy0 {
    public final hzt a;
    public final hzt b;

    public lxy0(hzt hztVar, hzt hztVar2) {
        this.a = hztVar;
        this.b = hztVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lxy0)) {
            return false;
        }
        lxy0 lxy0Var = (lxy0) obj;
        return this.a.equals(lxy0Var.a) && jl40.l(this.b, lxy0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        hzt hztVar = this.b;
        return hashCode + (hztVar == null ? 0 : hztVar.hashCode());
    }

    public final String toString() {
        return "ThemedLinearGradientState(default=" + this.a + ", dark=" + this.b + Extension.C_BRAKE;
    }
}
