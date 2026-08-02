package yads;

/* loaded from: classes10.dex */
public final class yj {
    public final int a;
    public int b;
    public int c;
    public long d;
    public final boolean e;
    public final kc2 f;
    public final kc2 g;
    public int h;
    public int i;

    public yj(kc2 kc2Var, kc2 kc2Var2, boolean z) {
        this.g = kc2Var;
        this.f = kc2Var2;
        this.e = z;
        kc2Var2.e(12);
        this.a = kc2Var2.p();
        kc2Var.e(12);
        this.i = kc2Var.p();
        rq0.a("first_chunk must be 1", kc2Var.b() == 1);
        this.b = -1;
    }

    public final boolean a() {
        int i = this.b + 1;
        this.b = i;
        if (i == this.a) {
            return false;
        }
        this.d = this.e ? this.f.q() : this.f.n();
        if (this.b == this.h) {
            this.c = this.g.p();
            kc2 kc2Var = this.g;
            kc2Var.e(kc2Var.b + 4);
            int i2 = this.i - 1;
            this.i = i2;
            this.h = i2 > 0 ? this.g.p() - 1 : -1;
        }
        return true;
    }
}
