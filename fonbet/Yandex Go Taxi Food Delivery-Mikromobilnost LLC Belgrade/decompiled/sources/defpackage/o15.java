package defpackage;

/* loaded from: classes5.dex */
public abstract class o15 extends a151 {
    @Override // defpackage.a151
    public final void a(n351 n351Var, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(955719335);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(n351Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? btsVar.k(this) : btsVar.e(this) ? 32 : 16;
        }
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            String a = n351Var.a();
            btsVar.c0(-676717751, a);
            if (a != null) {
                btsVar.e0(496632019);
                ib51.a(a, wwg.S(-317897265, true, new u5(29, this, n351Var), btsVar), btsVar, 48);
                btsVar.t(false);
            } else {
                btsVar.e0(496770403);
                e(n351Var, btsVar, (i2 & 112) | (i2 & 14) | 64);
                btsVar.t(false);
            }
            btsVar.t(false);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new m0(this, n351Var, i, 28);
        }
    }

    public abstract void e(n351 n351Var, fid fidVar, int i);
}
