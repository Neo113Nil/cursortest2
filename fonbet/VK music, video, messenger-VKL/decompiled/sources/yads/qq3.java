package yads;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import xsna.on00;
import xsna.pn00;

/* loaded from: classes10.dex */
public final class qq3 implements gq2 {
    public final jh3 a;

    public qq3(jh3 jh3Var) {
        this.a = jh3Var;
    }

    @Override // yads.gq2
    public final fp2 a(Object obj) {
        Map a = this.a.a();
        dp2 dp2Var = dp2.c;
        return new fp2("vast_wrapper_request", new LinkedHashMap(a), null);
    }

    @Override // yads.gq2
    public final fp2 a(wq2 wq2Var, int i, Object obj) {
        ep2 ep2Var;
        List list = wq2Var != null ? (List) wq2Var.a : null;
        if (204 == i) {
            ep2Var = ep2.e;
        } else if (list != null && i == 200) {
            ep2Var = list.isEmpty() ? ep2.e : ep2.c;
        } else {
            ep2Var = ep2.d;
        }
        LinkedHashMap n = pn00.n(this.a.a(), on00.f(new Pair("status", ep2Var.b)));
        dp2 dp2Var = dp2.c;
        return new fp2("vast_wrapper_response", new LinkedHashMap(n), null);
    }
}
