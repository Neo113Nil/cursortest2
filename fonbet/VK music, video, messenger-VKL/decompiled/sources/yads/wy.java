package yads;

import com.ironsource.X3;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.LinkedHashMap;
import xsna.pn00;
import xsna.ttp0;

/* loaded from: classes10.dex */
public final class wy {
    public final yb2 a;

    public /* synthetic */ wy() {
        this(new yb2());
    }

    public final gp2 a(d4 d4Var) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!ttp0.g(linkedHashMap)) {
            linkedHashMap = null;
        }
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap();
        }
        yb2 yb2Var = this.a;
        int i = d4Var.n;
        yb2Var.getClass();
        linkedHashMap.put(X3.i.n, i != 1 ? i != 2 ? StringUtils.UNDEFINED : X3.i.C : X3.i.D);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        if (!ttp0.g(linkedHashMap2)) {
            linkedHashMap2 = null;
        }
        if (linkedHashMap2 == null) {
            linkedHashMap2 = new LinkedHashMap();
        }
        linkedHashMap2.put("image_loading_automatically", Boolean.valueOf(d4Var.m));
        return new gp2(pn00.n(linkedHashMap, linkedHashMap2), (c) null);
    }

    public wy(yb2 yb2Var) {
        this.a = yb2Var;
    }
}
