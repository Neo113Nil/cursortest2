package yads;

import android.content.Context;
import xsna.g5g;

/* loaded from: classes10.dex */
public final class xg3 {
    public final mm2 a;
    public final sk2 b;
    public final nd3 c;
    public final yd3 d;
    public final um3 e;

    public xg3(Context context, nf3 nf3Var, il3 il3Var, nh3 nh3Var, dl3 dl3Var, lg3 lg3Var, eg3 eg3Var) {
        this.a = new mm2(dl3Var);
        this.b = new sk2(context, nf3Var);
        this.c = new nd3(nf3Var, il3Var, dl3Var, eg3Var);
        this.d = new yd3(il3Var, dl3Var, lg3Var);
        this.e = new um3(nf3Var, il3Var, nh3Var, dl3Var, eg3Var);
    }

    public final void a(vg3 vg3Var, boolean z) {
        if (!z) {
            g5g.A(vg3Var.a, new ug3[]{this.c});
        } else {
            g5g.A(vg3Var.a, new ug3[]{this.a, this.b, this.d, this.c, this.e});
            g5g.A(vg3Var.b, new wg3[]{this.e});
        }
    }
}
