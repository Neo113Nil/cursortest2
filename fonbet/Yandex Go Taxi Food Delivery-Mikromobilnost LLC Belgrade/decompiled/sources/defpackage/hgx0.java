package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class hgx0 {
    public final ngx0 a;
    public final tex0 b;
    public final String c;

    public hgx0(ngx0 ngx0Var, tex0 tex0Var, String str) {
        this.a = ngx0Var;
        this.b = tex0Var;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hgx0)) {
            return false;
        }
        hgx0 hgx0Var = (hgx0) obj;
        return this.a.equals(hgx0Var.a) && jl40.l(this.b, hgx0Var.b) && this.c.equals(hgx0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TariffInfoUiState(tariffNameUiState=");
        sb.append(this.a);
        sb.append(", tariffDescriptionUiState=");
        sb.append(this.b);
        sb.append(", contentDescription=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }
}
