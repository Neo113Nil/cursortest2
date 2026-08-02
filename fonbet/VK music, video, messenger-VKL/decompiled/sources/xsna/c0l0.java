package xsna;

import java.util.IdentityHashMap;
import java.util.Iterator;

/* compiled from: StealingBucketPriorityManagerQueue.kt */
/* loaded from: classes2.dex */
public class c0l0 extends hjq {
    public final IdentityHashMap<ckv, Integer> d;

    public c0l0(sl8 sl8Var) {
        super(sl8Var);
        this.d = new IdentityHashMap<>();
    }

    @Override // xsna.hjq, xsna.zbd0
    public final boolean a(ckv ckvVar) {
        return g(ckvVar).d.contains(ckvVar);
    }

    @Override // xsna.hjq, xsna.zbd0
    public final void b(ckv ckvVar) {
        sv90 sv90Var;
        sv90 g = g(ckvVar);
        g.f.contains(ckvVar);
        g.a(ckvVar);
        if (g.d.contains(ckvVar)) {
            return;
        }
        sl8 sl8Var = this.b;
        int a = ybd0.a(ckvVar, sl8Var.c);
        Iterator it = sl8Var.a.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                sv90Var = null;
                break;
            }
            int intValue = ((Number) it.next()).intValue();
            if (a != intValue && f(a, intValue)) {
                sv90Var = e(intValue);
                int size = sv90Var.a - sv90Var.d.size();
                if (size > 0 && sv90Var.e.isEmpty() && sv90Var.g <= size / 2) {
                    break;
                }
            }
        }
        if (sv90Var == null || sv90Var.equals(g)) {
            return;
        }
        g.b(ckvVar);
        sv90Var.a(ckvVar);
        this.d.put(ckvVar, Integer.valueOf(sv90Var.b));
    }

    @Override // xsna.hjq, xsna.zbd0
    public final boolean c(ckv ckvVar) {
        boolean b = g(ckvVar).b(ckvVar);
        this.d.remove(ckvVar);
        return b;
    }

    public boolean f(int i, int i2) {
        return true;
    }

    public final sv90 g(ckv ckvVar) {
        Integer num = this.d.get(ckvVar);
        return num != null ? e(num.intValue()) : e(ybd0.a(ckvVar, this.b.c));
    }
}
