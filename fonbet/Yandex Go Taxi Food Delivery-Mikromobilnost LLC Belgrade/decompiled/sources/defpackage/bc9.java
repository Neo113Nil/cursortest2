package defpackage;

/* loaded from: classes14.dex */
public final class bc9 implements dc9 {
    public final o2y0 a;
    public final zzs b;
    public final zzs c;
    public final int d;

    public bc9(o2y0 o2y0Var, zzs zzsVar, zzs zzsVar2, int i) {
        this.a = o2y0Var;
        this.b = zzsVar;
        this.c = zzsVar2;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!bc9.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        bc9 bc9Var = (bc9) obj;
        return jl40.l(this.a.b().a, bc9Var.a.b().a) && this.d == bc9Var.d && jl40.l(this.b, bc9Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (((this.a.b().a.hashCode() * 31) + this.d) * 31);
    }
}
