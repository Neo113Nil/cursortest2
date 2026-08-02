package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes7.dex */
public final class fo81 {
    public final String a;
    public final qu81 b;

    public fo81(String str, qu81 qu81Var) {
        this.a = str;
        this.b = qu81Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fo81)) {
            return false;
        }
        fo81 fo81Var = (fo81) obj;
        return jl40.l(this.a, fo81Var.a) && this.b.equals(fo81Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DebugPanelSdkIntegrationData(sdkVersion=" + this.a + ", sdkIntegrationStatusData=" + this.b + Extension.C_BRAKE;
    }
}
