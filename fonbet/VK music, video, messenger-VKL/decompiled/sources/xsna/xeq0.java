package xsna;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;

/* compiled from: UrlEnricher.kt */
/* loaded from: classes3.dex */
public final class xeq0 {
    public static final String a(String str, String str2) {
        List c0 = drm0.c0(str, new String[]{"?"}, 2, 2);
        String str3 = (String) c0.get(0);
        String str4 = (String) j5g.b0(1, c0);
        if (str4 == null) {
            str4 = "";
        }
        List c02 = drm0.c0(str4, new String[]{"&"}, 0, 6);
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
            Pair pair = new Pair((String) c03.get(0), (String) (1 < c03.size() ? c03.get(1) : ""));
            linkedHashMap.put(pair.i(), pair.j());
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
        linkedHashMap2.put("screen", "vk_video");
        linkedHashMap2.put("source", str2);
        String g0 = linkedHashMap2.isEmpty() ? "" : j5g.g0(linkedHashMap2.entrySet(), "&", null, null, 0, new weq0(0), 30);
        return g0.length() == 0 ? str3 : v1v.a('?', str3, g0);
    }

    public static final String b(String str, String str2) {
        String path;
        try {
            Uri g = jeq0.g(str);
            if (epx.f(g.getHost(), "vk.com") && (path = g.getPath()) != null && drm0.D(path, "/@donut-android", false)) {
                return str;
            }
            String uri = g.buildUpon().clearQuery().fragment(null).build().toString();
            String fragment = g.getFragment();
            if (fragment == null) {
                return str;
            }
            return uri + '#' + a(fragment, str2);
        } catch (Exception unused) {
            return str;
        }
    }
}
