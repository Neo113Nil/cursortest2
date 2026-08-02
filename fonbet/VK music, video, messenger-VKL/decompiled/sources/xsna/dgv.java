package xsna;

import java.util.LinkedHashMap;
import java.util.Set;

/* compiled from: HostPriorityManagerQueue.kt */
/* loaded from: classes2.dex */
public final class dgv implements zbd0 {
    public final int b;
    public final rv90 c;
    public final LinkedHashMap d = new LinkedHashMap();

    public dgv(int i, int i2) {
        this.b = i2;
        this.c = new rv90(i);
    }

    @Override // xsna.zbd0
    public final boolean a(ckv ckvVar) {
        return this.c.b.contains(ckvVar) && d(ckvVar).b.contains(ckvVar);
    }

    @Override // xsna.zbd0
    public final void b(ckv ckvVar) {
        rv90 rv90Var = this.c;
        Set<ckv> set = rv90Var.d;
        set.contains(ckvVar);
        set.add(ckvVar);
        Set<ckv> set2 = rv90Var.b;
        if (set2.size() < rv90Var.a) {
            set2.add(ckvVar);
        } else {
            rv90Var.c.add(ckvVar);
        }
        rv90 d = d(ckvVar);
        Set<ckv> set3 = d.d;
        set3.contains(ckvVar);
        set3.add(ckvVar);
        Set<ckv> set4 = d.b;
        if (set4.size() < d.a) {
            set4.add(ckvVar);
        } else {
            d.c.add(ckvVar);
        }
    }

    @Override // xsna.zbd0
    public final boolean c(ckv ckvVar) {
        this.c.a(ckvVar);
        return d(ckvVar).a(ckvVar);
    }

    public final rv90 d(ckv ckvVar) {
        String b = ckvVar.i().b();
        LinkedHashMap linkedHashMap = this.d;
        Object obj = linkedHashMap.get(b);
        if (obj == null) {
            obj = new rv90(this.b);
            linkedHashMap.put(b, obj);
        }
        return (rv90) obj;
    }
}
