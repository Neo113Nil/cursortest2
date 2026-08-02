package defpackage;

/* loaded from: classes14.dex */
public final class cc9 implements dc9 {
    public final o2y0 a;
    public final c0y0 b;
    public final String c;

    public cc9(o2y0 o2y0Var, c0y0 c0y0Var, String str) {
        this.a = o2y0Var;
        this.b = c0y0Var;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!cc9.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        cc9 cc9Var = (cc9) obj;
        return jl40.l(this.a.b().a, cc9Var.a.b().a) && this.b.equals(cc9Var.b) && this.c.equals(cc9Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.b().a.hashCode() * 31)) * 31);
    }
}
