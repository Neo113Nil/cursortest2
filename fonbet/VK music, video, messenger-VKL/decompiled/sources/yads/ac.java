package yads;

import com.ironsource.O6;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.LinkedHashMap;
import java.util.Map;
import xsna.jgp;
import xsna.ttp0;

/* loaded from: classes10.dex */
public final class ac implements od2 {
    public final ep2 a;
    public final String b;

    public ac(ep2 ep2Var, String str) {
        this.a = ep2Var;
        this.b = str;
    }

    @Override // yads.od2
    public final Map a(long j) {
        Map map = jgp.b;
        if (!ttp0.g(map)) {
            map = null;
        }
        if (map == null) {
            map = new LinkedHashMap();
        }
        String str = this.b;
        if (str == null) {
            map.put(O6.G1, StringUtils.UNDEFINED);
        } else {
            map.put(O6.G1, str);
        }
        String str2 = this.a.b;
        if (str2 == null) {
            map.put("status", StringUtils.UNDEFINED);
        } else {
            map.put("status", str2);
        }
        map.put("duration", Long.valueOf(j));
        return map;
    }
}
