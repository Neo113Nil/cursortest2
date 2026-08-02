package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class aq1 {
    public final pn1 a;
    public final zys0 b;

    public aq1(pn1 pn1Var, zys0 zys0Var) {
        this.a = pn1Var;
        this.b = zys0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aq1)) {
            return false;
        }
        aq1 aq1Var = (aq1) obj;
        return jl40.l(this.a, aq1Var.a) && jl40.l(this.b, aq1Var.b);
    }

    public final int hashCode() {
        pn1 pn1Var = this.a;
        int hashCode = (pn1Var == null ? 0 : pn1Var.hashCode()) * 31;
        zys0 zys0Var = this.b;
        return hashCode + (zys0Var != null ? zys0Var.hashCode() : 0);
    }

    public final String toString() {
        return "AiWidgetsConfig(aiChatWidget=" + this.a + ", smartCameraWidget=" + this.b + Extension.C_BRAKE;
    }
}
