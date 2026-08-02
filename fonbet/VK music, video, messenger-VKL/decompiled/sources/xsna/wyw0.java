package xsna;

import kotlin.NoWhenBranchMatchedException;
import xsna.azw0;
import xsna.vyw0;
import xsna.xyw0;
import xsna.yyw0;

/* compiled from: VoipScreenShareFeature.kt */
/* loaded from: classes7.dex */
public final class wyw0 extends wk50<e2x0, azw0, vyw0, yyw0> {
    public final f4z<xyw0> f;

    public wyw0(zyw0 zyw0Var) {
        super(vyw0.b.b, zyw0Var);
        this.f = new f4z<>();
    }

    @Override // xsna.wk50
    public final void N(azw0 azw0Var, vyw0 vyw0Var) {
        azw0 azw0Var2 = azw0Var;
        vyw0 vyw0Var2 = vyw0Var;
        if (vyw0Var2 instanceof vyw0.b) {
            T(new yyw0.b());
            return;
        }
        if (vyw0Var2 instanceof vyw0.a) {
            T(new yyw0.a(((vyw0.a) vyw0Var2).b));
            return;
        }
        if (!vyw0Var2.equals(vyw0.c.b)) {
            throw new NoWhenBranchMatchedException();
        }
        if (azw0Var2 instanceof azw0.a) {
            com.vk.voip.ui.c.b.getClass();
            rah0 rah0Var = com.vk.voip.ui.c.g;
            if (rah0Var == null) {
                rah0Var = null;
            }
            boolean z = ((azw0.a) azw0Var2).b;
            rah0Var.getClass();
            dcj dcjVar = new dcj(rah0Var, z, 1);
            if (i0q0.b()) {
                dcjVar.invoke();
            } else {
                rah0Var.d.d().c(new d2g0(1, dcjVar));
            }
            this.f.b(xyw0.a.a);
        }
    }
}
