package yads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.EmptySet;
import org.json.JSONObject;
import xsna.drm0;
import xsna.j5g;

/* loaded from: classes10.dex */
public final class w9 {
    public static c a(Map map) {
        Set S0;
        Long l;
        String c = u01.c(map, w11.n);
        String str = "";
        if (c == null) {
            c = "";
        }
        String c2 = u01.c(map, w11.L);
        if (c2 == null) {
            S0 = EmptySet.b;
        } else {
            try {
                str = new JSONObject(c2).optString("test_ids", "");
            } catch (Throwable unused) {
            }
            List c0 = drm0.c0(str, new String[]{";"}, 0, 6);
            ArrayList arrayList = new ArrayList();
            Iterator it = c0.iterator();
            while (it.hasNext()) {
                try {
                    l = Long.valueOf(Long.parseLong((String) it.next()));
                } catch (Throwable unused2) {
                    l = null;
                }
                if (l != null) {
                    arrayList.add(l);
                }
            }
            S0 = j5g.S0(arrayList);
        }
        return new c(c, S0);
    }
}
