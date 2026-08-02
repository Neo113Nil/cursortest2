package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class e6l0 {
    public final p0c0 a;
    public final String b;

    public e6l0(p0c0 p0c0Var, String str) {
        this.a = p0c0Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e6l0)) {
            return false;
        }
        e6l0 e6l0Var = (e6l0) obj;
        return jl40.l(this.a, e6l0Var.a) && jl40.l(this.b, e6l0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "AppearanceInfo(style=" + this.a + ", defaultIcon=" + this.b + Extension.C_BRAKE;
    }
}
