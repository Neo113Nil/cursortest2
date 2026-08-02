package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.a;
import kotlin.collections.builders.MapBuilder;

/* loaded from: classes8.dex */
public final class bo41 {
    public final ArrayList a = new ArrayList();
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public Integer d;
    public Integer e;
    public Integer f;
    public MapBuilder g;
    public MapBuilder h;

    public final zn41 a(do41 do41Var) {
        jl40.m();
        pw50 b = do41Var.b(new ao41(this, do41Var));
        LinkedHashSet b2 = b();
        this.a.add(do41Var);
        Iterator it = v4r0.g(b(), b2).iterator();
        while (it.hasNext()) {
            List list = (List) this.b.get((String) it.next());
            if (list != null) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    ((v221) it2.next()).a();
                }
            }
        }
        return new zn41(b, this, do41Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final LinkedHashSet b() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = this.a;
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((do41) it.next()).a());
        }
        linkedHashSet.addAll(arrayList2);
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Pair L = udq0.L(((do41) it2.next()).a());
            if (L != null) {
                arrayList3.add(L);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            Pair pair = (Pair) it3.next();
            ycc.r(scc.g(pair.c(), pair.f()), arrayList4);
        }
        linkedHashSet.addAll(arrayList4);
        if (linkedHashSet.contains("*")) {
            linkedHashSet.addAll(this.b.keySet());
        }
        return linkedHashSet;
    }

    public final void c(int i, String str, boolean z) {
        Pair L = udq0.L(str);
        if (L != null) {
            d(i, (String) L.c(), z);
            d(i, (String) L.f(), z);
        }
        d(i, str, z);
    }

    public final void d(int i, String str, boolean z) {
        Integer valueOf;
        HashMap hashMap = this.c;
        Integer num = (Integer) hashMap.get(str);
        if (z || num == null || num.intValue() != i) {
            hashMap.put(str, Integer.valueOf(i));
            List list = (List) this.b.get(str);
            if (list != null) {
                for (v221 v221Var : a.J0(list)) {
                    if (jl40.l(str, "*")) {
                        v221Var.getClass();
                        valueOf = this.f;
                    } else {
                        valueOf = Integer.valueOf(i);
                    }
                    v221Var.c(e(v221Var, valueOf));
                }
            }
        }
    }

    public final w221 e(v221 v221Var, Integer num) {
        v221Var.getClass();
        return new w221(this.f, num, this.e, this.g, this.h);
    }
}
