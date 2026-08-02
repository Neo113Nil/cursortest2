package defpackage;

/* loaded from: classes4.dex */
public class oy21 {
    public final td4 a = new td4(true, 0, (z1) new k2(2), false);
    public k2 b;
    public wr1 c;
    public ic51 d;
    public u5z0 e;
    public u5z0 f;
    public ic51 g;
    public yyu0 h;
    public fzo i;
    public boolean j;
    public lpf k;
    public lpf l;

    public final b4x0 a() {
        boolean z;
        if (this.b == null || this.c == null || this.d == null || this.e == null || this.f == null || ((this.g == null && !this.j) || this.h == null)) {
            ny61.r("not all mandatory fields set in V3 TBScertificate generator");
            return null;
        }
        b2 b2Var = new b2(10);
        b2Var.a(this.a);
        b2Var.a(this.b);
        b2Var.a(this.c);
        b2Var.a(this.d);
        b2 b2Var2 = new b2(2);
        b2Var2.a(this.e);
        b2Var2.a(this.f);
        b2Var.a(new iqf(b2Var2));
        ic51 ic51Var = this.g;
        if (ic51Var != null) {
            b2Var.a(ic51Var);
        } else {
            b2Var.a(new iqf());
        }
        b2Var.a(this.h);
        lpf lpfVar = this.k;
        if (lpfVar != null) {
            z = true;
            b2Var.a(new td4(2, 128, 1, (z1) lpfVar, false));
        } else {
            z = true;
        }
        lpf lpfVar2 = this.l;
        if (lpfVar2 != null) {
            b2Var.a(new td4(2, 128, 2, (z1) lpfVar2, false));
        }
        fzo fzoVar = this.i;
        if (fzoVar != null) {
            b2Var.a(new td4(z, 3, (z1) fzoVar, false));
        }
        return b4x0.h(new iqf(b2Var));
    }
}
