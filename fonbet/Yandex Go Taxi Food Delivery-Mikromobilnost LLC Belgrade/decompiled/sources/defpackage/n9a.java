package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class n9a {
    public final String a;
    public final boolean b;

    public n9a(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n9a)) {
            return false;
        }
        n9a n9aVar = (n9a) obj;
        return jl40.l(this.a, n9aVar.a) && this.b == n9aVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return xvz.k("ChargersOfferToggle(type=", this.a, ", isChecked=", this.b, Extension.C_BRAKE);
    }
}
