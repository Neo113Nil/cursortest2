package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class hwv extends iwv {
    public final String a;
    public final boolean b;
    public final String c;

    public hwv(String str, boolean z, String str2) {
        this.a = str;
        this.b = z;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hwv)) {
            return false;
        }
        hwv hwvVar = (hwv) obj;
        return jl40.l(this.a, hwvVar.a) && this.b == hwvVar.b && this.c.equals(hwvVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.e(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return oyr.t(oo31.l("Support(supportUrl=", this.a, ", showLogout=", ", supportType=", this.b), this.c, Extension.C_BRAKE);
    }
}
