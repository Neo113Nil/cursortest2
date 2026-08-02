package xsna;

import java.util.ArrayList;
import java.util.List;

/* compiled from: ExpandableAppBar.kt */
/* loaded from: classes3.dex */
public final class z7q implements b540 {
    public final /* synthetic */ szm a;

    public z7q(szm szmVar) {
        this.a = szmVar;
    }

    @Override // xsna.b540
    public final dp10 b(ep10 ep10Var, List<? extends List<? extends zo10>> list, long j) {
        ArrayList arrayList = (ArrayList) list;
        List list2 = (List) arrayList.get(0);
        List list3 = (List) arrayList.get(1);
        tra0 N = ((zo10) j5g.Y(list2)).N(o6j.b(0, j, 0, 0, Integer.MAX_VALUE, 7));
        tra0 N2 = ((zo10) j5g.Y(list3)).N(o6j.b(0, j, 0, 0, Integer.MAX_VALUE, 7));
        szm szmVar = this.a;
        y6p0 y6p0Var = szmVar.a;
        y6p0Var.a = N.c - N2.c;
        int i = o6j.i(j);
        int b = an10.b(y6p0Var.b()) + N2.c;
        return ep10Var.Q(i, b >= 0 ? b : 0, jgp.b, new ab6(N2, szmVar, N, 6));
    }
}
