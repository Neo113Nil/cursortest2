package defpackage;

import kotlinx.coroutines.flow.r0;

/* loaded from: classes12.dex */
public final class nk5 implements idz {
    public final /* synthetic */ int a;
    public final /* synthetic */ h55 b;

    public /* synthetic */ nk5(h55 h55Var, int i) {
        this.a = i;
        this.b = h55Var;
    }

    @Override // defpackage.sy60
    public final void a() {
        int i = this.a;
        h55 h55Var = this.b;
        switch (i) {
            case 0:
                qk5 qk5Var = (qk5) h55Var;
                qk5Var.z((m950) qk5Var.L.get(), new bb0(qk5Var, 9));
                break;
            default:
                y4c0 y4c0Var = (y4c0) h55Var;
                if (y4c0Var.u()) {
                    y4c0Var.r(new qu(9));
                    break;
                }
                break;
        }
    }

    @Override // defpackage.idz
    public final void r0() {
        switch (this.a) {
            case 0:
                a();
                break;
            default:
                y4c0 y4c0Var = (y4c0) this.b;
                j7j0 j7j0Var = (j7j0) y4c0Var.G;
                j7j0Var.a.a(1);
                r0 r0Var = j7j0Var.b;
                Boolean bool = Boolean.TRUE;
                r0Var.getClass();
                r0Var.m(null, bool);
                if (y4c0Var.u()) {
                    y4c0Var.r(new xpy(29));
                    break;
                }
                break;
        }
    }
}
