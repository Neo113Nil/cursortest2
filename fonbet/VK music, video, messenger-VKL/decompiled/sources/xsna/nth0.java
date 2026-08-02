package xsna;

import kotlin.NoWhenBranchMatchedException;
import xsna.gth0;
import xsna.rth0;

/* compiled from: SearchFollowersIntegrationFeature.kt */
/* loaded from: classes5.dex */
public final class nth0 extends wk50<tth0, sth0, gth0, sth0> {
    public final f4z f;

    public nth0(qth0 qth0Var) {
        super(null, qth0Var);
        this.f = new f4z();
    }

    @Override // xsna.wk50
    public final void N(sth0 sth0Var, gth0 gth0Var) {
        sth0 sth0Var2 = sth0Var;
        gth0 gth0Var2 = gth0Var;
        boolean z = sth0Var2.b;
        boolean z2 = sth0Var2.c;
        if (gth0Var2.equals(gth0.a.b)) {
            if (!z2) {
                T(new sth0(0));
                com.vk.mvi.core.internal.executors.a.c(new rp1(17, this, rth0.a.a));
                return;
            } else if (z) {
                T(new sth0(0));
                return;
            } else {
                com.vk.mvi.core.internal.executors.a.c(new rp1(17, this, rth0.b.a));
                return;
            }
        }
        if (gth0Var2 instanceof gth0.b) {
            boolean z3 = ((gth0.b) gth0Var2).b;
            if (z3 == z) {
                return;
            }
            T(sth0.a(sth0Var2, z3, false, 6));
            return;
        }
        if (gth0Var2 instanceof gth0.c) {
            String str = ((gth0.c) gth0Var2).b;
            if (drm0.N(str) == z2) {
                return;
            }
            T(sth0.a(sth0Var2, false, drm0.N(str), 5));
            return;
        }
        if (!gth0Var2.equals(gth0.d.b)) {
            throw new NoWhenBranchMatchedException();
        }
        if (!z2 || z) {
            return;
        }
        T(sth0.a(sth0Var2, true, false, 6));
    }
}
