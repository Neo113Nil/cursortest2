package defpackage;

import com.yandex.go.address.models.Address;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class lu0 {
    public final Address a;
    public final bgq0 b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    public lu0(bgq0 bgq0Var, Address address, String str, String str2, String str3, String str4, String str5) {
        this.a = address;
        this.b = bgq0Var;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lu0)) {
            return false;
        }
        lu0 lu0Var = (lu0) obj;
        return jl40.l(this.a, lu0Var.a) && jl40.l(this.b, lu0Var.b) && jl40.l(this.c, lu0Var.c) && jl40.l(this.d, lu0Var.d) && jl40.l(this.e, lu0Var.e) && jl40.l(this.f, lu0Var.f) && jl40.l(this.g, lu0Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + unr0.b(unr0.b(unr0.b(unr0.b((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AddressFinalCorrection(address=");
        sb.append(this.a);
        sb.append(", contact=");
        sb.append(this.b);
        sb.append(", floor=");
        g8e.D(sb, this.c, ", apartment=", this.d, ", doorPhone=");
        g8e.D(sb, this.e, ", porch=", this.f, ", comment=");
        return oyr.t(sb, this.g, Extension.C_BRAKE);
    }
}
