package yads;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.LinkedHashMap;
import java.util.Map;
import xsna.jgp;
import xsna.ttp0;

/* loaded from: classes10.dex */
public final class gp2 {
    public final Map a;
    public c b;

    public /* synthetic */ gp2(Map map, int i) {
        this((i & 1) != 0 ? jgp.b : map, (c) null);
    }

    public final void a(Object obj, String str) {
        if (obj != null) {
            this.a.put(str, obj);
        }
    }

    public final void b(Object obj, String str) {
        if (obj == null) {
            this.a.put(str, StringUtils.UNDEFINED);
        } else {
            this.a.put(str, obj);
        }
    }

    public gp2(Map map, c cVar) {
        map = ttp0.g(map) ? map : null;
        this.a = map == null ? new LinkedHashMap() : map;
        this.b = cVar;
    }
}
