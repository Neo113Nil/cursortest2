package yads;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Map;
import kotlin.Pair;
import xsna.drm0;
import xsna.pn00;

/* loaded from: classes10.dex */
public final class z62 implements jh3 {
    public final d4 a;

    public z62(d4 d4Var) {
        this.a = d4Var;
    }

    @Override // yads.jh3
    public final Map a() {
        String str = this.a.c.a;
        if (str == null || drm0.N(str)) {
            str = StringUtils.UNDEFINED;
        }
        return pn00.k(new Pair("ad_unit_id", str), new Pair("ad_type", this.a.a.b));
    }
}
