package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.a;
import kotlin.collections.b;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public final class le1 {
    public static String a(String str, Map map) {
        LinkedHashMap linkedHashMap;
        Map map2;
        List W;
        List W2;
        List list = (List) map.get("Set-Cookie");
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                W2 = evu0.W((String) it.next(), new String[]{Extension.SEMICOLON_SPACE}, (r2 & 4) != 0 ? 0 : 2);
                ycc.r(W2, arrayList);
            }
            int d = gw00.d(tcc.n(arrayList, 10));
            if (d < 16) {
                d = 16;
            }
            linkedHashMap = new LinkedHashMap(d);
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Pair b = b((String) it2.next());
                linkedHashMap.put(b.c(), b.f());
            }
        } else {
            linkedHashMap = null;
        }
        if (linkedHashMap == null || linkedHashMap.isEmpty()) {
            return "";
        }
        if (str != null) {
            W = evu0.W(str, new String[]{Extension.SEMICOLON_SPACE}, (r2 & 4) != 0 ? 0 : 2);
            List list2 = W;
            int d2 = gw00.d(tcc.n(list2, 10));
            map2 = new LinkedHashMap(d2 >= 16 ? d2 : 16);
            Iterator it3 = list2.iterator();
            while (it3.hasNext()) {
                Pair b2 = b((String) it3.next());
                map2.put(b2.c(), b2.f());
            }
        } else {
            map2 = null;
        }
        if (map2 == null) {
            map2 = b.f();
        }
        LinkedHashMap n = b.n(map2, linkedHashMap);
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : n.entrySet()) {
            String str2 = (entry.getKey() == null || entry.getValue() == null) ? null : entry.getKey() + "=" + entry.getValue();
            if (str2 != null) {
                arrayList2.add(str2);
            }
        }
        return a.X(arrayList2, Extension.SEMICOLON_SPACE, null, null, null, 62);
    }

    public static Pair b(String str) {
        int H = evu0.H(str, "=", 0, false, 6);
        return (H == -1 || H >= str.length() + (-1)) ? new Pair(null, null) : new Pair(str.substring(0, H), str.substring(H + 1));
    }
}
