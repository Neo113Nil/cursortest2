package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class dz4 extends fz4 {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;

    public dz4(String str, String str2, String str3, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
    }

    @Override // defpackage.fz4
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dz4)) {
            return false;
        }
        dz4 dz4Var = (dz4) obj;
        return jl40.l(this.a, dz4Var.a) && jl40.l(this.b, dz4Var.b) && jl40.l(this.c, dz4Var.c) && this.d == dz4Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return nnm.i(this.c, ", isDeletable=", Extension.C_BRAKE, b64.v("TrustedContactItem(id=", this.a, ", title=", this.b, ", subtitle="), this.d);
    }
}
