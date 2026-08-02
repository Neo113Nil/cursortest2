package xsna;

import com.vk.log.L;
import kotlin.NoWhenBranchMatchedException;
import xsna.a7f0;
import xsna.a990;
import xsna.no90;
import xsna.qo90;
import xsna.sn90;

/* compiled from: PastBroadcastsFeature.kt */
/* loaded from: classes7.dex */
public final class bo90 extends wk50<com.vk.voip.ui.broadcast.list.ui.a, qo90, sn90, no90> {
    public final uh0 f;

    public bo90(po90 po90Var, uh0 uh0Var) {
        super(sn90.a.b, po90Var);
        this.f = uh0Var;
    }

    @Override // xsna.wk50
    public final void N(qo90 qo90Var, sn90 sn90Var) {
        qo90 qo90Var2 = qo90Var;
        sn90 sn90Var2 = sn90Var;
        boolean z = sn90Var2 instanceof sn90.a;
        int i = 0;
        int i2 = 26;
        uh0 uh0Var = this.f;
        if (z) {
            uh0Var.getClass();
            a7f0.a.e(this, wjs0.b.U(new z7(new pt(uh0Var), 7)), null, new j4x(this, i2), new cu4(L.a, 7), null, 9);
            C(sn90.b.b);
        } else {
            int i3 = 16;
            if (sn90Var2 instanceof sn90.b) {
                T(no90.a.c.b);
                a7f0.a.f(this, uh0Var.b(null).l(new e8(new ha40(4), i2)), new wv2(1, this, bo90.class, "updateState", "updateState(Lcom/vk/mvi/core/data/MviPatch;)V", 0, 7), new kn20(this, i3), 1);
            } else {
                boolean z2 = sn90Var2 instanceof sn90.c;
                if (z2) {
                    if (qo90Var2 instanceof qo90.a) {
                        a990<Integer> a990Var = ((qo90.a) qo90Var2).c;
                        if (a990Var.b && (a990Var.d instanceof a990.b.a) && (!z2 || (a990Var.c instanceof a990.a.b))) {
                            T(no90.b.c.b);
                            a7f0.a.f(this, uh0Var.b(a990Var.a).l(new ao90(new h2s(qo90Var2, 28), i)), new eiz(this, 19), new hs00(this, i3), 1);
                        }
                    }
                } else if (sn90Var2 instanceof sn90.d) {
                    if (!(qo90Var2 instanceof qo90.a)) {
                        C(sn90.b.b);
                    } else if (((qo90.a) qo90Var2).c.d instanceof a990.b.a) {
                        T(no90.c.C3408c.b);
                        a7f0.a.f(this, uh0Var.b(null).l(new uf20(new p7x(15), 5)), new dh8(1, this, bo90.class, "updateState", "updateState(Lcom/vk/mvi/core/data/MviPatch;)V", 0, 4), new o3w(this, i2), 1);
                    }
                } else if (sn90Var2 instanceof sn90.f) {
                    sn90.f fVar = (sn90.f) sn90Var2;
                    if (qo90Var2 instanceof qo90.a) {
                        T(new no90.e(fVar.b));
                    }
                } else {
                    if (!(sn90Var2 instanceof sn90.e)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    sn90.e eVar = (sn90.e) sn90Var2;
                    if (qo90Var2 instanceof qo90.a) {
                        T(new no90.d(eVar.b));
                    }
                }
            }
        }
        s3q0 s3q0Var = s3q0.a;
    }
}
