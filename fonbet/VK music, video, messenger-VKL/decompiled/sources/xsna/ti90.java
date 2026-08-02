package xsna;

import xsna.q630;

/* compiled from: LazyItemScopeImpl.kt */
/* loaded from: classes11.dex */
public final class ti90 extends q630.c implements noy {
    public float p;
    public mtk0<Integer> q;
    public mtk0<Integer> r;

    public ti90() {
        throw null;
    }

    @Override // xsna.noy
    public final dp10 c(ep10 ep10Var, zo10 zo10Var, long j) {
        mtk0<Integer> mtk0Var = this.q;
        int round = (mtk0Var == null || mtk0Var.getValue().intValue() == Integer.MAX_VALUE) ? Integer.MAX_VALUE : Math.round(mtk0Var.getValue().floatValue() * this.p);
        mtk0<Integer> mtk0Var2 = this.r;
        int round2 = (mtk0Var2 == null || mtk0Var2.getValue().intValue() == Integer.MAX_VALUE) ? Integer.MAX_VALUE : Math.round(mtk0Var2.getValue().floatValue() * this.p);
        int k = round != Integer.MAX_VALUE ? round : o6j.k(j);
        int j2 = round2 != Integer.MAX_VALUE ? round2 : o6j.j(j);
        if (round == Integer.MAX_VALUE) {
            round = o6j.i(j);
        }
        if (round2 == Integer.MAX_VALUE) {
            round2 = o6j.h(j);
        }
        tra0 N = zo10Var.N(s6j.a(k, round, j2, round2));
        return ep10Var.Q(N.b, N.c, jgp.b, new iou(N, 27));
    }
}
