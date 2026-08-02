package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class cq5 {
    public final String a;
    public final boolean b;

    public cq5(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cq5)) {
            return false;
        }
        cq5 cq5Var = (cq5) obj;
        return jl40.l(this.a, cq5Var.a) && this.b == cq5Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return xvz.k("AutoAccept(title=", this.a, ", isAutoAcceptEnabled=", this.b, Extension.C_BRAKE);
    }
}
