package xsna;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;

/* compiled from: UrlAnalyticsEnricherImpl.kt */
/* loaded from: classes.dex */
public final class qeq0 {
    public final String a(String str, List<req0> list) {
        String encodedFragment;
        Uri parse = Uri.parse(str);
        String path = parse.getPath();
        int i = 0;
        boolean z = path != null && drm0.D(path, "/@donut-android", false);
        if ((epx.f(parse.getHost(), "vk.com") && z) || (encodedFragment = parse.getEncodedFragment()) == null) {
            return str;
        }
        String uri = parse.buildUpon().clearQuery().fragment(null).build().toString();
        List c0 = drm0.c0(encodedFragment, new String[]{"?"}, 2, 2);
        String str2 = (String) j5g.b0(0, c0);
        String str3 = (String) j5g.b0(1, c0);
        if (str3 == null) {
            str3 = "";
        }
        List c02 = drm0.c0(str3, new String[]{"&"}, 0, 6);
        ArrayList arrayList = new ArrayList();
        for (Object obj : c02) {
            if (!drm0.N((String) obj)) {
                arrayList.add(obj);
            }
        }
        int e = on00.e(c5g.u(arrayList, 10));
        if (e < 16) {
            e = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(e);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            List c03 = drm0.c0((String) it.next(), new String[]{"="}, 2, 2);
            Pair pair = new Pair((String) (c03.size() > 0 ? c03.get(0) : ""), (String) (1 < c03.size() ? c03.get(1) : ""));
            linkedHashMap.put(pair.i(), pair.j());
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
        for (req0 req0Var : list) {
            linkedHashMap2.put(req0Var.a(), req0Var.b());
        }
        Set entrySet = linkedHashMap2.entrySet();
        StringBuilder e2 = fw3.e(uri);
        if (str2 != null) {
            e2.append('#');
            e2.append(str2);
        }
        if (!linkedHashMap2.isEmpty()) {
            e2.append("?");
        }
        for (Object obj2 : entrySet) {
            int i2 = i + 1;
            if (i < 0) {
                e43.t();
                throw null;
            }
            Map.Entry entry = (Map.Entry) obj2;
            e2.append((String) entry.getKey());
            e2.append("=");
            e2.append((String) entry.getValue());
            if (i != entrySet.size() - 1) {
                e2.append("&");
            }
            i = i2;
        }
        return e2.toString();
    }
}
