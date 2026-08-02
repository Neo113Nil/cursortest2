package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class d6n extends n351 {
    public final List c;
    public final gv90 d;
    public final boolean e;
    public final String f;

    public d6n(List list, gv90 gv90Var, boolean z, String str) {
        super("dynamic-content-photos-key", false, 14);
        this.c = list;
        this.d = gv90Var;
        this.e = z;
        this.f = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d6n)) {
            return false;
        }
        d6n d6nVar = (d6n) obj;
        return this.c.equals(d6nVar.c) && jl40.l(this.d, d6nVar.d) && this.e == d6nVar.e && jl40.l(this.f, d6nVar.f);
    }

    public final int hashCode() {
        int hashCode = this.c.hashCode() * 31;
        gv90 gv90Var = this.d;
        int e = unr0.e((hashCode + (gv90Var == null ? 0 : gv90Var.hashCode())) * 31, 31, this.e);
        String str = this.f;
        return e + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DynamicContentPhotosModel(images=");
        sb.append(this.c);
        sb.append(", action=");
        sb.append(this.d);
        sb.append(", isShimmering=");
        return n.m(", metricaLabel=", this.f, Extension.C_BRAKE, sb, this.e);
    }
}
