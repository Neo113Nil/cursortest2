package defpackage;

import kotlinx.serialization.json.c;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class gvp0 {
    public final String a;
    public final boolean b;
    public final c c;

    public gvp0(String str, boolean z, c cVar) {
        this.a = str;
        this.b = z;
        this.c = cVar;
    }

    public static gvp0 a(gvp0 gvp0Var, boolean z) {
        String str = gvp0Var.a;
        c cVar = gvp0Var.c;
        gvp0Var.getClass();
        return new gvp0(str, z, cVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gvp0)) {
            return false;
        }
        gvp0 gvp0Var = (gvp0) obj;
        return jl40.l(this.a, gvp0Var.a) && this.b == gvp0Var.b && jl40.l(this.c, gvp0Var.c);
    }

    public final int hashCode() {
        int e = unr0.e(this.a.hashCode() * 31, 31, this.b);
        c cVar = this.c;
        return e + (cVar == null ? 0 : cVar.a.hashCode());
    }

    public final String toString() {
        StringBuilder l = oo31.l("SearchOption(id=", this.a, ", isSelected=", ", metaContext=", this.b);
        l.append(this.c);
        l.append(Extension.C_BRAKE);
        return l.toString();
    }
}
