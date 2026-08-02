package yads;

import android.net.Uri;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import xsna.c5g;
import xsna.jgp;
import xsna.on00;

/* loaded from: classes10.dex */
public abstract class nm2 {
    public static Uri a(Uri uri, ce3 ce3Var) {
        Map map;
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        if (queryParameterNames != null) {
            int e = on00.e(c5g.u(queryParameterNames, 10));
            if (e < 16) {
                e = 16;
            }
            map = new LinkedHashMap(e);
            for (String str : queryParameterNames) {
                Pair pair = new Pair(str, uri.getQueryParameter(str));
                map.put(pair.i(), pair.j());
            }
        } else {
            map = null;
        }
        if (map == null) {
            map = jgp.b;
        }
        om2 om2Var = (om2) ce3Var.invoke(new om2(map));
        Uri.Builder clearQuery = uri.buildUpon().clearQuery();
        for (Map.Entry entry : om2Var.a.entrySet()) {
            clearQuery.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        return clearQuery.build();
    }
}
