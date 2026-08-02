package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class dri {
    public final sqi a;
    public final m8s0 b;

    public dri(sqi sqiVar, l8s0 l8s0Var) {
        this.a = sqiVar;
        this.b = l8s0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dri)) {
            return false;
        }
        dri driVar = (dri) obj;
        return this.a.equals(driVar.a) && jl40.l(this.b, driVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        m8s0 m8s0Var = this.b;
        return hashCode + (m8s0Var == null ? 0 : m8s0Var.hashCode());
    }

    public final String toString() {
        return "TrackingPopup(popupSettings=" + this.a + ", showPolicy=" + this.b + Extension.C_BRAKE;
    }
}
