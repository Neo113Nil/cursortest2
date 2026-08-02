package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class hvm {
    public final gvm a;
    public final gvm b;

    public hvm(gvm gvmVar, gvm gvmVar2) {
        this.a = gvmVar;
        this.b = gvmVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hvm)) {
            return false;
        }
        hvm hvmVar = (hvm) obj;
        return this.a.equals(hvmVar.a) && jl40.l(this.b, hvmVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        gvm gvmVar = this.b;
        return hashCode + (gvmVar == null ? 0 : gvmVar.hashCode());
    }

    public final String toString() {
        return "DueButtonsConfig(buttonContinue=" + this.a + ", buttonDelete=" + this.b + Extension.C_BRAKE;
    }
}
