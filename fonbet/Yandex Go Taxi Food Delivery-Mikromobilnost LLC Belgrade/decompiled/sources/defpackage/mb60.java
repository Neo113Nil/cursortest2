package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class mb60 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public mb60(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mb60)) {
            return false;
        }
        mb60 mb60Var = (mb60) obj;
        return this.a.equals(mb60Var.a) && this.b.equals(mb60Var.b) && this.c.equals(mb60Var.c) && jl40.l(this.d, mb60Var.d);
    }

    public final int hashCode() {
        int b = unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return b + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return g8e.r(b64.v("NoBackgroundLocationPermissionState(title=", this.a, ", description=", this.b, ", buttonText="), this.c, ", imageUrl=", this.d, Extension.C_BRAKE);
    }
}
