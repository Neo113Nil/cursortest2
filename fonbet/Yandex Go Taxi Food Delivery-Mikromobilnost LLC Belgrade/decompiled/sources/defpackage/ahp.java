package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class ahp implements bhp {
    public final String a;
    public final z9r0 b;

    public ahp(String str, z9r0 z9r0Var) {
        this.a = str;
        this.b = z9r0Var;
    }

    @Override // defpackage.nqs0
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ahp)) {
            return false;
        }
        ahp ahpVar = (ahp) obj;
        return jl40.l(this.a, ahpVar.a) && this.b.equals(ahpVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OpenSettingsModal(analyticsName=" + this.a + ", params=" + this.b + Extension.C_BRAKE;
    }
}
