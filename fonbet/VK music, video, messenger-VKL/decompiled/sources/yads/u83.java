package yads;

/* loaded from: classes10.dex */
public class u83 implements xq {
    public static final u83 B = new u83(new t83());
    public final x51 A;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final boolean l;
    public final s51 m;
    public final int n;
    public final s51 o;
    public final int p;
    public final int q;
    public final int r;
    public final s51 s;
    public final s51 t;
    public final int u;
    public final int v;
    public final boolean w;
    public final boolean x;
    public final boolean y;
    public final v51 z;

    public u83(t83 t83Var) {
        this.b = t83Var.a;
        this.c = t83Var.b;
        this.d = t83Var.c;
        this.e = t83Var.d;
        this.f = t83Var.e;
        this.g = t83Var.f;
        this.h = t83Var.g;
        this.i = t83Var.h;
        this.j = t83Var.i;
        this.k = t83Var.j;
        this.l = t83Var.k;
        this.m = t83Var.l;
        this.n = t83Var.m;
        this.o = t83Var.n;
        this.p = t83Var.o;
        this.q = t83Var.p;
        this.r = t83Var.q;
        this.s = t83Var.r;
        this.t = t83Var.s;
        this.u = t83Var.t;
        this.v = t83Var.u;
        this.w = t83Var.v;
        this.x = t83Var.w;
        this.y = t83Var.x;
        this.z = v51.a(t83Var.y);
        this.A = x51.a(t83Var.z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x00cf, code lost:
    
        if (((yads.x51) r2.entrySet()).equals(r3.entrySet()) != false) goto L64;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            u83 u83Var = (u83) obj;
            if (this.b == u83Var.b && this.c == u83Var.c && this.d == u83Var.d && this.e == u83Var.e && this.f == u83Var.f && this.g == u83Var.g && this.h == u83Var.h && this.i == u83Var.i && this.l == u83Var.l && this.j == u83Var.j && this.k == u83Var.k && this.m.equals(u83Var.m) && this.n == u83Var.n && this.o.equals(u83Var.o) && this.p == u83Var.p && this.q == u83Var.q && this.r == u83Var.r && this.s.equals(u83Var.s) && this.t.equals(u83Var.t) && this.u == u83Var.u && this.v == u83Var.v && this.w == u83Var.w && this.x == u83Var.x && this.y == u83Var.y) {
                v51 v51Var = this.z;
                v51 v51Var2 = u83Var.z;
                v51Var.getClass();
                if (v51Var != v51Var2) {
                    if (v51Var2 != null) {
                    }
                }
                if (this.A.equals(u83Var.A)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return this.A.hashCode() + ((pz2.a(this.z.entrySet()) + ((((((((((((this.t.hashCode() + ((this.s.hashCode() + ((((((((this.o.hashCode() + ((((this.m.hashCode() + ((((((((((((((((((((((this.b + 31) * 31) + this.c) * 31) + this.d) * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31) + this.h) * 31) + this.i) * 31) + (this.l ? 1 : 0)) * 31) + this.j) * 31) + this.k) * 31)) * 31) + this.n) * 31)) * 31) + this.p) * 31) + this.q) * 31) + this.r) * 31)) * 31)) * 31) + this.u) * 31) + this.v) * 31) + (this.w ? 1 : 0)) * 31) + (this.x ? 1 : 0)) * 31) + (this.y ? 1 : 0)) * 31)) * 31);
    }
}
