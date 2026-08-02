package yads;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import xsna.pn00;

/* loaded from: classes10.dex */
public final class j9 implements fq2 {
    public final d4 a;
    public final n9 b = new n9();

    public j9(d4 d4Var) {
        this.a = d4Var;
    }

    @Override // yads.fq2
    public final Map a() {
        LinkedHashMap m = pn00.m(new Pair("ad_type", this.a.a.b));
        String str = this.a.c.a;
        if (str != null) {
            m.put("ad_unit_id", str);
        }
        m.putAll(this.b.a(this.a.e).a);
        return m;
    }
}
