package yads;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import xsna.c5g;
import xsna.j5g;
import xsna.pn00;
import xsna.ttp0;

/* loaded from: classes10.dex */
public final class g32 implements u32 {
    public final br2 a;
    public final n9 b;
    public final wy c;

    public /* synthetic */ g32() {
        this(new br2(), new n9(), new wy());
    }

    @Override // yads.u32
    public final gp2 a(v9 v9Var, d4 d4Var, e22 e22Var) {
        br2 br2Var = this.a;
        gp2 a = br2Var.a(v9Var, d4Var);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!ttp0.g(linkedHashMap)) {
            linkedHashMap = null;
        }
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap();
        }
        if (e22Var != null) {
            List a2 = br2Var.b.a(e22Var);
            if (!a2.isEmpty()) {
                linkedHashMap.put("image_sizes", a2);
            }
            br2Var.b.getClass();
            List list = e22Var.a;
            ArrayList arrayList = new ArrayList(c5g.u(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((gz1) it.next()).a.b);
            }
            if (!arrayList.isEmpty()) {
                linkedHashMap.put("native_ad_types", arrayList);
            }
            br2Var.b.getClass();
            ArrayList b = h22.b(e22Var);
            Object a0 = j5g.a0(b);
            if (a0 == null) {
                linkedHashMap.put("ad_id", StringUtils.UNDEFINED);
            } else {
                linkedHashMap.put("ad_id", a0);
            }
            if (b.isEmpty()) {
                b = null;
            }
            if (b == null) {
                linkedHashMap.put("ad_ids", StringUtils.UNDEFINED);
            } else {
                linkedHashMap.put("ad_ids", b);
            }
        }
        c cVar = a.b;
        if (cVar == null) {
            cVar = null;
        }
        LinkedHashMap n = pn00.n(a.a, linkedHashMap);
        if (!ttp0.g(n)) {
            n = null;
        }
        if (n == null) {
            n = new LinkedHashMap();
        }
        gp2 a3 = this.b.a(d4Var.e);
        gp2 a4 = this.c.a(d4Var);
        if (cVar == null) {
            cVar = a3.b;
        }
        LinkedHashMap n2 = pn00.n(n, a3.a);
        LinkedHashMap linkedHashMap2 = ttp0.g(n2) ? n2 : null;
        if (linkedHashMap2 == null) {
            linkedHashMap2 = new LinkedHashMap();
        }
        if (cVar == null) {
            cVar = a4.b;
        }
        return new gp2(pn00.n(linkedHashMap2, a4.a), cVar);
    }

    public g32(br2 br2Var, n9 n9Var, wy wyVar) {
        this.a = br2Var;
        this.b = n9Var;
        this.c = wyVar;
    }
}
