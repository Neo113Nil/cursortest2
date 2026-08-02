package xsna;

import java.util.ArrayList;
import java.util.List;

/* compiled from: VkCollapsableTopAppBar.kt */
/* loaded from: classes17.dex */
public final class wlu0 implements b540 {
    public final /* synthetic */ v6p0 a;

    public wlu0(v6p0 v6p0Var) {
        this.a = v6p0Var;
    }

    @Override // xsna.b540
    public final dp10 b(ep10 ep10Var, List<? extends List<? extends zo10>> list, long j) {
        ArrayList arrayList = (ArrayList) list;
        List list2 = (List) arrayList.get(0);
        tra0 N = ((zo10) j5g.Y((List) arrayList.get(1))).N(o6j.b(0, j, 0, 0, Integer.MAX_VALUE, 7));
        tra0 N2 = ((zo10) j5g.Y(list2)).N(o6j.b(0, j, 0, 0, Integer.MAX_VALUE, 7));
        v6p0 v6p0Var = this.a;
        v6p0Var.getState().f(-N2.c);
        return ep10Var.Q(o6j.i(j), an10.b(v6p0Var.getState().b()) + N2.c + N.c, jgp.b, new bwg(N2, v6p0Var, N, 9));
    }
}
