package defpackage;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.a;
import kotlin.collections.b;

/* loaded from: classes7.dex */
public final class ai71 implements ar81 {
    public final yi61 a;
    public final pf71 b;
    public final go71 c;

    public ai71() {
        yi61 yi61Var = new yi61();
        pf71 pf71Var = new pf71();
        go71 go71Var = new go71();
        this.a = yi61Var;
        this.b = pf71Var;
        this.c = go71Var;
    }

    @Override // defpackage.ar81
    public final hn71 d(fe81 fe81Var, d881 d881Var, qb71 qb71Var) {
        yi61 yi61Var = this.a;
        hn71 a = yi61Var.a(fe81Var, d881Var);
        hl71 hl71Var = yi61Var.b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!ym11.h(linkedHashMap)) {
            linkedHashMap = null;
        }
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap();
        }
        if (qb71Var != null) {
            ArrayList a2 = hl71Var.a(qb71Var);
            if (!a2.isEmpty()) {
                linkedHashMap.put("image_sizes", a2);
            }
            List list = qb71Var.a;
            ArrayList arrayList = new ArrayList(tcc.n(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((se71) it.next()).a.b);
            }
            if (!arrayList.isEmpty()) {
                linkedHashMap.put("native_ad_types", arrayList);
            }
            ArrayList b = hl71.b(qb71Var);
            Object R = a.R(b);
            if (R == null) {
                linkedHashMap.put("ad_id", StringUtils.UNDEFINED);
            } else {
                linkedHashMap.put("ad_id", R);
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
        no61 no61Var = (no61) a.c;
        if (no61Var == null) {
            no61Var = null;
        }
        LinkedHashMap n = b.n((Map) a.b, linkedHashMap);
        if (!ym11.h(n)) {
            n = null;
        }
        if (n == null) {
            n = new LinkedHashMap();
        }
        hn71 a3 = this.b.a(fe81Var.e);
        this.c.getClass();
        hn71 a4 = go71.a(fe81Var);
        if (no61Var == null) {
            no61Var = (no61) a3.c;
        }
        LinkedHashMap n2 = b.n(n, (Map) a3.b);
        LinkedHashMap linkedHashMap2 = ym11.h(n2) ? n2 : null;
        if (linkedHashMap2 == null) {
            linkedHashMap2 = new LinkedHashMap();
        }
        if (no61Var == null) {
            no61Var = (no61) a4.c;
        }
        return new hn71(b.n(linkedHashMap2, (Map) a4.b), no61Var);
    }
}
