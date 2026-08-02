package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class pkm0 implements pre {
    public final String a;
    public final List b;
    public final rkm0 c;
    public final String d;
    public final boolean e;

    public pkm0(String str, List list, rkm0 rkm0Var, String str2, boolean z) {
        this.a = str;
        this.b = list;
        this.c = rkm0Var;
        this.d = str2;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pkm0)) {
            return false;
        }
        pkm0 pkm0Var = (pkm0) obj;
        return jl40.l(this.a, pkm0Var.a) && this.b.equals(pkm0Var.b) && jl40.l(this.c, pkm0Var.c) && jl40.l(this.d, pkm0Var.d) && this.e == pkm0Var.e;
    }

    @Override // defpackage.pre
    public final String getId() {
        return this.a;
    }

    @Override // defpackage.pre
    public final String getType() {
        return "scalable-selector";
    }

    public final int hashCode() {
        int c = unr0.c(this.a.hashCode() * 31, 31, this.b);
        rkm0 rkm0Var = this.c;
        return Boolean.hashCode(this.e) + unr0.b((c + (rkm0Var == null ? 0 : rkm0Var.hashCode())) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder r = xvz.r("ScalableSelectorRemoteCoreWidget(id=", this.a, ", options=", this.b, ", style=");
        r.append(this.c);
        r.append(", formStateKey=");
        r.append(this.d);
        r.append(", scrollable=");
        return x4e.i(r, this.e, Extension.C_BRAKE);
    }
}
