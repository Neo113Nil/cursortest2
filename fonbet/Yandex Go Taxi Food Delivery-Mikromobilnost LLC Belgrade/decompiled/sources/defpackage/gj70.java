package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public final class gj70 {
    public final String a;
    public final boolean b;

    public gj70(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gj70)) {
            return false;
        }
        gj70 gj70Var = (gj70) obj;
        return this.a.equals(gj70Var.a) && this.b == gj70Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return xvz.k("OrderByCond(key=", this.a, ", asc=", this.b, Extension.C_BRAKE);
    }
}
