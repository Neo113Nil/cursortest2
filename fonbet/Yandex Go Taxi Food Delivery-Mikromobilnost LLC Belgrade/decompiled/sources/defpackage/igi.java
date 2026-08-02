package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public final class igi {
    public final nbi a;
    public final vli b;
    public final psi c;

    public igi(nbi nbiVar, vli vliVar, psi psiVar) {
        this.a = nbiVar;
        this.b = vliVar;
        this.c = psiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof igi)) {
            return false;
        }
        igi igiVar = (igi) obj;
        return jl40.l(this.a, igiVar.a) && jl40.l(this.b, igiVar.b) && jl40.l(this.c, igiVar.c);
    }

    public final int hashCode() {
        nbi nbiVar = this.a;
        int hashCode = (nbiVar == null ? 0 : nbiVar.hashCode()) * 31;
        vli vliVar = this.b;
        int hashCode2 = (hashCode + (vliVar == null ? 0 : vliVar.hashCode())) * 31;
        psi psiVar = this.c;
        return hashCode2 + (psiVar != null ? psiVar.hashCode() : 0);
    }

    public final String toString() {
        return "DeliveryOrderingProcess(orderDetailsStep=" + this.a + ", recipientStep=" + this.b + ", summaryStep=" + this.c + Extension.C_BRAKE;
    }

    public igi() {
        this(null, null, null);
    }
}
