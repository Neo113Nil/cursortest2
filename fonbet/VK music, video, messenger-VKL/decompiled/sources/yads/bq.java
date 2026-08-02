package yads;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes10.dex */
public final class bq {
    public final v9 a;
    public final jp2 b;
    public final ij c;

    public /* synthetic */ bq(o5 o5Var, e00 e00Var, v9 v9Var, String str, bu1 bu1Var) {
        this(v9Var, bu1Var, new ij(o5Var, e00Var, str));
    }

    public final void a(String str) {
        gp2 a = this.c.a();
        a.b("no_view_for_asset", "reason");
        a.b(str, "asset_name");
        Map map = this.a.u;
        if (map != null) {
            a.a.putAll(map);
        }
        c cVar = this.a.i;
        a.b = cVar;
        this.b.a(new fp2(dp2.A.a(), new LinkedHashMap(a.a), cVar));
    }

    public bq(v9 v9Var, bu1 bu1Var, ij ijVar) {
        this.a = v9Var;
        this.b = bu1Var;
        this.c = ijVar;
    }
}
