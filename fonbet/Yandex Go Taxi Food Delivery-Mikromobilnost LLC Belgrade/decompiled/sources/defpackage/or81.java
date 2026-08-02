package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes7.dex */
public final class or81 {
    public final String a;
    public final String b;

    public or81(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof or81)) {
            return false;
        }
        or81 or81Var = (or81) obj;
        return jl40.l(this.a, or81Var.a) && jl40.l(this.b, or81Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("DebugPanelMediationAdapterParameterData(name=", this.a, ", value=", this.b, Extension.C_BRAKE);
    }
}
