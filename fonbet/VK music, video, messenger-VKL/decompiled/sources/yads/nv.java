package yads;

import android.content.Context;
import com.ironsource.O6;
import com.ironsource.X3;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.LinkedHashMap;
import java.util.Map;
import xsna.jgp;
import xsna.pn00;
import xsna.ttp0;

/* loaded from: classes10.dex */
public final class nv {
    public final d4 a;
    public final ov2 b;

    public nv(d4 d4Var, ov2 ov2Var) {
        this.a = d4Var;
        this.b = ov2Var;
    }

    public final void a(Context context, e00 e00Var, ji2 ji2Var, Long l) {
        Map map = jgp.b;
        if (!ttp0.g(map)) {
            map = null;
        }
        if (map == null) {
            map = new LinkedHashMap();
        }
        String str = StringUtils.UNDEFINED;
        if (e00Var == null) {
            map.put("ad_type", StringUtils.UNDEFINED);
        } else {
            map.put("ad_type", e00Var);
        }
        if (l == null) {
            map.put("duration", StringUtils.UNDEFINED);
        } else {
            map.put("duration", l);
        }
        LinkedHashMap a = li2.a(ji2Var);
        map.putAll(a);
        String str2 = (String) a.get(O6.G1);
        br2 br2Var = new br2();
        n9 n9Var = new n9();
        d4 d4Var = this.a;
        gp2 b = br2Var.b(null, d4Var);
        gp2 a2 = n9Var.a(d4Var.e);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!ttp0.g(linkedHashMap)) {
            linkedHashMap = null;
        }
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap();
        }
        int i = d4Var.n;
        if (i == 1) {
            str = X3.i.D;
        } else if (i == 2) {
            str = X3.i.C;
        }
        linkedHashMap.put(X3.i.n, str);
        gp2 a3 = hp2.a(b, a2);
        c cVar = a3.b;
        if (cVar == null) {
            cVar = null;
        }
        gp2 gp2Var = new gp2(pn00.n(a3.a, linkedHashMap), cVar);
        c cVar2 = gp2Var.b;
        LinkedHashMap n = pn00.n(map, gp2Var.a);
        if (!ttp0.g(n)) {
            n = null;
        }
        if (n == null) {
            n = new LinkedHashMap();
        }
        dp2 dp2Var = dp2.I;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(n);
        fp2 fp2Var = new fp2("client_bidding_loading_result", linkedHashMap2, cVar2);
        ((mv3) this.b).getClass();
        tv3 tv3Var = tv3.a;
        cf.a(context, new gr3(((mv3) this.b).a)).a(fp2Var);
        new we(context).a(dp2Var, linkedHashMap2, str2, null);
    }
}
