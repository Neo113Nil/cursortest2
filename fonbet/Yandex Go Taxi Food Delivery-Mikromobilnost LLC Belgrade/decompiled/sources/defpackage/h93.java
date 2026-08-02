package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public final class h93 {
    public final String a;
    public final String b;
    public final int c;
    public final int d;
    public final boolean e;
    public Long f;

    public h93(String str, boolean z, String str2, int i, int i2, int i3) {
        z = (i3 & 16) != 0 ? false : z;
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
        this.e = z;
        this.f = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h93)) {
            return false;
        }
        h93 h93Var = (h93) obj;
        return jl40.l(this.a, h93Var.a) && jl40.l(this.b, h93Var.b) && this.c == h93Var.c && this.d == h93Var.d && this.e == h93Var.e && jl40.l(this.f, h93Var.f);
    }

    public final int hashCode() {
        int e = unr0.e(oyr.b(this.d, oyr.b(this.c, unr0.b(this.a.hashCode() * 31, 31, this.b), 31), 31), 31, this.e);
        Long l = this.f;
        return e + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        Long l = this.f;
        StringBuilder v = b64.v("AssetPathEntity(id=", this.a, ", name=", this.b, ", assetCount=");
        vfc.u(this.c, this.d, ", typeInt=", ", isAll=", v);
        v.append(this.e);
        v.append(", modifiedDate=");
        v.append(l);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
