package yads;

import android.content.Context;

/* loaded from: classes10.dex */
public final class u72 {
    public final hl3 a;
    public final o72 b;
    public final qz2 c;
    public final r62 d;
    public final hk2 e;
    public final h82 f;
    public final bf2 g;
    public final bf2 h;
    public final uo2 i;
    public final s72 j = new s72(this);
    public final oi1 k = new oi1();
    public bf2 l;

    public u72(Context context, v9 v9Var, ov2 ov2Var, q62 q62Var, we3 we3Var, ej3 ej3Var, hl3 hl3Var, jg3 jg3Var, dl3 dl3Var, zi3 zi3Var, o72 o72Var, nj2 nj2Var, qz2 qz2Var) {
        this.a = hl3Var;
        this.b = o72Var;
        this.c = qz2Var;
        this.i = new uo2(hl3Var, new t72(this));
        k82 k82Var = new k82(hl3Var);
        this.d = new r62(q62Var);
        this.f = new h82(q62Var);
        vg3 vg3Var = new vg3();
        new y62(hl3Var, q62Var, k82Var, o72Var).a(vg3Var);
        n72 n72Var = new n72(context, v9Var, ov2Var, q62Var, we3Var.a(), k82Var, jg3Var, dl3Var, vg3Var, zi3Var);
        bp2 bp2Var = new bp2(q62Var, we3Var.a(), vg3Var);
        i82 i82Var = new i82(q62Var, ej3Var);
        hk2 hk2Var = new hk2(we3Var, new y31(context, new t42(v9Var), nj2Var));
        this.e = hk2Var;
        this.h = new bf2(hl3Var, n72Var, i82Var, hk2Var);
        this.g = new bf2(hl3Var, bp2Var, i82Var, hk2Var);
    }

    public final void a(bf2 bf2Var) {
        this.l = bf2Var;
        if (bf2Var != null) {
            bf2Var.e.a = this.j;
        }
        if (bf2Var != null) {
            bf2Var.b.a(bf2Var.e);
            bf2Var.b.play();
        }
    }
}
