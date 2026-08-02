package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class c040 implements d040 {
    public final String a;
    public final List b;
    public final String c;
    public final CharSequence d;
    public final su30 e;
    public final boolean f;
    public final String g;

    public c040(String str, List list, String str2, CharSequence charSequence, su30 su30Var, boolean z, String str3) {
        this.a = str;
        this.b = list;
        this.c = str2;
        this.d = charSequence;
        this.e = su30Var;
        this.f = z;
        this.g = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c040)) {
            return false;
        }
        c040 c040Var = (c040) obj;
        return jl40.l(this.a, c040Var.a) && jl40.l(this.b, c040Var.b) && jl40.l(this.c, c040Var.c) && jl40.l(this.d, c040Var.d) && jl40.l(this.e, c040Var.e) && this.f == c040Var.f && jl40.l(this.g, c040Var.g);
    }

    public final int hashCode() {
        String str = this.a;
        return this.g.hashCode() + unr0.e((this.e.hashCode() + smw0.b(unr0.b(unr0.c((str == null ? 0 : str.hashCode()) * 31, 31, this.b), 31, this.c), 31, this.d)) * 31, 31, this.f);
    }

    public final String toString() {
        StringBuilder r = xvz.r("MtSimpleRoute(id=", this.a, ", snippets=", this.b, ", duration=");
        r.append(this.c);
        r.append(", walkDuration=");
        r.append((Object) this.d);
        r.append(", route=");
        r.append(this.e);
        r.append(", isSelected=");
        r.append(this.f);
        r.append(", contentDescription=");
        return oyr.t(r, this.g, Extension.C_BRAKE);
    }
}
