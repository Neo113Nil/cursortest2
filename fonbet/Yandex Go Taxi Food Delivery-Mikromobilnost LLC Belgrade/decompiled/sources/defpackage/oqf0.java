package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class oqf0 implements qqf0 {
    public final boolean a;
    public final tls b;

    public oqf0(tls tlsVar, boolean z) {
        this.a = z;
        this.b = tlsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oqf0)) {
            return false;
        }
        oqf0 oqf0Var = (oqf0) obj;
        return this.a == oqf0Var.a && jl40.l(this.b, oqf0Var.b);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        tls tlsVar = this.b;
        return hashCode + (tlsVar == null ? 0 : tlsVar.hashCode());
    }

    public final String toString() {
        return "SwitchUiState(isChecked=" + this.a + ", checkChangeCallback=" + this.b + Extension.C_BRAKE;
    }
}
