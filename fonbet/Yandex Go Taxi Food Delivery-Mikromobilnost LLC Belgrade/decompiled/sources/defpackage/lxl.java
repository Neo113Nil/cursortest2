package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class lxl extends nxl {
    public final dzp0 a;

    public lxl(dzp0 dzp0Var) {
        this.a = dzp0Var;
    }

    public final see a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof lxl) {
            return jl40.l(this.a, ((lxl) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "UpdateContent(content=" + this.a + Extension.C_BRAKE;
    }
}
