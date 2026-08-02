package defpackage;

import java.util.List;
import java.util.Map;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class orz implements qrz {
    public final m7v a;
    public final mjy0 b;
    public final mjy0 c;
    public final List d;
    public final nrz e;
    public final Map f;

    public orz(h7v h7vVar, mjy0 mjy0Var, mjy0 mjy0Var2, List list, nrz nrzVar, Map map) {
        this.a = h7vVar;
        this.b = mjy0Var;
        this.c = mjy0Var2;
        this.d = list;
        this.e = nrzVar;
        this.f = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof orz)) {
            return false;
        }
        orz orzVar = (orz) obj;
        return jl40.l(this.a, orzVar.a) && this.b.equals(orzVar.b) && this.c.equals(orzVar.c) && this.d.equals(orzVar.d) && this.e.equals(orzVar.e) && this.f.equals(orzVar.f);
    }

    public final int hashCode() {
        m7v m7vVar = this.a;
        return this.f.hashCode() + ((this.e.hashCode() + unr0.c((this.c.hashCode() + ((this.b.hashCode() + ((m7vVar == null ? 0 : m7vVar.hashCode()) * 31)) * 31)) * 31, 31, this.d)) * 31);
    }

    public final String toString() {
        return "Content(image=" + this.a + ", title=" + this.b + ", subtitle=" + this.c + ", bullets=" + this.d + ", actionButton=" + this.e + ", textTemplates=" + this.f + Extension.C_BRAKE;
    }
}
