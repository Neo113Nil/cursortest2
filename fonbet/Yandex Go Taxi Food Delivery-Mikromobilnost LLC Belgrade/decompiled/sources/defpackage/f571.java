package defpackage;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.b;

/* loaded from: classes7.dex */
public final class f571 {
    public final yi61 a;
    public final pf71 b;
    public final go71 c;

    public f571() {
        yi61 yi61Var = new yi61();
        pf71 pf71Var = new pf71();
        go71 go71Var = new go71();
        this.a = yi61Var;
        this.b = pf71Var;
        this.c = go71Var;
    }

    public final hn71 a(fe81 fe81Var, d881 d881Var) {
        hn71 b = this.a.b(fe81Var, d881Var);
        hn71 a = this.b.a(fe81Var.e);
        this.c.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!ym11.h(linkedHashMap)) {
            linkedHashMap = null;
        }
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap();
        }
        int i = fe81Var.n;
        linkedHashMap.put("orientation", i != 1 ? i != 2 ? StringUtils.UNDEFINED : "landscape" : "portrait");
        hn71 a2 = fga1.a(b, a);
        no61 no61Var = (no61) a2.c;
        return new hn71(b.n((Map) a2.b, linkedHashMap), no61Var != null ? no61Var : null);
    }
}
