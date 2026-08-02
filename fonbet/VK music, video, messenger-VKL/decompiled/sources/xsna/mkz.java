package xsna;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: LivePlayerFactory.kt */
/* loaded from: classes3.dex */
public final class mkz extends qkl {
    public mkz(bpn0 bpn0Var, b25 b25Var) {
        super(bpn0Var, b25Var);
    }

    @Override // xsna.qkl
    public final d3b0 n(m7q m7qVar, boolean z, boolean z2) {
        boolean z3 = m7qVar.I;
        boolean z4 = m7qVar.J;
        if (!fxc0.B().p()) {
            return super.n(m7qVar, z, z2);
        }
        sht0 e = jgz.e(m7qVar);
        LinkedHashMap<sht0, d3b0> linkedHashMap = this.d;
        d3b0 d3b0Var = linkedHashMap.get(e);
        boolean x = fxc0.B().x(z4, z3);
        if (d3b0Var != null) {
            if ((d3b0Var.a() instanceof wl80) == x) {
                return d3b0Var;
            }
            linkedHashMap.remove(e);
            qkl.o(d3b0Var, true);
            return m(x);
        }
        if (linkedHashMap.size() < this.e.a) {
            return m(x);
        }
        boolean x2 = fxc0.B().x(z4, z3);
        Set<Map.Entry<sht0, d3b0>> entrySet = linkedHashMap.entrySet();
        sht0 sht0Var = null;
        for (Map.Entry<sht0, d3b0> entry : entrySet) {
            boolean z5 = entry.getValue().a() instanceof wl80;
            if (f5b0.b(entry.getValue())) {
                if (x2 == z5) {
                    return linkedHashMap.remove(entry.getKey());
                }
                if (sht0Var == null) {
                    sht0Var = entry.getKey();
                }
            }
        }
        if (z2 && sht0Var == null) {
            Map.Entry entry2 = (Map.Entry) j5g.j0(entrySet);
            sht0Var = entry2 != null ? (sht0) entry2.getKey() : null;
        }
        if (sht0Var == null) {
            return null;
        }
        d3b0 remove = linkedHashMap.remove(sht0Var);
        if (remove != null) {
            qkl.o(remove, true);
        }
        return m(x2);
    }
}
