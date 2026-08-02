package defpackage;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.TreeMap;

/* loaded from: classes10.dex */
public final class n28 {
    public final LinkedHashMap a = new LinkedHashMap();
    public final TreeMap b = new TreeMap(new gvc());
    public final qo31 c;
    public final qo31 d;

    public n28(jdj jdjVar, int i) {
        a84 a84Var = kgg0.a;
        Iterator it = new ArrayList(kgg0.i).iterator();
        while (true) {
            j94 j94Var = null;
            if (!it.hasNext()) {
                break;
            }
            kgg0 kgg0Var = (kgg0) it.next();
            d6z.y("Currently only support ConstantQuality", Objects.nonNull(kgg0Var));
            mzn h = jdjVar.h(kgg0Var.c(i));
            if (h != null) {
                h.toString();
                sgb1.g(3, "CapabilitiesByQuality");
                if (!h.d().isEmpty()) {
                    int c = h.c();
                    int a = h.a();
                    List b = h.b();
                    List d = h.d();
                    d6z.m("Should contain at least one VideoProfile.", !d.isEmpty());
                    j94Var = new j94(c, a, ly3.w(b), ly3.w(d), b.isEmpty() ? null : (jzn) b.get(0), (lzn) d.get(0));
                }
                if (j94Var == null) {
                    kgg0Var.toString();
                    sgb1.g(5, "CapabilitiesByQuality");
                } else {
                    this.b.put(j94Var.f.j(), kgg0Var);
                    this.a.put(kgg0Var, j94Var);
                }
            }
        }
        if (this.a.isEmpty()) {
            sgb1.d("CapabilitiesByQuality", "No supported EncoderProfiles");
            this.d = null;
            this.c = null;
        } else {
            ArrayDeque arrayDeque = new ArrayDeque(this.a.values());
            this.c = (qo31) arrayDeque.peekFirst();
            this.d = (qo31) arrayDeque.peekLast();
        }
    }

    public final qo31 a(kgg0 kgg0Var) {
        d6z.m("Unknown quality: " + kgg0Var, kgg0.h.contains(kgg0Var));
        return kgg0Var == kgg0.f ? this.c : kgg0Var == kgg0.e ? this.d : (qo31) this.a.get(kgg0Var);
    }
}
