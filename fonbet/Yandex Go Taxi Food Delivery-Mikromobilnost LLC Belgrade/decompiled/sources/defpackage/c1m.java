package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class c1m extends f1m {
    public final l1o a;
    public final u1m b;
    public final wbe0 c;

    public c1m(l1o l1oVar, u1m u1mVar, wbe0 wbe0Var) {
        this.a = l1oVar;
        this.b = u1mVar;
        this.c = wbe0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!c1m.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        c1m c1mVar = (c1m) obj;
        return jl40.l(this.a, c1mVar.a) && jl40.l(this.b, c1mVar.b) && jl40.l(this.c, c1mVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "PortionStarted(context=" + this.a + ", query=" + this.b + ", portionParams=" + this.c + Extension.C_BRAKE;
    }
}
