package defpackage;

import yads.w31;
import yads.wk2;
import yads.y31;

/* loaded from: classes7.dex */
public class ao81 implements kq71 {
    public final int B;
    public final int C;
    public final boolean D;
    public final wk2 E;
    public final int F;
    public final wk2 G;
    public final int H;
    public final int I;
    public final int J;
    public final wk2 K;
    public final wk2 L;
    public final int M;
    public final int N;
    public final boolean O;
    public final boolean P;
    public final boolean Q;
    public final w31 R;
    public final y31 S;
    public final int a;
    public final int b;
    public final int c;
    public final int w;
    public final int x = 0;
    public final int y = 0;
    public final int z = 0;
    public final int A = 0;

    static {
        new ao81(new wk81());
    }

    public ao81(wk81 wk81Var) {
        this.a = wk81Var.a;
        this.b = wk81Var.b;
        this.c = wk81Var.c;
        this.w = wk81Var.d;
        this.B = wk81Var.e;
        this.C = wk81Var.f;
        this.D = wk81Var.g;
        this.E = wk81Var.h;
        this.F = wk81Var.i;
        this.G = wk81Var.j;
        this.H = wk81Var.k;
        this.I = wk81Var.l;
        this.J = wk81Var.m;
        this.K = wk81Var.n;
        this.L = wk81Var.o;
        this.M = wk81Var.p;
        this.N = wk81Var.q;
        this.O = wk81Var.r;
        this.P = wk81Var.s;
        this.Q = wk81Var.t;
        this.R = w31.a(wk81Var.u);
        Object[] array = wk81Var.v.toArray();
        this.S = y31.l(array.length, array);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                ao81 ao81Var = (ao81) obj;
                if (this.a == ao81Var.a && this.b == ao81Var.b && this.c == ao81Var.c && this.w == ao81Var.w && this.x == ao81Var.x && this.y == ao81Var.y && this.z == ao81Var.z && this.A == ao81Var.A && this.D == ao81Var.D && this.B == ao81Var.B && this.C == ao81Var.C && this.E.equals(ao81Var.E) && this.F == ao81Var.F && this.G.equals(ao81Var.G) && this.H == ao81Var.H && this.I == ao81Var.I && this.J == ao81Var.J && this.K.equals(ao81Var.K) && this.L.equals(ao81Var.L) && this.M == ao81Var.M && this.N == ao81Var.N && this.O == ao81Var.O && this.P == ao81Var.P && this.Q == ao81Var.Q) {
                    w31 w31Var = ao81Var.R;
                    w31 w31Var2 = this.R;
                    w31Var2.getClass();
                    if (!(w31Var2 == w31Var ? true : w31Var != null ? w31Var2.entrySet().equals(w31Var.entrySet()) : false) || !this.S.equals(ao81Var.S)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.S.hashCode() + ((mja1.c(this.R.entrySet()) + ((((((((((((this.L.hashCode() + ((this.K.hashCode() + ((((((((this.G.hashCode() + ((((this.E.hashCode() + ((((((((((((((((((((((this.a + 31) * 31) + this.b) * 31) + this.c) * 31) + this.w) * 31) + this.x) * 31) + this.y) * 31) + this.z) * 31) + this.A) * 31) + (this.D ? 1 : 0)) * 31) + this.B) * 31) + this.C) * 31)) * 31) + this.F) * 31)) * 31) + this.H) * 31) + this.I) * 31) + this.J) * 31)) * 31)) * 31) + this.M) * 31) + this.N) * 31) + (this.O ? 1 : 0)) * 31) + (this.P ? 1 : 0)) * 31) + (this.Q ? 1 : 0)) * 31)) * 31);
    }
}
