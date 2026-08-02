package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class gq1 {
    public final vn1 a;
    public final azs0 b;

    public gq1(vn1 vn1Var, azs0 azs0Var) {
        this.a = vn1Var;
        this.b = azs0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gq1)) {
            return false;
        }
        gq1 gq1Var = (gq1) obj;
        return jl40.l(this.a, gq1Var.a) && jl40.l(this.b, gq1Var.b);
    }

    public final int hashCode() {
        vn1 vn1Var = this.a;
        int hashCode = (vn1Var == null ? 0 : vn1Var.hashCode()) * 31;
        azs0 azs0Var = this.b;
        return hashCode + (azs0Var != null ? azs0Var.hashCode() : 0);
    }

    public final String toString() {
        return "AiWidgetsConfigState(aiChatWidgetState=" + this.a + ", smartCameraWidgetState=" + this.b + Extension.C_BRAKE;
    }
}
