package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class mkm0 extends n351 {
    public final List c;
    public final qkm0 d;
    public final boolean e;
    public final String f;

    public mkm0(List list, qkm0 qkm0Var, boolean z, String str) {
        super("scalable-selector", false, 14);
        this.c = list;
        this.d = qkm0Var;
        this.e = z;
        this.f = str;
    }

    @Override // defpackage.n351
    public final String a() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mkm0)) {
            return false;
        }
        mkm0 mkm0Var = (mkm0) obj;
        return jl40.l(this.c, mkm0Var.c) && jl40.l(this.d, mkm0Var.d) && this.e == mkm0Var.e && jl40.l(this.f, mkm0Var.f);
    }

    public final int hashCode() {
        int hashCode = this.c.hashCode() * 31;
        qkm0 qkm0Var = this.d;
        int e = unr0.e((hashCode + (qkm0Var == null ? 0 : qkm0Var.hashCode())) * 31, 31, this.e);
        String str = this.f;
        return e + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ScalableSelectorModel(options=");
        sb.append(this.c);
        sb.append(", style=");
        sb.append(this.d);
        sb.append(", scrollable=");
        return n.m(", id=", this.f, Extension.C_BRAKE, sb, this.e);
    }
}
