package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class a1m extends f1m {
    public final l1o a;
    public final u1m b;
    public final wbe0 c;
    public final Throwable d;

    public a1m(l1o l1oVar, u1m u1mVar, wbe0 wbe0Var, Throwable th) {
        this.a = l1oVar;
        this.b = u1mVar;
        this.c = wbe0Var;
        this.d = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!a1m.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        a1m a1mVar = (a1m) obj;
        return jl40.l(this.a, a1mVar.a) && jl40.l(this.b, a1mVar.b) && jl40.l(this.c, a1mVar.c) && jl40.l(this.d, a1mVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "PortionFailed(context=" + this.a + ", query=" + this.b + ", portionParams=" + this.c + ", error=" + this.d + Extension.C_BRAKE;
    }
}
