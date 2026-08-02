package defpackage;

/* loaded from: classes8.dex */
public final class n0p {
    public final String a;
    public final mdd0 b;
    public final b5d0 c;
    public final v7d0 d;
    public final add0 e;
    public final bdd0 f;
    public final yo40 g;
    public final hzk h;
    public final am2 i;

    public n0p(String str, mdd0 mdd0Var, b5d0 b5d0Var, v7d0 v7d0Var, add0 add0Var, bdd0 bdd0Var, yo40 yo40Var, hzk hzkVar, am2 am2Var) {
        this.a = str;
        this.b = mdd0Var;
        this.c = b5d0Var;
        this.d = v7d0Var;
        this.e = add0Var;
        this.f = bdd0Var;
        this.g = yo40Var;
        this.h = hzkVar;
        this.i = am2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n0p) {
            n0p n0pVar = (n0p) obj;
            if (this.a.equals(n0pVar.a) && jl40.l(this.b, n0pVar.b) && jl40.l(this.c, n0pVar.c) && jl40.l(this.d, n0pVar.d) && this.e.equals(n0pVar.e) && this.f.equals(n0pVar.f) && this.g == n0pVar.g && this.h.equals(n0pVar.h) && jl40.l(this.i, n0pVar.i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 961)) * 31;
        am2 am2Var = this.i;
        return (hashCode + (am2Var == null ? 0 : am2Var.hashCode())) * 31;
    }

    public final String toString() {
        return "ExternalModule(instanceId=" + this.a + ", logger=" + this.b + ", imageLoader=" + this.c + ", plusPay=" + this.d + ", plusPayInternal=" + this.e + ", internalDependencies=" + this.f + ", stringsProvider=" + this.g + ", userAvatarProvider=null, urlLauncher=" + this.h + ", tarifficatorFactory=" + this.i + ", transactionUIFactory=null)";
    }
}
