package yads;

import android.content.Context;
import android.view.View;

/* loaded from: classes10.dex */
public final class ed3 {
    public final lg3 a;
    public final il3 b;
    public final nf3 c;
    public final nh3 d;
    public final cl3 e;
    public final w5 f;
    public final ch3 g;
    public final zg3 h;
    public final dg3 i;

    public ed3(Context context, ov2 ov2Var, lg3 lg3Var, il3 il3Var, nf3 nf3Var, fk3 fk3Var, nh3 nh3Var, dl3 dl3Var, vg3 vg3Var, eg3 eg3Var, v9 v9Var, boolean z) {
        this.a = lg3Var;
        this.b = il3Var;
        this.c = nf3Var;
        this.d = nh3Var;
        this.e = dl3Var;
        w5 w5Var = new w5();
        this.f = w5Var;
        ch3 ch3Var = new ch3(context, ov2Var, v9Var, nf3Var, w5Var, nh3Var, il3Var, fk3Var, dl3Var);
        this.g = ch3Var;
        zg3 zg3Var = new zg3(lg3Var, vg3Var);
        this.h = zg3Var;
        this.i = new dg3(nf3Var, lg3Var, zg3Var, ch3Var, nh3Var, w5Var, dl3Var, eg3Var, z);
        new xg3(context, nf3Var, il3Var, nh3Var, dl3Var, lg3Var, eg3Var).a(vg3Var, z);
    }

    public final void a() {
        this.a.a(this.i);
        this.a.a(this.c);
        this.f.a(v5.v, null);
        View view = this.b.getView();
        if (view != null) {
            this.e.a(view, this.b.a());
        }
        ih3 ih3Var = this.g.d;
        if (!ih3Var.e && !ih3Var.d) {
            ih3Var.e = true;
            ih3Var.c.post(new hh3(ih3Var));
        }
        this.d.a(lh3.c);
    }

    public final void a(eh3 eh3Var) {
        ch3 ch3Var = this.g;
        ch3Var.i.setValue(ch3Var, ch3.k[0], eh3Var);
    }
}
