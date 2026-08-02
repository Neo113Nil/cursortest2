package yads;

import io.appmetrica.analytics.plugins.PluginErrorDetails;
import java.util.LinkedHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import xsna.pn00;

/* loaded from: classes10.dex */
public final class c1 {
    public final jp2 a;
    public final d4 b;
    public final v9 c;
    public final sx d;

    public /* synthetic */ c1(bu1 bu1Var, d4 d4Var, v9 v9Var) {
        this(bu1Var, d4Var, v9Var, new sx());
    }

    public final void a(String str) {
        Object obj;
        gp2 a = this.d.a(this.c, this.b);
        zg2 zg2Var = (zg2) bh2.a.getValue();
        if (zg2Var != null) {
            int ordinal = zg2Var.ordinal();
            if (ordinal == 0) {
                obj = PluginErrorDetails.Platform.FLUTTER;
            } else if (ordinal == 1) {
                obj = "react-native";
            } else {
                if (ordinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                obj = PluginErrorDetails.Platform.UNITY;
            }
        } else {
            obj = a.a.get("plugin_type");
        }
        dp2 dp2Var = dp2.c;
        LinkedHashMap n = pn00.n(a.a, pn00.k(new Pair("activity_event", str), new Pair("plugin_type", obj)));
        this.a.a(new fp2("activity_action", new LinkedHashMap(n), a.b));
    }

    public final void b() {
        a("on_resume");
    }

    public c1(bu1 bu1Var, d4 d4Var, v9 v9Var, sx sxVar) {
        this.a = bu1Var;
        this.b = d4Var;
        this.c = v9Var;
        this.d = sxVar;
    }

    public final void a() {
        a("on_pause");
    }
}
