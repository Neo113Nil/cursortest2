package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Pair;
import ru.yandex.taxi.order.analytics.model.ListOpenReason;

/* loaded from: classes14.dex */
public final class h151 {
    public final xxe0 a;
    public final uy70 b;

    public h151(xxe0 xxe0Var, uy70 uy70Var) {
        this.a = xxe0Var;
        this.b = uy70Var;
    }

    public final void a(String str, ArrayList arrayList) {
        int d = gw00.d(tcc.n(arrayList, 10));
        if (d < 16) {
            d = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(d);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            d380 d380Var = (d380) it.next();
            Pair pair = new Pair(d380Var.a, d380Var.c);
            linkedHashMap.put(pair.c(), pair.f());
        }
        if (this.b.a(linkedHashMap) != ListOpenReason.NONE) {
            ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((d380) it2.next()).e());
            }
            xxe0 xxe0Var = this.a;
            xxe0Var.getClass();
            HashMap hashMap = new HashMap();
            hashMap.put("open_from_screen_type", str);
            hashMap.put("order_list", arrayList2);
            xxe0Var.a.a("PreviewOrderDetails.Shown", hashMap, 1, new HashMap());
        }
    }
}
