package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class jug {
    public final mt a;
    public final mt b;

    public jug(mt mtVar, mt mtVar2) {
        this.a = mtVar;
        this.b = mtVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jug)) {
            return false;
        }
        jug jugVar = (jug) obj;
        return jl40.l(this.a, jugVar.a) && jl40.l(this.b, jugVar.b);
    }

    public final int hashCode() {
        mt mtVar = this.a;
        int hashCode = (mtVar == null ? 0 : mtVar.hashCode()) * 31;
        mt mtVar2 = this.b;
        return hashCode + (mtVar2 != null ? mtVar2.hashCode() : 0);
    }

    public final String toString() {
        return "DebtActionButtons(primaryActionButtonViewModel=" + this.a + ", secondaryActionButtonViewModel=" + this.b + Extension.C_BRAKE;
    }
}
