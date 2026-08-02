package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.collections.a;

/* loaded from: classes10.dex */
public final class kkf extends b5r {
    public final Map a;
    public final boolean b;

    public kkf(Map map) {
        this.a = map;
        this.b = ((Boolean) map.get("containsPathModified")).booleanValue();
    }

    @Override // defpackage.b5r
    public final boolean a() {
        return this.b;
    }

    @Override // defpackage.b5r
    public final String b(int i, ArrayList arrayList, boolean z) {
        String str = (String) this.a.get("where");
        String f = ela1.f(i);
        return evu0.k0(str).toString().length() == 0 ? z ? "AND ".concat(f) : f : (!z || evu0.k0(str).toString().length() <= 0) ? oyr.p("( ", str, " )") : oyr.p("AND ( ", str, " )");
    }

    @Override // defpackage.b5r
    public final String c() {
        Object obj = this.a.get("orderBy");
        List list = obj instanceof List ? (List) obj : null;
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return null;
        }
        return a.X(list, ",", null, null, new a5f(9), 30);
    }
}
