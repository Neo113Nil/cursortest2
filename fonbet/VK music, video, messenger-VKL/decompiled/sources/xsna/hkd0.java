package xsna;

import kotlin.NoWhenBranchMatchedException;
import xsna.smd0;

/* compiled from: ProductCardCommunityInfoTaskExecutor.kt */
/* loaded from: classes18.dex */
public final class hkd0 extends uvj<nmd0, on50, smd0.b, smd0, xld0, tkd0> {
    public final rkd0 g;

    public hkd0(nn50 nn50Var, rkd0 rkd0Var) {
        super(tci.c, nn50Var);
        this.g = rkd0Var;
    }

    @Override // xsna.mn50
    public final jn50 d(hn50 hn50Var) {
        smd0.b bVar = (smd0.b) hn50Var;
        boolean z = bVar instanceof smd0.b.a;
        hpj hpjVar = this.f;
        if (z) {
            return m(myc0.h(hpjVar, null, null, new fkd0(this, null), 3));
        }
        if (bVar instanceof smd0.b.C3679b) {
            return m(myc0.h(hpjVar, null, null, new gkd0(this, (smd0.b.C3679b) bVar, null), 3));
        }
        throw new NoWhenBranchMatchedException();
    }
}
