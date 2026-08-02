package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.b;

/* loaded from: classes9.dex */
public final class h2c {
    public final cne0 a;
    public Map b;
    public final Set c;

    public h2c(dne0 dne0Var) {
        cne0 a = dne0Var.a("ru.yandex.taxi.analytics.ClidManager");
        this.a = a;
        String l = a.l("clid1", null);
        Pair pair = new Pair("clid1", l == null ? "0" : l);
        String l2 = a.l("clid2006", null);
        this.b = b.i(pair, new Pair("clid2006", l2 != null ? l2 : "0"));
        this.c = j73.f0(new String[]{"clid1", "clid2006"});
    }

    public final void a(Map map) {
        Set set = this.c;
        int d = gw00.d(tcc.n(set, 10));
        if (d < 16) {
            d = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(d);
        for (Object obj : set) {
            String str = (String) map.get((String) obj);
            if (str == null) {
                str = "0";
            }
            linkedHashMap.put(obj, str);
        }
        this.b = linkedHashMap;
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            this.a.r((String) entry.getKey(), (String) entry.getValue());
        }
    }
}
