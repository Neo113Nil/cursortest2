package xsna;

import java.util.ArrayList;
import java.util.List;

/* compiled from: MainContent.kt */
/* loaded from: classes16.dex */
public final class ud00 implements b540 {
    public final /* synthetic */ v6p0 a;

    public ud00(v6p0 v6p0Var) {
        this.a = v6p0Var;
    }

    @Override // xsna.b540
    public final dp10 b(ep10 ep10Var, List<? extends List<? extends zo10>> list, long j) {
        tra0 N = ((zo10) j5g.Y((List) ((ArrayList) list).get(0))).N(o6j.b(0, j, 0, 0, Integer.MAX_VALUE, 7));
        v6p0 v6p0Var = this.a;
        v6p0Var.getState().f(-N.c);
        return ep10Var.Q(o6j.i(j), an10.b(v6p0Var.getState().b()) + N.c, jgp.b, new eaa(20, N, v6p0Var));
    }
}
