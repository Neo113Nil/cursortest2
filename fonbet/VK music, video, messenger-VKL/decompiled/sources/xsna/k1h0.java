package xsna;

import java.util.List;
import java.util.Map;

/* compiled from: Effects.kt */
/* loaded from: classes11.dex */
public final class k1h0 implements kgn {
    public final /* synthetic */ l1h0 a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ p1h0 c;

    public k1h0(l1h0 l1h0Var, Object obj, p1h0 p1h0Var) {
        this.a = l1h0Var;
        this.b = obj;
        this.c = p1h0Var;
    }

    @Override // xsna.kgn
    public final void dispose() {
        l1h0 l1h0Var = this.a;
        ph50<Object, m1h0> ph50Var = l1h0Var.c;
        Object obj = this.b;
        m1h0 n = ph50Var.n(obj);
        p1h0 p1h0Var = this.c;
        if (n == p1h0Var) {
            Map<Object, Map<String, List<Object>>> map = l1h0Var.b;
            Map<String, List<Object>> d = p1h0Var.d();
            if (d.isEmpty()) {
                map.remove(obj);
            } else {
                map.put(obj, d);
            }
        }
    }
}
