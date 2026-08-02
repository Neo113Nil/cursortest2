package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class bo10 {
    public final String a;
    public final String b;
    public final boolean c;

    public bo10(String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bo10)) {
            return false;
        }
        bo10 bo10Var = (bo10) obj;
        return jl40.l(this.a, bo10Var.a) && jl40.l(this.b, bo10Var.b) && this.c == bo10Var.c;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return Boolean.hashCode(this.c) + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return x4e.i(b64.v("MenuWebViewData(menuUrl=", this.a, ", token=", this.b, ", isNeedAuthorization="), this.c, Extension.C_BRAKE);
    }
}
