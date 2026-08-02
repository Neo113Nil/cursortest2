package xsna;

import kotlin.NoWhenBranchMatchedException;
import xsna.awg0;
import xsna.jm50;
import xsna.xpc;

/* compiled from: ClipCtaWithDonutMviTaskExecutor.kt */
/* loaded from: classes16.dex */
public final class ypc extends evg0<ppc, on50, xpc, xpc, npc, mpc> {
    public final m3a f;
    public final dpc g;

    public ypc(m3a m3aVar, dpc dpcVar, nn50 nn50Var) {
        super(jm50.a.a, nn50Var);
        this.f = m3aVar;
        this.g = dpcVar;
    }

    @Override // xsna.mn50
    public final jn50 d(hn50 hn50Var) {
        if (!((xpc) hn50Var).equals(xpc.a.b)) {
            throw new NoWhenBranchMatchedException();
        }
        dpc dpcVar = this.g;
        if (dpcVar.h) {
            return awg0.a.b(this, this.f.e(dpcVar.a), null, null, new ji3(this, 12), 3);
        }
        return null;
    }
}
