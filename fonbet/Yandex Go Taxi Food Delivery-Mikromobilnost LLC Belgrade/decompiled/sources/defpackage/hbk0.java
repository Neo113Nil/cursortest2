package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class hbk0 {
    public final String a;
    public final boolean b;

    public hbk0(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hbk0)) {
            return false;
        }
        hbk0 hbk0Var = (hbk0) obj;
        return jl40.l(this.a, hbk0Var.a) && this.b == hbk0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return xvz.k("UpsellActionInfo(upsellId=", this.a, ", hideOnAction=", this.b, Extension.C_BRAKE);
    }
}
