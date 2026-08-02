package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class kxy0 {
    public final piy a;
    public final piy b;

    public kxy0(piy piyVar, piy piyVar2) {
        this.a = piyVar;
        this.b = piyVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kxy0)) {
            return false;
        }
        kxy0 kxy0Var = (kxy0) obj;
        return this.a.equals(kxy0Var.a) && jl40.l(this.b, kxy0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        piy piyVar = this.b;
        return hashCode + (piyVar == null ? 0 : piyVar.hashCode());
    }

    public final String toString() {
        return "ThemedLinearGradient(default=" + this.a + ", dark=" + this.b + Extension.C_BRAKE;
    }
}
