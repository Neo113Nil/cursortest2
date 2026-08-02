package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class b1m extends f1m {
    public final l1o a;
    public final u1m b;
    public final wbe0 c;
    public final ywl d;

    public b1m(l1o l1oVar, u1m u1mVar, wbe0 wbe0Var, ywl ywlVar) {
        this.a = l1oVar;
        this.b = u1mVar;
        this.c = wbe0Var;
        this.d = ywlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!b1m.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        b1m b1mVar = (b1m) obj;
        return jl40.l(this.a, b1mVar.a) && jl40.l(this.b, b1mVar.b) && jl40.l(this.c, b1mVar.c) && jl40.l(this.d, b1mVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "PortionFinished(context=" + this.a + ", query=" + this.b + ", portionParams=" + this.c + ", document=" + this.d + Extension.C_BRAKE;
    }
}
