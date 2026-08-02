package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class h4f0 extends s120 {
    public final g720 a;
    public final boolean b;
    public final String c = "Messaging.Arguments.Key.PrivacySettings";

    public h4f0(g720 g720Var, boolean z) {
        this.a = g720Var;
        this.b = z;
    }

    @Override // defpackage.s120
    public final String a() {
        return this.c;
    }

    @Override // defpackage.s120
    public final g720 b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h4f0)) {
            return false;
        }
        h4f0 h4f0Var = (h4f0) obj;
        return jl40.l(this.a, h4f0Var.a) && this.b == h4f0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PrivacySettingsArguments(source=" + this.a + ", openSearchItem=" + this.b + Extension.C_BRAKE;
    }
}
