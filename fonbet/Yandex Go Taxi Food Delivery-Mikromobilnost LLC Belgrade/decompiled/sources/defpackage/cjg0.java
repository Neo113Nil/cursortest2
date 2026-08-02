package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class cjg0 implements n1m {
    public final u1m a;
    public final ywl b;
    public final boolean c;
    public final List d;

    public cjg0(u1m u1mVar, ywl ywlVar, boolean z, List list) {
        this.a = u1mVar;
        this.b = ywlVar;
        this.c = z;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cjg0)) {
            return false;
        }
        cjg0 cjg0Var = (cjg0) obj;
        return jl40.l(this.a, cjg0Var.a) && jl40.l(this.b, cjg0Var.b) && this.c == cjg0Var.c && jl40.l(this.d, cjg0Var.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ywl ywlVar = this.b;
        return this.d.hashCode() + unr0.e((hashCode + (ywlVar == null ? 0 : ywlVar.hashCode())) * 31, 31, this.c);
    }

    public final String toString() {
        return "QueriedDocumentOrigin(query=" + this.a + ", preview=" + this.b + ", isForce=" + this.c + ", patchParams=" + this.d + Extension.C_BRAKE;
    }
}
