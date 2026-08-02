package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class a721 {
    public final String a;
    public final boolean b;

    public a721(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a721)) {
            return false;
        }
        a721 a721Var = (a721) obj;
        return jl40.l(this.a, a721Var.a) && this.b == a721Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return xvz.k("UpdateFlowData(tariffClass=", this.a, ", clarifyDestinationVisible=", this.b, Extension.C_BRAKE);
    }
}
